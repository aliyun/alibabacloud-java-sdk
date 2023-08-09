// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListTimingSyntheticTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListTimingSyntheticTasksResponseBodyData data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("Frequency")
        public String frequency;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("MonitorCategory")
        public Integer monitorCategory;

        @NameInMap("MonitorNum")
        public String monitorNum;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListTimingSyntheticTasksResponseBodyDataItemsTags> tags;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskType")
        public Integer taskType;

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
        @NameInMap("Items")
        public java.util.List<ListTimingSyntheticTasksResponseBodyDataItems> items;

        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

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
