// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAddrAttributeInfoRequest extends TeaModel {
    @NameInMap("Addrs")
    public String addrs;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Type")
    public String type;

    public static DescribeDnsGtmAddrAttributeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAddrAttributeInfoRequest self = new DescribeDnsGtmAddrAttributeInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAddrAttributeInfoRequest setAddrs(String addrs) {
        this.addrs = addrs;
        return this;
    }
    public String getAddrs() {
        return this.addrs;
    }

    public DescribeDnsGtmAddrAttributeInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDnsGtmAddrAttributeInfoRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
