// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateConfigRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese</p>
     * </li>
     * <li><p>en: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Specifies whether to enable forced Simple Authentication and Security Layer (SASL) authentication. After this feature is enabled, clients that do not perform SASL authentication cannot access the cluster</p>
     */
    @NameInMap("AuthEnabled")
    public Boolean authEnabled;

    /**
     * <p>The reserved field.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("AutopurgePurgeInterval")
    public String autopurgePurgeInterval;

    /**
     * <p>The reserved field.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("AutopurgeSnapRetainCount")
    public String autopurgeSnapRetainCount;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-09k1q11****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to enable RAM authentication for the configuration center in Nacos:</p>
     * <ul>
     * <li><p><code>true</code>: enabled</p>
     * </li>
     * <li><p><code>false</code>: disabled</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Before you set this parameter, call the QueryConfig operation to obtain the ConfigAuthSupported parameter to check whether the current cluster supports this feature.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ConfigAuthEnabled")
    public Boolean configAuthEnabled;

    /**
     * <p>Specifies whether to enable the configuration encryption feature for the configuration center in Nacos. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The request was successful.</p>
     * </li>
     * <li><p><code>false</code>: The request failed.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Before you set this parameter, call the QueryConfig operation to obtain the ConfigSecretSupported parameter to check whether the current cluster supports this feature.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ConfigSecretEnabled")
    public Boolean configSecretEnabled;

    /**
     * <p>The format of the configurations. Supported formats include TEXT, JSON, XML, and HTML.</p>
     * 
     * <strong>example:</strong>
     * <p>TEXT</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>Specifies whether to enable the Nacos open-source console</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ConsoleUIEnabled")
    public Boolean consoleUIEnabled;

    /**
     * <p>Specifies whether to enable the four-character command access feature</p>
     */
    @NameInMap("Enable4lw")
    public Boolean enable4lw;

    /**
     * <p>Specifies whether to enable Eureka protocol support in Nacos</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EurekaSupported")
    public Boolean eurekaSupported;

    /**
     * <p>Specifies whether to enable TTL configuration in ZooKeeper parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ExtendedTypesEnable")
    public String extendedTypesEnable;

    /**
     * <p>The maximum connection duration of the instance. This parameter is valid for ZooKeeper instances. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("InitLimit")
    public String initLimit;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>mse_prepaid_public_cn-st2212****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum amount of data on each node. This parameter is valid for ZooKeeper instances. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1048575</p>
     */
    @NameInMap("JuteMaxbuffer")
    public String juteMaxbuffer;

    /**
     * <p>Specifies whether MCP is enabled in Nacos configuration. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: enabled</p>
     * </li>
     * <li><p><code>false</code>: disabled</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Before you set this parameter, call the QueryConfig operation to obtain the MCPSupported parameter to check whether the current cluster supports this feature.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MCPEnabled")
    public Boolean MCPEnabled;

    /**
     * <p>The number of connections between a single client and a single server in ZooKeeper configuration.<br>
     * If this parameter is set to 0, no limits are imposed on the number of connections.<br></p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxClientCnxns")
    public String maxClientCnxns;

    /**
     * <p>The maximum timeout period in ZooKeeper configuration. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxSessionTimeout")
    public String maxSessionTimeout;

    /**
     * <p>The minimum timeout period in ZooKeeper configuration. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MinSessionTimeout")
    public String minSessionTimeout;

    /**
     * <p>Specifies whether to enable RAM authentication for the Accreditation Centre in Nacos:</p>
     * <ul>
     * <li><p><code>true</code>: enabled</p>
     * </li>
     * <li><p><code>false</code>: disabled</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Before you set this parameter, call the QueryConfig operation to obtain the NamingAuthSupporte parameter to check whether the current cluster supports this feature.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NamingAuthEnabled")
    public Boolean namingAuthEnabled;

    /**
     * <p>Specifies whether super permissions are enabled. This parameter is valid for ZooKeeper instances. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: enabled</p>
     * </li>
     * <li><p><code>false</code>: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OpenSuperAcl")
    public String openSuperAcl;

    /**
     * <p>The password of the account.</p>
     * <blockquote>
     * <p>This parameter is required when OpenSuperAcl is set to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>password</p>
     */
    @NameInMap("PassWord")
    public String passWord;

    /**
     * <p>The extended request parameter in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>The frequency at which snapshots are generated in ZooKeeper configuration</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("SnapshotCount")
    public String snapshotCount;

    /**
     * <p>The connection timeout period of the instance. This parameter is valid for ZooKeeper instances. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SyncLimit")
    public String syncLimit;

    /**
     * <p>Specifies whether to enable TLS transmission link encryption in Nacos</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TLSEnabled")
    public Boolean TLSEnabled;

    /**
     * <p>The time unit. This parameter is valid for ZooKeeper instances. Default value: 2000. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("TickTime")
    public String tickTime;

    /**
     * <p>The username of the account.</p>
     * <blockquote>
     * <p>This parameter is required when OpenSuperAcl is set to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static UpdateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigRequest self = new UpdateConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateConfigRequest setAuthEnabled(Boolean authEnabled) {
        this.authEnabled = authEnabled;
        return this;
    }
    public Boolean getAuthEnabled() {
        return this.authEnabled;
    }

    public UpdateConfigRequest setAutopurgePurgeInterval(String autopurgePurgeInterval) {
        this.autopurgePurgeInterval = autopurgePurgeInterval;
        return this;
    }
    public String getAutopurgePurgeInterval() {
        return this.autopurgePurgeInterval;
    }

    public UpdateConfigRequest setAutopurgeSnapRetainCount(String autopurgeSnapRetainCount) {
        this.autopurgeSnapRetainCount = autopurgeSnapRetainCount;
        return this;
    }
    public String getAutopurgeSnapRetainCount() {
        return this.autopurgeSnapRetainCount;
    }

    public UpdateConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateConfigRequest setConfigAuthEnabled(Boolean configAuthEnabled) {
        this.configAuthEnabled = configAuthEnabled;
        return this;
    }
    public Boolean getConfigAuthEnabled() {
        return this.configAuthEnabled;
    }

    public UpdateConfigRequest setConfigSecretEnabled(Boolean configSecretEnabled) {
        this.configSecretEnabled = configSecretEnabled;
        return this;
    }
    public Boolean getConfigSecretEnabled() {
        return this.configSecretEnabled;
    }

    public UpdateConfigRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public UpdateConfigRequest setConsoleUIEnabled(Boolean consoleUIEnabled) {
        this.consoleUIEnabled = consoleUIEnabled;
        return this;
    }
    public Boolean getConsoleUIEnabled() {
        return this.consoleUIEnabled;
    }

    public UpdateConfigRequest setEnable4lw(Boolean enable4lw) {
        this.enable4lw = enable4lw;
        return this;
    }
    public Boolean getEnable4lw() {
        return this.enable4lw;
    }

    public UpdateConfigRequest setEurekaSupported(Boolean eurekaSupported) {
        this.eurekaSupported = eurekaSupported;
        return this;
    }
    public Boolean getEurekaSupported() {
        return this.eurekaSupported;
    }

    public UpdateConfigRequest setExtendedTypesEnable(String extendedTypesEnable) {
        this.extendedTypesEnable = extendedTypesEnable;
        return this;
    }
    public String getExtendedTypesEnable() {
        return this.extendedTypesEnable;
    }

    public UpdateConfigRequest setInitLimit(String initLimit) {
        this.initLimit = initLimit;
        return this;
    }
    public String getInitLimit() {
        return this.initLimit;
    }

    public UpdateConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateConfigRequest setJuteMaxbuffer(String juteMaxbuffer) {
        this.juteMaxbuffer = juteMaxbuffer;
        return this;
    }
    public String getJuteMaxbuffer() {
        return this.juteMaxbuffer;
    }

    public UpdateConfigRequest setMCPEnabled(Boolean MCPEnabled) {
        this.MCPEnabled = MCPEnabled;
        return this;
    }
    public Boolean getMCPEnabled() {
        return this.MCPEnabled;
    }

    public UpdateConfigRequest setMaxClientCnxns(String maxClientCnxns) {
        this.maxClientCnxns = maxClientCnxns;
        return this;
    }
    public String getMaxClientCnxns() {
        return this.maxClientCnxns;
    }

    public UpdateConfigRequest setMaxSessionTimeout(String maxSessionTimeout) {
        this.maxSessionTimeout = maxSessionTimeout;
        return this;
    }
    public String getMaxSessionTimeout() {
        return this.maxSessionTimeout;
    }

    public UpdateConfigRequest setMinSessionTimeout(String minSessionTimeout) {
        this.minSessionTimeout = minSessionTimeout;
        return this;
    }
    public String getMinSessionTimeout() {
        return this.minSessionTimeout;
    }

    public UpdateConfigRequest setNamingAuthEnabled(Boolean namingAuthEnabled) {
        this.namingAuthEnabled = namingAuthEnabled;
        return this;
    }
    public Boolean getNamingAuthEnabled() {
        return this.namingAuthEnabled;
    }

    public UpdateConfigRequest setOpenSuperAcl(String openSuperAcl) {
        this.openSuperAcl = openSuperAcl;
        return this;
    }
    public String getOpenSuperAcl() {
        return this.openSuperAcl;
    }

    public UpdateConfigRequest setPassWord(String passWord) {
        this.passWord = passWord;
        return this;
    }
    public String getPassWord() {
        return this.passWord;
    }

    public UpdateConfigRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public UpdateConfigRequest setSnapshotCount(String snapshotCount) {
        this.snapshotCount = snapshotCount;
        return this;
    }
    public String getSnapshotCount() {
        return this.snapshotCount;
    }

    public UpdateConfigRequest setSyncLimit(String syncLimit) {
        this.syncLimit = syncLimit;
        return this;
    }
    public String getSyncLimit() {
        return this.syncLimit;
    }

    public UpdateConfigRequest setTLSEnabled(Boolean TLSEnabled) {
        this.TLSEnabled = TLSEnabled;
        return this;
    }
    public Boolean getTLSEnabled() {
        return this.TLSEnabled;
    }

    public UpdateConfigRequest setTickTime(String tickTime) {
        this.tickTime = tickTime;
        return this;
    }
    public String getTickTime() {
        return this.tickTime;
    }

    public UpdateConfigRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
