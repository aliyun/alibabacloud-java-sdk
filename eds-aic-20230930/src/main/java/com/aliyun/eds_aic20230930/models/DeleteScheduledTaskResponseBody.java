// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteScheduledTaskResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9A51B1DF-96FF-3BCC-B08C-783161D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of deletion results.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<DeleteScheduledTaskResponseBodyTasks> tasks;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DeleteScheduledTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduledTaskResponseBody self = new DeleteScheduledTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteScheduledTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteScheduledTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteScheduledTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteScheduledTaskResponseBody setTasks(java.util.List<DeleteScheduledTaskResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DeleteScheduledTaskResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public DeleteScheduledTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DeleteScheduledTaskResponseBodyTasks extends TeaModel {
        /**
         * <p>The ID of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>sch-260705-agbx1eev</p>
         */
        @NameInMap("ScheduledId")
        public String scheduledId;

        /**
         * <p>Indicates whether the scheduled task is deleted successfully.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DeleteScheduledTaskResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DeleteScheduledTaskResponseBodyTasks self = new DeleteScheduledTaskResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DeleteScheduledTaskResponseBodyTasks setScheduledId(String scheduledId) {
            this.scheduledId = scheduledId;
            return this;
        }
        public String getScheduledId() {
            return this.scheduledId;
        }

        public DeleteScheduledTaskResponseBodyTasks setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
