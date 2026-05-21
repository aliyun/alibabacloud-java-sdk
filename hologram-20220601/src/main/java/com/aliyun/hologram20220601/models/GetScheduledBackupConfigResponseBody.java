// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetScheduledBackupConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetScheduledBackupConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>623EF0B6-A6C1-5764-82CC-0BC176654CB9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetScheduledBackupConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledBackupConfigResponseBody self = new GetScheduledBackupConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScheduledBackupConfigResponseBody setData(GetScheduledBackupConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetScheduledBackupConfigResponseBodyData getData() {
        return this.data;
    }

    public GetScheduledBackupConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetScheduledBackupConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetScheduledBackupConfigResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetScheduledBackupConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScheduledBackupConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetScheduledBackupConfigResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Long enabled;

        /**
         * <strong>example:</strong>
         * <p>{&quot;schedule&quot;:&quot;0 10 * * 1,2&quot;,&quot;instance_id&quot;:&quot;hgprecn-cn-lbj3dfgog004&quot;,&quot;week&quot;:&quot;1,2&quot;,&quot;hour&quot;:10,&quot;data_keep_quantity&quot;:3,&quot;type&quot;:&quot;periodical&quot;,&quot;enabled&quot;:true}</p>
         */
        @NameInMap("TaskParameter")
        public String taskParameter;

        /**
         * <strong>example:</strong>
         * <p>backup</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static GetScheduledBackupConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScheduledBackupConfigResponseBodyData self = new GetScheduledBackupConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScheduledBackupConfigResponseBodyData setEnabled(Long enabled) {
            this.enabled = enabled;
            return this;
        }
        public Long getEnabled() {
            return this.enabled;
        }

        public GetScheduledBackupConfigResponseBodyData setTaskParameter(String taskParameter) {
            this.taskParameter = taskParameter;
            return this;
        }
        public String getTaskParameter() {
            return this.taskParameter;
        }

        public GetScheduledBackupConfigResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
