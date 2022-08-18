// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ValidatePdnsUdpIpSegmentRequest extends TeaModel {
    @NameInMap("Ip")
    public String ip;

    @NameInMap("Lang")
    public String lang;

    public static ValidatePdnsUdpIpSegmentRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidatePdnsUdpIpSegmentRequest self = new ValidatePdnsUdpIpSegmentRequest();
        return TeaModel.build(map, self);
    }

    public ValidatePdnsUdpIpSegmentRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ValidatePdnsUdpIpSegmentRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
