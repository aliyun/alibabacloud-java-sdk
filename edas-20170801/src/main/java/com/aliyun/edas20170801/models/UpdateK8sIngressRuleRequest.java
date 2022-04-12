// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sIngressRuleRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("IngressConf")
    public java.util.Map<String, ?> ingressConf;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    public static UpdateK8sIngressRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sIngressRuleRequest self = new UpdateK8sIngressRuleRequest();
        return TeaModel.build(map, self);
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
