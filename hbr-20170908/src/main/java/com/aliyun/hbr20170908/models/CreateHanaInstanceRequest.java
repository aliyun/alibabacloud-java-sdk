// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateHanaInstanceRequest extends TeaModel {
    /**
     * <p>The alert settings. Valid value: INHERITED, which indicates that the backup client sends alert notifications in the same way as the backup vault.</p>
     */
    @NameInMap("AlertSetting")
    public String alertSetting;

    /**
     * <p>The IDs of ECS instances that host the SAP HANA instance to be registered. HBR installs backup clients on the specified ECS instances.</p>
     */
    @NameInMap("EcsInstanceId")
    public String ecsInstanceId;

    /**
     * <p>The name of the SAP HANA instance.</p>
     */
    @NameInMap("HanaName")
    public String hanaName;

    /**
     * <p>The private or internal IP address of the host where the primary node of the SAP HANA instance resides.</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The instance number of the SAP HANA system.</p>
     */
    @NameInMap("InstanceNumber")
    public Integer instanceNumber;

    /**
     * <p>The password that is used to connect with the SAP HANA database.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The security identifier (SID) of the SAP HANA database.</p>
     * <br>
     * <p>For more information, see [How to find sid user and instance number of HANA db?](https://answers.sap.com/questions/555192/how-to-find-sid-user-and-instance-number-of-hana-d.html?spm=a2c4g.11186623.0.0.55c34b4ftZeXNK)</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <p>Specifies whether to connect with the SAP HANA database over Secure Sockets Layer (SSL).</p>
     */
    @NameInMap("UseSsl")
    public Boolean useSsl;

    /**
     * <p>The username of the SYSTEMDB database.</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>Specifies whether to verify the SSL certificate of the SAP HANA database.</p>
     */
    @NameInMap("ValidateCertificate")
    public Boolean validateCertificate;

    /**
     * <p>The ID of the backup vault.</p>
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
