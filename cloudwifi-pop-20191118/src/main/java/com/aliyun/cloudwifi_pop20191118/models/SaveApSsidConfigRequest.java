// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApSsidConfigRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    @NameInMap("Nasid")
    public String nasid;

    @NameInMap("IgnoreWeakProbe")
    public Integer ignoreWeakProbe;

    @NameInMap("FourthAuthPort")
    public Integer fourthAuthPort;

    @NameInMap("CirType")
    public Integer cirType;

    @NameInMap("Ieee80211r")
    public Integer ieee80211r;

    @NameInMap("MobilityDomain")
    public String mobilityDomain;

    @NameInMap("DaePort")
    public Integer daePort;

    @NameInMap("FourthAuthServer")
    public String fourthAuthServer;

    @NameInMap("SecondaryAcctSecret")
    public String secondaryAcctSecret;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("FourthAuthSecret")
    public String fourthAuthSecret;

    @NameInMap("AcctStatusServerWork")
    public Integer acctStatusServerWork;

    @NameInMap("Ieee80211w")
    @Validation(required = true)
    public String ieee80211w;

    @NameInMap("SsidLb")
    @Validation(required = true)
    public Integer ssidLb;

    @NameInMap("AuthPort")
    public Integer authPort;

    @NameInMap("AuthServer")
    public String authServer;

    @NameInMap("DaeSecret")
    public String daeSecret;

    @NameInMap("Id")
    public Long id;

    @NameInMap("CirStep")
    public Long cirStep;

    @NameInMap("AuthStatusServerWork")
    public Integer authStatusServerWork;

    @NameInMap("SecondaryAuthPort")
    public Integer secondaryAuthPort;

    @NameInMap("SecondaryAuthSecret")
    public String secondaryAuthSecret;

    @NameInMap("ShortPreamble")
    @Validation(required = true)
    public String shortPreamble;

    @NameInMap("CirUl")
    public Long cirUl;

    @NameInMap("DaeClient")
    public String daeClient;

    @NameInMap("LiteEffect")
    public Boolean liteEffect;

    @NameInMap("ThirdAuthSecret")
    public String thirdAuthSecret;

    @NameInMap("ThirdAuthPort")
    public Integer thirdAuthPort;

    @NameInMap("AcctServer")
    public String acctServer;

    @NameInMap("SecondaryAuthServer")
    public String secondaryAuthServer;

    @NameInMap("EncKey")
    public String encKey;

    @NameInMap("AcctSecret")
    public String acctSecret;

    @NameInMap("AuthCache")
    @Validation(required = true)
    public String authCache;

    @NameInMap("MulticastForward")
    public Integer multicastForward;

    @NameInMap("SecondaryAcctPort")
    public Integer secondaryAcctPort;

    @NameInMap("RadioIndex")
    @Validation(required = true)
    public String radioIndex;

    @NameInMap("NdProxyWork")
    public Integer ndProxyWork;

    @NameInMap("Hidden")
    @Validation(required = true)
    public String hidden;

    @NameInMap("MaxInactivity")
    @Validation(required = true)
    public Integer maxInactivity;

    @NameInMap("ThirdAuthServer")
    public String thirdAuthServer;

    @NameInMap("SendConfigToAp")
    public Boolean sendConfigToAp;

    @NameInMap("Ssid")
    @Validation(required = true)
    public String ssid;

    @NameInMap("Cir")
    public Long cir;

    @NameInMap("Mac")
    @Validation(required = true)
    public String mac;

    @NameInMap("Network")
    @Validation(required = true)
    public Integer network;

    @NameInMap("Isolate")
    @Validation(required = true)
    public String isolate;

    @NameInMap("DisassocWeakRssi")
    @Validation(required = true)
    public Integer disassocWeakRssi;

    @NameInMap("ApAssetId")
    public Long apAssetId;

    @NameInMap("Encryption")
    @Validation(required = true)
    public String encryption;

    @NameInMap("VlanDhcp")
    @Validation(required = true)
    public Integer vlanDhcp;

    @NameInMap("Wmm")
    @Validation(required = true)
    public String wmm;

    @NameInMap("DynamicVlan")
    @Validation(required = true)
    public Integer dynamicVlan;

    @NameInMap("Disabled")
    @Validation(required = true)
    public String disabled;

    @NameInMap("Maxassoc")
    @Validation(required = true)
    public Integer maxassoc;

    @NameInMap("AcctPort")
    public Integer acctPort;

    @NameInMap("AuthSecret")
    public String authSecret;

    @NameInMap("FtOverDs")
    public Integer ftOverDs;

    @NameInMap("ArpProxyEnable")
    public Integer arpProxyEnable;

    @NameInMap("DisassocLowAck")
    @Validation(required = true)
    public String disassocLowAck;

    @NameInMap("SecondaryAcctServer")
    public String secondaryAcctServer;

    @NameInMap("Ownip")
    public String ownip;

    public static SaveApSsidConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveApSsidConfigRequest self = new SaveApSsidConfigRequest();
        return TeaModel.build(map, self);
    }

}
