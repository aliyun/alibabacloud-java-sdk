// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDnsGtmAddressPoolRequest extends TeaModel {
    /**
     * <p>The ID of the address pool. To obtain the ID, call <a href="https://www.alibabacloud.com/help/en/dns/latest/api-alidns-2015-01-09-describednsgtminstanceaddresspools">DescribeDnsGtmInstanceAddressPools</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testp******</p>
     */
    @NameInMap("AddrPoolId")
    public String addrPoolId;

    /**
     * <p>The language for some returned parameters. Default: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
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
