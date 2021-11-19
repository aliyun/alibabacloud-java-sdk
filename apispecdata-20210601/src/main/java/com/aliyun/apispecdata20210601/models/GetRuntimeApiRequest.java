// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601.models;

import com.aliyun.tea.*;

public class GetRuntimeApiRequest extends TeaModel {
    // API名称
    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("DeployEnvironment")
    public String deployEnvironment;

    // 环境
    @NameInMap("Env")
    public String env;

    // 是否填充结构体
    @NameInMap("FillStruct")
    public Boolean fillStruct;

    // 最大循环引用次数
    @NameInMap("MaxCircularReferences")
    public Long maxCircularReferences;

    // pop产品
    @NameInMap("PopCode")
    public String popCode;

    // pop版本
    @NameInMap("PopVersion")
    public String popVersion;

    @NameInMap("RequestContext")
    public RequestContext requestContext;

    // 网关类型
    @NameInMap("RuntimeType")
    public String runtimeType;

    public static GetRuntimeApiRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuntimeApiRequest self = new GetRuntimeApiRequest();
        return TeaModel.build(map, self);
    }

    public GetRuntimeApiRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public GetRuntimeApiRequest setDeployEnvironment(String deployEnvironment) {
        this.deployEnvironment = deployEnvironment;
        return this;
    }
    public String getDeployEnvironment() {
        return this.deployEnvironment;
    }

    public GetRuntimeApiRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetRuntimeApiRequest setFillStruct(Boolean fillStruct) {
        this.fillStruct = fillStruct;
        return this;
    }
    public Boolean getFillStruct() {
        return this.fillStruct;
    }

    public GetRuntimeApiRequest setMaxCircularReferences(Long maxCircularReferences) {
        this.maxCircularReferences = maxCircularReferences;
        return this;
    }
    public Long getMaxCircularReferences() {
        return this.maxCircularReferences;
    }

    public GetRuntimeApiRequest setPopCode(String popCode) {
        this.popCode = popCode;
        return this;
    }
    public String getPopCode() {
        return this.popCode;
    }

    public GetRuntimeApiRequest setPopVersion(String popVersion) {
        this.popVersion = popVersion;
        return this;
    }
    public String getPopVersion() {
        return this.popVersion;
    }

    public GetRuntimeApiRequest setRequestContext(RequestContext requestContext) {
        this.requestContext = requestContext;
        return this;
    }
    public RequestContext getRequestContext() {
        return this.requestContext;
    }

    public GetRuntimeApiRequest setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }
    public String getRuntimeType() {
        return this.runtimeType;
    }

}
