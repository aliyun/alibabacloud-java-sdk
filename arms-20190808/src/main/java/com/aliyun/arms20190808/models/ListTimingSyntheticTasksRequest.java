// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListTimingSyntheticTasksRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Search")
    public ListTimingSyntheticTasksRequestSearch search;

    @NameInMap("Tags")
    public java.util.List<ListTimingSyntheticTasksRequestTags> tags;

    public static ListTimingSyntheticTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTimingSyntheticTasksRequest self = new ListTimingSyntheticTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListTimingSyntheticTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTimingSyntheticTasksRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListTimingSyntheticTasksRequest setSearch(ListTimingSyntheticTasksRequestSearch search) {
        this.search = search;
        return this;
    }
    public ListTimingSyntheticTasksRequestSearch getSearch() {
        return this.search;
    }

    public ListTimingSyntheticTasksRequest setTags(java.util.List<ListTimingSyntheticTasksRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListTimingSyntheticTasksRequestTags> getTags() {
        return this.tags;
    }

    public static class ListTimingSyntheticTasksRequestSearch extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("OrderField")
        public String orderField;

        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskIds")
        public java.util.List<String> taskIds;

        @NameInMap("TaskTypes")
        public java.util.List<Integer> taskTypes;

        public static ListTimingSyntheticTasksRequestSearch build(java.util.Map<String, ?> map) throws Exception {
            ListTimingSyntheticTasksRequestSearch self = new ListTimingSyntheticTasksRequestSearch();
            return TeaModel.build(map, self);
        }

        public ListTimingSyntheticTasksRequestSearch setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTimingSyntheticTasksRequestSearch setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ListTimingSyntheticTasksRequestSearch setOrderField(String orderField) {
            this.orderField = orderField;
            return this;
        }
        public String getOrderField() {
            return this.orderField;
        }

        public ListTimingSyntheticTasksRequestSearch setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListTimingSyntheticTasksRequestSearch setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListTimingSyntheticTasksRequestSearch setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTimingSyntheticTasksRequestSearch setTaskIds(java.util.List<String> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<String> getTaskIds() {
            return this.taskIds;
        }

        public ListTimingSyntheticTasksRequestSearch setTaskTypes(java.util.List<Integer> taskTypes) {
            this.taskTypes = taskTypes;
            return this;
        }
        public java.util.List<Integer> getTaskTypes() {
            return this.taskTypes;
        }

    }

    public static class ListTimingSyntheticTasksRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListTimingSyntheticTasksRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListTimingSyntheticTasksRequestTags self = new ListTimingSyntheticTasksRequestTags();
            return TeaModel.build(map, self);
        }

        public ListTimingSyntheticTasksRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTimingSyntheticTasksRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
