// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDnsGtmAddressPoolRequest extends TeaModel {
    @NameInMap("AddrPoolId")
    public String addrPoolId;

    @NameInMap("Lang")
    public String lang;

    public static DeleteDnsGtmAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnsGtmAddressPoolRequest self = new DeleteDnsGtmAddressPoolRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDnsGtmAddressPoolRequest setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public DeleteDnsGtmAddressPoolRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
