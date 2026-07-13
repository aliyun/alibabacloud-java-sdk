// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAddrAttributeInfoRequest extends TeaModel {
    /**
     * <p>The list of addresses.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       &quot;1.1.XX.XX&quot;
     * ]</p>
     */
    @NameInMap("Addrs")
    public String addrs;

    /**
     * <p>The language of some returned parameters. Default value: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The address type:</p>
     * <ul>
     * <li><p>IPV4: IPv4 address</p>
     * </li>
     * <li><p>IPV6: IPv6 address</p>
     * </li>
     * <li><p>DOMAIN: domain name</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IPV4</p>
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
