// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sIngressRuleRequest extends TeaModel {
    /**
     * <p>The annotations.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;nginx.ingress.kubernetes.io/ssl-redirect\&quot;:\&quot;true\&quot;,\&quot;nginx.ingress.kubernetes.io/configuration-snippet\&quot;:\&quot;set $test value\&quot;}</p>
     */
    @NameInMap("Annotations")
    public String annotations;

    /**
     * <p>The ID of the Kubernetes cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>5b2b4ab4-efbc-4a81-9c45-xxxxxxxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The routing rules of the Ingress. Set this parameter to a JSON string in the following format:</p>
     * <pre><code>{
     *   &quot;rules&quot;: [
     *     {
     *       &quot;host&quot;: &quot;abc.com&quot;,
     *       &quot;secretName&quot;: &quot;tls-secret&quot;,
     *       &quot;paths&quot;: [
     *         {
     *           &quot;path&quot;: &quot;/path&quot;,
     *           &quot;backend&quot;: {
     *             &quot;servicePort&quot;: 80,
     *             &quot;serviceName&quot;: &quot;xxx&quot;
     *           }
     *         }
     *       ]
     *     }
     *   ]
     * }
     * </code></pre>
     * <p>Parameter description:</p>
     * <ul>
     * <li>rules: the list of routing rules.</li>
     * <li>host: the domain name to be accessed.</li>
     * <li>secretName: the name of the Secret that stores the information about the Transport Layer Security (TLS) certificate. The certificate is required if you need to use the HTTPS protocol.</li>
     * <li>paths: the list of paths to be accessed.</li>
     * <li>path: the path to be accessed.</li>
     * <li>backend: the configuration of the backend service. You can specify a service that is created in the Enterprise Distributed Application Service (EDAS) console.</li>
     * <li>serviceName: the name of the backend service.</li>
     * <li>servicePort: the port of the backend service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;rules&quot;:[{&quot;host&quot;:&quot;abc.com&quot;,&quot;secretName&quot;:&quot;tls-secret&quot;,&quot;paths&quot;:[{&quot;path&quot;:&quot;/path&quot;,&quot;backend&quot;:{&quot;servicePort&quot;:80,&quot;serviceName&quot;:&quot;xxx&quot;}}]}]}</p>
     */
    @NameInMap("IngressConf")
    public java.util.Map<String, ?> ingressConf;

    /**
     * <p>The labels.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;test-label\&quot;:\&quot;test-label-value\&quot;}</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The name of the Ingress. The name can contain lowercase letters, digits, and hyphens (-). It must start with a lowercase letter but cannot end with a hyphen (-). The name can be up to 63 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>my-ingress-rule</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace of the Kubernetes cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static UpdateK8sIngressRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sIngressRuleRequest self = new UpdateK8sIngressRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateK8sIngressRuleRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public UpdateK8sIngressRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateK8sIngressRuleRequest setIngressConf(java.util.Map<String, ?> ingressConf) {
        this.ingressConf = ingressConf;
        return this;
    }
    public java.util.Map<String, ?> getIngressConf() {
        return this.ingressConf;
    }

    public UpdateK8sIngressRuleRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public UpdateK8sIngressRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateK8sIngressRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
