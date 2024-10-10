// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCacheReserveSpecificationResponseBody extends TeaModel {
    @NameInMap("CacheReserveCapacity")
    public java.util.List<String> cacheReserveCapacity;

    @NameInMap("CacheReserveRegion")
    public java.util.List<String> cacheReserveRegion;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCacheReserveSpecificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCacheReserveSpecificationResponseBody self = new GetCacheReserveSpecificationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCacheReserveSpecificationResponseBody setCacheReserveCapacity(java.util.List<String> cacheReserveCapacity) {
        this.cacheReserveCapacity = cacheReserveCapacity;
        return this;
    }
    public java.util.List<String> getCacheReserveCapacity() {
        return this.cacheReserveCapacity;
    }

    public GetCacheReserveSpecificationResponseBody setCacheReserveRegion(java.util.List<String> cacheReserveRegion) {
        this.cacheReserveRegion = cacheReserveRegion;
        return this;
    }
    public java.util.List<String> getCacheReserveRegion() {
        return this.cacheReserveRegion;
    }

    public GetCacheReserveSpecificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
