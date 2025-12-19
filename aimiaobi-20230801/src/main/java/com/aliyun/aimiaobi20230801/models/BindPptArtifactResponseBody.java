// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class BindPptArtifactResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BindPptArtifactResponseBodyData data;

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

    public static BindPptArtifactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindPptArtifactResponseBody self = new BindPptArtifactResponseBody();
        return TeaModel.build(map, self);
    }

    public BindPptArtifactResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindPptArtifactResponseBody setData(BindPptArtifactResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindPptArtifactResponseBodyData getData() {
        return this.data;
    }

    public BindPptArtifactResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BindPptArtifactResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindPptArtifactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindPptArtifactResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BindPptArtifactResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>110f8401-e5ba-42db-addb-4f70196000c1</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static BindPptArtifactResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindPptArtifactResponseBodyData self = new BindPptArtifactResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindPptArtifactResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
