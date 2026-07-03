// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListLogRegionsResponseBody extends TeaModel {
    /**
     * <p>A list of log storage region IDs.</p>
     */
    @NameInMap("LogRegions")
    public java.util.List<String> logRegions;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListLogRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogRegionsResponseBody self = new ListLogRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogRegionsResponseBody setLogRegions(java.util.List<String> logRegions) {
        this.logRegions = logRegions;
        return this;
    }
    public java.util.List<String> getLogRegions() {
        return this.logRegions;
    }

    public ListLogRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
