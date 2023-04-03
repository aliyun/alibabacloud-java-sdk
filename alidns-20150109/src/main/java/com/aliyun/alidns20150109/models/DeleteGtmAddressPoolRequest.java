// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteGtmAddressPoolRequest extends TeaModel {
    /**
     * <p>The ID of the address pool that you want to delete.</p>
     */
    @NameInMap("AddrPoolId")
    public String addrPoolId;

    /**
     * <p>The language used by the user.</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DeleteGtmAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGtmAddressPoolRequest self = new DeleteGtmAddressPoolRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGtmAddressPoolRequest setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public DeleteGtmAddressPoolRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
