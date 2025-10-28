// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateK8sServiceRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5a166fbd-<strong><strong>-</strong></strong>-a286-781659d9f54c</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The policy used for external traffic management. Valid values:</p>
     * <ul>
     * <li>Local: The network traffic can be routed to pods on the node where the Service is deployed.</li>
     * <li>Cluster: The network traffic can be routed to pods on other nodes in the cluster.</li>
     * </ul>
     * <p>Default value: Local.</p>
     * 
     * <strong>example:</strong>
     * <p>Local</p>
     */
    @NameInMap("ExternalTrafficPolicy")
    public String externalTrafficPolicy;

    /**
     * <p>The name of the Kubernetes Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-http</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The port mapping of the Kubernetes Service. Set this parameter to a JSON array. The following parameters are included in the configurations:</p>
     * <ul>
     * <li><strong>protocol</strong>: the protocol used by the Service. Valid values: TCP and UDP. This parameter is mandatory.</li>
     * <li><strong>port</strong>: the frontend service port. Valid values: 1 to 65535. This parameter is mandatory.</li>
     * <li><strong>targetPort</strong>: the backend container port. Valid values: 1 to 65535. This parameter is mandatory.</li>
     * </ul>
     * <p>Example: <code>[{&quot;protocol&quot;: &quot;TCP&quot;, &quot;port&quot;: 80, &quot;targetPort&quot;: 8080},{&quot;protocol&quot;: &quot;TCP&quot;, &quot;port&quot;: 81, &quot;targetPort&quot;: 8081}]</code></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;protocol&quot;:&quot;TCP&quot;,&quot;port&quot;:80,&quot;targetPort&quot;:8080}]</p>
     */
    @NameInMap("ServicePorts")
    public String servicePorts;

    /**
     * <p>The type of the Kubernetes Service. Set the value to ClusterIP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ClusterIP</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateK8sServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateK8sServiceRequest self = new CreateK8sServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateK8sServiceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateK8sServiceRequest setExternalTrafficPolicy(String externalTrafficPolicy) {
        this.externalTrafficPolicy = externalTrafficPolicy;
        return this;
    }
    public String getExternalTrafficPolicy() {
        return this.externalTrafficPolicy;
    }

    public CreateK8sServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateK8sServiceRequest setServicePorts(String servicePorts) {
        this.servicePorts = servicePorts;
        return this;
    }
    public String getServicePorts() {
        return this.servicePorts;
    }

    public CreateK8sServiceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
