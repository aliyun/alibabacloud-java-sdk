// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class CreateSqlExecJobResponseBody extends TeaModel {
    /**
     * <p>The data body returned by the operation. For the field structure, see the child parameters.</p>
     */
    @NameInMap("data")
    public CreateSqlExecJobResponseBodyData data;

    /**
     * <p>The error code. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues with this call.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call succeeded.</li>
     * <li>false: The call failed. Check errCode and errMessage for troubleshooting.</li>
     * </ul>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateSqlExecJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlExecJobResponseBody self = new CreateSqlExecJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSqlExecJobResponseBody setData(CreateSqlExecJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSqlExecJobResponseBodyData getData() {
        return this.data;
    }

    public CreateSqlExecJobResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateSqlExecJobResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateSqlExecJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSqlExecJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSqlExecJobResponseBodyData extends TeaModel {
        /**
         * <p>The execution job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("execJobId")
        public Long execJobId;

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>Indicates whether the submission succeeded.</p>
         */
        @NameInMap("success")
        public Boolean success;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("taskId")
        public Long taskId;

        public static CreateSqlExecJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSqlExecJobResponseBodyData self = new CreateSqlExecJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSqlExecJobResponseBodyData setExecJobId(Long execJobId) {
            this.execJobId = execJobId;
            return this;
        }
        public Long getExecJobId() {
            return this.execJobId;
        }

        public CreateSqlExecJobResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateSqlExecJobResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateSqlExecJobResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
