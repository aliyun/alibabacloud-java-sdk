// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListPoolsResponseBody extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page. Maximum value: 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>An array of resource pools.</p>
     */
    @NameInMap("PoolList")
    public java.util.List<ListPoolsResponseBodyPoolList> poolList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPoolsResponseBody self = new ListPoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPoolsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPoolsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPoolsResponseBody setPoolList(java.util.List<ListPoolsResponseBodyPoolList> poolList) {
        this.poolList = poolList;
        return this;
    }
    public java.util.List<ListPoolsResponseBodyPoolList> getPoolList() {
        return this.poolList;
    }

    public ListPoolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPoolsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPoolsResponseBodyPoolListTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListPoolsResponseBodyPoolListTags build(java.util.Map<String, ?> map) throws Exception {
            ListPoolsResponseBodyPoolListTags self = new ListPoolsResponseBodyPoolListTags();
            return TeaModel.build(map, self);
        }

        public ListPoolsResponseBodyPoolListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListPoolsResponseBodyPoolListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListPoolsResponseBodyPoolList extends TeaModel {
        /**
         * <p>The time when the resource pool was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 11:09:59</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether the resource pool is the default pool. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The resource pool is the default pool.</p>
         * </li>
         * <li><p><strong>false</strong>: The resource pool is not the default pool.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The number of running executor nodes in the resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxExecutorNum")
        public Integer maxExecutorNum;

        /**
         * <p>The name of the resource pool.</p>
         * <ul>
         * <li><p>Maximum length: 15 characters.</p>
         * </li>
         * <li><p>Allowed characters: digits, letters, underscores (_), and periods (.).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PoolTest</p>
         */
        @NameInMap("PoolName")
        public String poolName;

        /**
         * <p>The priority of the resource pool.</p>
         * <ul>
         * <li><p>Valid values: 1 to 99. Default value: 1 (lowest priority).</p>
         * </li>
         * <li><p>Jobs in a resource pool with a higher priority are scheduled before those in a pool with a lower priority. The pool\&quot;s priority overrides the priority of an individual job.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the scheduling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-xxx</p>
         */
        @NameInMap("SchedulingPolicyId")
        public String schedulingPolicyId;

        /**
         * <p>The status of the resource pool. Valid values:</p>
         * <ul>
         * <li><p>Creating: The resource pool is being created.</p>
         * </li>
         * <li><p>Updating: The resource pool is being updated.</p>
         * </li>
         * <li><p>Deleting: The resource pool is being deleted.</p>
         * </li>
         * <li><p>Working: The resource pool is operational.</p>
         * </li>
         * <li><p>Deleted: The resource pool has been deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Working</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListPoolsResponseBodyPoolListTags> tags;

        /**
         * <p>The time when the resource pool was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 11:09:59</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListPoolsResponseBodyPoolList build(java.util.Map<String, ?> map) throws Exception {
            ListPoolsResponseBodyPoolList self = new ListPoolsResponseBodyPoolList();
            return TeaModel.build(map, self);
        }

        public ListPoolsResponseBodyPoolList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPoolsResponseBodyPoolList setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListPoolsResponseBodyPoolList setMaxExecutorNum(Integer maxExecutorNum) {
            this.maxExecutorNum = maxExecutorNum;
            return this;
        }
        public Integer getMaxExecutorNum() {
            return this.maxExecutorNum;
        }

        public ListPoolsResponseBodyPoolList setPoolName(String poolName) {
            this.poolName = poolName;
            return this;
        }
        public String getPoolName() {
            return this.poolName;
        }

        public ListPoolsResponseBodyPoolList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListPoolsResponseBodyPoolList setSchedulingPolicyId(String schedulingPolicyId) {
            this.schedulingPolicyId = schedulingPolicyId;
            return this;
        }
        public String getSchedulingPolicyId() {
            return this.schedulingPolicyId;
        }

        public ListPoolsResponseBodyPoolList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPoolsResponseBodyPoolList setTags(java.util.List<ListPoolsResponseBodyPoolListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListPoolsResponseBodyPoolListTags> getTags() {
            return this.tags;
        }

        public ListPoolsResponseBodyPoolList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
