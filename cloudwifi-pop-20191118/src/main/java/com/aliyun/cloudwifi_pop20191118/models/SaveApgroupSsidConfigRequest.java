// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApgroupSsidConfigRequest extends TeaModel {
    @NameInMap("AcctPort")
    public Integer acctPort;

    @NameInMap("AcctSecret")
    public String acctSecret;

    @NameInMap("AcctServer")
    public String acctServer;

    @NameInMap("ApgroupId")
    public String apgroupId;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AuthCache")
    public String authCache;

    @NameInMap("AuthPort")
    public Integer authPort;

    @NameInMap("AuthSecret")
    public String authSecret;

    @NameInMap("AuthServer")
    public String authServer;

    @NameInMap("Binding")
    public String binding;

    @NameInMap("Cir")
    public Long cir;

    @NameInMap("DaeClient")
    public String daeClient;

    @NameInMap("DaePort")
    public Integer daePort;

    @NameInMap("DaeSecret")
    public String daeSecret;

    @NameInMap("Disabled")
    public String disabled;

    @NameInMap("DisassocLowAck")
    public String disassocLowAck;

    @NameInMap("DisassocWeakRssi")
    public Integer disassocWeakRssi;

    @NameInMap("DynamicVlan")
    public Integer dynamicVlan;

    @NameInMap("Effect")
    public Boolean effect;

    @NameInMap("EncKey")
    public String encKey;

    @NameInMap("Encryption")
    public String encryption;

    @NameInMap("Hidden")
    public String hidden;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Ieee80211w")
    public String ieee80211w;

    @NameInMap("IgnoreWeakProbe")
    public Integer ignoreWeakProbe;

    @NameInMap("Isolate")
    public String isolate;

    @NameInMap("LiteEffect")
    public Boolean liteEffect;

    @NameInMap("MaxInactivity")
    public Integer maxInactivity;

    @NameInMap("Maxassoc")
    public String maxassoc;

    @NameInMap("MulticastForward")
    public Integer multicastForward;

    @NameInMap("Nasid")
    public String nasid;

    @NameInMap("Network")
    public Integer network;

    @NameInMap("NewSsid")
    public String newSsid;

    @NameInMap("Ownip")
    public String ownip;

    @NameInMap("SecondaryAcctPort")
    public Integer secondaryAcctPort;

    @NameInMap("SecondaryAcctSecret")
    public String secondaryAcctSecret;

    @NameInMap("SecondaryAcctServer")
    public String secondaryAcctServer;

    @NameInMap("SecondaryAuthPort")
    public Integer secondaryAuthPort;

    @NameInMap("SecondaryAuthSecret")
    public String secondaryAuthSecret;

    @NameInMap("SecondaryAuthServer")
    public String secondaryAuthServer;

    @NameInMap("ShortPreamble")
    public String shortPreamble;

    @NameInMap("Ssid")
    public String ssid;

    @NameInMap("SsidLb")
    public Integer ssidLb;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("VlanDhcp")
    public Integer vlanDhcp;

    @NameInMap("Wmm")
    public String wmm;

    public static SaveApgroupSsidConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveApgroupSsidConfigRequest self = new SaveApgroupSsidConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveApgroupSsidConfigRequest setAcctPort(Integer acctPort) {
        this.acctPort = acctPort;
        return this;
    }
    public Integer getAcctPort() {
        return this.acctPort;
    }

    public SaveApgroupSsidConfigRequest setAcctSecret(String acctSecret) {
        this.acctSecret = acctSecret;
        return this;
    }
    public String getAcctSecret() {
        return this.acctSecret;
    }

    public SaveApgroupSsidConfigRequest setAcctServer(String acctServer) {
        this.acctServer = acctServer;
        return this;
    }
    public String getAcctServer() {
        return this.acctServer;
    }

    public SaveApgroupSsidConfigRequest setApgroupId(String apgroupId) {
        this.apgroupId = apgroupId;
        return this;
    }
    public String getApgroupId() {
        return this.apgroupId;
    }

    public SaveApgroupSsidConfigRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public SaveApgroupSsidConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SaveApgroupSsidConfigRequest setAuthCache(String authCache) {
        this.authCache = authCache;
        return this;
    }
    public String getAuthCache() {
        return this.authCache;
    }

    public SaveApgroupSsidConfigRequest setAuthPort(Integer authPort) {
        this.authPort = authPort;
        return this;
    }
    public Integer getAuthPort() {
        return this.authPort;
    }

    public SaveApgroupSsidConfigRequest setAuthSecret(String authSecret) {
        this.authSecret = authSecret;
        return this;
    }
    public String getAuthSecret() {
        return this.authSecret;
    }

    public SaveApgroupSsidConfigRequest setAuthServer(String authServer) {
        this.authServer = authServer;
        return this;
    }
    public String getAuthServer() {
        return this.authServer;
    }

    public SaveApgroupSsidConfigRequest setBinding(String binding) {
        this.binding = binding;
        return this;
    }
    public String getBinding() {
        return this.binding;
    }

    public SaveApgroupSsidConfigRequest setCir(Long cir) {
        this.cir = cir;
        return this;
    }
    public Long getCir() {
        return this.cir;
    }

    public SaveApgroupSsidConfigRequest setDaeClient(String daeClient) {
        this.daeClient = daeClient;
        return this;
    }
    public String getDaeClient() {
        return this.daeClient;
    }

    public SaveApgroupSsidConfigRequest setDaePort(Integer daePort) {
        this.daePort = daePort;
        return this;
    }
    public Integer getDaePort() {
        return this.daePort;
    }

    public SaveApgroupSsidConfigRequest setDaeSecret(String daeSecret) {
        this.daeSecret = daeSecret;
        return this;
    }
    public String getDaeSecret() {
        return this.daeSecret;
    }

    public SaveApgroupSsidConfigRequest setDisabled(String disabled) {
        this.disabled = disabled;
        return this;
    }
    public String getDisabled() {
        return this.disabled;
    }

    public SaveApgroupSsidConfigRequest setDisassocLowAck(String disassocLowAck) {
        this.disassocLowAck = disassocLowAck;
        return this;
    }
    public String getDisassocLowAck() {
        return this.disassocLowAck;
    }

    public SaveApgroupSsidConfigRequest setDisassocWeakRssi(Integer disassocWeakRssi) {
        this.disassocWeakRssi = disassocWeakRssi;
        return this;
    }
    public Integer getDisassocWeakRssi() {
        return this.disassocWeakRssi;
    }

    public SaveApgroupSsidConfigRequest setDynamicVlan(Integer dynamicVlan) {
        this.dynamicVlan = dynamicVlan;
        return this;
    }
    public Integer getDynamicVlan() {
        return this.dynamicVlan;
    }

    public SaveApgroupSsidConfigRequest setEffect(Boolean effect) {
        this.effect = effect;
        return this;
    }
    public Boolean getEffect() {
        return this.effect;
    }

    public SaveApgroupSsidConfigRequest setEncKey(String encKey) {
        this.encKey = encKey;
        return this;
    }
    public String getEncKey() {
        return this.encKey;
    }

    public SaveApgroupSsidConfigRequest setEncryption(String encryption) {
        this.encryption = encryption;
        return this;
    }
    public String getEncryption() {
        return this.encryption;
    }

    public SaveApgroupSsidConfigRequest setHidden(String hidden) {
        this.hidden = hidden;
        return this;
    }
    public String getHidden() {
        return this.hidden;
    }

    public SaveApgroupSsidConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SaveApgroupSsidConfigRequest setIeee80211w(String ieee80211w) {
        this.ieee80211w = ieee80211w;
        return this;
    }
    public String getIeee80211w() {
        return this.ieee80211w;
    }

    public SaveApgroupSsidConfigRequest setIgnoreWeakProbe(Integer ignoreWeakProbe) {
        this.ignoreWeakProbe = ignoreWeakProbe;
        return this;
    }
    public Integer getIgnoreWeakProbe() {
        return this.ignoreWeakProbe;
    }

    public SaveApgroupSsidConfigRequest setIsolate(String isolate) {
        this.isolate = isolate;
        return this;
    }
    public String getIsolate() {
        return this.isolate;
    }

    public SaveApgroupSsidConfigRequest setLiteEffect(Boolean liteEffect) {
        this.liteEffect = liteEffect;
        return this;
    }
    public Boolean getLiteEffect() {
        return this.liteEffect;
    }

    public SaveApgroupSsidConfigRequest setMaxInactivity(Integer maxInactivity) {
        this.maxInactivity = maxInactivity;
        return this;
    }
    public Integer getMaxInactivity() {
        return this.maxInactivity;
    }

    public SaveApgroupSsidConfigRequest setMaxassoc(String maxassoc) {
        this.maxassoc = maxassoc;
        return this;
    }
    public String getMaxassoc() {
        return this.maxassoc;
    }

    public SaveApgroupSsidConfigRequest setMulticastForward(Integer multicastForward) {
        this.multicastForward = multicastForward;
        return this;
    }
    public Integer getMulticastForward() {
        return this.multicastForward;
    }

    public SaveApgroupSsidConfigRequest setNasid(String nasid) {
        this.nasid = nasid;
        return this;
    }
    public String getNasid() {
        return this.nasid;
    }

    public SaveApgroupSsidConfigRequest setNetwork(Integer network) {
        this.network = network;
        return this;
    }
    public Integer getNetwork() {
        return this.network;
    }

    public SaveApgroupSsidConfigRequest setNewSsid(String newSsid) {
        this.newSsid = newSsid;
        return this;
    }
    public String getNewSsid() {
        return this.newSsid;
    }

    public SaveApgroupSsidConfigRequest setOwnip(String ownip) {
        this.ownip = ownip;
        return this;
    }
    public String getOwnip() {
        return this.ownip;
    }

    public SaveApgroupSsidConfigRequest setSecondaryAcctPort(Integer secondaryAcctPort) {
        this.secondaryAcctPort = secondaryAcctPort;
        return this;
    }
    public Integer getSecondaryAcctPort() {
        return this.secondaryAcctPort;
    }

    public SaveApgroupSsidConfigRequest setSecondaryAcctSecret(String secondaryAcctSecret) {
        this.secondaryAcctSecret = secondaryAcctSecret;
        return this;
    }
    public String getSecondaryAcctSecret() {
        return this.secondaryAcctSecret;
    }

    public SaveApgroupSsidConfigRequest setSecondaryAcctServer(String secondaryAcctServer) {
        this.secondaryAcctServer = secondaryAcctServer;
        return this;
    }
    public String getSecondaryAcctServer() {
        return this.secondaryAcctServer;
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

    public SaveApgroupSsidConfigRequest setSecondaryAuthServer(String secondaryAuthServer) {
        this.secondaryAuthServer = secondaryAuthServer;
        return this;
    }
    public String getSecondaryAuthServer() {
        return this.secondaryAuthServer;
    }

    public SaveApgroupSsidConfigRequest setShortPreamble(String shortPreamble) {
        this.shortPreamble = shortPreamble;
        return this;
    }
    public String getShortPreamble() {
        return this.shortPreamble;
    }

    public SaveApgroupSsidConfigRequest setSsid(String ssid) {
        this.ssid = ssid;
        return this;
    }
    public String getSsid() {
        return this.ssid;
    }

    public SaveApgroupSsidConfigRequest setSsidLb(Integer ssidLb) {
        this.ssidLb = ssidLb;
        return this;
    }
    public Integer getSsidLb() {
        return this.ssidLb;
    }

    public SaveApgroupSsidConfigRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public SaveApgroupSsidConfigRequest setVlanDhcp(Integer vlanDhcp) {
        this.vlanDhcp = vlanDhcp;
        return this;
    }
    public Integer getVlanDhcp() {
        return this.vlanDhcp;
    }

    public SaveApgroupSsidConfigRequest setWmm(String wmm) {
        this.wmm = wmm;
        return this;
    }
    public String getWmm() {
        return this.wmm;
    }

}
