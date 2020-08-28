// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryUserServiceInfoRequest extends TeaModel {
    @NameInMap("ProductId")
    public String productId;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("Service")
    @Validation(required = true)
    public String service;

    public static QueryUserServiceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserServiceInfoRequest self = new QueryUserServiceInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserServiceInfoRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public QueryUserServiceInfoRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public QueryUserServiceInfoRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}
