// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RenewResourcePackageRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("EffectiveDate")
    public String effectiveDate;

    @NameInMap("Duration")
    @Validation(required = true)
    public Integer duration;

    @NameInMap("PricingCycle")
    @Validation(required = true)
    public String pricingCycle;

    public static RenewResourcePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewResourcePackageRequest self = new RenewResourcePackageRequest();
        return TeaModel.build(map, self);
    }

}
