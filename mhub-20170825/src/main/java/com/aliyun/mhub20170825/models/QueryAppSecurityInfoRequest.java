// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryAppSecurityInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    public static QueryAppSecurityInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppSecurityInfoRequest self = new QueryAppSecurityInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppSecurityInfoRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

}
