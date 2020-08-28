// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class UpdateUserServiceInfoRequest extends TeaModel {
    @NameInMap("Service")
    @Validation(required = true)
    public String service;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("ProductId")
    public String productId;

    public static UpdateUserServiceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserServiceInfoRequest self = new UpdateUserServiceInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserServiceInfoRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public UpdateUserServiceInfoRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public UpdateUserServiceInfoRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
