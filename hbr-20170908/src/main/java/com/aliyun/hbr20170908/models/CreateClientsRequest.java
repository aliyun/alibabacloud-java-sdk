// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateClientsRequest extends TeaModel {
    /**
     * <p>The alert settings. Valid value: INHERITED, which indicates that the HBR client sends alert notifications by using the same method configured for the backup vault.</p>
     */
    @NameInMap("AlertSetting")
    public String alertSetting;

    /**
     * <p>The installation information of the HBR clients.</p>
     */
    @NameInMap("ClientInfo")
    public String clientInfo;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to transmit data over HTTPS. Valid values:</p>
     * <br>
     * <p>*   true: transmits data over HTTPS.</p>
     * <p>*   false: transmits data over HTTP.</p>
     */
    @NameInMap("UseHttps")
    public Boolean useHttps;

    /**
     * <p>The ID of the backup vault.</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static CreateClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClientsRequest self = new CreateClientsRequest();
        return TeaModel.build(map, self);
    }

    public CreateClientsRequest setAlertSetting(String alertSetting) {
        this.alertSetting = alertSetting;
        return this;
    }
    public String getAlertSetting() {
        return this.alertSetting;
    }

    public CreateClientsRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

    public CreateClientsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateClientsRequest setUseHttps(Boolean useHttps) {
        this.useHttps = useHttps;
        return this;
    }
    public Boolean getUseHttps() {
        return this.useHttps;
    }

    public CreateClientsRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
