// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearchengine20260417.models;

import com.aliyun.tea.*;

public class GetDatasetResourceUrlResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of <code>200</code> indicates a successful request. Other values indicate an exception. For more information, see error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Integer code;

    /**
     * <p>The business data body.</p>
     */
    @NameInMap("data")
    public GetDatasetResourceUrlResponseBodyData data;

    /**
     * <p>The status description. The value is &quot;success&quot; for successful requests and a specific error message for failed requests.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The unique request ID, used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>1a0f40dd17774641794394269ec0e9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetDatasetResourceUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetResourceUrlResponseBody self = new GetDatasetResourceUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatasetResourceUrlResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetDatasetResourceUrlResponseBody setData(GetDatasetResourceUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDatasetResourceUrlResponseBodyData getData() {
        return this.data;
    }

    public GetDatasetResourceUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDatasetResourceUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDatasetResourceUrlResponseBodyData extends TeaModel {
        /**
         * <p>The temporary OSS access URL with a signature and expiration time (valid for 24 hours). The URL can be used directly for frontend display or download.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://maas-ai-search-center-raw.oss-cn-hangzhou.aliyuncs.com/.../sample.mp4">https://maas-ai-search-center-raw.oss-cn-hangzhou.aliyuncs.com/.../sample.mp4</a>...</p>
         */
        @NameInMap("url")
        public String url;

        public static GetDatasetResourceUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResourceUrlResponseBodyData self = new GetDatasetResourceUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDatasetResourceUrlResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
