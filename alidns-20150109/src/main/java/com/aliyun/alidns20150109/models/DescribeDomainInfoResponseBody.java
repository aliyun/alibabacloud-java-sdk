// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainInfoResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the domain name was registered in Alibaba Cloud.</p>
     */
    @NameInMap("AliDomain")
    public Boolean aliDomain;

    /**
     * <p>The available time to live (TTL) values that can be configured for the domain name. Available TTL values are not returned by default. If you want to query such information, set NeedDetailAttributes to true.</p>
     */
    @NameInMap("AvailableTtls")
    public DescribeDomainInfoResponseBodyAvailableTtls availableTtls;

    /**
     * <p>The time when the domain name was created.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The DNS servers that are used to resolve the domain name.</p>
     */
    @NameInMap("DnsServers")
    public DescribeDomainInfoResponseBodyDnsServers dnsServers;

    /**
     * <p>The ID of the domain name.</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    @NameInMap("DomainLoggingSwitchStatus")
    public String domainLoggingSwitchStatus;

    /**
     * <p>The domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the domain name group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the domain name group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Indicates whether blackhole filtering was triggered.</p>
     */
    @NameInMap("InBlackHole")
    public Boolean inBlackHole;

    /**
     * <p>Indicates whether traffic scrubbing was in progress.</p>
     */
    @NameInMap("InClean")
    public Boolean inClean;

    /**
     * <p>The ID of the Alibaba Cloud DNS instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the DNS request line.</p>
     */
    @NameInMap("LineType")
    public String lineType;

    /**
     * <p>The minimum TTL value.</p>
     */
    @NameInMap("MinTtl")
    public Long minTtl;

    /**
     * <p>The Punycode for the domain name. This parameter is returned only for Chinese domain names.</p>
     */
    @NameInMap("PunyCode")
    public String punyCode;

    /**
     * <p>The tree-structure DNS request lines.</p>
     */
    @NameInMap("RecordLineTreeJson")
    public String recordLineTreeJson;

    /**
     * <p>The DNS request lines.</p>
     */
    @NameInMap("RecordLines")
    public DescribeDomainInfoResponseBodyRecordLines recordLines;

    /**
     * <p>Indicates whether the DNS request lines are regional lines.</p>
     */
    @NameInMap("RegionLines")
    public Boolean regionLines;

    /**
     * <p>The description.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Indicates whether secondary DNS is supported.</p>
     */
    @NameInMap("SlaveDns")
    public Boolean slaveDns;

    @NameInMap("SubDomain")
    public Boolean subDomain;

    /**
     * <p>The version ID of Alibaba Cloud DNS.</p>
     */
    @NameInMap("VersionCode")
    public String versionCode;

    /**
     * <p>The edition of Alibaba Cloud DNS.</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static DescribeDomainInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainInfoResponseBody self = new DescribeDomainInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainInfoResponseBody setAliDomain(Boolean aliDomain) {
        this.aliDomain = aliDomain;
        return this;
    }
    public Boolean getAliDomain() {
        return this.aliDomain;
    }

    public DescribeDomainInfoResponseBody setAvailableTtls(DescribeDomainInfoResponseBodyAvailableTtls availableTtls) {
        this.availableTtls = availableTtls;
        return this;
    }
    public DescribeDomainInfoResponseBodyAvailableTtls getAvailableTtls() {
        return this.availableTtls;
    }

    public DescribeDomainInfoResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDomainInfoResponseBody setDnsServers(DescribeDomainInfoResponseBodyDnsServers dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }
    public DescribeDomainInfoResponseBodyDnsServers getDnsServers() {
        return this.dnsServers;
    }

    public DescribeDomainInfoResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public DescribeDomainInfoResponseBody setDomainLoggingSwitchStatus(String domainLoggingSwitchStatus) {
        this.domainLoggingSwitchStatus = domainLoggingSwitchStatus;
        return this;
    }
    public String getDomainLoggingSwitchStatus() {
        return this.domainLoggingSwitchStatus;
    }

    public DescribeDomainInfoResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainInfoResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDomainInfoResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeDomainInfoResponseBody setInBlackHole(Boolean inBlackHole) {
        this.inBlackHole = inBlackHole;
        return this;
    }
    public Boolean getInBlackHole() {
        return this.inBlackHole;
    }

    public DescribeDomainInfoResponseBody setInClean(Boolean inClean) {
        this.inClean = inClean;
        return this;
    }
    public Boolean getInClean() {
        return this.inClean;
    }

    public DescribeDomainInfoResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDomainInfoResponseBody setLineType(String lineType) {
        this.lineType = lineType;
        return this;
    }
    public String getLineType() {
        return this.lineType;
    }

    public DescribeDomainInfoResponseBody setMinTtl(Long minTtl) {
        this.minTtl = minTtl;
        return this;
    }
    public Long getMinTtl() {
        return this.minTtl;
    }

    public DescribeDomainInfoResponseBody setPunyCode(String punyCode) {
        this.punyCode = punyCode;
        return this;
    }
    public String getPunyCode() {
        return this.punyCode;
    }

    public DescribeDomainInfoResponseBody setRecordLineTreeJson(String recordLineTreeJson) {
        this.recordLineTreeJson = recordLineTreeJson;
        return this;
    }
    public String getRecordLineTreeJson() {
        return this.recordLineTreeJson;
    }

    public DescribeDomainInfoResponseBody setRecordLines(DescribeDomainInfoResponseBodyRecordLines recordLines) {
        this.recordLines = recordLines;
        return this;
    }
    public DescribeDomainInfoResponseBodyRecordLines getRecordLines() {
        return this.recordLines;
    }

    public DescribeDomainInfoResponseBody setRegionLines(Boolean regionLines) {
        this.regionLines = regionLines;
        return this;
    }
    public Boolean getRegionLines() {
        return this.regionLines;
    }

    public DescribeDomainInfoResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeDomainInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainInfoResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDomainInfoResponseBody setSlaveDns(Boolean slaveDns) {
        this.slaveDns = slaveDns;
        return this;
    }
    public Boolean getSlaveDns() {
        return this.slaveDns;
    }

    public DescribeDomainInfoResponseBody setSubDomain(Boolean subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public Boolean getSubDomain() {
        return this.subDomain;
    }

    public DescribeDomainInfoResponseBody setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

    public DescribeDomainInfoResponseBody setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public static class DescribeDomainInfoResponseBodyAvailableTtls extends TeaModel {
        @NameInMap("AvailableTtl")
        public java.util.List<String> availableTtl;

        public static DescribeDomainInfoResponseBodyAvailableTtls build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainInfoResponseBodyAvailableTtls self = new DescribeDomainInfoResponseBodyAvailableTtls();
            return TeaModel.build(map, self);
        }

        public DescribeDomainInfoResponseBodyAvailableTtls setAvailableTtl(java.util.List<String> availableTtl) {
            this.availableTtl = availableTtl;
            return this;
        }
        public java.util.List<String> getAvailableTtl() {
            return this.availableTtl;
        }

    }

    public static class DescribeDomainInfoResponseBodyDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        public java.util.List<String> dnsServer;

        public static DescribeDomainInfoResponseBodyDnsServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainInfoResponseBodyDnsServers self = new DescribeDomainInfoResponseBodyDnsServers();
            return TeaModel.build(map, self);
        }

        public DescribeDomainInfoResponseBodyDnsServers setDnsServer(java.util.List<String> dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public java.util.List<String> getDnsServer() {
            return this.dnsServer;
        }

    }

    public static class DescribeDomainInfoResponseBodyRecordLinesRecordLine extends TeaModel {
        /**
         * <p>The code of the parent line. This parameter is left empty if the line has no parent line.</p>
         */
        @NameInMap("FatherCode")
        public String fatherCode;

        /**
         * <p>The code of the line.</p>
         */
        @NameInMap("LineCode")
        public String lineCode;

        /**
         * <p>The name of the parent line.</p>
         */
        @NameInMap("LineDisplayName")
        public String lineDisplayName;

        /**
         * <p>The name of the line.</p>
         */
        @NameInMap("LineName")
        public String lineName;

        public static DescribeDomainInfoResponseBodyRecordLinesRecordLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainInfoResponseBodyRecordLinesRecordLine self = new DescribeDomainInfoResponseBodyRecordLinesRecordLine();
            return TeaModel.build(map, self);
        }

        public DescribeDomainInfoResponseBodyRecordLinesRecordLine setFatherCode(String fatherCode) {
            this.fatherCode = fatherCode;
            return this;
        }
        public String getFatherCode() {
            return this.fatherCode;
        }

        public DescribeDomainInfoResponseBodyRecordLinesRecordLine setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeDomainInfoResponseBodyRecordLinesRecordLine setLineDisplayName(String lineDisplayName) {
            this.lineDisplayName = lineDisplayName;
            return this;
        }
        public String getLineDisplayName() {
            return this.lineDisplayName;
        }

        public DescribeDomainInfoResponseBodyRecordLinesRecordLine setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

    }

    public static class DescribeDomainInfoResponseBodyRecordLines extends TeaModel {
        @NameInMap("RecordLine")
        public java.util.List<DescribeDomainInfoResponseBodyRecordLinesRecordLine> recordLine;

        public static DescribeDomainInfoResponseBodyRecordLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainInfoResponseBodyRecordLines self = new DescribeDomainInfoResponseBodyRecordLines();
            return TeaModel.build(map, self);
        }

        public DescribeDomainInfoResponseBodyRecordLines setRecordLine(java.util.List<DescribeDomainInfoResponseBodyRecordLinesRecordLine> recordLine) {
            this.recordLine = recordLine;
            return this;
        }
        public java.util.List<DescribeDomainInfoResponseBodyRecordLinesRecordLine> getRecordLine() {
            return this.recordLine;
        }

    }

}
