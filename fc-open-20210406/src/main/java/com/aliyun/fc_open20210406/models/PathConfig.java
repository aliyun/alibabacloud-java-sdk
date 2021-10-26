// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PathConfig extends TeaModel {
    // 该路径/方法对应的函数名称
    @NameInMap("functionName")
    public String functionName;

    // 请求方法，不填表示当前路径的所有方法匹配同一函数
    @NameInMap("methods")
    public java.util.List<String> methods;

    // 请求路径
    @NameInMap("path")
    public String path;

    // 该路径/方法对应服务的版本/别名
    @NameInMap("qualifier")
    public String qualifier;

    // 该路径/方法对应的服务名称
    @NameInMap("serviceName")
    public String serviceName;

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

    public PathConfig setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
