// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class RefreshFeatureTableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8B90B646-1678-41A3-B23F-EAC6587B0E48</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public FeatureTable result;

    public static RefreshFeatureTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshFeatureTableResponseBody self = new RefreshFeatureTableResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshFeatureTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshFeatureTableResponseBody setResult(FeatureTable result) {
        this.result = result;
        return this;
    }
    public FeatureTable getResult() {
        return this.result;
    }

}
