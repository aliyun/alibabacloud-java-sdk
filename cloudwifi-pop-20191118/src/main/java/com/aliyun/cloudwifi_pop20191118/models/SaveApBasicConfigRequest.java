// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApBasicConfigRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Country")
    public String country;

    @NameInMap("Dai")
    public String dai;

    @NameInMap("Description")
    public String description;

    @NameInMap("EchoInt")
    public Integer echoInt;

    @NameInMap("Failover")
    public Integer failover;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InsecureAllowed")
    public Integer insecureAllowed;

    @NameInMap("LanIp")
    public String lanIp;

    @NameInMap("LanMask")
    public String lanMask;

    @NameInMap("LanStatus")
    public Integer lanStatus;

    @NameInMap("LogIp")
    public String logIp;

    @NameInMap("LogLevel")
    public Integer logLevel;

    @NameInMap("Name")
    public String name;

    @NameInMap("Passwd")
    public String passwd;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("Route")
    public String route;

    @NameInMap("Scan")
    public Integer scan;

    @NameInMap("TokenServer")
    public String tokenServer;

    @NameInMap("Vpn")
    public String vpn;

    @NameInMap("WorkMode")
    public Integer workMode;

    public static SaveApBasicConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveApBasicConfigRequest self = new SaveApBasicConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveApBasicConfigRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public SaveApBasicConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SaveApBasicConfigRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public SaveApBasicConfigRequest setDai(String dai) {
        this.dai = dai;
        return this;
    }
    public String getDai() {
        return this.dai;
    }

    public SaveApBasicConfigRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SaveApBasicConfigRequest setEchoInt(Integer echoInt) {
        this.echoInt = echoInt;
        return this;
    }
    public Integer getEchoInt() {
        return this.echoInt;
    }

    public SaveApBasicConfigRequest setFailover(Integer failover) {
        this.failover = failover;
        return this;
    }
    public Integer getFailover() {
        return this.failover;
    }

    public SaveApBasicConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SaveApBasicConfigRequest setInsecureAllowed(Integer insecureAllowed) {
        this.insecureAllowed = insecureAllowed;
        return this;
    }
    public Integer getInsecureAllowed() {
        return this.insecureAllowed;
    }

    public SaveApBasicConfigRequest setLanIp(String lanIp) {
        this.lanIp = lanIp;
        return this;
    }
    public String getLanIp() {
        return this.lanIp;
    }

    public SaveApBasicConfigRequest setLanMask(String lanMask) {
        this.lanMask = lanMask;
        return this;
    }
    public String getLanMask() {
        return this.lanMask;
    }

    public SaveApBasicConfigRequest setLanStatus(Integer lanStatus) {
        this.lanStatus = lanStatus;
        return this;
    }
    public Integer getLanStatus() {
        return this.lanStatus;
    }

    public SaveApBasicConfigRequest setLogIp(String logIp) {
        this.logIp = logIp;
        return this;
    }
    public String getLogIp() {
        return this.logIp;
    }

    public SaveApBasicConfigRequest setLogLevel(Integer logLevel) {
        this.logLevel = logLevel;
        return this;
    }
    public Integer getLogLevel() {
        return this.logLevel;
    }

    public SaveApBasicConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SaveApBasicConfigRequest setPasswd(String passwd) {
        this.passwd = passwd;
        return this;
    }
    public String getPasswd() {
        return this.passwd;
    }

    public SaveApBasicConfigRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public SaveApBasicConfigRequest setRoute(String route) {
        this.route = route;
        return this;
    }
    public String getRoute() {
        return this.route;
    }

    public SaveApBasicConfigRequest setScan(Integer scan) {
        this.scan = scan;
        return this;
    }
    public Integer getScan() {
        return this.scan;
    }

    public SaveApBasicConfigRequest setTokenServer(String tokenServer) {
        this.tokenServer = tokenServer;
        return this;
    }
    public String getTokenServer() {
        return this.tokenServer;
    }

    public SaveApBasicConfigRequest setVpn(String vpn) {
        this.vpn = vpn;
        return this;
    }
    public String getVpn() {
        return this.vpn;
    }

    public SaveApBasicConfigRequest setWorkMode(Integer workMode) {
        this.workMode = workMode;
        return this;
    }
    public Integer getWorkMode() {
        return this.workMode;
    }

}
