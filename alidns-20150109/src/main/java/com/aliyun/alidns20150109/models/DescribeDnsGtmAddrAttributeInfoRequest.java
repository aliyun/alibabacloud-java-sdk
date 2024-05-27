// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAddrAttributeInfoRequest extends TeaModel {
    /**
     * <p>The addresses whose source regions you want to query.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Addrs")
    public String addrs;

    /**
     * <p>The language to return some response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of the addresses. Valid values:</p>
     * <br>
     * <p>*   IPV4: IPv4 address</p>
     * <p>*   IPV6: IPv6 address</p>
     * <p>*   DOMAIN: domain name</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
