// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyFeatureTableResponseBody extends TeaModel {
    /**
     * <p>Modifies a feature table.</p>
     * 
     * <strong>example:</strong>
     * <p>8B90B646-1678-41A3-B23F-EAC6587B0E48</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public FeatureTable result;

    public static ModifyFeatureTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFeatureTableResponseBody self = new ModifyFeatureTableResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFeatureTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyFeatureTableResponseBody setResult(FeatureTable result) {
        this.result = result;
        return this;
    }
    public FeatureTable getResult() {
        return this.result;
    }

}
