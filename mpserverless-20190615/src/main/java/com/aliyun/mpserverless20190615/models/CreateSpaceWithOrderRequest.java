// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateSpaceWithOrderRequest extends TeaModel {
    @NameInMap("Desc")
    public String desc;

    @NameInMap("Name")
    public String name;

    @NameInMap("PackageVersion")
    public String packageVersion;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    @NameInMap("UseCoupon")
    public Boolean useCoupon;

    public static CreateSpaceWithOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSpaceWithOrderRequest self = new CreateSpaceWithOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateSpaceWithOrderRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateSpaceWithOrderRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSpaceWithOrderRequest setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }
    public String getPackageVersion() {
        return this.packageVersion;
    }

    public CreateSpaceWithOrderRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateSpaceWithOrderRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public CreateSpaceWithOrderRequest setUseCoupon(Boolean useCoupon) {
        this.useCoupon = useCoupon;
        return this;
    }
    public Boolean getUseCoupon() {
        return this.useCoupon;
    }

}
