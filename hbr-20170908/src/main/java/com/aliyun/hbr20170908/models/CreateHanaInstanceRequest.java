// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateHanaInstanceRequest extends TeaModel {
    /**
     * <p>The alert settings. Valid value: INHERITED, which indicates that the Cloud Backup client sends alert notifications by using the same method configured for the backup vault.</p>
     * 
     * <strong>example:</strong>
     * <p>INHERITED</p>
     */
    @NameInMap("AlertSetting")
    public String alertSetting;

    /**
     * <p>The name of the Resource Access Management (RAM) role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>hbrcrossrole</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>The backup type. Valid values:</p>
     * <ul>
     * <li><strong>SELF_ACCOUNT</strong>: Data is backed up within the same Alibaba Cloud account.</li>
     * <li><strong>CROSS_ACCOUNT</strong>: Data is backed up across Alibaba Cloud accounts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CROSS_ACCOUNT</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>158975xxxxx4625</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    /**
     * <p>The IDs of the ECS instances that host the SAP HANA instance to be registered. Cloud Backup installs backup clients on the specified ECS instances.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;i-uf6ir9y******hvisj\&quot;]</p>
     */
    @NameInMap("EcsInstanceId")
    public String ecsInstanceId;

    /**
     * <p>The name of the SAP HANA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>HANA-DEV</p>
     */
    @NameInMap("HanaName")
    public String hanaName;

    /**
     * <p>The private or internal IP address of the host where the primary node of the SAP HANA instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>47.100.XX.XX</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The instance number of the SAP HANA system.</p>
     * 
     * <strong>example:</strong>
     * <p>00</p>
     */
    @NameInMap("InstanceNumber")
    public Integer instanceNumber;

    /**
     * <p>The password that is used to connect with the SAP HANA database.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm4ebtpkzx7zy</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The security identifier (SID) of the SAP HANA database. For more information, see <a href="https://answers.sap.com/questions/555192/how-to-find-sid-user-and-instance-number-of-hana-d.html?spm=a2c4g.11186623.0.0.55c34b4ftZeXNK">How to find sid user and instance number of HANA db?</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>HXE</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <p>Specifies whether to connect with the SAP HANA database over Secure Sockets Layer (SSL).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseSsl")
    public Boolean useSsl;

    /**
     * <p>The username of the SYSTEMDB database.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>Specifies whether to verify the SSL certificate of the SAP HANA database.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ValidateCertificate")
    public Boolean validateCertificate;

    /**
     * <p>The ID of the backup vault.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v-0003v4a******gfv2</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static CreateHanaInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHanaInstanceRequest self = new CreateHanaInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateHanaInstanceRequest setAlertSetting(String alertSetting) {
        this.alertSetting = alertSetting;
        return this;
    }
    public String getAlertSetting() {
        return this.alertSetting;
    }

    public CreateHanaInstanceRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public CreateHanaInstanceRequest setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public CreateHanaInstanceRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    public CreateHanaInstanceRequest setEcsInstanceId(String ecsInstanceId) {
        this.ecsInstanceId = ecsInstanceId;
        return this;
    }
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

    public CreateHanaInstanceRequest setHanaName(String hanaName) {
        this.hanaName = hanaName;
        return this;
    }
    public String getHanaName() {
        return this.hanaName;
    }

    public CreateHanaInstanceRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public CreateHanaInstanceRequest setInstanceNumber(Integer instanceNumber) {
        this.instanceNumber = instanceNumber;
        return this;
    }
    public Integer getInstanceNumber() {
        return this.instanceNumber;
    }

    public CreateHanaInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateHanaInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateHanaInstanceRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public CreateHanaInstanceRequest setUseSsl(Boolean useSsl) {
        this.useSsl = useSsl;
        return this;
    }
    public Boolean getUseSsl() {
        return this.useSsl;
    }

    public CreateHanaInstanceRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateHanaInstanceRequest setValidateCertificate(Boolean validateCertificate) {
        this.validateCertificate = validateCertificate;
        return this;
    }
    public Boolean getValidateCertificate() {
        return this.validateCertificate;
    }

    public CreateHanaInstanceRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
