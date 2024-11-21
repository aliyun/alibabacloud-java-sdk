// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCacheReserveInstancesResponseBody extends TeaModel {
    /**
     * <p>The cache reserve instances.</p>
     */
    @NameInMap("InstanceInfo")
    public java.util.List<ListCacheReserveInstancesResponseBodyInstanceInfo> instanceInfo;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>500</strong>. Valid values: <strong>1 to 500</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>65C66B7B-671A-8297-9187-2R5477247B76</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListCacheReserveInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCacheReserveInstancesResponseBody self = new ListCacheReserveInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCacheReserveInstancesResponseBody setInstanceInfo(java.util.List<ListCacheReserveInstancesResponseBodyInstanceInfo> instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }
    public java.util.List<ListCacheReserveInstancesResponseBodyInstanceInfo> getInstanceInfo() {
        return this.instanceInfo;
    }

    public ListCacheReserveInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCacheReserveInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCacheReserveInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCacheReserveInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListCacheReserveInstancesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListCacheReserveInstancesResponseBodyInstanceInfo extends TeaModel {
        /**
         * <p>The capacity of the cache reserve instance. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>512000</p>
         */
        @NameInMap("CacheReserveCapacity")
        public String cacheReserveCapacity;

        /**
         * <p>The region in which the cache reserve instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>HK</p>
         */
        @NameInMap("CacheReserveRegion")
        public String cacheReserveRegion;

        /**
         * <p>The time when the cache reserve instance was purchased.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-12T05:41:51Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The subscription period of the cache reserve instance. Unit: months.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The time when the cache reserve instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-05T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The ID of the cache reserve instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-xcdn-96wblslz****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the cache reserve instance. Valid values:</p>
         * <ul>
         * <li>online: The instance is in service.</li>
         * <li>offline: The instance has expired within an allowable period. In this state, the plan is unavailable.</li>
         * <li>disable: The instance is released.</li>
         * <li>overdue: The service was stopped due to overdue payments.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListCacheReserveInstancesResponseBodyInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCacheReserveInstancesResponseBodyInstanceInfo self = new ListCacheReserveInstancesResponseBodyInstanceInfo();
            return TeaModel.build(map, self);
        }

        public ListCacheReserveInstancesResponseBodyInstanceInfo setCacheReserveCapacity(String cacheReserveCapacity) {
            this.cacheReserveCapacity = cacheReserveCapacity;
            return this;
        }
        public String getCacheReserveCapacity() {
            return this.cacheReserveCapacity;
        }

        public ListCacheReserveInstancesResponseBodyInstanceInfo setCacheReserveRegion(String cacheReserveRegion) {
            this.cacheReserveRegion = cacheReserveRegion;
            return this;
        }
        public String getCacheReserveRegion() {
            return this.cacheReserveRegion;
        }

        public ListCacheReserveInstancesResponseBodyInstanceInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCacheReserveInstancesResponseBodyInstanceInfo setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListCacheReserveInstancesResponseBodyInstanceInfo setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListCacheReserveInstancesResponseBodyInstanceInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCacheReserveInstancesResponseBodyInstanceInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
