// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeIpv4LocationRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Ip")
    public String ip;

    public static DescribeIpv4LocationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv4LocationRequest self = new DescribeIpv4LocationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpv4LocationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeIpv4LocationRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
