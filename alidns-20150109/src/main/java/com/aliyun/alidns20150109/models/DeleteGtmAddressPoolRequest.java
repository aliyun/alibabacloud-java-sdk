// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteGtmAddressPoolRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("AddrPoolId")
    @Validation(required = true)
    public String addrPoolId;

    public static DeleteGtmAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGtmAddressPoolRequest self = new DeleteGtmAddressPoolRequest();
        return TeaModel.build(map, self);
    }

}
