// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosServiceRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the cluster.</p>
     * <blockquote>
     * <p>This operation contains both the InstanceId and ClusterId parameters. You must specify one of them.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mse-3691a080</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether the instance is marked as a temporary node. Valid values:</p>
     * <ul>
     * <li><code>true</code>: yes</li>
     * <li><code>false</code>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ephemeral")
    public Boolean ephemeral;

    /**
     * <p>The name of the group.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT_GROUP</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p>This operation contains both the InstanceId and ClusterId parameters. You must specify one of them.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-st21ri2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The protection threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ProtectThreshold")
    public String protectThreshold;

    /**
     * <p>The name of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>com.alibabacloud.hipstershop.cartserviceapi.service.CartService</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    public static CreateNacosServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNacosServiceRequest self = new CreateNacosServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateNacosServiceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateNacosServiceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateNacosServiceRequest setEphemeral(Boolean ephemeral) {
        this.ephemeral = ephemeral;
        return this;
    }
    public Boolean getEphemeral() {
        return this.ephemeral;
    }

    public CreateNacosServiceRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateNacosServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateNacosServiceRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateNacosServiceRequest setProtectThreshold(String protectThreshold) {
        this.protectThreshold = protectThreshold;
        return this;
    }
    public String getProtectThreshold() {
        return this.protectThreshold;
    }

    public CreateNacosServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
