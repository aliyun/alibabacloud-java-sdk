// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetCacheCheckAddParamRequest extends TeaModel {
    @NameInMap("CacheKey")
    public String cacheKey;

    public static GetCacheCheckAddParamRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCacheCheckAddParamRequest self = new GetCacheCheckAddParamRequest();
        return TeaModel.build(map, self);
    }

    public GetCacheCheckAddParamRequest setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
        return this;
    }
    public String getCacheKey() {
        return this.cacheKey;
    }

}
