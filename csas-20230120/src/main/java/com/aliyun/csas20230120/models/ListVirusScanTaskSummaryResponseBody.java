// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusScanTaskSummaryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of detection statistics for virus scan tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<ListVirusScanTaskSummaryResponseBodyTasks> tasks;

    public static ListVirusScanTaskSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanTaskSummaryResponseBody self = new ListVirusScanTaskSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirusScanTaskSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVirusScanTaskSummaryResponseBody setTasks(java.util.List<ListVirusScanTaskSummaryResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListVirusScanTaskSummaryResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class ListVirusScanTaskSummaryResponseBodyTasks extends TeaModel {
        /**
         * <p>The virus scan task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>v1:1024772</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The number of virus files detected by the task.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("VirusFileCount")
        public Long virusFileCount;

        public static ListVirusScanTaskSummaryResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanTaskSummaryResponseBodyTasks self = new ListVirusScanTaskSummaryResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListVirusScanTaskSummaryResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListVirusScanTaskSummaryResponseBodyTasks setVirusFileCount(Long virusFileCount) {
            this.virusFileCount = virusFileCount;
            return this;
        }
        public Long getVirusFileCount() {
            return this.virusFileCount;
        }

    }

}
