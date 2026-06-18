// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetPerformanceDataCollectionResponseBody extends TeaModel {
    /**
     * <p>Indicates whether Data Quality collection is enabled. Valid values: <code>true</code> and <code>false</code>.</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The unique ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPerformanceDataCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPerformanceDataCollectionResponseBody self = new GetPerformanceDataCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPerformanceDataCollectionResponseBody setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public GetPerformanceDataCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
