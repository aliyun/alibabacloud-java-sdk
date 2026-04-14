// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpListResponseBody extends TeaModel {
    /**
     * <p>Current page</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Whether there is a next page</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasMore")
    public Boolean hasMore;

    /**
     * <p>IP list</p>
     */
    @NameInMap("Ips")
    public java.util.List<DedicatedIpListResponseBodyIps> ips;

    /**
     * <p>Page size</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total amount of purchased IP data</p>
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
         * <p>Whether auto-renewal is enabled</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoRenewal")
        public Boolean autoRenewal;

        /**
         * <p>Whether an email has been sent</p>
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
         * <p>Expiration time</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-12T09:19:20Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>IP ID, consistent with the purchased instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Purchased instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>IP address</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>Extended information</p>
         */
        @NameInMap("IpExt")
        public DedicatedIpListResponseBodyIpsIpExt ipExt;

        /**
         * <p>Name of the IP pool</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("IpPoolName")
        public String ipPoolName;

        /**
         * <p>Purchase time</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-12T09:19:20Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>IP status</p>
         * 
         * <strong>example:</strong>
         * <p>sold</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Warm-up status</p>
         * 
         * <strong>example:</strong>
         * <p>finish</p>
         */
        @NameInMap("WarmupStatus")
        public String warmupStatus;

        /**
         * <p>Warm-up method</p>
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
