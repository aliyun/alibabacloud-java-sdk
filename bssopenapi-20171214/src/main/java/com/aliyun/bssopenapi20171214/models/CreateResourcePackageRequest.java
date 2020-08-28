// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateResourcePackageRequest extends TeaModel {
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

    public static CreateResourcePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourcePackageRequest self = new CreateResourcePackageRequest();
        return TeaModel.build(map, self);
    }

}
