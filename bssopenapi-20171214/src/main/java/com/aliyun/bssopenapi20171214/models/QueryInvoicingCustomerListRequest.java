// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInvoicingCustomerListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static QueryInvoicingCustomerListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInvoicingCustomerListRequest self = new QueryInvoicingCustomerListRequest();
        return TeaModel.build(map, self);
    }

    public QueryInvoicingCustomerListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
