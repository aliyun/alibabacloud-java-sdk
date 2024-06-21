// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListTimingSyntheticTasksRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The search keyword.</p>
     */
    @NameInMap("Search")
    public ListTimingSyntheticTasksRequestSearch search;

    /**
     * <p>The tags.</p>
     */
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
        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>AlibabaCloud DNS Task</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The order by which tasks are sorted. 1: ascending order. -1: descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The condition by which tasks are sorted. You can sort tasks by gmtCreate, gmtModified, status, or monitorCount.</p>
         * 
         * <strong>example:</strong>
         * <p>status</p>
         */
        @NameInMap("OrderField")
        public String orderField;

        /**
         * <p>The page number. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries per page. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The task status. CREATING: The task is being created. RUNNING: The task is running. PARTIAL_RUNNING: The task is partially running. STOP: The task is stopped. LIMIT_STOP: The task is stopped due to quota limit. EXCEPTION: The task is abnormal. DELETE: The task is deleted. DELETE_EXCEPTION: An exception occurs while deleting the task.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task IDs.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<String> taskIds;

        /**
         * <p>The task types.</p>
         */
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>mark</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1111</p>
         */
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
