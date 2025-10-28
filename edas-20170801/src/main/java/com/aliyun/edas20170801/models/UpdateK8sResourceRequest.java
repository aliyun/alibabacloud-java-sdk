// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sResourceRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>2e7059e9-2d********5e8ecac64ff</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the namespace to which the Kubernetes resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>app-namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The description of the resource in the YAML format.</p>
     * 
     * <strong>example:</strong>
     * <p>apiVersion: apps/v1 kind: Deployment metadata:   name: demo-app   namespace: app-namespace spec:   replicas: 3   selector:     matchLabels:       cluster: abc   template: # create pods using pod definition in this template     metadata:       labels:         cluster: abc     spec:       containers:       - image: registry-vpc.cn-hangzhou.aliyuncs.com/edas-demo-image/consumer:1.0         imagePullPolicy: Always         name: test-container         ports:         - containerPort: 80         env:         - name: foo           value: bar</p>
     */
    @NameInMap("ResourceContent")
    public String resourceContent;

    public static UpdateK8sResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sResourceRequest self = new UpdateK8sResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateK8sResourceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateK8sResourceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateK8sResourceRequest setResourceContent(String resourceContent) {
        this.resourceContent = resourceContent;
        return this;
    }
    public String getResourceContent() {
        return this.resourceContent;
    }

}
