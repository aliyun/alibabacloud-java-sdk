// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateConfigRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AuthEnabled")
    public Boolean authEnabled;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("AutopurgePurgeInterval")
    public String autopurgePurgeInterval;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("AutopurgeSnapRetainCount")
    public String autopurgeSnapRetainCount;

    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-09k1q11****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to enable Resource Access Management (RAM) authentication for a configuration center. This parameter is valid for Nacos instances. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enabled.</li>
     * <li><code>false</code>: disabled.</li>
     * </ul>
     * <blockquote>
     * <p>Before you configure this parameter, you must call the QueryConfig operation to obtain the ConfigAuthSupported parameter value to check whether the instance supports the RAM authentication feature.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ConfigAuthEnabled")
    public Boolean configAuthEnabled;

    /**
     * <p>Specifies whether to enable configuration encryption for a configuration center. This parameter is valid for Nacos instances. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enabled.</li>
     * <li><code>false</code>: disabled.</li>
     * </ul>
     * <blockquote>
     * <p>Before you configure this parameter, you must call the QueryConfig operation to obtain the ConfigSecretSupported parameter value to check whether the instance supports configuration encryption.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ConfigSecretEnabled")
    public Boolean configSecretEnabled;

    /**
     * <p>The format of the configuration. Supported formats include TEXT, JSON, XML, and HTML.</p>
     * 
     * <strong>example:</strong>
     * <p>TEXT</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("ConsoleUIEnabled")
    public Boolean consoleUIEnabled;

    @NameInMap("Enable4lw")
    public Boolean enable4lw;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EurekaSupported")
    public Boolean eurekaSupported;

    /**
     * <p>Specifies whether to enable the time to live (TTL) configuration. This parameter is valid for ZooKeeper instances.</p>
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
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>mse_prepaid_public_cn-st2212****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum amount of data on each node. This parameter is valid for ZooKeeper instances. The default maximum data amount on each node is 1 megabyte. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1048575</p>
     */
    @NameInMap("JuteMaxbuffer")
    public String juteMaxbuffer;

    /**
     * <p>Specifies whether to enable Mesh Configuration Protocol (MCP). This parameter is valid for Nacos instances. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enabled.</li>
     * <li><code>false</code>: disabled.</li>
     * </ul>
     * <blockquote>
     * <p>Before you configure this parameter, you must call the QueryConfig operation to obtain the MCPSupported parameter value to check whether the instance supports MCP.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MCPEnabled")
    public Boolean MCPEnabled;

    /**
     * <p>The number of connections between a client and a server. This parameter is valid for ZooKeeper instances.\
     * If this parameter is set to 0, no limits are imposed on the number of connections.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxClientCnxns")
    public String maxClientCnxns;

    /**
     * <p>The maximum timeout period. This parameter is valid for ZooKeeper instances. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxSessionTimeout")
    public String maxSessionTimeout;

    /**
     * <p>The minimum timeout period. This parameter is valid for ZooKeeper instances. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MinSessionTimeout")
    public String minSessionTimeout;

    /**
     * <p>Specifies whether to enable RAM authentication for a registry. This parameter is valid for Nacos instances. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enabled.</li>
     * <li><code>false</code>: disabled.</li>
     * </ul>
     * <blockquote>
     * <p>Before you configure this parameter, you must call the QueryConfig operation to obtain the NamingAuthSupporte parameter value to check whether the instance supports the RAM authentication feature.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NamingAuthEnabled")
    public Boolean namingAuthEnabled;

    /**
     * <p>Specifies whether to enable super permissions. This parameter is valid for ZooKeeper instances. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enabled</li>
     * <li><code>false</code>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OpenSuperAcl")
    public String openSuperAcl;

    /**
     * <p>The password that corresponds to the username.</p>
     * <blockquote>
     * <p>You must specify this parameter if OpenSuperAcl is set to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>password</p>
     */
    @NameInMap("PassWord")
    public String passWord;

    /**
     * <p>The extended request parameters in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>The frequency for generating snapshots. This parameter is valid for ZooKeeper instances.</p>
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
     * <p>The name of the user.</p>
     * <blockquote>
     * <p>You must specify this parameter if OpenSuperAcl is set to true.</p>
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
