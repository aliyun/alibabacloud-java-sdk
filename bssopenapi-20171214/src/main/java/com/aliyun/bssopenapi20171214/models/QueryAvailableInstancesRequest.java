// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAvailableInstancesRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

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

    @NameInMap("InstanceIDs")
    public String instanceIDs;

    @NameInMap("EndTimeStart")
    public String endTimeStart;

    @NameInMap("EndTimeEnd")
    public String endTimeEnd;

    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    @NameInMap("RenewStatus")
    public String renewStatus;

    public static QueryAvailableInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAvailableInstancesRequest self = new QueryAvailableInstancesRequest();
        return TeaModel.build(map, self);
    }

}
