// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListDDoSInstancesResponseBody extends TeaModel {
    /**
     * <p>The instance details.</p>
     */
    @NameInMap("InstanceInfo")
    public java.util.List<ListDDoSInstancesResponseBodyInstanceInfo> instanceInfo;

    /**
     * <p>The current page number, which is the same as the PageNumber request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9F1DC265-BF10-5C9C-B607-760265C5F365</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListDDoSInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDDoSInstancesResponseBody self = new ListDDoSInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDDoSInstancesResponseBody setInstanceInfo(java.util.List<ListDDoSInstancesResponseBodyInstanceInfo> instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }
    public java.util.List<ListDDoSInstancesResponseBodyInstanceInfo> getInstanceInfo() {
        return this.instanceInfo;
    }

    public ListDDoSInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDDoSInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDDoSInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDDoSInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListDDoSInstancesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListDDoSInstancesResponseBodyInstanceInfo extends TeaModel {
        /**
         * <p>The purchase time of the instance. The time is in ISO 8601 format and displayed in UTC. The format is yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-01T07:59:07Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The specifications of the DDoS instance in the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>cn_300</p>
         */
        @NameInMap("DDoSBurstableDomesticProtection")
        public String DDoSBurstableDomesticProtection;

        /**
         * <p>The specifications of the DDoS instance outside the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>overseas_300</p>
         */
        @NameInMap("DDoSBurstableOverseasProtection")
        public String DDoSBurstableOverseasProtection;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-ddddxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The scheduled release time. The time is in ISO 8601 format and displayed in UTC. The format is yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-25T16:00:00Z</p>
         */
        @NameInMap("ReserveReleaseTime")
        public String reserveReleaseTime;

        /**
         * <p>The ID of the associated site plan instance.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-site-b0s6kmx0r0n4</p>
         */
        @NameInMap("SiteInstanceId")
        public String siteInstanceId;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: The instance is running normally.</li>
         * <li><strong>offline</strong>: The instance has expired but is not overdue, and is unavailable.</li>
         * <li><strong>disable</strong>: The instance has been released.</li>
         * <li><strong>overdue</strong>: The instance is suspended due to overdue payment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListDDoSInstancesResponseBodyInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDDoSInstancesResponseBodyInstanceInfo self = new ListDDoSInstancesResponseBodyInstanceInfo();
            return TeaModel.build(map, self);
        }

        public ListDDoSInstancesResponseBodyInstanceInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDDoSInstancesResponseBodyInstanceInfo setDDoSBurstableDomesticProtection(String DDoSBurstableDomesticProtection) {
            this.DDoSBurstableDomesticProtection = DDoSBurstableDomesticProtection;
            return this;
        }
        public String getDDoSBurstableDomesticProtection() {
            return this.DDoSBurstableDomesticProtection;
        }

        public ListDDoSInstancesResponseBodyInstanceInfo setDDoSBurstableOverseasProtection(String DDoSBurstableOverseasProtection) {
            this.DDoSBurstableOverseasProtection = DDoSBurstableOverseasProtection;
            return this;
        }
        public String getDDoSBurstableOverseasProtection() {
            return this.DDoSBurstableOverseasProtection;
        }

        public ListDDoSInstancesResponseBodyInstanceInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDDoSInstancesResponseBodyInstanceInfo setReserveReleaseTime(String reserveReleaseTime) {
            this.reserveReleaseTime = reserveReleaseTime;
            return this;
        }
        public String getReserveReleaseTime() {
            return this.reserveReleaseTime;
        }

        public ListDDoSInstancesResponseBodyInstanceInfo setSiteInstanceId(String siteInstanceId) {
            this.siteInstanceId = siteInstanceId;
            return this;
        }
        public String getSiteInstanceId() {
            return this.siteInstanceId;
        }

        public ListDDoSInstancesResponseBodyInstanceInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
