// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateClientSettingsRequest extends TeaModel {
    @NameInMap("AlertOnPartialComplete")
    public Boolean alertOnPartialComplete;

    /**
     * <p>The ID of the backup client.</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The network type of the backup client. Valid values:</p>
     * <br>
     * <p>*   **PUBLIC**: public network</p>
     * <p>*   **VPC**: VPC.</p>
     * <p>*   **CLASSIC**: classic network</p>
     */
    @NameInMap("DataNetworkType")
    public String dataNetworkType;

    /**
     * <p>The proxy settings of the backup client. Valid values:</p>
     * <br>
     * <p>*   **DISABLE**: No proxy is configured.</p>
     * <p>*   **USE_CONTROL_PROXY**: The proxy settings are the same as the settings that are predefined by the system. Default value: USE_CONTROL_PROXY.</p>
     * <p>*   **CUSTOM**: Custom HTTP proxy settings are configured.</p>
     */
    @NameInMap("DataProxySetting")
    public String dataProxySetting;

    /**
     * <p>The number of CPU cores that can be used by a single backup job. A value of 0 indicates no limits.</p>
     */
    @NameInMap("MaxCpuCore")
    public Integer maxCpuCore;

    @NameInMap("MaxMemory")
    public Long maxMemory;

    /**
     * <p>The number of concurrent tasks that can be included in a backup job. A value of 0 indicates no limits.</p>
     */
    @NameInMap("MaxWorker")
    public Integer maxWorker;

    /**
     * <p>The custom IP address of the proxy server.</p>
     */
    @NameInMap("ProxyHost")
    public String proxyHost;

    /**
     * <p>The custom password of the proxy server.</p>
     */
    @NameInMap("ProxyPassword")
    public String proxyPassword;

    /**
     * <p>The custom port number of the proxy server.</p>
     */
    @NameInMap("ProxyPort")
    public Integer proxyPort;

    /**
     * <p>The custom username of the proxy server.</p>
     */
    @NameInMap("ProxyUser")
    public String proxyUser;

    /**
     * <p>The ID of resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to transmit data over HTTPS.</p>
     * <br>
     * <p>*   true: The system transmits data over HTTPS.</p>
     * <p>*   false: The system transmits data over HTTP.</p>
     */
    @NameInMap("UseHttps")
    public Boolean useHttps;

    /**
     * <p>The ID of the backup vault. If you use a backup client of an earlier version, you must set this parameter.</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static UpdateClientSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClientSettingsRequest self = new UpdateClientSettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClientSettingsRequest setAlertOnPartialComplete(Boolean alertOnPartialComplete) {
        this.alertOnPartialComplete = alertOnPartialComplete;
        return this;
    }
    public Boolean getAlertOnPartialComplete() {
        return this.alertOnPartialComplete;
    }

    public UpdateClientSettingsRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public UpdateClientSettingsRequest setDataNetworkType(String dataNetworkType) {
        this.dataNetworkType = dataNetworkType;
        return this;
    }
    public String getDataNetworkType() {
        return this.dataNetworkType;
    }

    public UpdateClientSettingsRequest setDataProxySetting(String dataProxySetting) {
        this.dataProxySetting = dataProxySetting;
        return this;
    }
    public String getDataProxySetting() {
        return this.dataProxySetting;
    }

    public UpdateClientSettingsRequest setMaxCpuCore(Integer maxCpuCore) {
        this.maxCpuCore = maxCpuCore;
        return this;
    }
    public Integer getMaxCpuCore() {
        return this.maxCpuCore;
    }

    public UpdateClientSettingsRequest setMaxMemory(Long maxMemory) {
        this.maxMemory = maxMemory;
        return this;
    }
    public Long getMaxMemory() {
        return this.maxMemory;
    }

    public UpdateClientSettingsRequest setMaxWorker(Integer maxWorker) {
        this.maxWorker = maxWorker;
        return this;
    }
    public Integer getMaxWorker() {
        return this.maxWorker;
    }

    public UpdateClientSettingsRequest setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
        return this;
    }
    public String getProxyHost() {
        return this.proxyHost;
    }

    public UpdateClientSettingsRequest setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
        return this;
    }
    public String getProxyPassword() {
        return this.proxyPassword;
    }

    public UpdateClientSettingsRequest setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
        return this;
    }
    public Integer getProxyPort() {
        return this.proxyPort;
    }

    public UpdateClientSettingsRequest setProxyUser(String proxyUser) {
        this.proxyUser = proxyUser;
        return this;
    }
    public String getProxyUser() {
        return this.proxyUser;
    }

    public UpdateClientSettingsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateClientSettingsRequest setUseHttps(Boolean useHttps) {
        this.useHttps = useHttps;
        return this;
    }
    public Boolean getUseHttps() {
        return this.useHttps;
    }

    public UpdateClientSettingsRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
