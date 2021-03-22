// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetInstanceListResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceList")
    public GetInstanceListResponseBodyInstanceList instanceList;

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

    public GetInstanceListResponseBody setInstanceList(GetInstanceListResponseBodyInstanceList instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public GetInstanceListResponseBodyInstanceList getInstanceList() {
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

    public static class GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO self = new GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetInstanceListResponseBodyInstanceListInstanceVOTags extends TeaModel {
        @NameInMap("TagVO")
        public java.util.List<GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO> tagVO;

        public static GetInstanceListResponseBodyInstanceListInstanceVOTags build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListInstanceVOTags self = new GetInstanceListResponseBodyInstanceListInstanceVOTags();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOTags setTagVO(java.util.List<GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO> tagVO) {
            this.tagVO = tagVO;
            return this;
        }
        public java.util.List<GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO> getTagVO() {
            return this.tagVO;
        }

    }

    public static class GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo extends TeaModel {
        @NameInMap("Current2OpenSourceVersion")
        public String current2OpenSourceVersion;

        public static GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo self = new GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo setCurrent2OpenSourceVersion(String current2OpenSourceVersion) {
            this.current2OpenSourceVersion = current2OpenSourceVersion;
            return this;
        }
        public String getCurrent2OpenSourceVersion() {
            return this.current2OpenSourceVersion;
        }

    }

    public static class GetInstanceListResponseBodyInstanceListInstanceVO extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DeployType")
        public Integer deployType;

        @NameInMap("Tags")
        public GetInstanceListResponseBodyInstanceListInstanceVOTags tags;

        @NameInMap("DiskType")
        public Integer diskType;

        @NameInMap("SslEndPoint")
        public String sslEndPoint;

        @NameInMap("AllConfig")
        public String allConfig;

        @NameInMap("PaidType")
        public Integer paidType;

        @NameInMap("Name")
        public String name;

        @NameInMap("UpgradeServiceDetailInfo")
        public GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo upgradeServiceDetailInfo;

        @NameInMap("SpecType")
        public String specType;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("SecurityGroup")
        public String securityGroup;

        @NameInMap("InstanceId")
        public String instanceId;

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

        @NameInMap("EndPoint")
        public String endPoint;

        public static GetInstanceListResponseBodyInstanceListInstanceVO build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListInstanceVO self = new GetInstanceListResponseBodyInstanceListInstanceVO();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setDeployType(Integer deployType) {
            this.deployType = deployType;
            return this;
        }
        public Integer getDeployType() {
            return this.deployType;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setTags(GetInstanceListResponseBodyInstanceListInstanceVOTags tags) {
            this.tags = tags;
            return this;
        }
        public GetInstanceListResponseBodyInstanceListInstanceVOTags getTags() {
            return this.tags;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setDiskType(Integer diskType) {
            this.diskType = diskType;
            return this;
        }
        public Integer getDiskType() {
            return this.diskType;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setSslEndPoint(String sslEndPoint) {
            this.sslEndPoint = sslEndPoint;
            return this;
        }
        public String getSslEndPoint() {
            return this.sslEndPoint;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setAllConfig(String allConfig) {
            this.allConfig = allConfig;
            return this;
        }
        public String getAllConfig() {
            return this.allConfig;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setPaidType(Integer paidType) {
            this.paidType = paidType;
            return this;
        }
        public Integer getPaidType() {
            return this.paidType;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setUpgradeServiceDetailInfo(GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo upgradeServiceDetailInfo) {
            this.upgradeServiceDetailInfo = upgradeServiceDetailInfo;
            return this;
        }
        public GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo getUpgradeServiceDetailInfo() {
            return this.upgradeServiceDetailInfo;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setServiceStatus(Integer serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setEipMax(Integer eipMax) {
            this.eipMax = eipMax;
            return this;
        }
        public Integer getEipMax() {
            return this.eipMax;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setMsgRetain(Integer msgRetain) {
            this.msgRetain = msgRetain;
            return this;
        }
        public Integer getMsgRetain() {
            return this.msgRetain;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setTopicNumLimit(Integer topicNumLimit) {
            this.topicNumLimit = topicNumLimit;
            return this;
        }
        public Integer getTopicNumLimit() {
            return this.topicNumLimit;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setIoMax(Integer ioMax) {
            this.ioMax = ioMax;
            return this;
        }
        public Integer getIoMax() {
            return this.ioMax;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

    }

    public static class GetInstanceListResponseBodyInstanceList extends TeaModel {
        @NameInMap("InstanceVO")
        public java.util.List<GetInstanceListResponseBodyInstanceListInstanceVO> instanceVO;

        public static GetInstanceListResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceList self = new GetInstanceListResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceList setInstanceVO(java.util.List<GetInstanceListResponseBodyInstanceListInstanceVO> instanceVO) {
            this.instanceVO = instanceVO;
            return this;
        }
        public java.util.List<GetInstanceListResponseBodyInstanceListInstanceVO> getInstanceVO() {
            return this.instanceVO;
        }

    }

}
