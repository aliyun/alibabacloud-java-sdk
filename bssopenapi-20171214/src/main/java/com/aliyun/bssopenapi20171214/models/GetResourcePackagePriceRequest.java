// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetResourcePackagePriceRequest extends TeaModel {
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("PackageType")
    public String packageType;

    @NameInMap("EffectiveDate")
    public String effectiveDate;

    @NameInMap("Specification")
    public String specification;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetResourcePackagePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourcePackagePriceRequest self = new GetResourcePackagePriceRequest();
        return TeaModel.build(map, self);
    }

}
