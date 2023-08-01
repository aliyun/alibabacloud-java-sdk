// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sAppPrecheckResultRequest extends TeaModel {
    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The ID of the cluster in Enterprise Distributed Application Service (EDAS).</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The namespace of the Kubernetes cluster.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static GetK8sAppPrecheckResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetK8sAppPrecheckResultRequest self = new GetK8sAppPrecheckResultRequest();
        return TeaModel.build(map, self);
    }

    public GetK8sAppPrecheckResultRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetK8sAppPrecheckResultRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetK8sAppPrecheckResultRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
