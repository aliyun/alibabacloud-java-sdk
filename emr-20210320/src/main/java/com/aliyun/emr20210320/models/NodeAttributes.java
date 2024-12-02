// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class NodeAttributes extends TeaModel {
    /**
     * <p>是否启用云盘加密。取值范围：</p>
     * <ul>
     * <li>true：启用加密。</li>
     * <li>false：不加密。</li>
     * </ul>
     * <p>默认值：false，不加密</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DataDiskEncrypted")
    public Boolean dataDiskEncrypted;

    /**
     * <p>KMS加密秘钥ID。</p>
     * 
     * <strong>example:</strong>
     * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
     */
    @NameInMap("DataDiskKMSKeyId")
    public String dataDiskKMSKeyId;

    /**
     * <p>ECS ssh登录秘钥。</p>
     * 
     * <strong>example:</strong>
     * <p>emr_login</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>MASTER节点root密码。</p>
     * 
     * <strong>example:</strong>
     * <p>Adxefswfd****</p>
     */
    @NameInMap("MasterRootPassword")
    public String masterRootPassword;

    /**
     * <p>ECS访问资源绑定的角色。</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunECSInstanceForEMRRole</p>
     */
    @NameInMap("RamRole")
    public String ramRole;

    /**
     * <p>安全组ID。EMR只支持普通安全组，不支持企业安全组。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-hp3abbae8lb6lmb1****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>是否启用云盘加密。取值范围：</p>
     * <ul>
     * <li>true：启用加密。</li>
     * <li>false：不加密。</li>
     * </ul>
     * <p>默认值：false，不加密</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SystemDiskEncrypted")
    public Boolean systemDiskEncrypted;

    /**
     * <p>KMS加密秘钥ID。</p>
     * 
     * <strong>example:</strong>
     * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
     */
    @NameInMap("SystemDiskKMSKeyId")
    public String systemDiskKMSKeyId;

    /**
     * <p>专有网络ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1tgey2p0ytxmdo5****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>可用区ID。</p>
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
