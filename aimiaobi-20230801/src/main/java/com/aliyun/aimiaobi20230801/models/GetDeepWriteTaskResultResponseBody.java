// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDeepWriteTaskResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDeepWriteTaskResultResponseBodyData data;

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

    @NameInMap("Success")
    public Boolean success;

    public static GetDeepWriteTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeepWriteTaskResultResponseBody self = new GetDeepWriteTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeepWriteTaskResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeepWriteTaskResultResponseBody setData(GetDeepWriteTaskResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeepWriteTaskResultResponseBodyData getData() {
        return this.data;
    }

    public GetDeepWriteTaskResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDeepWriteTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeepWriteTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeepWriteTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDeepWriteTaskResultResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://aimiaobi-service-pre-hangzhou.oss-cn-hangzhou.aliyuncs.com/aimiaobi/deep-write-workspace/142***1/dbaaebd1-eb1b-41e8-9b99-******-result.zip?Expire=1111">https://aimiaobi-service-pre-hangzhou.oss-cn-hangzhou.aliyuncs.com/aimiaobi/deep-write-workspace/142***1/dbaaebd1-eb1b-41e8-9b99-******-result.zip?Expire=1111</a></p>
         */
        @NameInMap("ArtifactUrl")
        public String artifactUrl;

        /**
         * <strong>example:</strong>
         * <p>f8707efa-c30e-407f-a611-50871aa68952</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static GetDeepWriteTaskResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeepWriteTaskResultResponseBodyData self = new GetDeepWriteTaskResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeepWriteTaskResultResponseBodyData setArtifactUrl(String artifactUrl) {
            this.artifactUrl = artifactUrl;
            return this;
        }
        public String getArtifactUrl() {
            return this.artifactUrl;
        }

        public GetDeepWriteTaskResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
