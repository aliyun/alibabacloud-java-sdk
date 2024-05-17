// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateK8sIngressRuleRequest extends TeaModel {
    /**
     * <p>The annotations.</p>
     */
    @NameInMap("Annotations")
    public String annotations;

    /**
     * <p>The ID of the Kubernetes cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The routing rules of the Ingress. Set this parameter to a JSON string in the following format:</p>
     * <br>
     * <p>    {</p>
     * <p>      "rules": [</p>
     * <p>        {</p>
     * <p>          "host": "abc.com",</p>
     * <p>          "secretName": "tls-secret",</p>
     * <p>          "paths": [</p>
     * <p>            {</p>
     * <p>              "path": "/path",</p>
     * <p>              "backend": {</p>
     * <p>                "servicePort": 80,</p>
     * <p>                "serviceName": "xxx"</p>
     * <p>              }</p>
     * <p>            }</p>
     * <p>          ]</p>
     * <p>        }</p>
     * <p>      ]</p>
     * <p>    }</p>
     * <br>
     * <p>Parameter description:</p>
     * <br>
     * <p>*   rules: the list of routing rules.</p>
     * <p>*   host: the domain name to be accessed.</p>
     * <p>*   secretName: the name of the Secret that stores the information about the Transport Layer Security (TLS) certificate. The certificate is required if you need to use the HTTPS protocol.</p>
     * <p>*   paths: the list of paths to be accessed.</p>
     * <p>*   path: the path to be accessed.</p>
     * <p>*   backend: the configuration of the backend service. You can specify a service that is created in the Enterprise Distributed Application Service (EDAS) console.</p>
     * <p>*   serviceName: the name of the backend service.</p>
     * <p>*   servicePort: the port of the backend service.</p>
     */
    @NameInMap("IngressConf")
    public java.util.Map<String, ?> ingressConf;

    /**
     * <p>The labels.</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The name of the Ingress. The name can contain lowercase letters, digits, and hyphens (-). It must start with a lowercase letter but cannot end with a hyphen (-). The name can be up to 63 characters in length.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace of the Kubernetes cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static CreateK8sIngressRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateK8sIngressRuleRequest self = new CreateK8sIngressRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateK8sIngressRuleRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public CreateK8sIngressRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateK8sIngressRuleRequest setIngressConf(java.util.Map<String, ?> ingressConf) {
        this.ingressConf = ingressConf;
        return this;
    }
    public java.util.Map<String, ?> getIngressConf() {
        return this.ingressConf;
    }

    public CreateK8sIngressRuleRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public CreateK8sIngressRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateK8sIngressRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
