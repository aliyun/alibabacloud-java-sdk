// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreatePdnsUdpIpSegmentRequest extends TeaModel {
    @NameInMap("Ip")
    public String ip;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Name")
    public String name;

    public static CreatePdnsUdpIpSegmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePdnsUdpIpSegmentRequest self = new CreatePdnsUdpIpSegmentRequest();
        return TeaModel.build(map, self);
    }

    public CreatePdnsUdpIpSegmentRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public CreatePdnsUdpIpSegmentRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreatePdnsUdpIpSegmentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
