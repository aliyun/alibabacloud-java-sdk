// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class OpenAPIToolMeta extends TeaModel {
    @NameInMap("method")
    public String method;

    @NameInMap("path")
    public String path;

    @NameInMap("toolId")
    public String toolId;

    @NameInMap("toolName")
    public String toolName;

    public static OpenAPIToolMeta build(java.util.Map<String, ?> map) throws Exception {
        OpenAPIToolMeta self = new OpenAPIToolMeta();
        return TeaModel.build(map, self);
    }

    public OpenAPIToolMeta setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public OpenAPIToolMeta setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public OpenAPIToolMeta setToolId(String toolId) {
        this.toolId = toolId;
        return this;
    }
    public String getToolId() {
        return this.toolId;
    }

    public OpenAPIToolMeta setToolName(String toolName) {
        this.toolName = toolName;
        return this;
    }
    public String getToolName() {
        return this.toolName;
    }

}
