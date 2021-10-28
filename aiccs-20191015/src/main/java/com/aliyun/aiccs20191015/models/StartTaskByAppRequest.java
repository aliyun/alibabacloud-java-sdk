// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartTaskByAppRequest extends TeaModel {
    // app
    @NameInMap("App")
    public String app;

    // appId
    @NameInMap("AppId")
    public Integer appId;

    // appName
    @NameInMap("AppName")
    public String appName;

    // buildId
    @NameInMap("BuildId")
    public String buildId;

    // envTypes
    @NameInMap("EnvTypes")
    public String envTypes;

    // operator
    @NameInMap("Operator")
    public String operator;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // siteType
    @NameInMap("SiteType")
    public String siteType;

    // token
    @NameInMap("Token")
    public String token;

    public static StartTaskByAppRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTaskByAppRequest self = new StartTaskByAppRequest();
        return TeaModel.build(map, self);
    }

    public StartTaskByAppRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public StartTaskByAppRequest setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }
    public Integer getAppId() {
        return this.appId;
    }

    public StartTaskByAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public StartTaskByAppRequest setBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }
    public String getBuildId() {
        return this.buildId;
    }

    public StartTaskByAppRequest setEnvTypes(String envTypes) {
        this.envTypes = envTypes;
        return this;
    }
    public String getEnvTypes() {
        return this.envTypes;
    }

    public StartTaskByAppRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public StartTaskByAppRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartTaskByAppRequest setSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }
    public String getSiteType() {
        return this.siteType;
    }

    public StartTaskByAppRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
