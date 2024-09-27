// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAddrAttributeInfoRequest extends TeaModel {
    /**
     * <p>The addresses.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1.1.1.1&quot;]</p>
     */
    @NameInMap("Addrs")
    public String addrs;

    /**
     * <p>The language of the values for specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of addresses. Valid values:</p>
     * <ul>
     * <li>IPV4: IPv4 address</li>
     * <li>IPv6: IPv6 address</li>
     * <li>DOMAIN: domain name</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
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
