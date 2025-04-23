// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20181015.models;

import com.aliyun.tea.*;

public class GetInstanceListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("InstanceList")
    public GetInstanceListResponseBodyInstanceList instanceList;

    /**
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>ABA4A7FD-E10F-45C7-9774-A5236015****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceListResponseBody self = new GetInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetInstanceListResponseBody setInstanceList(GetInstanceListResponseBodyInstanceList instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public GetInstanceListResponseBodyInstanceList getInstanceList() {
        return this.instanceList;
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

    public GetInstanceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfoUpgradeServiceDetailInfoVO extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.10</p>
         */
        @NameInMap("Current2OpenSourceVersion")
        public String current2OpenSourceVersion;

        public static GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfoUpgradeServiceDetailInfoVO build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfoUpgradeServiceDetailInfoVO self = new GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfoUpgradeServiceDetailInfoVO();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfoUpgradeServiceDetailInfoVO setCurrent2OpenSourceVersion(String current2OpenSourceVersion) {
            this.current2OpenSourceVersion = current2OpenSourceVersion;
            return this;
        }
        public String getCurrent2OpenSourceVersion() {
            return this.current2OpenSourceVersion;
        }

    }

    public static class GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo extends TeaModel {
        @NameInMap("UpgradeServiceDetailInfoVO")
        public java.util.List<GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfoUpgradeServiceDetailInfoVO> upgradeServiceDetailInfoVO;

        public static GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo self = new GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo setUpgradeServiceDetailInfoVO(java.util.List<GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfoUpgradeServiceDetailInfoVO> upgradeServiceDetailInfoVO) {
            this.upgradeServiceDetailInfoVO = upgradeServiceDetailInfoVO;
            return this;
        }
        public java.util.List<GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfoUpgradeServiceDetailInfoVO> getUpgradeServiceDetailInfoVO() {
            return this.upgradeServiceDetailInfoVO;
        }

    }

    public static class GetInstanceListResponseBodyInstanceListInstanceVO extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1566215995000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("DeployType")
        public Integer deployType;

        /**
         * <strong>example:</strong>
         * <p>192.168.0.212:9092,192.168.0.210:9092,192.168.0.211:****</p>
         */
        @NameInMap("EndPoint")
        public String endPoint;

        /**
         * <strong>example:</strong>
         * <p>1568908800000</p>
         */
        @NameInMap("ExpiredTime")
        public Long expiredTime;

        /**
         * <strong>example:</strong>
         * <p>alikafka_pre-cn-mp919o4v****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>alikafka_pre-cn-mp919o4v****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ServiceStatus")
        public Integer serviceStatus;

        /**
         * <strong>example:</strong>
         * <p>47.111.110.11:9093,121.40.96.141:9093,47.111.118.133:****</p>
         */
        @NameInMap("SslEndPoint")
        public String sslEndPoint;

        @NameInMap("UpgradeServiceDetailInfo")
        public GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo upgradeServiceDetailInfo;

        /**
         * <p>VSwitch ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp13rg6bcpkxofr78****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1l6hrlykj3405r7****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetInstanceListResponseBodyInstanceListInstanceVO build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListInstanceVO self = new GetInstanceListResponseBodyInstanceListInstanceVO();
            return TeaModel.build(map, self);
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

        public GetInstanceListResponseBodyInstanceListInstanceVO setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setServiceStatus(Integer serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setSslEndPoint(String sslEndPoint) {
            this.sslEndPoint = sslEndPoint;
            return this;
        }
        public String getSslEndPoint() {
            return this.sslEndPoint;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setUpgradeServiceDetailInfo(GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo upgradeServiceDetailInfo) {
            this.upgradeServiceDetailInfo = upgradeServiceDetailInfo;
            return this;
        }
        public GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo getUpgradeServiceDetailInfo() {
            return this.upgradeServiceDetailInfo;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
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
