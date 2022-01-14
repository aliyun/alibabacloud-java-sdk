// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApgroupBasicConfigRequest extends TeaModel {
    // appSecret
    @NameInMap("AppCode")
    public String appCode;

    // appKey
    @NameInMap("AppName")
    public String appName;

    // country
    @NameInMap("Country")
    public String country;

    // dai
    @NameInMap("Dai")
    public String dai;

    // description
    @NameInMap("Description")
    public String description;

    // echoInt
    @NameInMap("EchoInt")
    public Integer echoInt;

    // failover
    @NameInMap("Failover")
    public Integer failover;

    // id
    @NameInMap("Id")
    public Long id;

    // insecureAllowed
    @NameInMap("InsecureAllowed")
    public Integer insecureAllowed;

    // isConfigStrongConsistency
    @NameInMap("IsConfigStrongConsistency")
    public Boolean isConfigStrongConsistency;

    // lanIp
    @NameInMap("LanIp")
    public String lanIp;

    // lanMask
    @NameInMap("LanMask")
    public String lanMask;

    // lanStatus
    @NameInMap("LanStatus")
    public Integer lanStatus;

    // logIp
    @NameInMap("LogIp")
    public String logIp;

    // logLevel
    @NameInMap("LogLevel")
    public Integer logLevel;

    // name
    @NameInMap("Name")
    public String name;

    // parentApgroupId
    @NameInMap("ParentApgroupId")
    public Long parentApgroupId;

    // passwd
    @NameInMap("Passwd")
    public String passwd;

    // protocol
    @NameInMap("Protocol")
    public String protocol;

    // route
    @NameInMap("Route")
    public String route;

    // scan
    @NameInMap("Scan")
    public Integer scan;

    // tokenServer
    @NameInMap("TokenServer")
    public String tokenServer;

    // vpn
    @NameInMap("Vpn")
    public String vpn;

    // workMode
    @NameInMap("WorkMode")
    public Integer workMode;

    public static SaveApgroupBasicConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveApgroupBasicConfigRequest self = new SaveApgroupBasicConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveApgroupBasicConfigRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public SaveApgroupBasicConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SaveApgroupBasicConfigRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public SaveApgroupBasicConfigRequest setDai(String dai) {
        this.dai = dai;
        return this;
    }
    public String getDai() {
        return this.dai;
    }

    public SaveApgroupBasicConfigRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SaveApgroupBasicConfigRequest setEchoInt(Integer echoInt) {
        this.echoInt = echoInt;
        return this;
    }
    public Integer getEchoInt() {
        return this.echoInt;
    }

    public SaveApgroupBasicConfigRequest setFailover(Integer failover) {
        this.failover = failover;
        return this;
    }
    public Integer getFailover() {
        return this.failover;
    }

    public SaveApgroupBasicConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SaveApgroupBasicConfigRequest setInsecureAllowed(Integer insecureAllowed) {
        this.insecureAllowed = insecureAllowed;
        return this;
    }
    public Integer getInsecureAllowed() {
        return this.insecureAllowed;
    }

    public SaveApgroupBasicConfigRequest setIsConfigStrongConsistency(Boolean isConfigStrongConsistency) {
        this.isConfigStrongConsistency = isConfigStrongConsistency;
        return this;
    }
    public Boolean getIsConfigStrongConsistency() {
        return this.isConfigStrongConsistency;
    }

    public SaveApgroupBasicConfigRequest setLanIp(String lanIp) {
        this.lanIp = lanIp;
        return this;
    }
    public String getLanIp() {
        return this.lanIp;
    }

    public SaveApgroupBasicConfigRequest setLanMask(String lanMask) {
        this.lanMask = lanMask;
        return this;
    }
    public String getLanMask() {
        return this.lanMask;
    }

    public SaveApgroupBasicConfigRequest setLanStatus(Integer lanStatus) {
        this.lanStatus = lanStatus;
        return this;
    }
    public Integer getLanStatus() {
        return this.lanStatus;
    }

    public SaveApgroupBasicConfigRequest setLogIp(String logIp) {
        this.logIp = logIp;
        return this;
    }
    public String getLogIp() {
        return this.logIp;
    }

    public SaveApgroupBasicConfigRequest setLogLevel(Integer logLevel) {
        this.logLevel = logLevel;
        return this;
    }
    public Integer getLogLevel() {
        return this.logLevel;
    }

    public SaveApgroupBasicConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SaveApgroupBasicConfigRequest setParentApgroupId(Long parentApgroupId) {
        this.parentApgroupId = parentApgroupId;
        return this;
    }
    public Long getParentApgroupId() {
        return this.parentApgroupId;
    }

    public SaveApgroupBasicConfigRequest setPasswd(String passwd) {
        this.passwd = passwd;
        return this;
    }
    public String getPasswd() {
        return this.passwd;
    }

    public SaveApgroupBasicConfigRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public SaveApgroupBasicConfigRequest setRoute(String route) {
        this.route = route;
        return this;
    }
    public String getRoute() {
        return this.route;
    }

    public SaveApgroupBasicConfigRequest setScan(Integer scan) {
        this.scan = scan;
        return this;
    }
    public Integer getScan() {
        return this.scan;
    }

    public SaveApgroupBasicConfigRequest setTokenServer(String tokenServer) {
        this.tokenServer = tokenServer;
        return this;
    }
    public String getTokenServer() {
        return this.tokenServer;
    }

    public SaveApgroupBasicConfigRequest setVpn(String vpn) {
        this.vpn = vpn;
        return this;
    }
    public String getVpn() {
        return this.vpn;
    }

    public SaveApgroupBasicConfigRequest setWorkMode(Integer workMode) {
        this.workMode = workMode;
        return this;
    }
    public Integer getWorkMode() {
        return this.workMode;
    }

}
