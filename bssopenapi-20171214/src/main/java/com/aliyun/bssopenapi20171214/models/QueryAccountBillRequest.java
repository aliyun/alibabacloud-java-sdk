// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountBillRequest extends TeaModel {
    @NameInMap("BillingCycle")
    @Validation(required = true)
    public String billingCycle;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("OwnerID")
    public Long ownerID;

    @NameInMap("IsGroupByProduct")
    public Boolean isGroupByProduct;

    @NameInMap("ProductCode")
    public String productCode;

    public static QueryAccountBillRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountBillRequest self = new QueryAccountBillRequest();
        return TeaModel.build(map, self);
    }

}
