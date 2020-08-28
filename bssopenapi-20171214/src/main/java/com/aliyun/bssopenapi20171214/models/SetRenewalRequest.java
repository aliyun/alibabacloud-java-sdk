// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetRenewalRequest extends TeaModel {
    @NameInMap("RenewalPeriod")
    public Integer renewalPeriod;

    @NameInMap("InstanceIDs")
    @Validation(required = true)
    public String instanceIDs;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    @NameInMap("RenewalPeriodUnit")
    public String renewalPeriodUnit;

    @NameInMap("RenewalStatus")
    @Validation(required = true)
    public String renewalStatus;

    public static SetRenewalRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRenewalRequest self = new SetRenewalRequest();
        return TeaModel.build(map, self);
    }

}
