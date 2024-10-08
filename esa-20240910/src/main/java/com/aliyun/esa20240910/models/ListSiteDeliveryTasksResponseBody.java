// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSiteDeliveryTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
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
     * <p>34DCBC8A-<strong><strong>-</strong></strong>-****-6DAA11D7DDBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public java.util.List<ListSiteDeliveryTasksResponseBodyTasks> tasks;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSiteDeliveryTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSiteDeliveryTasksResponseBody self = new ListSiteDeliveryTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSiteDeliveryTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSiteDeliveryTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSiteDeliveryTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSiteDeliveryTasksResponseBody setTasks(java.util.List<ListSiteDeliveryTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListSiteDeliveryTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public ListSiteDeliveryTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSiteDeliveryTasksResponseBodyTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dcdn_log_access_l1</p>
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
         * <p>sls</p>
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
         * <p>cdn-test-task</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        public static ListSiteDeliveryTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListSiteDeliveryTasksResponseBodyTasks self = new ListSiteDeliveryTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListSiteDeliveryTasksResponseBodyTasks setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public ListSiteDeliveryTasksResponseBodyTasks setDataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }
        public String getDataCenter() {
            return this.dataCenter;
        }

        public ListSiteDeliveryTasksResponseBodyTasks setDeliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }
        public String getDeliveryType() {
            return this.deliveryType;
        }

        public ListSiteDeliveryTasksResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSiteDeliveryTasksResponseBodyTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
