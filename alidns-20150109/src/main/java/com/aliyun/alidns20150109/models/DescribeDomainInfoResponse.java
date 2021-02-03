// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainId")
    @Validation(required = true)
    public String domainId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("PunyCode")
    @Validation(required = true)
    public String punyCode;

    @NameInMap("AliDomain")
    @Validation(required = true)
    public Boolean aliDomain;

    @NameInMap("Remark")
    @Validation(required = true)
    public String remark;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("GroupName")
    @Validation(required = true)
    public String groupName;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("VersionCode")
    @Validation(required = true)
    public String versionCode;

    @NameInMap("VersionName")
    @Validation(required = true)
    public String versionName;

    @NameInMap("MinTtl")
    @Validation(required = true)
    public Long minTtl;

    @NameInMap("RecordLineTreeJson")
    @Validation(required = true)
    public String recordLineTreeJson;

    @NameInMap("LineType")
    @Validation(required = true)
    public String lineType;

    @NameInMap("RegionLines")
    @Validation(required = true)
    public Boolean regionLines;

    @NameInMap("InBlackHole")
    @Validation(required = true)
    public Boolean inBlackHole;

    @NameInMap("InClean")
    @Validation(required = true)
    public Boolean inClean;

    @NameInMap("SlaveDns")
    @Validation(required = true)
    public Boolean slaveDns;

    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    public String resourceGroupId;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("RecordLines")
    @Validation(required = true)
    public DescribeDomainInfoResponseRecordLines recordLines;

    @NameInMap("DnsServers")
    @Validation(required = true)
    public DescribeDomainInfoResponseDnsServers dnsServers;

    @NameInMap("AvailableTtls")
    @Validation(required = true)
    public DescribeDomainInfoResponseAvailableTtls availableTtls;

    public static DescribeDomainInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainInfoResponse self = new DescribeDomainInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainInfoResponse setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public DescribeDomainInfoResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainInfoResponse setPunyCode(String punyCode) {
        this.punyCode = punyCode;
        return this;
    }
    public String getPunyCode() {
        return this.punyCode;
    }

    public DescribeDomainInfoResponse setAliDomain(Boolean aliDomain) {
        this.aliDomain = aliDomain;
        return this;
    }
    public Boolean getAliDomain() {
        return this.aliDomain;
    }

    public DescribeDomainInfoResponse setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeDomainInfoResponse setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDomainInfoResponse setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeDomainInfoResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDomainInfoResponse setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

    public DescribeDomainInfoResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public DescribeDomainInfoResponse setMinTtl(Long minTtl) {
        this.minTtl = minTtl;
        return this;
    }
    public Long getMinTtl() {
        return this.minTtl;
    }

    public DescribeDomainInfoResponse setRecordLineTreeJson(String recordLineTreeJson) {
        this.recordLineTreeJson = recordLineTreeJson;
        return this;
    }
    public String getRecordLineTreeJson() {
        return this.recordLineTreeJson;
    }

    public DescribeDomainInfoResponse setLineType(String lineType) {
        this.lineType = lineType;
        return this;
    }
    public String getLineType() {
        return this.lineType;
    }

    public DescribeDomainInfoResponse setRegionLines(Boolean regionLines) {
        this.regionLines = regionLines;
        return this;
    }
    public Boolean getRegionLines() {
        return this.regionLines;
    }

    public DescribeDomainInfoResponse setInBlackHole(Boolean inBlackHole) {
        this.inBlackHole = inBlackHole;
        return this;
    }
    public Boolean getInBlackHole() {
        return this.inBlackHole;
    }

    public DescribeDomainInfoResponse setInClean(Boolean inClean) {
        this.inClean = inClean;
        return this;
    }
    public Boolean getInClean() {
        return this.inClean;
    }

    public DescribeDomainInfoResponse setSlaveDns(Boolean slaveDns) {
        this.slaveDns = slaveDns;
        return this;
    }
    public Boolean getSlaveDns() {
        return this.slaveDns;
    }

    public DescribeDomainInfoResponse setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDomainInfoResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDomainInfoResponse setRecordLines(DescribeDomainInfoResponseRecordLines recordLines) {
        this.recordLines = recordLines;
        return this;
    }
    public DescribeDomainInfoResponseRecordLines getRecordLines() {
        return this.recordLines;
    }

    public DescribeDomainInfoResponse setDnsServers(DescribeDomainInfoResponseDnsServers dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }
    public DescribeDomainInfoResponseDnsServers getDnsServers() {
        return this.dnsServers;
    }

    public DescribeDomainInfoResponse setAvailableTtls(DescribeDomainInfoResponseAvailableTtls availableTtls) {
        this.availableTtls = availableTtls;
        return this;
    }
    public DescribeDomainInfoResponseAvailableTtls getAvailableTtls() {
        return this.availableTtls;
    }

    public static class DescribeDomainInfoResponseRecordLinesRecordLine extends TeaModel {
        @NameInMap("LineCode")
        @Validation(required = true)
        public String lineCode;

        @NameInMap("FatherCode")
        @Validation(required = true)
        public String fatherCode;

        @NameInMap("LineName")
        @Validation(required = true)
        public String lineName;

        @NameInMap("LineDisplayName")
        @Validation(required = true)
        public String lineDisplayName;

        public static DescribeDomainInfoResponseRecordLinesRecordLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainInfoResponseRecordLinesRecordLine self = new DescribeDomainInfoResponseRecordLinesRecordLine();
            return TeaModel.build(map, self);
        }

        public DescribeDomainInfoResponseRecordLinesRecordLine setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeDomainInfoResponseRecordLinesRecordLine setFatherCode(String fatherCode) {
            this.fatherCode = fatherCode;
            return this;
        }
        public String getFatherCode() {
            return this.fatherCode;
        }

        public DescribeDomainInfoResponseRecordLinesRecordLine setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeDomainInfoResponseRecordLinesRecordLine setLineDisplayName(String lineDisplayName) {
            this.lineDisplayName = lineDisplayName;
            return this;
        }
        public String getLineDisplayName() {
            return this.lineDisplayName;
        }

    }

    public static class DescribeDomainInfoResponseRecordLines extends TeaModel {
        @NameInMap("RecordLine")
        @Validation(required = true)
        public java.util.List<DescribeDomainInfoResponseRecordLinesRecordLine> recordLine;

        public static DescribeDomainInfoResponseRecordLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainInfoResponseRecordLines self = new DescribeDomainInfoResponseRecordLines();
            return TeaModel.build(map, self);
        }

        public DescribeDomainInfoResponseRecordLines setRecordLine(java.util.List<DescribeDomainInfoResponseRecordLinesRecordLine> recordLine) {
            this.recordLine = recordLine;
            return this;
        }
        public java.util.List<DescribeDomainInfoResponseRecordLinesRecordLine> getRecordLine() {
            return this.recordLine;
        }

    }

    public static class DescribeDomainInfoResponseDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        @Validation(required = true)
        public java.util.List<String> dnsServer;

        public static DescribeDomainInfoResponseDnsServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainInfoResponseDnsServers self = new DescribeDomainInfoResponseDnsServers();
            return TeaModel.build(map, self);
        }

        public DescribeDomainInfoResponseDnsServers setDnsServer(java.util.List<String> dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public java.util.List<String> getDnsServer() {
            return this.dnsServer;
        }

    }

    public static class DescribeDomainInfoResponseAvailableTtls extends TeaModel {
        @NameInMap("AvailableTtl")
        @Validation(required = true)
        public java.util.List<String> availableTtl;

        public static DescribeDomainInfoResponseAvailableTtls build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainInfoResponseAvailableTtls self = new DescribeDomainInfoResponseAvailableTtls();
            return TeaModel.build(map, self);
        }

        public DescribeDomainInfoResponseAvailableTtls setAvailableTtl(java.util.List<String> availableTtl) {
            this.availableTtl = availableTtl;
            return this;
        }
        public java.util.List<String> getAvailableTtl() {
            return this.availableTtl;
        }

    }

}
