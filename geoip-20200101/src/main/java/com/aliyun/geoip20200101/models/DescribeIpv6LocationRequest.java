// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeIpv6LocationRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Ip")
    public String ip;

    public static DescribeIpv6LocationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpv6LocationRequest self = new DescribeIpv6LocationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpv6LocationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeIpv6LocationRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
