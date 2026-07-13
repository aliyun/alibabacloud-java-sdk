// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceAddressPoolRequest extends TeaModel {
    /**
     * <p>The ID of the address pool.&lt;props=&quot;china&quot;&gt;You can call the <a href="https://help.aliyun.com/zh/dns/api-alidns-2015-01-09-describednsgtminstanceaddresspools?spm=a2c4g.11186623.help-menu-29697.d_0_5_1_3_9_7.1cee430dbd1I3y">DescribeDnsGtmInstanceAddressPools</a> operation to obtain the ID.
     * &lt;props=&quot;intl&quot;&gt;You can call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describednsgtminstanceaddresspools?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDnsGtmInstanceAddressPools</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test*****</p>
     */
    @NameInMap("AddrPoolId")
    public String addrPoolId;

    /**
     * <p>The language of the response. Default value: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeDnsGtmInstanceAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceAddressPoolRequest self = new DescribeDnsGtmInstanceAddressPoolRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceAddressPoolRequest setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public DescribeDnsGtmInstanceAddressPoolRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
