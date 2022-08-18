// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceAddressPoolRequest extends TeaModel {
    @NameInMap("AddrPoolId")
    public String addrPoolId;

    @NameInMap("Lang")
    public String lang;

    public static DescribeGtmInstanceAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceAddressPoolRequest self = new DescribeGtmInstanceAddressPoolRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceAddressPoolRequest setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public DescribeGtmInstanceAddressPoolRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
