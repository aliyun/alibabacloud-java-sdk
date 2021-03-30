// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApgroupSsidConfigRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("NewSsid")
    public String newSsid;

    @NameInMap("Nasid")
    public String nasid;

    @NameInMap("IgnoreWeakProbe")
    public Integer ignoreWeakProbe;

    @NameInMap("DaePort")
    public Integer daePort;

    @NameInMap("ApgroupId")
    public String apgroupId;

    @NameInMap("Hidden")
    public String hidden;

    @NameInMap("SecondaryAcctSecret")
    public String secondaryAcctSecret;

    @NameInMap("Binding")
    public String binding;

    @NameInMap("MaxInactivity")
    public Integer maxInactivity;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("Ssid")
    public String ssid;

    @NameInMap("Cir")
    public Long cir;

    @NameInMap("Network")
    public Integer network;

    @NameInMap("Ieee80211w")
    public String ieee80211w;

    @NameInMap("Isolate")
    public String isolate;

    @NameInMap("SsidLb")
    public Integer ssidLb;

    @NameInMap("DisassocWeakRssi")
    public Integer disassocWeakRssi;

    @NameInMap("Encryption")
    public String encryption;

    @NameInMap("VlanDhcp")
    public Integer vlanDhcp;

    @NameInMap("AuthPort")
    public Integer authPort;

    @NameInMap("Wmm")
    public String wmm;

    @NameInMap("DynamicVlan")
    public Integer dynamicVlan;

    @NameInMap("AuthServer")
    public String authServer;

    @NameInMap("Disabled")
    public String disabled;

    @NameInMap("DaeSecret")
    public String daeSecret;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Maxassoc")
    public String maxassoc;

    @NameInMap("SecondaryAuthPort")
    public Integer secondaryAuthPort;

    @NameInMap("SecondaryAuthSecret")
    public String secondaryAuthSecret;

    @NameInMap("AcctPort")
    public Integer acctPort;

    @NameInMap("ShortPreamble")
    public String shortPreamble;

    @NameInMap("LiteEffect")
    public Boolean liteEffect;

    @NameInMap("DaeClient")
    public String daeClient;

    @NameInMap("AcctServer")
    public String acctServer;

    @NameInMap("SecondaryAuthServer")
    public String secondaryAuthServer;

    @NameInMap("EncKey")
    public String encKey;

    @NameInMap("AcctSecret")
    public String acctSecret;

    @NameInMap("AuthSecret")
    public String authSecret;

    @NameInMap("Effect")
    public Boolean effect;

    @NameInMap("AuthCache")
    public String authCache;

    @NameInMap("MulticastForward")
    public Integer multicastForward;

    @NameInMap("SecondaryAcctPort")
    public Integer secondaryAcctPort;

    @NameInMap("DisassocLowAck")
    public String disassocLowAck;

    @NameInMap("SecondaryAcctServer")
    public String secondaryAcctServer;

    @NameInMap("Ownip")
    public String ownip;

    public static SaveApgroupSsidConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveApgroupSsidConfigRequest self = new SaveApgroupSsidConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveApgroupSsidConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SaveApgroupSsidConfigRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public SaveApgroupSsidConfigRequest setNewSsid(String newSsid) {
        this.newSsid = newSsid;
        return this;
    }
    public String getNewSsid() {
        return this.newSsid;
    }

    public SaveApgroupSsidConfigRequest setNasid(String nasid) {
        this.nasid = nasid;
        return this;
    }
    public String getNasid() {
        return this.nasid;
    }

    public SaveApgroupSsidConfigRequest setIgnoreWeakProbe(Integer ignoreWeakProbe) {
        this.ignoreWeakProbe = ignoreWeakProbe;
        return this;
    }
    public Integer getIgnoreWeakProbe() {
        return this.ignoreWeakProbe;
    }

    public SaveApgroupSsidConfigRequest setDaePort(Integer daePort) {
        this.daePort = daePort;
        return this;
    }
    public Integer getDaePort() {
        return this.daePort;
    }

    public SaveApgroupSsidConfigRequest setApgroupId(String apgroupId) {
        this.apgroupId = apgroupId;
        return this;
    }
    public String getApgroupId() {
        return this.apgroupId;
    }

    public SaveApgroupSsidConfigRequest setHidden(String hidden) {
        this.hidden = hidden;
        return this;
    }
    public String getHidden() {
        return this.hidden;
    }

    public SaveApgroupSsidConfigRequest setSecondaryAcctSecret(String secondaryAcctSecret) {
        this.secondaryAcctSecret = secondaryAcctSecret;
        return this;
    }
    public String getSecondaryAcctSecret() {
        return this.secondaryAcctSecret;
    }

    public SaveApgroupSsidConfigRequest setBinding(String binding) {
        this.binding = binding;
        return this;
    }
    public String getBinding() {
        return this.binding;
    }

    public SaveApgroupSsidConfigRequest setMaxInactivity(Integer maxInactivity) {
        this.maxInactivity = maxInactivity;
        return this;
    }
    public Integer getMaxInactivity() {
        return this.maxInactivity;
    }

    public SaveApgroupSsidConfigRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public SaveApgroupSsidConfigRequest setSsid(String ssid) {
        this.ssid = ssid;
        return this;
    }
    public String getSsid() {
        return this.ssid;
    }

    public SaveApgroupSsidConfigRequest setCir(Long cir) {
        this.cir = cir;
        return this;
    }
    public Long getCir() {
        return this.cir;
    }

    public SaveApgroupSsidConfigRequest setNetwork(Integer network) {
        this.network = network;
        return this;
    }
    public Integer getNetwork() {
        return this.network;
    }

    public SaveApgroupSsidConfigRequest setIeee80211w(String ieee80211w) {
        this.ieee80211w = ieee80211w;
        return this;
    }
    public String getIeee80211w() {
        return this.ieee80211w;
    }

    public SaveApgroupSsidConfigRequest setIsolate(String isolate) {
        this.isolate = isolate;
        return this;
    }
    public String getIsolate() {
        return this.isolate;
    }

    public SaveApgroupSsidConfigRequest setSsidLb(Integer ssidLb) {
        this.ssidLb = ssidLb;
        return this;
    }
    public Integer getSsidLb() {
        return this.ssidLb;
    }

    public SaveApgroupSsidConfigRequest setDisassocWeakRssi(Integer disassocWeakRssi) {
        this.disassocWeakRssi = disassocWeakRssi;
        return this;
    }
    public Integer getDisassocWeakRssi() {
        return this.disassocWeakRssi;
    }

    public SaveApgroupSsidConfigRequest setEncryption(String encryption) {
        this.encryption = encryption;
        return this;
    }
    public String getEncryption() {
        return this.encryption;
    }

    public SaveApgroupSsidConfigRequest setVlanDhcp(Integer vlanDhcp) {
        this.vlanDhcp = vlanDhcp;
        return this;
    }
    public Integer getVlanDhcp() {
        return this.vlanDhcp;
    }

    public SaveApgroupSsidConfigRequest setAuthPort(Integer authPort) {
        this.authPort = authPort;
        return this;
    }
    public Integer getAuthPort() {
        return this.authPort;
    }

    public SaveApgroupSsidConfigRequest setWmm(String wmm) {
        this.wmm = wmm;
        return this;
    }
    public String getWmm() {
        return this.wmm;
    }

    public SaveApgroupSsidConfigRequest setDynamicVlan(Integer dynamicVlan) {
        this.dynamicVlan = dynamicVlan;
        return this;
    }
    public Integer getDynamicVlan() {
        return this.dynamicVlan;
    }

    public SaveApgroupSsidConfigRequest setAuthServer(String authServer) {
        this.authServer = authServer;
        return this;
    }
    public String getAuthServer() {
        return this.authServer;
    }

    public SaveApgroupSsidConfigRequest setDisabled(String disabled) {
        this.disabled = disabled;
        return this;
    }
    public String getDisabled() {
        return this.disabled;
    }

    public SaveApgroupSsidConfigRequest setDaeSecret(String daeSecret) {
        this.daeSecret = daeSecret;
        return this;
    }
    public String getDaeSecret() {
        return this.daeSecret;
    }

    public SaveApgroupSsidConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SaveApgroupSsidConfigRequest setMaxassoc(String maxassoc) {
        this.maxassoc = maxassoc;
        return this;
    }
    public String getMaxassoc() {
        return this.maxassoc;
    }

    public SaveApgroupSsidConfigRequest setSecondaryAuthPort(Integer secondaryAuthPort) {
        this.secondaryAuthPort = secondaryAuthPort;
        return this;
    }
    public Integer getSecondaryAuthPort() {
        return this.secondaryAuthPort;
    }

    public SaveApgroupSsidConfigRequest setSecondaryAuthSecret(String secondaryAuthSecret) {
        this.secondaryAuthSecret = secondaryAuthSecret;
        return this;
    }
    public String getSecondaryAuthSecret() {
        return this.secondaryAuthSecret;
    }

    public SaveApgroupSsidConfigRequest setAcctPort(Integer acctPort) {
        this.acctPort = acctPort;
        return this;
    }
    public Integer getAcctPort() {
        return this.acctPort;
    }

    public SaveApgroupSsidConfigRequest setShortPreamble(String shortPreamble) {
        this.shortPreamble = shortPreamble;
        return this;
    }
    public String getShortPreamble() {
        return this.shortPreamble;
    }

    public SaveApgroupSsidConfigRequest setLiteEffect(Boolean liteEffect) {
        this.liteEffect = liteEffect;
        return this;
    }
    public Boolean getLiteEffect() {
        return this.liteEffect;
    }

    public SaveApgroupSsidConfigRequest setDaeClient(String daeClient) {
        this.daeClient = daeClient;
        return this;
    }
    public String getDaeClient() {
        return this.daeClient;
    }

    public SaveApgroupSsidConfigRequest setAcctServer(String acctServer) {
        this.acctServer = acctServer;
        return this;
    }
    public String getAcctServer() {
        return this.acctServer;
    }

    public SaveApgroupSsidConfigRequest setSecondaryAuthServer(String secondaryAuthServer) {
        this.secondaryAuthServer = secondaryAuthServer;
        return this;
    }
    public String getSecondaryAuthServer() {
        return this.secondaryAuthServer;
    }

    public SaveApgroupSsidConfigRequest setEncKey(String encKey) {
        this.encKey = encKey;
        return this;
    }
    public String getEncKey() {
        return this.encKey;
    }

    public SaveApgroupSsidConfigRequest setAcctSecret(String acctSecret) {
        this.acctSecret = acctSecret;
        return this;
    }
    public String getAcctSecret() {
        return this.acctSecret;
    }

    public SaveApgroupSsidConfigRequest setAuthSecret(String authSecret) {
        this.authSecret = authSecret;
        return this;
    }
    public String getAuthSecret() {
        return this.authSecret;
    }

    public SaveApgroupSsidConfigRequest setEffect(Boolean effect) {
        this.effect = effect;
        return this;
    }
    public Boolean getEffect() {
        return this.effect;
    }

    public SaveApgroupSsidConfigRequest setAuthCache(String authCache) {
        this.authCache = authCache;
        return this;
    }
    public String getAuthCache() {
        return this.authCache;
    }

    public SaveApgroupSsidConfigRequest setMulticastForward(Integer multicastForward) {
        this.multicastForward = multicastForward;
        return this;
    }
    public Integer getMulticastForward() {
        return this.multicastForward;
    }

    public SaveApgroupSsidConfigRequest setSecondaryAcctPort(Integer secondaryAcctPort) {
        this.secondaryAcctPort = secondaryAcctPort;
        return this;
    }
    public Integer getSecondaryAcctPort() {
        return this.secondaryAcctPort;
    }

    public SaveApgroupSsidConfigRequest setDisassocLowAck(String disassocLowAck) {
        this.disassocLowAck = disassocLowAck;
        return this;
    }
    public String getDisassocLowAck() {
        return this.disassocLowAck;
    }

    public SaveApgroupSsidConfigRequest setSecondaryAcctServer(String secondaryAcctServer) {
        this.secondaryAcctServer = secondaryAcctServer;
        return this;
    }
    public String getSecondaryAcctServer() {
        return this.secondaryAcctServer;
    }

    public SaveApgroupSsidConfigRequest setOwnip(String ownip) {
        this.ownip = ownip;
        return this;
    }
    public String getOwnip() {
        return this.ownip;
    }

}
