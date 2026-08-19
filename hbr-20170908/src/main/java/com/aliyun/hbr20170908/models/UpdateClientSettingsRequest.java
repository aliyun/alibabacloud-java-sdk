// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateClientSettingsRequest extends TeaModel {
    /**
     * <p>Specifies whether to trigger an alert for partially completed jobs. This parameter takes effect only for local File Backup and ECS File Backup Essential Edition.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AlertOnPartialComplete")
    public Boolean alertOnPartialComplete;

    /**
     * <p>The backup client ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-*********************</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The data plane access point type. Valid values:</p>
     * <ul>
     * <li><strong>PUBLIC</strong>: public network</li>
     * <li><strong>VPC</strong>: VPC network</li>
     * <li><strong>CLASSIC</strong>: classic network</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("DataNetworkType")
    public String dataNetworkType;

    /**
     * <p>The data plane proxy setting. Valid values:</p>
     * <ul>
     * <li><strong>DISABLE</strong>: does not use a proxy.</li>
     * <li><strong>USE_CONTROL_PROXY</strong> (default): uses the same configuration as the control plane.</li>
     * <li><strong>CUSTOM</strong>: uses a custom configuration (HTTP protocol).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USE_CONTROL_PROXY</p>
     */
    @NameInMap("DataProxySetting")
    public String dataProxySetting;

    /**
     * <p>The number of CPU cores used by a single backup job. A value of 0 indicates no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxCpuCore")
    public Integer maxCpuCore;

    /**
     * <p>The maximum memory that the client can use, in bytes. Only version 2.13.0 and later are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("MaxMemory")
    public Long maxMemory;

    /**
     * <p>The number of concurrent workers for a single backup job. A value of 0 indicates no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxWorker")
    public Integer maxWorker;

    /**
     * <p>The IP address of the custom data plane proxy server host.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.11.100</p>
     */
    @NameInMap("ProxyHost")
    public String proxyHost;

    /**
     * <p>The password of the custom data plane proxy server.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ProxyPassword")
    public String proxyPassword;

    /**
     * <p>The port of the custom data plane proxy server host.</p>
     * 
     * <strong>example:</strong>
     * <p>3128</p>
     */
    @NameInMap("ProxyPort")
    public Integer proxyPort;

    /**
     * <p>The username of the custom data plane proxy server.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("ProxyUser")
    public String proxyUser;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-*********************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to use HTTPS to transmit data plane data.</p>
     * <ul>
     * <li>true: Uses HTTPS for transmission.</li>
     * <li>false: Uses HTTP for transmission.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseHttps")
    public Boolean useHttps;

    /**
     * <p>The backup vault ID. This parameter is required for legacy clients.</p>
     * 
     * <strong>example:</strong>
     * <p>v-*********************</p>
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
