// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApRadioConfigRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    @NameInMap("Htmode")
    @Validation(required = true)
    public String htmode;

    @NameInMap("Frag")
    @Validation(required = true)
    public Integer frag;

    @NameInMap("Minrate")
    @Validation(required = true)
    public Integer minrate;

    @NameInMap("Probereq")
    @Validation(required = true)
    public String probereq;

    @NameInMap("Channel")
    @Validation(required = true)
    public String channel;

    @NameInMap("Shortgi")
    @Validation(required = true)
    public String shortgi;

    @NameInMap("Hwmode")
    @Validation(required = true)
    public String hwmode;

    @NameInMap("MgmtRate")
    @Validation(required = true)
    public Integer mgmtRate;

    @NameInMap("BcastRate")
    @Validation(required = true)
    public Integer bcastRate;

    @NameInMap("Uapsd")
    @Validation(required = true)
    public Integer uapsd;

    @NameInMap("BeaconInt")
    @Validation(required = true)
    public Integer beaconInt;

    @NameInMap("Rts")
    @Validation(required = true)
    public Integer rts;

    @NameInMap("RequireMode")
    public String requireMode;

    @NameInMap("McastRate")
    @Validation(required = true)
    public Integer mcastRate;

    @NameInMap("Txpower")
    @Validation(required = true)
    public String txpower;

    @NameInMap("Noscan")
    @Validation(required = true)
    public String noscan;

    @NameInMap("Disabled")
    @Validation(required = true)
    public String disabled;

    @NameInMap("Id")
    @Validation(required = true)
    public Long id;

    public static SaveApRadioConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveApRadioConfigRequest self = new SaveApRadioConfigRequest();
        return TeaModel.build(map, self);
    }

}
