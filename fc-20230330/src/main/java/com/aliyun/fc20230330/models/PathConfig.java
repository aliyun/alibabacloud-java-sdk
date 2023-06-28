// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PathConfig extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("functionName")
    public String functionName;

    @NameInMap("innerRewriteConfig")
    public InnerRewriteConfig innerRewriteConfig;

    @NameInMap("methods")
    public java.util.List<String> methods;

    @NameInMap("path")
    public String path;

    @NameInMap("qualifier")
    public String qualifier;

    @NameInMap("rewriteConfig")
    public RewriteConfig rewriteConfig;

    @NameInMap("serviceName")
    public String serviceName;

    public static PathConfig build(java.util.Map<String, ?> map) throws Exception {
        PathConfig self = new PathConfig();
        return TeaModel.build(map, self);
    }

    public PathConfig setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public PathConfig setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public PathConfig setInnerRewriteConfig(InnerRewriteConfig innerRewriteConfig) {
        this.innerRewriteConfig = innerRewriteConfig;
        return this;
    }
    public InnerRewriteConfig getInnerRewriteConfig() {
        return this.innerRewriteConfig;
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

    public PathConfig setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
