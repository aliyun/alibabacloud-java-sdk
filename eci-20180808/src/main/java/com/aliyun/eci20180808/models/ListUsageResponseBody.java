// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class ListUsageResponseBody extends TeaModel {
    /**
     * <p>The information about the used amounts and upper limits of privileges and quotas that you have in the specified region. The information contains the following items:</p>
     * <br>
     * <p>*   UsedCpu: the number of existing vCPUs.</p>
     * <p>*   MaxCpu: the upper limit of vCPUs.</p>
     * <p>*   MaxImageCacheCount: the upper limit of manually created image caches.</p>
     * <p>*   UsedImageCacheCount: the number of existing image caches that are manually created.</p>
     * <p>*   MaxAutoImageCacheCount: the upper limit of automatically created image caches.</p>
     * <p>*   UsedAutoImageCacheCount: the number of existing image caches that are automatically created.</p>
     * <p>*   MaxDataCacheCount: the upper limit of DataCaches.</p>
     * <p>*   UsedDataCacheCount: the number of existing DataCaches.</p>
     */
    @NameInMap("Attributes")
    public java.util.Map<String, ?> attributes;

    /**
     * <p>The request ID.</p>
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
