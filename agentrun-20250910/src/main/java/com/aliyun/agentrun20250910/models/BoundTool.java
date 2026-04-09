// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BoundTool extends TeaModel {
    @NameInMap("apis")
    public java.util.List<BoundToolApi> apis;

    /**
     * <p>绑定的 HTTP 请求方法，支持：GET、PUT、POST、PATCH、DELETE、OPTIONS</p>
     * 
     * <strong>example:</strong>
     * <p>POST</p>
     */
    @NameInMap("method")
    @Deprecated
    public String method;

    /**
     * <p>绑定的 URL 路径，用于路由匹配</p>
     * 
     * <strong>example:</strong>
     * <p>/api/v1/tools</p>
     */
    @NameInMap("path")
    @Deprecated
    public String path;

    /**
     * <p>要绑定的工具名称</p>
     * 
     * <strong>example:</strong>
     * <p>my-tool</p>
     */
    @NameInMap("toolName")
    public String toolName;

    public static BoundTool build(java.util.Map<String, ?> map) throws Exception {
        BoundTool self = new BoundTool();
        return TeaModel.build(map, self);
    }

    public BoundTool setApis(java.util.List<BoundToolApi> apis) {
        this.apis = apis;
        return this;
    }
    public java.util.List<BoundToolApi> getApis() {
        return this.apis;
    }

    @Deprecated
    public BoundTool setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    @Deprecated
    public BoundTool setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public BoundTool setToolName(String toolName) {
        this.toolName = toolName;
        return this;
    }
    public String getToolName() {
        return this.toolName;
    }

}
