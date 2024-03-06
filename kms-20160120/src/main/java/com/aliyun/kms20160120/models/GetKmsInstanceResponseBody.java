// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetKmsInstanceResponseBody extends TeaModel {
    /**
     * <p>The details of the KMS instance.</p>
     */
    @NameInMap("KmsInstance")
    public GetKmsInstanceResponseBodyKmsInstance kmsInstance;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The region to which the VPC belongs.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The vSwitch in the VPC.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The Alibaba Cloud account to which the VPC belongs.</p>
         */
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
        /**
         * <p>A list of associated VPCs.</p>
         * <br>
         * <p>>  If your self-managed applications are deployed in multiple VPCs in the same region, you can associate VPCs with the KMS instance beyond the VPC that you specify when you enable the KMS instance. The VPCs can belong to the same Alibaba Cloud account or different Alibaba Cloud accounts. After the configuration is complete, self-managed applications in the VPCs can access the specified KMS instance.</p>
         */
        @NameInMap("BindVpcs")
        public GetKmsInstanceResponseBodyKmsInstanceBindVpcs bindVpcs;

        /**
         * <p>The content of the certificate authority (CA) certificate of the KMS instance.</p>
         */
        @NameInMap("CaCertificateChainPem")
        public String caCertificateChainPem;

        /**
         * <p>The time when the KMS instance is created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The expiration time of the KMS instance.</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The ID of the KMS instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the KMS instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The number of keys that can be created for the KMS instance.</p>
         */
        @NameInMap("KeyNum")
        public Long keyNum;

        /**
         * <p>The number of secrets that can be created for the KMS instance.</p>
         */
        @NameInMap("SecretNum")
        public String secretNum;

        /**
         * <p>The computing performance of the KMS instance.</p>
         */
        @NameInMap("Spec")
        public Long spec;

        /**
         * <p>The time when the KMS instance is enabled.</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <p>The status of the KMS instance. Valid values:</p>
         * <br>
         * <p>*   Uninitialized: The KMS instance is not enabled.</p>
         * <p>*   Connecting: The KMS instance is being connected.</p>
         * <p>*   Connected: The KMS instance is enabled.</p>
         * <p>*   Disconnected: The KMS instance is disconnected.</p>
         * <p>*   Error: The KMS instance is abnormal.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The virtual private cloud (VPC) with which the KMS instance is associated.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The access management quota for the KMS instance.</p>
         */
        @NameInMap("VpcNum")
        public Long vpcNum;

        /**
         * <p>The vSwitch in the VPC.</p>
         */
        @NameInMap("VswitchIds")
        public String vswitchIds;

        /**
         * <p>The zone with which the KMS instance is associated.</p>
         */
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
