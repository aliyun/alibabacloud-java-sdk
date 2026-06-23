// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetPerformanceDataCollectionResponseBody extends TeaModel {
    /**
     * <p>Indicates whether quality data collection is enabled. Valid values:</p>
     * <ul>
     * <li>on: Enabled.</li>
     * <li>off: Disabled.</li>
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
