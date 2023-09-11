// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetKmsInstanceResponseBody extends TeaModel {
    @NameInMap("KmsInstance")
    public GetKmsInstanceResponseBodyKmsInstance kmsInstance;

    @NameInMap("RequestId")
    public String requestId;

    public static GetKmsInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKmsInstanceResponseBody self = new GetKmsInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKmsInstanceResponseBody setKmsInstance(GetKmsInstanceResponseBodyKmsInstance kmsInstance) {
        this.kmsInstance = kmsInstance;
        return this;
    }
    public GetKmsInstanceResponseBodyKmsInstance getKmsInstance() {
        return this.kmsInstance;
    }

    public GetKmsInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetKmsInstanceResponseBodyKmsInstanceBindVpcsBindVpc extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcOwnerId")
        public String vpcOwnerId;

        public static GetKmsInstanceResponseBodyKmsInstanceBindVpcsBindVpc build(java.util.Map<String, ?> map) throws Exception {
            GetKmsInstanceResponseBodyKmsInstanceBindVpcsBindVpc self = new GetKmsInstanceResponseBodyKmsInstanceBindVpcsBindVpc();
            return TeaModel.build(map, self);
        }

        public GetKmsInstanceResponseBodyKmsInstanceBindVpcsBindVpc setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetKmsInstanceResponseBodyKmsInstanceBindVpcsBindVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetKmsInstanceResponseBodyKmsInstanceBindVpcsBindVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetKmsInstanceResponseBodyKmsInstanceBindVpcsBindVpc setVpcOwnerId(String vpcOwnerId) {
            this.vpcOwnerId = vpcOwnerId;
            return this;
        }
        public String getVpcOwnerId() {
            return this.vpcOwnerId;
        }

    }

    public static class GetKmsInstanceResponseBodyKmsInstanceBindVpcs extends TeaModel {
        @NameInMap("BindVpc")
        public java.util.List<GetKmsInstanceResponseBodyKmsInstanceBindVpcsBindVpc> bindVpc;

        public static GetKmsInstanceResponseBodyKmsInstanceBindVpcs build(java.util.Map<String, ?> map) throws Exception {
            GetKmsInstanceResponseBodyKmsInstanceBindVpcs self = new GetKmsInstanceResponseBodyKmsInstanceBindVpcs();
            return TeaModel.build(map, self);
        }

        public GetKmsInstanceResponseBodyKmsInstanceBindVpcs setBindVpc(java.util.List<GetKmsInstanceResponseBodyKmsInstanceBindVpcsBindVpc> bindVpc) {
            this.bindVpc = bindVpc;
            return this;
        }
        public java.util.List<GetKmsInstanceResponseBodyKmsInstanceBindVpcsBindVpc> getBindVpc() {
            return this.bindVpc;
        }

    }

    public static class GetKmsInstanceResponseBodyKmsInstance extends TeaModel {
        @NameInMap("BindVpcs")
        public GetKmsInstanceResponseBodyKmsInstanceBindVpcs bindVpcs;

        @NameInMap("CaCertificateChainPem")
        public String caCertificateChainPem;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("KeyNum")
        public Long keyNum;

        @NameInMap("SecretNum")
        public String secretNum;

        @NameInMap("Spec")
        public Long spec;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcNum")
        public Long vpcNum;

        @NameInMap("VswitchIds")
        public String vswitchIds;

        @NameInMap("ZoneIds")
        public String zoneIds;

        public static GetKmsInstanceResponseBodyKmsInstance build(java.util.Map<String, ?> map) throws Exception {
            GetKmsInstanceResponseBodyKmsInstance self = new GetKmsInstanceResponseBodyKmsInstance();
            return TeaModel.build(map, self);
        }

        public GetKmsInstanceResponseBodyKmsInstance setBindVpcs(GetKmsInstanceResponseBodyKmsInstanceBindVpcs bindVpcs) {
            this.bindVpcs = bindVpcs;
            return this;
        }
        public GetKmsInstanceResponseBodyKmsInstanceBindVpcs getBindVpcs() {
            return this.bindVpcs;
        }

        public GetKmsInstanceResponseBodyKmsInstance setCaCertificateChainPem(String caCertificateChainPem) {
            this.caCertificateChainPem = caCertificateChainPem;
            return this;
        }
        public String getCaCertificateChainPem() {
            return this.caCertificateChainPem;
        }

        public GetKmsInstanceResponseBodyKmsInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetKmsInstanceResponseBodyKmsInstance setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetKmsInstanceResponseBodyKmsInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetKmsInstanceResponseBodyKmsInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetKmsInstanceResponseBodyKmsInstance setKeyNum(Long keyNum) {
            this.keyNum = keyNum;
            return this;
        }
        public Long getKeyNum() {
            return this.keyNum;
        }

        public GetKmsInstanceResponseBodyKmsInstance setSecretNum(String secretNum) {
            this.secretNum = secretNum;
            return this;
        }
        public String getSecretNum() {
            return this.secretNum;
        }

        public GetKmsInstanceResponseBodyKmsInstance setSpec(Long spec) {
            this.spec = spec;
            return this;
        }
        public Long getSpec() {
            return this.spec;
        }

        public GetKmsInstanceResponseBodyKmsInstance setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public GetKmsInstanceResponseBodyKmsInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetKmsInstanceResponseBodyKmsInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetKmsInstanceResponseBodyKmsInstance setVpcNum(Long vpcNum) {
            this.vpcNum = vpcNum;
            return this;
        }
        public Long getVpcNum() {
            return this.vpcNum;
        }

        public GetKmsInstanceResponseBodyKmsInstance setVswitchIds(String vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public String getVswitchIds() {
            return this.vswitchIds;
        }

        public GetKmsInstanceResponseBodyKmsInstance setZoneIds(String zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }
        public String getZoneIds() {
            return this.zoneIds;
        }

    }

}
