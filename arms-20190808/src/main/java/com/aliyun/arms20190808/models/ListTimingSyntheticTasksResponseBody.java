// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListTimingSyntheticTasksResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("Data")
    public ListTimingSyntheticTasksResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListTimingSyntheticTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTimingSyntheticTasksResponseBody self = new ListTimingSyntheticTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTimingSyntheticTasksResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListTimingSyntheticTasksResponseBody setData(ListTimingSyntheticTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTimingSyntheticTasksResponseBodyData getData() {
        return this.data;
    }

    public ListTimingSyntheticTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTimingSyntheticTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTimingSyntheticTasksResponseBodyDataItemsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTimingSyntheticTasksResponseBodyDataItemsTags build(java.util.Map<String, ?> map) throws Exception {
            ListTimingSyntheticTasksResponseBodyDataItemsTags self = new ListTimingSyntheticTasksResponseBodyDataItemsTags();
            return TeaModel.build(map, self);
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTimingSyntheticTasksResponseBodyDataItemsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTimingSyntheticTasksResponseBodyDataItems extends TeaModel {
        /**
         * <p>The detection frequency. Valid values: 1m, 5m, 10m, 15m, 20m, 30m, 1h, 2h, 3h, 4h, 6h, 8h, 12h, and 24h.</p>
         */
        @NameInMap("Frequency")
        public String frequency;

        /**
         * <p>The time when the task was created.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the task was modified.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The detection point type. 1: PC. 2: mobile device.</p>
         */
        @NameInMap("MonitorCategory")
        public Integer monitorCategory;

        /**
         * <p>The number of detection points.</p>
         */
        @NameInMap("MonitorNum")
        public String monitorNum;

        /**
         * <p>The task name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The task status. CREATING: The task is being created. RUNNING: The task is running. PARTIAL_RUNNING: The task is partially running. STOP: The task is stopped. LIMIT_STOP: The task is stopped due to quota limit. EXCEPTION: The task is abnormal. DELETE: The task is deleted. DELETE_EXCEPTION: An exception occurs while deleting the task.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTimingSyntheticTasksResponseBodyDataItemsTags> tags;

        /**
         * <p>The ID of the synthetic monitoring task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The type of the task. Valid values:</p>
         * <br>
         * <p>1: ICMP. 2: TCP. 3: DNS. 4: HTTP. 5: website speed. 6: file download.</p>
         */
        @NameInMap("TaskType")
        public Integer taskType;

        /**
         * <p>The URL for synthetic monitoring.</p>
         */
        @NameInMap("Url")
        public String url;

        public static ListTimingSyntheticTasksResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListTimingSyntheticTasksResponseBodyDataItems self = new ListTimingSyntheticTasksResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setFrequency(String frequency) {
            this.frequency = frequency;
            return this;
        }
        public String getFrequency() {
            return this.frequency;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setMonitorCategory(Integer monitorCategory) {
            this.monitorCategory = monitorCategory;
            return this;
        }
        public Integer getMonitorCategory() {
            return this.monitorCategory;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setMonitorNum(String monitorNum) {
            this.monitorNum = monitorNum;
            return this;
        }
        public String getMonitorNum() {
            return this.monitorNum;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setTags(java.util.List<ListTimingSyntheticTasksResponseBodyDataItemsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTimingSyntheticTasksResponseBodyDataItemsTags> getTags() {
            return this.tags;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

        public ListTimingSyntheticTasksResponseBodyDataItems setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListTimingSyntheticTasksResponseBodyData extends TeaModel {
        /**
         * <p>The queried tasks.</p>
         */
        @NameInMap("Items")
        public java.util.List<ListTimingSyntheticTasksResponseBodyDataItems> items;

        /**
         * <p>The page number.</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of tasks.</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListTimingSyntheticTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTimingSyntheticTasksResponseBodyData self = new ListTimingSyntheticTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTimingSyntheticTasksResponseBodyData setItems(java.util.List<ListTimingSyntheticTasksResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListTimingSyntheticTasksResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListTimingSyntheticTasksResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListTimingSyntheticTasksResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListTimingSyntheticTasksResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
