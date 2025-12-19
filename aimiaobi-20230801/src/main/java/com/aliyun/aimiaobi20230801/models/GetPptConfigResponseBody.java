// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetPptConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPptConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>错误消息</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPptConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPptConfigResponseBody self = new GetPptConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPptConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPptConfigResponseBody setData(GetPptConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPptConfigResponseBodyData getData() {
        return this.data;
    }

    public GetPptConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPptConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPptConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPptConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPptConfigResponseBodyData extends TeaModel {
        /**
         * <p>AppKey</p>
         * 
         * <strong>example:</strong>
         * <p>333444766</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>Code</p>
         * 
         * <strong>example:</strong>
         * <p>r4wr5y6g</p>
         */
        @NameInMap("Code")
        public String code;

        public static GetPptConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPptConfigResponseBodyData self = new GetPptConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPptConfigResponseBodyData setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public GetPptConfigResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

}
