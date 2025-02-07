// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateChatMediaUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateChatMediaUrlResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>03C67DAD-EB26-41D8-949D-9B0C470FB716</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateChatMediaUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChatMediaUrlResponseBody self = new CreateChatMediaUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChatMediaUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateChatMediaUrlResponseBody setData(CreateChatMediaUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateChatMediaUrlResponseBodyData getData() {
        return this.data;
    }

    public CreateChatMediaUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateChatMediaUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateChatMediaUrlResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public CreateChatMediaUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateChatMediaUrlResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>$iAHNCNQCo21wMwMGBAAFAAbaACOEAaQhIH6TAqogDGyb-qD2Hbj0A88AAAGRLKYVnwTOACwwYwcACM8AAAGRLRPynQ</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://ccc-v2-online.oss-cn-shanghai.aliyuncs.com/ccc-test/namelist.csv?Expires=1642067227&OSSAccessKeyId=****&Signature=">https://ccc-v2-online.oss-cn-shanghai.aliyuncs.com/ccc-test/namelist.csv?Expires=1642067227&amp;OSSAccessKeyId=****&amp;Signature=</a>****</p>
         */
        @NameInMap("Url")
        public String url;

        public static CreateChatMediaUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateChatMediaUrlResponseBodyData self = new CreateChatMediaUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateChatMediaUrlResponseBodyData setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public CreateChatMediaUrlResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
