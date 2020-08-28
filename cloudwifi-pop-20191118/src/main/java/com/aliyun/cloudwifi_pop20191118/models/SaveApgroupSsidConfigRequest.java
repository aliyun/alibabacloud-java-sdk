// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApgroupSsidConfigRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    @NameInMap("NewSsid")
    @Validation(required = true)
    public String newSsid;

    @NameInMap("Nasid")
    public String nasid;

    @NameInMap("IgnoreWeakProbe")
    public Integer ignoreWeakProbe;

    @NameInMap("DaePort")
    public Integer daePort;

    @NameInMap("ApgroupId")
    @Validation(required = true)
    public String apgroupId;

    @NameInMap("Hidden")
    public String hidden;

    @NameInMap("SecondaryAcctSecret")
    public String secondaryAcctSecret;

    @NameInMap("Binding")
    @Validation(required = true)
    public String binding;

    @NameInMap("MaxInactivity")
    public Integer maxInactivity;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("Ssid")
    @Validation(required = true)
    public String ssid;

    @NameInMap("Cir")
    public Long cir;

    @NameInMap("Network")
    @Validation(required = true)
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
    @Validation(required = true)
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

}
