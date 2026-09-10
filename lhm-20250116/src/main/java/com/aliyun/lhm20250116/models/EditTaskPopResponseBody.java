// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class EditTaskPopResponseBody extends TeaModel {
    /**
     * <p>The data body returned by the operation. For the field structure, see the child parameter descriptions.</p>
     */
    @NameInMap("data")
    public EditTaskPopResponseBodyData data;

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
     * <li>true: Successful.</li>
     * <li>false: Failed. Check errCode and errMessage for troubleshooting.</li>
     * </ul>
     */
    @NameInMap("success")
    public Boolean success;

    public static EditTaskPopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditTaskPopResponseBody self = new EditTaskPopResponseBody();
        return TeaModel.build(map, self);
    }

    public EditTaskPopResponseBody setData(EditTaskPopResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EditTaskPopResponseBodyData getData() {
        return this.data;
    }

    public EditTaskPopResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public EditTaskPopResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public EditTaskPopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EditTaskPopResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EditTaskPopResponseBodyData extends TeaModel {
        /**
         * <p>The file upload and parsing ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("fileUploadParseId")
        public Long fileUploadParseId;

        /**
         * <p>The primary key ID that uniquely identifies a record.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The message content. In error scenarios, this field contains the error message. In log scenarios, this field contains the log content. In instance progress scenarios, this field may return a status or progress value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed. Check errCode and errMessage for troubleshooting.</li>
         * </ul>
         */
        @NameInMap("success")
        public Boolean success;

        /**
         * <p>The task ID that uniquely identifies a task.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("taskId")
        public Long taskId;

        public static EditTaskPopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EditTaskPopResponseBodyData self = new EditTaskPopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EditTaskPopResponseBodyData setFileUploadParseId(Long fileUploadParseId) {
            this.fileUploadParseId = fileUploadParseId;
            return this;
        }
        public Long getFileUploadParseId() {
            return this.fileUploadParseId;
        }

        public EditTaskPopResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public EditTaskPopResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public EditTaskPopResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public EditTaskPopResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
