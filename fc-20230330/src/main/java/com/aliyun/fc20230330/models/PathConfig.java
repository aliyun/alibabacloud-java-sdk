// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PathConfig extends TeaModel {
    /**
     * <p>The name of the function.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myFunction</p>
     */
    @NameInMap("functionName")
    public String functionName;

    /**
     * <p>The supported methods.</p>
     */
    @NameInMap("methods")
    public java.util.List<String> methods;

    /**
     * <p>The route matching rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/api/*</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>The version or alias.</p>
     * 
     * <strong>example:</strong>
     * <p>myAlias</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The rewrite configuration.</p>
     */
    @NameInMap("rewriteConfig")
    public RewriteConfig rewriteConfig;

    public static PathConfig build(java.util.Map<String, ?> map) throws Exception {
        PathConfig self = new PathConfig();
        return TeaModel.build(map, self);
    }

    public PathConfig setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
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

    public PathConfig setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public PathConfig setRewriteConfig(RewriteConfig rewriteConfig) {
        this.rewriteConfig = rewriteConfig;
        return this;
    }
    public RewriteConfig getRewriteConfig() {
        return this.rewriteConfig;
    }

}
