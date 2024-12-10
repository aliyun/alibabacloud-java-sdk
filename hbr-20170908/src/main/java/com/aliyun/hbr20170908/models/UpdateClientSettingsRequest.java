// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateClientSettingsRequest extends TeaModel {
    /**
     * <p>Specifies whether to generate alert for partially completed jobs. This parameter is valid only for on-premises file backup and ECS file backup.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AlertOnPartialComplete")
    public Boolean alertOnPartialComplete;

    /**
     * <p>The ID of the HBR client.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-*********************</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The type of the endpoint on the data plane. Valid values:</p>
     * <ul>
     * <li><strong>PUBLIC</strong>: Internet</li>
     * <li><strong>VPC</strong>: virtual private cloud (VPC)</li>
     * <li><strong>CLASSIC</strong>: classic network</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("DataNetworkType")
    public String dataNetworkType;

    /**
     * <p>The proxy configuration on the data plane. Valid values:</p>
     * <ul>
     * <li><strong>DISABLE</strong>: The proxy is not used.</li>
     * <li><strong>USE_CONTROL_PROXY</strong> (default): The configuration is the same as that on the control plane.</li>
     * <li><strong>CUSTOM</strong>: The configuration is customized (HTTP).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USE_CONTROL_PROXY</p>
     */
    @NameInMap("DataProxySetting")
    public String dataProxySetting;

    /**
     * <p>The number of CPU cores used by a single backup job. The value 0 indicates that the number is unlimited.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxCpuCore")
    public Integer maxCpuCore;

    /**
     * <p>The maximum memory that can be used by the client. Unit: bytes. Only V2.13.0 and later are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("MaxMemory")
    public Long maxMemory;

    /**
     * <p>The number of concurrent backup jobs. The value 0 indicates that the number is unlimited.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxWorker")
    public Integer maxWorker;

    /**
     * <p>The custom host IP address of the proxy server on the data plane.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.11.100</p>
     */
    @NameInMap("ProxyHost")
    public String proxyHost;

    /**
     * <p>The custom password of the proxy server on the data plane.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ProxyPassword")
    public String proxyPassword;

    /**
     * <p>The custom host port of the proxy server on the data plane.</p>
     * 
     * <strong>example:</strong>
     * <p>3128</p>
     */
    @NameInMap("ProxyPort")
    public Integer proxyPort;

    /**
     * <p>The custom username of the proxy server on the data plane.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("ProxyUser")
    public String proxyUser;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-*********************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to transmit the data on the data plane over HTTPS. Valid values:</p>
     * <ul>
     * <li>true: Data is transmitted over HTTPS.</li>
     * <li>false: Data is transmitted over HTTP.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseHttps")
    public Boolean useHttps;

    /**
     * <p>The ID of the backup vault. This parameter is required for the old HBR client.</p>
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
