// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetEvaluatorRequest extends TeaModel {
    /**
     * <p>The target version number. If not specified, the latest version is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("version")
    public String version;

    public static GetEvaluatorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEvaluatorRequest self = new GetEvaluatorRequest();
        return TeaModel.build(map, self);
    }

    public GetEvaluatorRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
