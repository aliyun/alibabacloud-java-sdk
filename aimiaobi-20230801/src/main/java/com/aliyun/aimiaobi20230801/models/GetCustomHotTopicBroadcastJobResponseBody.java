// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetCustomHotTopicBroadcastJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCustomHotTopicBroadcastJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCustomHotTopicBroadcastJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomHotTopicBroadcastJobResponseBody self = new GetCustomHotTopicBroadcastJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomHotTopicBroadcastJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomHotTopicBroadcastJobResponseBody setData(GetCustomHotTopicBroadcastJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomHotTopicBroadcastJobResponseBodyData getData() {
        return this.data;
    }

    public GetCustomHotTopicBroadcastJobResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCustomHotTopicBroadcastJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomHotTopicBroadcastJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomHotTopicBroadcastJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomHotTopicBroadcastJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>错误信息</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>热点话题版本号标识</p>
         */
        @NameInMap("HotTopicVersion")
        public String hotTopicVersion;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetCustomHotTopicBroadcastJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomHotTopicBroadcastJobResponseBodyData self = new GetCustomHotTopicBroadcastJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomHotTopicBroadcastJobResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetCustomHotTopicBroadcastJobResponseBodyData setHotTopicVersion(String hotTopicVersion) {
            this.hotTopicVersion = hotTopicVersion;
            return this;
        }
        public String getHotTopicVersion() {
            return this.hotTopicVersion;
        }

        public GetCustomHotTopicBroadcastJobResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
