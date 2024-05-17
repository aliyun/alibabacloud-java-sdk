// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sServiceRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The policy used for external traffic management. Valid values:</p>
     * <br>
     * <p>*   Local: local mode</p>
     * <p>*   Cluster: cluster mode</p>
     * <br>
     * <p>Default value: Local.</p>
     */
    @NameInMap("ExternalTrafficPolicy")
    public String externalTrafficPolicy;

    /**
     * <p>The name of the service in a Kubernetes cluster.</p>
     * <br>
     * <p>*   The name can contain lowercase letters, digits, and hyphens (-).</p>
     * <p>*   It must start with a letter and end with a letter or digit.</p>
     * <p>*   The name can be 2 to 32 characters in length.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The mappings between service ports. Set this parameter to a JSON array. The following parameters are included in the configurations:</p>
     * <br>
     * <p>*   **protocol**: the protocol used by the service. Valid values: TCP and UDP. This parameter is required.</p>
     * <p>*   **port**: the frontend service port. Valid values: 1 to 65535. This parameter is required.</p>
     * <p>*   **targetPort**: the backend container port. Valid values: 1 to 65535. This parameter is required.</p>
     * <br>
     * <p>Example: `[{"protocol": "TCP", "port": 80, "targetPort": 8080},{"protocol": "TCP", "port": 81, "targetPort": 8081}]`</p>
     */
    @NameInMap("ServicePorts")
    public String servicePorts;

    /**
     * <p>The type of the service in a Kubernetes cluster. Set the value to ClusterIP.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateK8sServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sServiceRequest self = new UpdateK8sServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateK8sServiceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateK8sServiceRequest setExternalTrafficPolicy(String externalTrafficPolicy) {
        this.externalTrafficPolicy = externalTrafficPolicy;
        return this;
    }
    public String getExternalTrafficPolicy() {
        return this.externalTrafficPolicy;
    }

    public UpdateK8sServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateK8sServiceRequest setServicePorts(String servicePorts) {
        this.servicePorts = servicePorts;
        return this;
    }
    public String getServicePorts() {
        return this.servicePorts;
    }

    public UpdateK8sServiceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
