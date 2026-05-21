// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasaisearchproxy20260424.models;

import com.aliyun.tea.*;

public class OpenDatasetResourceUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Integer code;

    @NameInMap("data")
    public OpenDatasetResourceUrlResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1a0f40dd17774641794394269ec0e9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static OpenDatasetResourceUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenDatasetResourceUrlResponseBody self = new OpenDatasetResourceUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenDatasetResourceUrlResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public OpenDatasetResourceUrlResponseBody setData(OpenDatasetResourceUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OpenDatasetResourceUrlResponseBodyData getData() {
        return this.data;
    }

    public OpenDatasetResourceUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OpenDatasetResourceUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OpenDatasetResourceUrlResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://maas-ai-search-center-raw.oss-cn-hangzhou.aliyuncs.com/.../sample.mp4">https://maas-ai-search-center-raw.oss-cn-hangzhou.aliyuncs.com/.../sample.mp4</a>...</p>
         */
        @NameInMap("url")
        public String url;

        public static OpenDatasetResourceUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OpenDatasetResourceUrlResponseBodyData self = new OpenDatasetResourceUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OpenDatasetResourceUrlResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
