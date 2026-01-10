// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class PathConfig extends TeaModel {
    /**
     * <p>agent runtime 版本（仅当 resourceType 为 runtime 时有效）</p>
     */
    @NameInMap("agentRuntimeEndpointName")
    public String agentRuntimeEndpointName;

    /**
     * <p>支持的方法有：HEAD, GET, POST, PUT, DELETE, PATCH, OPTIONS</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;GET&quot;]</p>
     */
    @NameInMap("methods")
    public java.util.List<String> methods;

    /**
     * <p>此条路由规则对应的请求路径。</p>
     * 
     * <strong>example:</strong>
     * <p>/login</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>资源名称</p>
     */
    @NameInMap("resourceName")
    public String resourceName;

    /**
     * <p>资源类型（和凭证关联资源类型一致）</p>
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
