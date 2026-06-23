// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterDiagnosisRequest extends TeaModel {
    /**
     * <p>The parameters that specify the diagnosis target. The following examples show the parameters for different diagnosis types:</p>
     * <p>node:</p>
     * <pre><code>{&quot;name&quot;: &quot;cn-shanghai.10.10.10.107&quot;}
     * </code></pre>
     * <p>pod</p>
     * <pre><code>{&quot;namespace&quot;: &quot;kube-system&quot;, &quot;name&quot;: &quot;csi-plugin-2cg9f&quot;}
     * </code></pre>
     * <p>network</p>
     * <pre><code>{&quot;src&quot;: &quot;10.10.10.108&quot;, &quot;dst&quot;: &quot;10.11.247.16&quot;, &quot;dport&quot;: &quot;80&quot;}
     * </code></pre>
     * <p>ingress</p>
     * <pre><code>{&quot;url&quot;: &quot;https://example.com&quot;}
     * </code></pre>
     * <p>memory</p>
     * <pre><code>{&quot;node&quot;:&quot;ap-southeast-1.172.16.9.240&quot;}
     * </code></pre>
     * <p>service</p>
     * <pre><code>{&quot;namespace&quot;: &quot;kube-system&quot;, &quot;name&quot;: &quot;nginx-ingress-lb&quot;}
     * ```.
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>{&quot;namespace&quot;: &quot;kube-system&quot;, &quot;name&quot;: &quot;csi-plugin-2cg9f&quot;}</p>
     */
    @NameInMap("target")
    public java.util.Map<String, ?> target;

    /**
     * <p>The diagnosis type.</p>
     * 
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
