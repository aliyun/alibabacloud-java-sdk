// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class PathConfig extends TeaModel {
    /**
     * <p>The agent runtime version. This parameter takes effect only when <code>resourceType</code> is <code>runtime</code>.</p>
     */
    @NameInMap("agentRuntimeEndpointName")
    public String agentRuntimeEndpointName;

    /**
     * <p>The compatible protocol, used to convert the backend response format. This parameter is required only when <code>resourceType</code> is <code>flow</code>. Valid values: <code>native</code> indicates an FnF native call; <code>openai</code>, <code>dify-workflow</code>, and <code>dify-chatflow</code> map to their corresponding compatible APIs.</p>
     * 
     * <strong>example:</strong>
     * <p>native</p>
     */
    @NameInMap("compatibleProtocol")
    public String compatibleProtocol;

    /**
     * <p>The Flow version/alias. This parameter takes effect only when <code>resourceType</code> is <code>flow</code>. Default value: <code>Default</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("flowEndpointName")
    public String flowEndpointName;

    /**
     * <p>Supported methods: HEAD, GET, POST, PUT, DELETE, PATCH, and OPTIONS.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;GET\&quot;]</p>
     */
    @NameInMap("methods")
    public java.util.List<String> methods;

    /**
     * <p>The path for this routing rule.</p>
     * 
     * <strong>example:</strong>
     * <p>/login</p>
     */
    @NameInMap("path")
    public String path;

    @NameInMap("removeBasePathOnForward")
    public Boolean removeBasePathOnForward;

    /**
     * <p>The resource name.</p>
     */
    @NameInMap("resourceName")
    public String resourceName;

    /**
     * <p>The resource type. This type must match the one associated with the credential.</p>
     * 
     * <strong>example:</strong>
     * <p>runtime</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static PathConfig build(java.util.Map<String, ?> map) throws Exception {
        PathConfig self = new PathConfig();
        return TeaModel.build(map, self);
    }

    public PathConfig setAgentRuntimeEndpointName(String agentRuntimeEndpointName) {
        this.agentRuntimeEndpointName = agentRuntimeEndpointName;
        return this;
    }
    public String getAgentRuntimeEndpointName() {
        return this.agentRuntimeEndpointName;
    }

    public PathConfig setCompatibleProtocol(String compatibleProtocol) {
        this.compatibleProtocol = compatibleProtocol;
        return this;
    }
    public String getCompatibleProtocol() {
        return this.compatibleProtocol;
    }

    public PathConfig setFlowEndpointName(String flowEndpointName) {
        this.flowEndpointName = flowEndpointName;
        return this;
    }
    public String getFlowEndpointName() {
        return this.flowEndpointName;
    }

    public PathConfig setMethods(java.util.List<String> methods) {
        this.methods = methods;
        return this;
    }
    public java.util.List<String> getMethods() {
        return this.methods;
    }

    public PathConfig setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public PathConfig setRemoveBasePathOnForward(Boolean removeBasePathOnForward) {
        this.removeBasePathOnForward = removeBasePathOnForward;
        return this;
    }
    public Boolean getRemoveBasePathOnForward() {
        return this.removeBasePathOnForward;
    }

    public PathConfig setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public PathConfig setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
