// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GatewayService extends TeaModel {
    /**
     * <p>The traffic policy of the service.</p>
     */
    @NameInMap("GatewayTrafficPolicy")
    public TrafficPolicy gatewayTrafficPolicy;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The name of the group to which the service belongs.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The ID of the service.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The metadata of the service.</p>
     */
    @NameInMap("MetaInfo")
    public String metaInfo;

    /**
     * <p>The name of the service.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace to which the service belongs.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The source type of the service.</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static GatewayService build(java.util.Map<String, ?> map) throws Exception {
        GatewayService self = new GatewayService();
        return TeaModel.build(map, self);
    }

    public GatewayService setGatewayTrafficPolicy(TrafficPolicy gatewayTrafficPolicy) {
        this.gatewayTrafficPolicy = gatewayTrafficPolicy;
        return this;
    }
    public TrafficPolicy getGatewayTrafficPolicy() {
        return this.gatewayTrafficPolicy;
    }

    public GatewayService setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public GatewayService setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public GatewayService setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GatewayService setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public GatewayService setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GatewayService setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GatewayService setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
