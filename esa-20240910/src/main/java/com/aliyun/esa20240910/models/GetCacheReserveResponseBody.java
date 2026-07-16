// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCacheReserveResponseBody extends TeaModel {
    /**
     * <p>The cache reserve instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cr_hk_123456789</p>
     */
    @NameInMap("CacheReserveInstanceId")
    public String cacheReserveInstanceId;

    /**
     * <p>The switch status. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: Enabled.</li>
     * <li><strong>off</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F61CDR30-E83C-4FDA-BF73-9A94CDD44229</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCacheReserveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCacheReserveResponseBody self = new GetCacheReserveResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCacheReserveResponseBody setCacheReserveInstanceId(String cacheReserveInstanceId) {
        this.cacheReserveInstanceId = cacheReserveInstanceId;
        return this;
    }
    public String getCacheReserveInstanceId() {
        return this.cacheReserveInstanceId;
    }

    public GetCacheReserveResponseBody setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public GetCacheReserveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
