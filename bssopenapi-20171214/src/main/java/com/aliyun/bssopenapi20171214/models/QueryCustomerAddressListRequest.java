// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCustomerAddressListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static QueryCustomerAddressListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerAddressListRequest self = new QueryCustomerAddressListRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomerAddressListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
