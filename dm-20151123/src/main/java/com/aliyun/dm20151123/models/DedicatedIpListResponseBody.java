// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpListResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Indicates whether the next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasMore")
    public Boolean hasMore;

    /**
     * <p>The list of IP addresses.</p>
     */
    @NameInMap("Ips")
    public java.util.List<DedicatedIpListResponseBodyIps> ips;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of purchased IP addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCounts")
    public Integer totalCounts;

    public static DedicatedIpListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpListResponseBody self = new DedicatedIpListResponseBody();
        return TeaModel.build(map, self);
    }

    public DedicatedIpListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DedicatedIpListResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public DedicatedIpListResponseBody setIps(java.util.List<DedicatedIpListResponseBodyIps> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<DedicatedIpListResponseBodyIps> getIps() {
        return this.ips;
    }

    public DedicatedIpListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DedicatedIpListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DedicatedIpListResponseBody setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static class DedicatedIpListResponseBodyIpsIpExt extends TeaModel {
        /**
         * <p>Indicates whether auto-renewal is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoRenewal")
        public Boolean autoRenewal;

        /**
         * <p>Indicates whether emails have been sent.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasSendMail")
        public Boolean hasSendMail;

        @NameInMap("LastWarmUpTypeChangedTime")
        public String lastWarmUpTypeChangedTime;

        public static DedicatedIpListResponseBodyIpsIpExt build(java.util.Map<String, ?> map) throws Exception {
            DedicatedIpListResponseBodyIpsIpExt self = new DedicatedIpListResponseBodyIpsIpExt();
            return TeaModel.build(map, self);
        }

        public DedicatedIpListResponseBodyIpsIpExt setAutoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        public DedicatedIpListResponseBodyIpsIpExt setHasSendMail(Boolean hasSendMail) {
            this.hasSendMail = hasSendMail;
            return this;
        }
        public Boolean getHasSendMail() {
            return this.hasSendMail;
        }

        public DedicatedIpListResponseBodyIpsIpExt setLastWarmUpTypeChangedTime(String lastWarmUpTypeChangedTime) {
            this.lastWarmUpTypeChangedTime = lastWarmUpTypeChangedTime;
            return this;
        }
        public String getLastWarmUpTypeChangedTime() {
            return this.lastWarmUpTypeChangedTime;
        }

    }

    public static class DedicatedIpListResponseBodyIps extends TeaModel {
        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-12T09:19:20Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The IP address ID. This is the same as the purchased instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the purchased instance.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The extended information.</p>
         */
        @NameInMap("IpExt")
        public DedicatedIpListResponseBodyIpsIpExt ipExt;

        /**
         * <p>The name of the IP pool to which the IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("IpPoolName")
        public String ipPoolName;

        /**
         * <p>The purchase time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-12T09:19:20Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>sold</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The prefetch status.</p>
         * 
         * <strong>example:</strong>
         * <p>finish</p>
         */
        @NameInMap("WarmupStatus")
        public String warmupStatus;

        /**
         * <p>The prefetch method.</p>
         * 
         * <strong>example:</strong>
         * <p>cusSelfManager</p>
         */
        @NameInMap("WarmupType")
        public String warmupType;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DedicatedIpListResponseBodyIps build(java.util.Map<String, ?> map) throws Exception {
            DedicatedIpListResponseBodyIps self = new DedicatedIpListResponseBodyIps();
            return TeaModel.build(map, self);
        }

        public DedicatedIpListResponseBodyIps setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DedicatedIpListResponseBodyIps setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DedicatedIpListResponseBodyIps setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DedicatedIpListResponseBodyIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DedicatedIpListResponseBodyIps setIpExt(DedicatedIpListResponseBodyIpsIpExt ipExt) {
            this.ipExt = ipExt;
            return this;
        }
        public DedicatedIpListResponseBodyIpsIpExt getIpExt() {
            return this.ipExt;
        }

        public DedicatedIpListResponseBodyIps setIpPoolName(String ipPoolName) {
            this.ipPoolName = ipPoolName;
            return this;
        }
        public String getIpPoolName() {
            return this.ipPoolName;
        }

        public DedicatedIpListResponseBodyIps setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DedicatedIpListResponseBodyIps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DedicatedIpListResponseBodyIps setWarmupStatus(String warmupStatus) {
            this.warmupStatus = warmupStatus;
            return this;
        }
        public String getWarmupStatus() {
            return this.warmupStatus;
        }

        public DedicatedIpListResponseBodyIps setWarmupType(String warmupType) {
            this.warmupType = warmupType;
            return this;
        }
        public String getWarmupType() {
            return this.warmupType;
        }

        public DedicatedIpListResponseBodyIps setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
