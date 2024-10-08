// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUserDeliveryTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1f94c47f-3a1a-4f69-8d6c-bfeee1b49aab</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public java.util.List<ListUserDeliveryTasksResponseBodyTasks> tasks;

    /**
     * <strong>example:</strong>
     * <p>68</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListUserDeliveryTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserDeliveryTasksResponseBody self = new ListUserDeliveryTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserDeliveryTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserDeliveryTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserDeliveryTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserDeliveryTasksResponseBody setTasks(java.util.List<ListUserDeliveryTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListUserDeliveryTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public ListUserDeliveryTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserDeliveryTasksResponseBodyTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dcdn_log_er</p>
         */
        @NameInMap("BusinessType")
        public String businessType;

        /**
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("DataCenter")
        public String dataCenter;

        /**
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("DeliveryType")
        public String deliveryType;

        /**
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>testoss11</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        public static ListUserDeliveryTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListUserDeliveryTasksResponseBodyTasks self = new ListUserDeliveryTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListUserDeliveryTasksResponseBodyTasks setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public ListUserDeliveryTasksResponseBodyTasks setDataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }
        public String getDataCenter() {
            return this.dataCenter;
        }

        public ListUserDeliveryTasksResponseBodyTasks setDeliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }
        public String getDeliveryType() {
            return this.deliveryType;
        }

        public ListUserDeliveryTasksResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserDeliveryTasksResponseBodyTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
