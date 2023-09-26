// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeApiGroupDetailResponseBody extends TeaModel {
    @NameInMap("BillingStatus")
    public String billingStatus;

    @NameInMap("ClassicVpcSubDomain")
    public String classicVpcSubDomain;

    @NameInMap("CompatibleFlags")
    public String compatibleFlags;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("CustomTraceConfig")
    public String customTraceConfig;

    @NameInMap("DefaultDomain")
    public String defaultDomain;

    @NameInMap("Description")
    public String description;

    @NameInMap("DomainItems")
    public DescribeApiGroupDetailResponseBodyDomainItems domainItems;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("HttpsPolicy")
    public String httpsPolicy;

    @NameInMap("IllegalStatus")
    public String illegalStatus;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InstanceVipList")
    public String instanceVipList;

    @NameInMap("Ipv6Status")
    public String ipv6Status;

    @NameInMap("ModifiedTime")
    public String modifiedTime;

    @NameInMap("PassthroughHeaders")
    public String passthroughHeaders;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RpcPattern")
    public String rpcPattern;

    @NameInMap("StageItems")
    public DescribeApiGroupDetailResponseBodyStageItems stageItems;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubDomain")
    public String subDomain;

    @NameInMap("TrafficLimit")
    public Integer trafficLimit;

    @NameInMap("UserLogConfig")
    public String userLogConfig;

    @NameInMap("VpcDomain")
    public String vpcDomain;

    public static DescribeApiGroupDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupDetailResponseBody self = new DescribeApiGroupDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupDetailResponseBody setBillingStatus(String billingStatus) {
        this.billingStatus = billingStatus;
        return this;
    }
    public String getBillingStatus() {
        return this.billingStatus;
    }

    public DescribeApiGroupDetailResponseBody setClassicVpcSubDomain(String classicVpcSubDomain) {
        this.classicVpcSubDomain = classicVpcSubDomain;
        return this;
    }
    public String getClassicVpcSubDomain() {
        return this.classicVpcSubDomain;
    }

    public DescribeApiGroupDetailResponseBody setCompatibleFlags(String compatibleFlags) {
        this.compatibleFlags = compatibleFlags;
        return this;
    }
    public String getCompatibleFlags() {
        return this.compatibleFlags;
    }

    public DescribeApiGroupDetailResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeApiGroupDetailResponseBody setCustomTraceConfig(String customTraceConfig) {
        this.customTraceConfig = customTraceConfig;
        return this;
    }
    public String getCustomTraceConfig() {
        return this.customTraceConfig;
    }

    public DescribeApiGroupDetailResponseBody setDefaultDomain(String defaultDomain) {
        this.defaultDomain = defaultDomain;
        return this;
    }
    public String getDefaultDomain() {
        return this.defaultDomain;
    }

    public DescribeApiGroupDetailResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeApiGroupDetailResponseBody setDomainItems(DescribeApiGroupDetailResponseBodyDomainItems domainItems) {
        this.domainItems = domainItems;
        return this;
    }
    public DescribeApiGroupDetailResponseBodyDomainItems getDomainItems() {
        return this.domainItems;
    }

    public DescribeApiGroupDetailResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiGroupDetailResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeApiGroupDetailResponseBody setHttpsPolicy(String httpsPolicy) {
        this.httpsPolicy = httpsPolicy;
        return this;
    }
    public String getHttpsPolicy() {
        return this.httpsPolicy;
    }

    public DescribeApiGroupDetailResponseBody setIllegalStatus(String illegalStatus) {
        this.illegalStatus = illegalStatus;
        return this;
    }
    public String getIllegalStatus() {
        return this.illegalStatus;
    }

    public DescribeApiGroupDetailResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeApiGroupDetailResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeApiGroupDetailResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeApiGroupDetailResponseBody setInstanceVipList(String instanceVipList) {
        this.instanceVipList = instanceVipList;
        return this;
    }
    public String getInstanceVipList() {
        return this.instanceVipList;
    }

    public DescribeApiGroupDetailResponseBody setIpv6Status(String ipv6Status) {
        this.ipv6Status = ipv6Status;
        return this;
    }
    public String getIpv6Status() {
        return this.ipv6Status;
    }

    public DescribeApiGroupDetailResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public DescribeApiGroupDetailResponseBody setPassthroughHeaders(String passthroughHeaders) {
        this.passthroughHeaders = passthroughHeaders;
        return this;
    }
    public String getPassthroughHeaders() {
        return this.passthroughHeaders;
    }

    public DescribeApiGroupDetailResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApiGroupDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiGroupDetailResponseBody setRpcPattern(String rpcPattern) {
        this.rpcPattern = rpcPattern;
        return this;
    }
    public String getRpcPattern() {
        return this.rpcPattern;
    }

    public DescribeApiGroupDetailResponseBody setStageItems(DescribeApiGroupDetailResponseBodyStageItems stageItems) {
        this.stageItems = stageItems;
        return this;
    }
    public DescribeApiGroupDetailResponseBodyStageItems getStageItems() {
        return this.stageItems;
    }

    public DescribeApiGroupDetailResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeApiGroupDetailResponseBody setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

    public DescribeApiGroupDetailResponseBody setTrafficLimit(Integer trafficLimit) {
        this.trafficLimit = trafficLimit;
        return this;
    }
    public Integer getTrafficLimit() {
        return this.trafficLimit;
    }

    public DescribeApiGroupDetailResponseBody setUserLogConfig(String userLogConfig) {
        this.userLogConfig = userLogConfig;
        return this;
    }
    public String getUserLogConfig() {
        return this.userLogConfig;
    }

    public DescribeApiGroupDetailResponseBody setVpcDomain(String vpcDomain) {
        this.vpcDomain = vpcDomain;
        return this;
    }
    public String getVpcDomain() {
        return this.vpcDomain;
    }

    public static class DescribeApiGroupDetailResponseBodyDomainItemsDomainItem extends TeaModel {
        @NameInMap("BindStageName")
        public String bindStageName;

        @NameInMap("CertificateId")
        public String certificateId;

        @NameInMap("CertificateName")
        public String certificateName;

        @NameInMap("DomainBindingStatus")
        public String domainBindingStatus;

        @NameInMap("DomainLegalStatus")
        public String domainLegalStatus;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainNameResolution")
        public String domainNameResolution;

        @NameInMap("DomainRemark")
        public String domainRemark;

        @NameInMap("DomainWebSocketStatus")
        public String domainWebSocketStatus;

        @NameInMap("WildcardDomainPatterns")
        public String wildcardDomainPatterns;

        public static DescribeApiGroupDetailResponseBodyDomainItemsDomainItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupDetailResponseBodyDomainItemsDomainItem self = new DescribeApiGroupDetailResponseBodyDomainItemsDomainItem();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupDetailResponseBodyDomainItemsDomainItem setBindStageName(String bindStageName) {
            this.bindStageName = bindStageName;
            return this;
        }
        public String getBindStageName() {
            return this.bindStageName;
        }

        public DescribeApiGroupDetailResponseBodyDomainItemsDomainItem setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

        public DescribeApiGroupDetailResponseBodyDomainItemsDomainItem setCertificateName(String certificateName) {
            this.certificateName = certificateName;
            return this;
        }
        public String getCertificateName() {
            return this.certificateName;
        }

        public DescribeApiGroupDetailResponseBodyDomainItemsDomainItem setDomainBindingStatus(String domainBindingStatus) {
            this.domainBindingStatus = domainBindingStatus;
            return this;
        }
        public String getDomainBindingStatus() {
            return this.domainBindingStatus;
        }

        public DescribeApiGroupDetailResponseBodyDomainItemsDomainItem setDomainLegalStatus(String domainLegalStatus) {
            this.domainLegalStatus = domainLegalStatus;
            return this;
        }
        public String getDomainLegalStatus() {
            return this.domainLegalStatus;
        }

        public DescribeApiGroupDetailResponseBodyDomainItemsDomainItem setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeApiGroupDetailResponseBodyDomainItemsDomainItem setDomainNameResolution(String domainNameResolution) {
            this.domainNameResolution = domainNameResolution;
            return this;
        }
        public String getDomainNameResolution() {
            return this.domainNameResolution;
        }

        public DescribeApiGroupDetailResponseBodyDomainItemsDomainItem setDomainRemark(String domainRemark) {
            this.domainRemark = domainRemark;
            return this;
        }
        public String getDomainRemark() {
            return this.domainRemark;
        }

        public DescribeApiGroupDetailResponseBodyDomainItemsDomainItem setDomainWebSocketStatus(String domainWebSocketStatus) {
            this.domainWebSocketStatus = domainWebSocketStatus;
            return this;
        }
        public String getDomainWebSocketStatus() {
            return this.domainWebSocketStatus;
        }

        public DescribeApiGroupDetailResponseBodyDomainItemsDomainItem setWildcardDomainPatterns(String wildcardDomainPatterns) {
            this.wildcardDomainPatterns = wildcardDomainPatterns;
            return this;
        }
        public String getWildcardDomainPatterns() {
            return this.wildcardDomainPatterns;
        }

    }

    public static class DescribeApiGroupDetailResponseBodyDomainItems extends TeaModel {
        @NameInMap("DomainItem")
        public java.util.List<DescribeApiGroupDetailResponseBodyDomainItemsDomainItem> domainItem;

        public static DescribeApiGroupDetailResponseBodyDomainItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupDetailResponseBodyDomainItems self = new DescribeApiGroupDetailResponseBodyDomainItems();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupDetailResponseBodyDomainItems setDomainItem(java.util.List<DescribeApiGroupDetailResponseBodyDomainItemsDomainItem> domainItem) {
            this.domainItem = domainItem;
            return this;
        }
        public java.util.List<DescribeApiGroupDetailResponseBodyDomainItemsDomainItem> getDomainItem() {
            return this.domainItem;
        }

    }

    public static class DescribeApiGroupDetailResponseBodyStageItemsStageInfo extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("StageId")
        public String stageId;

        @NameInMap("StageName")
        public String stageName;

        public static DescribeApiGroupDetailResponseBodyStageItemsStageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupDetailResponseBodyStageItemsStageInfo self = new DescribeApiGroupDetailResponseBodyStageItemsStageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupDetailResponseBodyStageItemsStageInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApiGroupDetailResponseBodyStageItemsStageInfo setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public DescribeApiGroupDetailResponseBodyStageItemsStageInfo setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class DescribeApiGroupDetailResponseBodyStageItems extends TeaModel {
        @NameInMap("StageInfo")
        public java.util.List<DescribeApiGroupDetailResponseBodyStageItemsStageInfo> stageInfo;

        public static DescribeApiGroupDetailResponseBodyStageItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupDetailResponseBodyStageItems self = new DescribeApiGroupDetailResponseBodyStageItems();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupDetailResponseBodyStageItems setStageInfo(java.util.List<DescribeApiGroupDetailResponseBodyStageItemsStageInfo> stageInfo) {
            this.stageInfo = stageInfo;
            return this;
        }
        public java.util.List<DescribeApiGroupDetailResponseBodyStageItemsStageInfo> getStageInfo() {
            return this.stageInfo;
        }

    }

}
