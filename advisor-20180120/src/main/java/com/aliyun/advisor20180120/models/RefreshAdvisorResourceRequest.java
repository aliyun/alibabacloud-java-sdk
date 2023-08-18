// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class RefreshAdvisorResourceRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("ResourceId")
    public String resourceId;

    public static RefreshAdvisorResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshAdvisorResourceRequest self = new RefreshAdvisorResourceRequest();
        return TeaModel.build(map, self);
    }

    public RefreshAdvisorResourceRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public RefreshAdvisorResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
