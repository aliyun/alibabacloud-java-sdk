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
     * <p>The number of entries on each page. Maximum value: 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Queries the resource pool list.</p>
     */
    @NameInMap("PoolList")
    public java.util.List<ListPoolsResponseBodyPoolList> poolList;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of list entries.</p>
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

    public static class ListPoolsResponseBodyPoolList extends TeaModel {
        /**
         * <p>Indices whether the resource pool is the default resource pool. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The maximum number of execution nodes that can run concurrently in a resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("MaxExectorNum")
        public Integer maxExectorNum;

        /**
         * <p>The name of the resource pool.</p>
         * <ul>
         * <li>The value can be up to 15 characters in length.</li>
         * <li>It can contain digits, uppercase letters, lowercase letters, underscores (_), and dots (.).</li>
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
         * <li>You can set a priority in the range of 1 to 99. The default value is 1, which is the lowest priority.</li>
         * <li>Jobs submitted to a resource pool with a higher priority level value will be scheduled before pending jobs in a resource pool with a lower priority level value, and the priority level of the resource pool takes precedence over the priority of the job.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The status of the resource pool. Valid values:</p>
         * <ul>
         * <li>Creating: The resource pool is being created.</li>
         * <li>Updating: The resource pool is being updated.</li>
         * <li>Deleting: The resource pool is being deleted.</li>
         * <li>Working: The resource pool is working.</li>
         * <li>Deleted: The resource pool is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Working</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListPoolsResponseBodyPoolList build(java.util.Map<String, ?> map) throws Exception {
            ListPoolsResponseBodyPoolList self = new ListPoolsResponseBodyPoolList();
            return TeaModel.build(map, self);
        }

        public ListPoolsResponseBodyPoolList setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListPoolsResponseBodyPoolList setMaxExectorNum(Integer maxExectorNum) {
            this.maxExectorNum = maxExectorNum;
            return this;
        }
        public Integer getMaxExectorNum() {
            return this.maxExectorNum;
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

        public ListPoolsResponseBodyPoolList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
