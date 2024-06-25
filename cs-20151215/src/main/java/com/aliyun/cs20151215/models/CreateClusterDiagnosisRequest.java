// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterDiagnosisRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;namespace&quot;: &quot;kube-system&quot;, &quot;name&quot;: &quot;csi-plugin-2cg9f&quot;}</p>
     */
    @NameInMap("target")
    public java.util.Map<String, ?> target;

    /**
     * <strong>example:</strong>
     * <p>node</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateClusterDiagnosisRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterDiagnosisRequest self = new CreateClusterDiagnosisRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterDiagnosisRequest setTarget(java.util.Map<String, ?> target) {
        this.target = target;
        return this;
    }
    public java.util.Map<String, ?> getTarget() {
        return this.target;
    }

    public CreateClusterDiagnosisRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
