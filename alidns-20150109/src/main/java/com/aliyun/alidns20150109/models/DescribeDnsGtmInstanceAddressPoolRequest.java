// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceAddressPoolRequest extends TeaModel {
    /**
     * <p>The ID of the address pool.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddrPoolId")
    public String addrPoolId;

    /**
     * <p>The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
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
