// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApRadioConfigRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("BcastRate")
    public Integer bcastRate;

    @NameInMap("BeaconInt")
    public Integer beaconInt;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("Disabled")
    public String disabled;

    @NameInMap("Frag")
    public Integer frag;

    @NameInMap("Htmode")
    public String htmode;

    @NameInMap("Hwmode")
    public String hwmode;

    @NameInMap("Id")
    public Long id;

    @NameInMap("McastRate")
    public Integer mcastRate;

    @NameInMap("MgmtRate")
    public Integer mgmtRate;

    @NameInMap("Minrate")
    public Integer minrate;

    @NameInMap("Noscan")
    public String noscan;

    @NameInMap("Probereq")
    public String probereq;

    @NameInMap("RequireMode")
    public String requireMode;

    @NameInMap("Rts")
    public Integer rts;

    @NameInMap("Shortgi")
    public String shortgi;

    @NameInMap("Txpower")
    public String txpower;

    @NameInMap("Uapsd")
    public Integer uapsd;

    public static SaveApRadioConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveApRadioConfigRequest self = new SaveApRadioConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveApRadioConfigRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public SaveApRadioConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SaveApRadioConfigRequest setBcastRate(Integer bcastRate) {
        this.bcastRate = bcastRate;
        return this;
    }
    public Integer getBcastRate() {
        return this.bcastRate;
    }

    public SaveApRadioConfigRequest setBeaconInt(Integer beaconInt) {
        this.beaconInt = beaconInt;
        return this;
    }
    public Integer getBeaconInt() {
        return this.beaconInt;
    }

    public SaveApRadioConfigRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public SaveApRadioConfigRequest setDisabled(String disabled) {
        this.disabled = disabled;
        return this;
    }
    public String getDisabled() {
        return this.disabled;
    }

    public SaveApRadioConfigRequest setFrag(Integer frag) {
        this.frag = frag;
        return this;
    }
    public Integer getFrag() {
        return this.frag;
    }

    public SaveApRadioConfigRequest setHtmode(String htmode) {
        this.htmode = htmode;
        return this;
    }
    public String getHtmode() {
        return this.htmode;
    }

    public SaveApRadioConfigRequest setHwmode(String hwmode) {
        this.hwmode = hwmode;
        return this;
    }
    public String getHwmode() {
        return this.hwmode;
    }

    public SaveApRadioConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SaveApRadioConfigRequest setMcastRate(Integer mcastRate) {
        this.mcastRate = mcastRate;
        return this;
    }
    public Integer getMcastRate() {
        return this.mcastRate;
    }

    public SaveApRadioConfigRequest setMgmtRate(Integer mgmtRate) {
        this.mgmtRate = mgmtRate;
        return this;
    }
    public Integer getMgmtRate() {
        return this.mgmtRate;
    }

    public SaveApRadioConfigRequest setMinrate(Integer minrate) {
        this.minrate = minrate;
        return this;
    }
    public Integer getMinrate() {
        return this.minrate;
    }

    public SaveApRadioConfigRequest setNoscan(String noscan) {
        this.noscan = noscan;
        return this;
    }
    public String getNoscan() {
        return this.noscan;
    }

    public SaveApRadioConfigRequest setProbereq(String probereq) {
        this.probereq = probereq;
        return this;
    }
    public String getProbereq() {
        return this.probereq;
    }

    public SaveApRadioConfigRequest setRequireMode(String requireMode) {
        this.requireMode = requireMode;
        return this;
    }
    public String getRequireMode() {
        return this.requireMode;
    }

    public SaveApRadioConfigRequest setRts(Integer rts) {
        this.rts = rts;
        return this;
    }
    public Integer getRts() {
        return this.rts;
    }

    public SaveApRadioConfigRequest setShortgi(String shortgi) {
        this.shortgi = shortgi;
        return this;
    }
    public String getShortgi() {
        return this.shortgi;
    }

    public SaveApRadioConfigRequest setTxpower(String txpower) {
        this.txpower = txpower;
        return this;
    }
    public String getTxpower() {
        return this.txpower;
    }

    public SaveApRadioConfigRequest setUapsd(Integer uapsd) {
        this.uapsd = uapsd;
        return this;
    }
    public Integer getUapsd() {
        return this.uapsd;
    }

}
