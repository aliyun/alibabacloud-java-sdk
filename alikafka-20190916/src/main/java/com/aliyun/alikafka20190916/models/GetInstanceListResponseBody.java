// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetInstanceListResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceList")
    public java.util.List<GetInstanceListResponseBodyInstanceList> instanceList;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceListResponseBody self = new GetInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceListResponseBody setInstanceList(java.util.List<GetInstanceListResponseBodyInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<GetInstanceListResponseBodyInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public GetInstanceListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetInstanceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceListResponseBodyInstanceListUpgradeServiceDetailInfo extends TeaModel {
        @NameInMap("Current2OpenSourceVersion")
        public String current2OpenSourceVersion;

        public static GetInstanceListResponseBodyInstanceListUpgradeServiceDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListUpgradeServiceDetailInfo self = new GetInstanceListResponseBodyInstanceListUpgradeServiceDetailInfo();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceListUpgradeServiceDetailInfo setCurrent2OpenSourceVersion(String current2OpenSourceVersion) {
            this.current2OpenSourceVersion = current2OpenSourceVersion;
            return this;
        }
        public String getCurrent2OpenSourceVersion() {
            return this.current2OpenSourceVersion;
        }

    }

    public static class GetInstanceListResponseBodyInstanceListTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetInstanceListResponseBodyInstanceListTags build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListTags self = new GetInstanceListResponseBodyInstanceListTags();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetInstanceListResponseBodyInstanceListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetInstanceListResponseBodyInstanceList extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("UpgradeServiceDetailInfo")
        public java.util.List<GetInstanceListResponseBodyInstanceListUpgradeServiceDetailInfo> upgradeServiceDetailInfo;

        @NameInMap("SpecType")
        public String specType;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DeployType")
        public Integer deployType;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("Tags")
        public java.util.List<GetInstanceListResponseBodyInstanceListTags> tags;

        @NameInMap("DiskType")
        public Integer diskType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SslEndPoint")
        public String sslEndPoint;

        @NameInMap("SecurityGroup")
        public String securityGroup;

        @NameInMap("ServiceStatus")
        public Integer serviceStatus;

        @NameInMap("EipMax")
        public Integer eipMax;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("MsgRetain")
        public Integer msgRetain;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        @NameInMap("TopicNumLimit")
        public Integer topicNumLimit;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("IoMax")
        public Integer ioMax;

        @NameInMap("PaidType")
        public Integer paidType;

        @NameInMap("Name")
        public String name;

        @NameInMap("EndPoint")
        public String endPoint;

        public static GetInstanceListResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceList self = new GetInstanceListResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetInstanceListResponseBodyInstanceList setUpgradeServiceDetailInfo(java.util.List<GetInstanceListResponseBodyInstanceListUpgradeServiceDetailInfo> upgradeServiceDetailInfo) {
            this.upgradeServiceDetailInfo = upgradeServiceDetailInfo;
            return this;
        }
        public java.util.List<GetInstanceListResponseBodyInstanceListUpgradeServiceDetailInfo> getUpgradeServiceDetailInfo() {
            return this.upgradeServiceDetailInfo;
        }

        public GetInstanceListResponseBodyInstanceList setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public GetInstanceListResponseBodyInstanceList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetInstanceListResponseBodyInstanceList setDeployType(Integer deployType) {
            this.deployType = deployType;
            return this;
        }
        public Integer getDeployType() {
            return this.deployType;
        }

        public GetInstanceListResponseBodyInstanceList setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public GetInstanceListResponseBodyInstanceList setTags(java.util.List<GetInstanceListResponseBodyInstanceListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetInstanceListResponseBodyInstanceListTags> getTags() {
            return this.tags;
        }

        public GetInstanceListResponseBodyInstanceList setDiskType(Integer diskType) {
            this.diskType = diskType;
            return this;
        }
        public Integer getDiskType() {
            return this.diskType;
        }

        public GetInstanceListResponseBodyInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceListResponseBodyInstanceList setSslEndPoint(String sslEndPoint) {
            this.sslEndPoint = sslEndPoint;
            return this;
        }
        public String getSslEndPoint() {
            return this.sslEndPoint;
        }

        public GetInstanceListResponseBodyInstanceList setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public GetInstanceListResponseBodyInstanceList setServiceStatus(Integer serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

        public GetInstanceListResponseBodyInstanceList setEipMax(Integer eipMax) {
            this.eipMax = eipMax;
            return this;
        }
        public Integer getEipMax() {
            return this.eipMax;
        }

        public GetInstanceListResponseBodyInstanceList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetInstanceListResponseBodyInstanceList setMsgRetain(Integer msgRetain) {
            this.msgRetain = msgRetain;
            return this;
        }
        public Integer getMsgRetain() {
            return this.msgRetain;
        }

        public GetInstanceListResponseBodyInstanceList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetInstanceListResponseBodyInstanceList setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public GetInstanceListResponseBodyInstanceList setTopicNumLimit(Integer topicNumLimit) {
            this.topicNumLimit = topicNumLimit;
            return this;
        }
        public Integer getTopicNumLimit() {
            return this.topicNumLimit;
        }

        public GetInstanceListResponseBodyInstanceList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public GetInstanceListResponseBodyInstanceList setIoMax(Integer ioMax) {
            this.ioMax = ioMax;
            return this;
        }
        public Integer getIoMax() {
            return this.ioMax;
        }

        public GetInstanceListResponseBodyInstanceList setPaidType(Integer paidType) {
            this.paidType = paidType;
            return this;
        }
        public Integer getPaidType() {
            return this.paidType;
        }

        public GetInstanceListResponseBodyInstanceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceListResponseBodyInstanceList setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

    }

}
