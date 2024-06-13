// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class RefreshAdvisorCostCheckShrinkRequest extends TeaModel {
    @NameInMap("AssumeAliyunIdList")
    public String assumeAliyunIdListShrink;

    @NameInMap("CheckIds")
    public String checkIdsShrink;

    @NameInMap("Product")
    public String product;

    @NameInMap("RefreshResource")
    public Boolean refreshResource;

    @NameInMap("ResourceIds")
    public String resourceIdsShrink;

    public static RefreshAdvisorCostCheckShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshAdvisorCostCheckShrinkRequest self = new RefreshAdvisorCostCheckShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RefreshAdvisorCostCheckShrinkRequest setAssumeAliyunIdListShrink(String assumeAliyunIdListShrink) {
        this.assumeAliyunIdListShrink = assumeAliyunIdListShrink;
        return this;
    }
    public String getAssumeAliyunIdListShrink() {
        return this.assumeAliyunIdListShrink;
    }

    public RefreshAdvisorCostCheckShrinkRequest setCheckIdsShrink(String checkIdsShrink) {
        this.checkIdsShrink = checkIdsShrink;
        return this;
    }
    public String getCheckIdsShrink() {
        return this.checkIdsShrink;
    }

    public RefreshAdvisorCostCheckShrinkRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public RefreshAdvisorCostCheckShrinkRequest setRefreshResource(Boolean refreshResource) {
        this.refreshResource = refreshResource;
        return this;
    }
    public Boolean getRefreshResource() {
        return this.refreshResource;
    }

    public RefreshAdvisorCostCheckShrinkRequest setResourceIdsShrink(String resourceIdsShrink) {
        this.resourceIdsShrink = resourceIdsShrink;
        return this;
    }
    public String getResourceIdsShrink() {
        return this.resourceIdsShrink;
    }

}
