// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksStatResponseBody extends TeaModel {
    /**
     * <p>The task objects.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeHistoryTasksStatResponseBodyItems> items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FC724D23-XXXX-XXXX-ABB1-606C935AE7FD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHistoryTasksStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryTasksStatResponseBody self = new DescribeHistoryTasksStatResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryTasksStatResponseBody setItems(java.util.List<DescribeHistoryTasksStatResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeHistoryTasksStatResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeHistoryTasksStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHistoryTasksStatResponseBodyItems extends TeaModel {
        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Scheduled: The task is waiting to be executed.</li>
         * <li>Running: The task is running.</li>
         * <li>Succeed: The task is successful.</li>
         * <li>Failed: The task failed.</li>
         * <li>Cancelling: The task is being terminated.</li>
         * <li>Canceled: The task has been terminated.</li>
         * <li>Waiting: The task is waiting for scheduled time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of tasks in a specified state.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeHistoryTasksStatResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryTasksStatResponseBodyItems self = new DescribeHistoryTasksStatResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryTasksStatResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHistoryTasksStatResponseBodyItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
