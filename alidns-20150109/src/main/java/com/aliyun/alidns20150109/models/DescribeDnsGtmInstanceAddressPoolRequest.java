// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceAddressPoolRequest extends TeaModel {
    @NameInMap("AddrPoolId")
    public String addrPoolId;

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
