// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetTieredCacheResponseBody extends TeaModel {
    /**
     * <p>Multi-level cache architecture mode. Possible values:</p>
     * <ul>
     * <li>edge: Edge cache layer.</li>
     * <li>edge_smart: Edge cache layer + intelligent cache layer.</li>
     * <li>edge_regional: Edge cache layer + regional cache layer.</li>
     * <li>edge_regional_smart: Edge cache layer + regional cache layer + intelligent cache layer.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>edge</p>
     */
    @NameInMap("CacheArchitectureMode")
    public String cacheArchitectureMode;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTieredCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTieredCacheResponseBody self = new GetTieredCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTieredCacheResponseBody setCacheArchitectureMode(String cacheArchitectureMode) {
        this.cacheArchitectureMode = cacheArchitectureMode;
        return this;
    }
    public String getCacheArchitectureMode() {
        return this.cacheArchitectureMode;
    }

    public GetTieredCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
