// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class NodeAttributes extends TeaModel {
    /**
     * <p>Specifies whether to enable encryption for the data disk. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/ecs/user-guide/encrypt-a-data-disk">Encrypt a data disk</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/ecs/user-guide/encryption-overview">Encrypt a data disk</a>. Valid values:</p>
     * <ul>
     * <li><p>true: Enables encryption.</p>
     * </li>
     * <li><p>false (default): Disables encryption.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DataDiskEncrypted")
    public Boolean dataDiskEncrypted;

    /**
     * <p>The ID of the KMS key for the data disk.</p>
     * 
     * <strong>example:</strong>
     * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
     */
    @NameInMap("DataDiskKMSKeyId")
    public String dataDiskKMSKeyId;

    /**
     * <p>The SSH key pair for logging on to the ECS instances.</p>
     * 
     * <strong>example:</strong>
     * <p>emr_login</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The password of the root user for the master node. This parameter is left empty in the response of an API call.</p>
     * 
     * <strong>example:</strong>
     * <p>EAQ#86****</p>
     */
    @NameInMap("MasterRootPassword")
    public String masterRootPassword;

    /**
     * <p>The RAM role that is attached to the ECS instances to access other cloud resources.
     * Default value: AliyunECSInstanceForEMRRole.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunECSInstanceForEMRRole</p>
     */
    @NameInMap("RamRole")
    public String ramRole;

    /**
     * <p>The ID of the security group. EMR supports only basic security groups and does not support enterprise security groups.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-hp3abbae8lb6lmb1****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>Specifies whether to enable disk encryption for the system disk. Valid values:</p>
     * <ul>
     * <li><p>true: Enables encryption.</p>
     * </li>
     * <li><p>false (default): Disables encryption.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SystemDiskEncrypted")
    public Boolean systemDiskEncrypted;

    /**
     * <p>The ID of the KMS key.</p>
     * 
     * <strong>example:</strong>
     * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
     */
    @NameInMap("SystemDiskKMSKeyId")
    public String systemDiskKMSKeyId;

    /**
     * <p>The ID of the VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1tgey2p0ytxmdo5****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static NodeAttributes build(java.util.Map<String, ?> map) throws Exception {
        NodeAttributes self = new NodeAttributes();
        return TeaModel.build(map, self);
    }

    public NodeAttributes setDataDiskEncrypted(Boolean dataDiskEncrypted) {
        this.dataDiskEncrypted = dataDiskEncrypted;
        return this;
    }
    public Boolean getDataDiskEncrypted() {
        return this.dataDiskEncrypted;
    }

    public NodeAttributes setDataDiskKMSKeyId(String dataDiskKMSKeyId) {
        this.dataDiskKMSKeyId = dataDiskKMSKeyId;
        return this;
    }
    public String getDataDiskKMSKeyId() {
        return this.dataDiskKMSKeyId;
    }

    public NodeAttributes setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public NodeAttributes setMasterRootPassword(String masterRootPassword) {
        this.masterRootPassword = masterRootPassword;
        return this;
    }
    public String getMasterRootPassword() {
        return this.masterRootPassword;
    }

    public NodeAttributes setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public NodeAttributes setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public NodeAttributes setSystemDiskEncrypted(Boolean systemDiskEncrypted) {
        this.systemDiskEncrypted = systemDiskEncrypted;
        return this;
    }
    public Boolean getSystemDiskEncrypted() {
        return this.systemDiskEncrypted;
    }

    public NodeAttributes setSystemDiskKMSKeyId(String systemDiskKMSKeyId) {
        this.systemDiskKMSKeyId = systemDiskKMSKeyId;
        return this;
    }
    public String getSystemDiskKMSKeyId() {
        return this.systemDiskKMSKeyId;
    }

    public NodeAttributes setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public NodeAttributes setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
