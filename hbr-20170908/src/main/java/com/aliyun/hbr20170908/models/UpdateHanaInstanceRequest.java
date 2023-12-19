// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateHanaInstanceRequest extends TeaModel {
    /**
     * <p>The alert settings. Valid value: INHERITED, which indicates that the backup client sends alert notifications in the same way as the backup vault.</p>
     */
    @NameInMap("AlertSetting")
    public String alertSetting;

    /**
     * <p>The ID of the SAP HANA instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

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
     * <p>Specifies whether to connect with the SAP HANA database over Secure Sockets Layer (SSL). Valid values:</p>
     * <br>
     * <p>*   true: The SAP HANA database is connected over SSL.</p>
     * <p>*   false: The SAP HANA database is not connected over SSL.</p>
     */
    @NameInMap("UseSsl")
    public Boolean useSsl;

    /**
     * <p>The username of the SYSTEMDB database.</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>Specifies whether to verify the SSL certificate of the SAP HANA database. Valid values:</p>
     * <br>
     * <p>*   true: The SSL certificate of the SAP HANA instance is verified.</p>
     * <p>*   false: The SSL certificate of the SAP HANA instance is not verified.</p>
     */
    @NameInMap("ValidateCertificate")
    public Boolean validateCertificate;

    /**
     * <p>The ID of the backup vault.</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static UpdateHanaInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHanaInstanceRequest self = new UpdateHanaInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHanaInstanceRequest setAlertSetting(String alertSetting) {
        this.alertSetting = alertSetting;
        return this;
    }
    public String getAlertSetting() {
        return this.alertSetting;
    }

    public UpdateHanaInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateHanaInstanceRequest setHanaName(String hanaName) {
        this.hanaName = hanaName;
        return this;
    }
    public String getHanaName() {
        return this.hanaName;
    }

    public UpdateHanaInstanceRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public UpdateHanaInstanceRequest setInstanceNumber(Integer instanceNumber) {
        this.instanceNumber = instanceNumber;
        return this;
    }
    public Integer getInstanceNumber() {
        return this.instanceNumber;
    }

    public UpdateHanaInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateHanaInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateHanaInstanceRequest setUseSsl(Boolean useSsl) {
        this.useSsl = useSsl;
        return this;
    }
    public Boolean getUseSsl() {
        return this.useSsl;
    }

    public UpdateHanaInstanceRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UpdateHanaInstanceRequest setValidateCertificate(Boolean validateCertificate) {
        this.validateCertificate = validateCertificate;
        return this;
    }
    public Boolean getValidateCertificate() {
        return this.validateCertificate;
    }

    public UpdateHanaInstanceRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
