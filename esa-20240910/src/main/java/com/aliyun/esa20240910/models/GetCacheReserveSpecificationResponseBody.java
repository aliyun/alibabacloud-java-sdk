// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCacheReserveSpecificationResponseBody extends TeaModel {
    /**
     * <p>The capacities of cache reserve instances that can be created.</p>
     */
    @NameInMap("CacheReserveCapacity")
    public java.util.List<String> cacheReserveCapacity;

    /**
     * <p>The regions in which cache reserve instances can be created.</p>
     */
    @NameInMap("CacheReserveRegion")
    public java.util.List<String> cacheReserveRegion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
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
