// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryOrdersRequest extends TeaModel {
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("PaymentStatus")
    public String paymentStatus;

    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    public static QueryOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrdersRequest self = new QueryOrdersRequest();
        return TeaModel.build(map, self);
    }

}
