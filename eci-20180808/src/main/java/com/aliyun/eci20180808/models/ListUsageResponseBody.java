// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class ListUsageResponseBody extends TeaModel {
    /**
     * <p>The information about the used amounts and upper limits of privileges and quotas that you have in the specified region. The information contains the following items:</p>
     * <ul>
     * <li>UsedCpu: the number of existing vCPUs.</li>
     * <li>MaxCpu: the upper limit of vCPUs.</li>
     * <li>MaxImageCacheCount: the upper limit of manually created image caches.</li>
     * <li>UsedImageCacheCount: the number of existing image caches that are manually created.</li>
     * <li>MaxAutoImageCacheCount: the upper limit of automatically created image caches.</li>
     * <li>UsedAutoImageCacheCount: the number of existing image caches that are automatically created.</li>
     * <li>MaxDataCacheCount: the upper limit of DataCaches.</li>
     * <li>UsedDataCacheCount: the number of existing DataCaches.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;UsedCpu&quot;: 11,&quot;MaxCpu&quot;: 1000,&quot;MaxImageCacheCount&quot;: 50,&quot;UsedImageCacheCount&quot;: 0}</p>
     */
    @NameInMap("Attributes")
    public java.util.Map<String, ?> attributes;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>89164E78-FC82-4684-BE97-DCDD85D26546</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsageResponseBody self = new ListUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsageResponseBody setAttributes(java.util.Map<String, ?> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, ?> getAttributes() {
        return this.attributes;
    }

    public ListUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
