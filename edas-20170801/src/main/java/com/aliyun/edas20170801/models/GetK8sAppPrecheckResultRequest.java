// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sAppPrecheckResultRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    // A short description of struct
    @NameInMap("ClusterId")
    public String clusterId;

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
