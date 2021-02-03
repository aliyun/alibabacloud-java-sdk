// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainInfoResponseBody extends TeaModel {
    @NameInMap("RecordLineTreeJson")
    public String recordLineTreeJson;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("InBlackHole")
    public Boolean inBlackHole;

    @NameInMap("RegionLines")
    public Boolean regionLines;

    @NameInMap("SlaveDns")
    public Boolean slaveDns;

    @NameInMap("AliDomain")
    public Boolean aliDomain;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("PunyCode")
    public String punyCode;

    @NameInMap("DnsServers")
    public DescribeDomainInfoResponseBodyDnsServers dnsServers;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("VersionCode")
    public String versionCode;

    @NameInMap("RecordLines")
    public DescribeDomainInfoResponseBodyRecordLines recordLines;

    @NameInMap("DomainId")
    public String domainId;

    @NameInMap("AvailableTtls")
    public DescribeDomainInfoResponseBodyAvailableTtls availableTtls;

    @NameInMap("MinTtl")
    public Long minTtl;

    @NameInMap("InClean")
    public Boolean inClean;

    @NameInMap("VersionName")
    public String versionName;

    @NameInMap("LineType")
    public String lineType;

    public static DescribeDomainInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainInfoResponseBody self = new DescribeDomainInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainInfoResponseBody setRecordLineTreeJson(String recordLineTreeJson) {
        this.recordLineTreeJson = recordLineTreeJson;
        return this;
    }
    public String getRecordLineTreeJson() {
        return this.recordLineTreeJson;
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

    public DescribeDomainInfoResponseBody setRegionLines(Boolean regionLines) {
        this.regionLines = regionLines;
        return this;
    }
    public Boolean getRegionLines() {
        return this.regionLines;
    }

    public DescribeDomainInfoResponseBody setSlaveDns(Boolean slaveDns) {
        this.slaveDns = slaveDns;
        return this;
    }
    public Boolean getSlaveDns() {
        return this.slaveDns;
    }

    public DescribeDomainInfoResponseBody setAliDomain(Boolean aliDomain) {
        this.aliDomain = aliDomain;
        return this;
    }
    public Boolean getAliDomain() {
        return this.aliDomain;
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

    public DescribeDomainInfoResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDomainInfoResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainInfoResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDomainInfoResponseBody setPunyCode(String punyCode) {
        this.punyCode = punyCode;
        return this;
    }
    public String getPunyCode() {
        return this.punyCode;
    }

    public DescribeDomainInfoResponseBody setDnsServers(DescribeDomainInfoResponseBodyDnsServers dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }
    public DescribeDomainInfoResponseBodyDnsServers getDnsServers() {
        return this.dnsServers;
    }

    public DescribeDomainInfoResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeDomainInfoResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDomainInfoResponseBody setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

    public DescribeDomainInfoResponseBody setRecordLines(DescribeDomainInfoResponseBodyRecordLines recordLines) {
        this.recordLines = recordLines;
        return this;
    }
    public DescribeDomainInfoResponseBodyRecordLines getRecordLines() {
        return this.recordLines;
    }

    public DescribeDomainInfoResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public DescribeDomainInfoResponseBody setAvailableTtls(DescribeDomainInfoResponseBodyAvailableTtls availableTtls) {
        this.availableTtls = availableTtls;
        return this;
    }
    public DescribeDomainInfoResponseBodyAvailableTtls getAvailableTtls() {
        return this.availableTtls;
    }

    public DescribeDomainInfoResponseBody setMinTtl(Long minTtl) {
        this.minTtl = minTtl;
        return this;
    }
    public Long getMinTtl() {
        return this.minTtl;
    }

    public DescribeDomainInfoResponseBody setInClean(Boolean inClean) {
        this.inClean = inClean;
        return this;
    }
    public Boolean getInClean() {
        return this.inClean;
    }

    public DescribeDomainInfoResponseBody setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public DescribeDomainInfoResponseBody setLineType(String lineType) {
        this.lineType = lineType;
        return this;
    }
    public String getLineType() {
        return this.lineType;
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
        @NameInMap("FatherCode")
        public String fatherCode;

        @NameInMap("LineDisplayName")
        public String lineDisplayName;

        @NameInMap("LineCode")
        public String lineCode;

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

        public DescribeDomainInfoResponseBodyRecordLinesRecordLine setLineDisplayName(String lineDisplayName) {
            this.lineDisplayName = lineDisplayName;
            return this;
        }
        public String getLineDisplayName() {
            return this.lineDisplayName;
        }

        public DescribeDomainInfoResponseBodyRecordLinesRecordLine setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
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

}
