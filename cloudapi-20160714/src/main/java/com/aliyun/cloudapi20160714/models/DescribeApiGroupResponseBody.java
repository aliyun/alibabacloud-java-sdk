// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiGroupResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("CompatibleFlags")
    public String compatibleFlags;

    @NameInMap("BasePath")
    public String basePath;

    @NameInMap("Ipv6Status")
    public String ipv6Status;

    @NameInMap("UserLogConfig")
    public String userLogConfig;

    @NameInMap("CustomerConfigs")
    public String customerConfigs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Description")
    public String description;

    @NameInMap("HttpsPolicy")
    public String httpsPolicy;

    @NameInMap("SubDomain")
    public String subDomain;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("RpcPattern")
    public String rpcPattern;

    @NameInMap("DefaultDomain")
    public String defaultDomain;

    @NameInMap("CmsMonitorGroup")
    public String cmsMonitorGroup;

    @NameInMap("BillingStatus")
    public String billingStatus;

    @NameInMap("TrafficLimit")
    public Integer trafficLimit;

    @NameInMap("PassthroughHeaders")
    public String passthroughHeaders;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VpcDomain")
    public String vpcDomain;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("CustomTraceConfig")
    public String customTraceConfig;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ModifiedTime")
    public String modifiedTime;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("ClassicVpcSubDomain")
    public String classicVpcSubDomain;

    @NameInMap("IllegalStatus")
    public String illegalStatus;

    @NameInMap("InstanceVipList")
    public String instanceVipList;

    @NameInMap("VpcSlbIntranetDomain")
    public String vpcSlbIntranetDomain;

    @NameInMap("CustomDomains")
    public DescribeApiGroupResponseBodyCustomDomains customDomains;

    @NameInMap("StageItems")
    public DescribeApiGroupResponseBodyStageItems stageItems;

    public static DescribeApiGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupResponseBody self = new DescribeApiGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeApiGroupResponseBody setCompatibleFlags(String compatibleFlags) {
        this.compatibleFlags = compatibleFlags;
        return this;
    }
    public String getCompatibleFlags() {
        return this.compatibleFlags;
    }

    public DescribeApiGroupResponseBody setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public DescribeApiGroupResponseBody setIpv6Status(String ipv6Status) {
        this.ipv6Status = ipv6Status;
        return this;
    }
    public String getIpv6Status() {
        return this.ipv6Status;
    }

    public DescribeApiGroupResponseBody setUserLogConfig(String userLogConfig) {
        this.userLogConfig = userLogConfig;
        return this;
    }
    public String getUserLogConfig() {
        return this.userLogConfig;
    }

    public DescribeApiGroupResponseBody setCustomerConfigs(String customerConfigs) {
        this.customerConfigs = customerConfigs;
        return this;
    }
    public String getCustomerConfigs() {
        return this.customerConfigs;
    }

    public DescribeApiGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiGroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeApiGroupResponseBody setHttpsPolicy(String httpsPolicy) {
        this.httpsPolicy = httpsPolicy;
        return this;
    }
    public String getHttpsPolicy() {
        return this.httpsPolicy;
    }

    public DescribeApiGroupResponseBody setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

    public DescribeApiGroupResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeApiGroupResponseBody setRpcPattern(String rpcPattern) {
        this.rpcPattern = rpcPattern;
        return this;
    }
    public String getRpcPattern() {
        return this.rpcPattern;
    }

    public DescribeApiGroupResponseBody setDefaultDomain(String defaultDomain) {
        this.defaultDomain = defaultDomain;
        return this;
    }
    public String getDefaultDomain() {
        return this.defaultDomain;
    }

    public DescribeApiGroupResponseBody setCmsMonitorGroup(String cmsMonitorGroup) {
        this.cmsMonitorGroup = cmsMonitorGroup;
        return this;
    }
    public String getCmsMonitorGroup() {
        return this.cmsMonitorGroup;
    }

    public DescribeApiGroupResponseBody setBillingStatus(String billingStatus) {
        this.billingStatus = billingStatus;
        return this;
    }
    public String getBillingStatus() {
        return this.billingStatus;
    }

    public DescribeApiGroupResponseBody setTrafficLimit(Integer trafficLimit) {
        this.trafficLimit = trafficLimit;
        return this;
    }
    public Integer getTrafficLimit() {
        return this.trafficLimit;
    }

    public DescribeApiGroupResponseBody setPassthroughHeaders(String passthroughHeaders) {
        this.passthroughHeaders = passthroughHeaders;
        return this;
    }
    public String getPassthroughHeaders() {
        return this.passthroughHeaders;
    }

    public DescribeApiGroupResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeApiGroupResponseBody setVpcDomain(String vpcDomain) {
        this.vpcDomain = vpcDomain;
        return this;
    }
    public String getVpcDomain() {
        return this.vpcDomain;
    }

    public DescribeApiGroupResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeApiGroupResponseBody setCustomTraceConfig(String customTraceConfig) {
        this.customTraceConfig = customTraceConfig;
        return this;
    }
    public String getCustomTraceConfig() {
        return this.customTraceConfig;
    }

    public DescribeApiGroupResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApiGroupResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public DescribeApiGroupResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiGroupResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeApiGroupResponseBody setClassicVpcSubDomain(String classicVpcSubDomain) {
        this.classicVpcSubDomain = classicVpcSubDomain;
        return this;
    }
    public String getClassicVpcSubDomain() {
        return this.classicVpcSubDomain;
    }

    public DescribeApiGroupResponseBody setIllegalStatus(String illegalStatus) {
        this.illegalStatus = illegalStatus;
        return this;
    }
    public String getIllegalStatus() {
        return this.illegalStatus;
    }

    public DescribeApiGroupResponseBody setInstanceVipList(String instanceVipList) {
        this.instanceVipList = instanceVipList;
        return this;
    }
    public String getInstanceVipList() {
        return this.instanceVipList;
    }

    public DescribeApiGroupResponseBody setVpcSlbIntranetDomain(String vpcSlbIntranetDomain) {
        this.vpcSlbIntranetDomain = vpcSlbIntranetDomain;
        return this;
    }
    public String getVpcSlbIntranetDomain() {
        return this.vpcSlbIntranetDomain;
    }

    public DescribeApiGroupResponseBody setCustomDomains(DescribeApiGroupResponseBodyCustomDomains customDomains) {
        this.customDomains = customDomains;
        return this;
    }
    public DescribeApiGroupResponseBodyCustomDomains getCustomDomains() {
        return this.customDomains;
    }

    public DescribeApiGroupResponseBody setStageItems(DescribeApiGroupResponseBodyStageItems stageItems) {
        this.stageItems = stageItems;
        return this;
    }
    public DescribeApiGroupResponseBodyStageItems getStageItems() {
        return this.stageItems;
    }

    public static class DescribeApiGroupResponseBodyCustomDomainsDomainItem extends TeaModel {
        @NameInMap("BindStageName")
        public String bindStageName;

        @NameInMap("DomainLegalStatus")
        public String domainLegalStatus;

        @NameInMap("CertificateName")
        public String certificateName;

        @NameInMap("CustomDomainType")
        public String customDomainType;

        @NameInMap("DomainCNAMEStatus")
        public String domainCNAMEStatus;

        @NameInMap("WildcardDomainPatterns")
        public String wildcardDomainPatterns;

        @NameInMap("DomainBindingStatus")
        public String domainBindingStatus;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainRemark")
        public String domainRemark;

        @NameInMap("DomainWebSocketStatus")
        public String domainWebSocketStatus;

        @NameInMap("CertificateId")
        public String certificateId;

        public static DescribeApiGroupResponseBodyCustomDomainsDomainItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupResponseBodyCustomDomainsDomainItem self = new DescribeApiGroupResponseBodyCustomDomainsDomainItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupResponseBodyCustomDomainsDomainItem setBindStageName(String bindStageName) {
            this.bindStageName = bindStageName;
            return this;
        }
        public String getBindStageName() {
            return this.bindStageName;
        }

        public DescribeApiGroupResponseBodyCustomDomainsDomainItem setDomainLegalStatus(String domainLegalStatus) {
            this.domainLegalStatus = domainLegalStatus;
            return this;
        }
        public String getDomainLegalStatus() {
            return this.domainLegalStatus;
        }

        public DescribeApiGroupResponseBodyCustomDomainsDomainItem setCertificateName(String certificateName) {
            this.certificateName = certificateName;
            return this;
        }
        public String getCertificateName() {
            return this.certificateName;
        }

        public DescribeApiGroupResponseBodyCustomDomainsDomainItem setCustomDomainType(String customDomainType) {
            this.customDomainType = customDomainType;
            return this;
        }
        public String getCustomDomainType() {
            return this.customDomainType;
        }

        public DescribeApiGroupResponseBodyCustomDomainsDomainItem setDomainCNAMEStatus(String domainCNAMEStatus) {
            this.domainCNAMEStatus = domainCNAMEStatus;
            return this;
        }
        public String getDomainCNAMEStatus() {
            return this.domainCNAMEStatus;
        }

        public DescribeApiGroupResponseBodyCustomDomainsDomainItem setWildcardDomainPatterns(String wildcardDomainPatterns) {
            this.wildcardDomainPatterns = wildcardDomainPatterns;
            return this;
        }
        public String getWildcardDomainPatterns() {
            return this.wildcardDomainPatterns;
        }

        public DescribeApiGroupResponseBodyCustomDomainsDomainItem setDomainBindingStatus(String domainBindingStatus) {
            this.domainBindingStatus = domainBindingStatus;
            return this;
        }
        public String getDomainBindingStatus() {
            return this.domainBindingStatus;
        }

        public DescribeApiGroupResponseBodyCustomDomainsDomainItem setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeApiGroupResponseBodyCustomDomainsDomainItem setDomainRemark(String domainRemark) {
            this.domainRemark = domainRemark;
            return this;
        }
        public String getDomainRemark() {
            return this.domainRemark;
        }

        public DescribeApiGroupResponseBodyCustomDomainsDomainItem setDomainWebSocketStatus(String domainWebSocketStatus) {
            this.domainWebSocketStatus = domainWebSocketStatus;
            return this;
        }
        public String getDomainWebSocketStatus() {
            return this.domainWebSocketStatus;
        }

        public DescribeApiGroupResponseBodyCustomDomainsDomainItem setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

    }

    public static class DescribeApiGroupResponseBodyCustomDomains extends TeaModel {
        @NameInMap("DomainItem")
        public java.util.List<DescribeApiGroupResponseBodyCustomDomainsDomainItem> domainItem;

        public static DescribeApiGroupResponseBodyCustomDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupResponseBodyCustomDomains self = new DescribeApiGroupResponseBodyCustomDomains();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupResponseBodyCustomDomains setDomainItem(java.util.List<DescribeApiGroupResponseBodyCustomDomainsDomainItem> domainItem) {
            this.domainItem = domainItem;
            return this;
        }
        public java.util.List<DescribeApiGroupResponseBodyCustomDomainsDomainItem> getDomainItem() {
            return this.domainItem;
        }

    }

    public static class DescribeApiGroupResponseBodyStageItemsStageInfo extends TeaModel {
        @NameInMap("StageId")
        public String stageId;

        @NameInMap("StageName")
        public String stageName;

        @NameInMap("Description")
        public String description;

        public static DescribeApiGroupResponseBodyStageItemsStageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupResponseBodyStageItemsStageInfo self = new DescribeApiGroupResponseBodyStageItemsStageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupResponseBodyStageItemsStageInfo setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public DescribeApiGroupResponseBodyStageItemsStageInfo setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeApiGroupResponseBodyStageItemsStageInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeApiGroupResponseBodyStageItems extends TeaModel {
        @NameInMap("StageInfo")
        public java.util.List<DescribeApiGroupResponseBodyStageItemsStageInfo> stageInfo;

        public static DescribeApiGroupResponseBodyStageItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupResponseBodyStageItems self = new DescribeApiGroupResponseBodyStageItems();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupResponseBodyStageItems setStageInfo(java.util.List<DescribeApiGroupResponseBodyStageItemsStageInfo> stageInfo) {
            this.stageInfo = stageInfo;
            return this;
        }
        public java.util.List<DescribeApiGroupResponseBodyStageItemsStageInfo> getStageInfo() {
            return this.stageInfo;
        }

    }

}
