// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetKmsInstanceResponseBody extends TeaModel {
    /**
     * <p>The details of the KMS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("KmsInstance")
    public GetKmsInstanceResponseBodyKmsInstance kmsInstance;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each request. You can use this ID to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>46b4a94a-57d2-44b4-9810-1e87d31abb33</p>
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

        /**
         * <p>The CA certificate chain for the KMS instance in PEM format.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----\r\nMIIDuzCCAqOgAwIBAgIJALTKwWAjvbMiMA0GCSqGSIb3DQEBCwUAMHQxCzAJBgNV****-----END CERTIFICATE-----</p>
         */
        @NameInMap("CaCertificateChainPem")
        public String caCertificateChainPem;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><p><code>PREPAY</code>: subscription</p>
         * </li>
         * <li><p><code>POSTPAY</code>: pay-as-you-go</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The creation time of the KMS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-05T12:44:20Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        @NameInMap("DeletionProtectionDescription")
        public String deletionProtectionDescription;

        /**
         * <p>The expiration time of the KMS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-05T16:00:00Z</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The ID of the KMS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>kst-bjj62f5ba3dnpb6v8****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the KMS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>kst-bjj62f5ba3dnpb6v8****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The maximum number of keys that can be created in the KMS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("KeyNum")
        public Long keyNum;

        /**
         * <p>Indicates whether logging is enabled for the KMS instance. Valid values: <code>1</code> (enabled) and <code>0</code> (disabled).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Log")
        public Long log;

        /**
         * <p>The log storage capacity. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("LogStorage")
        public Long logStorage;

        /**
         * <p>The product type.<br>Subscription:<br><code>kms_ddi_public_cn</code>: China site<br><code>kms_ddi_public_intl</code>: international site<br>Pay-as-you-go:<br><code>kms_ppi_public_cn</code>: China site<br><code>kms_ppi_public_intl</code>: international site<br><br><br><br><br><br></p>
         * 
         * <strong>example:</strong>
         * <p>kms_ddi_public_cn</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The version of the KMS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ProductVersion")
        public String productVersion;

        /**
         * <p>The sales status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("SaleStatus")
        public String saleStatus;

        /**
         * <p>The maximum number of credentials that can be created in the KMS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SecretNum")
        public String secretNum;

        /**
         * <p>The computing performance of the KMS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Spec")
        public Long spec;

        /**
         * <p>The time when the KMS instance was enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-05T12:44:19Z</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <p>The status of the KMS instance. Valid values:</p>
         * <ul>
         * <li><p><code>Uninitialized</code>: The instance is not enabled.</p>
         * </li>
         * <li><p><code>Connecting</code>: The instance is connecting.</p>
         * </li>
         * <li><p><code>Connected</code>: The instance is enabled.</p>
         * </li>
         * <li><p><code>Disconnected</code>: The instance is disconnected.</p>
         * </li>
         * <li><p><code>Error</code>: The instance is in an error state.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Connected</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The VPC to which the KMS instance is attached.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp19z7cwmltad5dff****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The maximum number of VPCs that can be associated with the KMS instance for access control.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("VpcNum")
        public Long vpcNum;

        /**
         * <p>The vSwitches in the VPC to which the KMS instance is attached.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1i512amda6d10a0****</p>
         */
        @NameInMap("VswitchIds")
        public java.util.List<String> vswitchIds;

        /**
         * <p>The zones to which the KMS instance is attached.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;cn-hangzhou-k&quot;,       &quot;cn-hangzhou-j&quot;</p>
         */
        @NameInMap("ZoneIds")
        public java.util.List<String> zoneIds;

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

        public GetKmsInstanceResponseBodyKmsInstance setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetKmsInstanceResponseBodyKmsInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetKmsInstanceResponseBodyKmsInstance setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public GetKmsInstanceResponseBodyKmsInstance setDeletionProtectionDescription(String deletionProtectionDescription) {
            this.deletionProtectionDescription = deletionProtectionDescription;
            return this;
        }
        public String getDeletionProtectionDescription() {
            return this.deletionProtectionDescription;
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

        public GetKmsInstanceResponseBodyKmsInstance setLog(Long log) {
            this.log = log;
            return this;
        }
        public Long getLog() {
            return this.log;
        }

        public GetKmsInstanceResponseBodyKmsInstance setLogStorage(Long logStorage) {
            this.logStorage = logStorage;
            return this;
        }
        public Long getLogStorage() {
            return this.logStorage;
        }

        public GetKmsInstanceResponseBodyKmsInstance setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetKmsInstanceResponseBodyKmsInstance setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public GetKmsInstanceResponseBodyKmsInstance setSaleStatus(String saleStatus) {
            this.saleStatus = saleStatus;
            return this;
        }
        public String getSaleStatus() {
            return this.saleStatus;
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

        public GetKmsInstanceResponseBodyKmsInstance setVswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

        public GetKmsInstanceResponseBodyKmsInstance setZoneIds(java.util.List<String> zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }
        public java.util.List<String> getZoneIds() {
            return this.zoneIds;
        }

    }

}
