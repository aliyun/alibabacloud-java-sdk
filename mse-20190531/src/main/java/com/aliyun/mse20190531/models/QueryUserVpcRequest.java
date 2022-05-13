// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryUserVpcRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Region")
    public String region;

    @NameInMap("UserId")
    public String userId;

    public static QueryUserVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserVpcRequest self = new QueryUserVpcRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserVpcRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public QueryUserVpcRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public QueryUserVpcRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
