// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryAppInfoRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    public static QueryAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppInfoRequest self = new QueryAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppInfoRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

}
