// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartTaskByAppRequest extends TeaModel {
    // app
    @NameInMap("App")
    public String app;

    // operator
    @NameInMap("Operator")
    public String operator;

    // token
    @NameInMap("Token")
    public String token;

    // envTypes
    @NameInMap("EnvTypes")
    public String envTypes;

    // appName
    @NameInMap("AppName")
    public String appName;

    // appId
    @NameInMap("AppId")
    public Integer appId;

    // buildId
    @NameInMap("BuildId")
    public String buildId;

    // siteType
    @NameInMap("SiteType")
    public String siteType;

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

    public StartTaskByAppRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public StartTaskByAppRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public StartTaskByAppRequest setEnvTypes(String envTypes) {
        this.envTypes = envTypes;
        return this;
    }
    public String getEnvTypes() {
        return this.envTypes;
    }

    public StartTaskByAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public StartTaskByAppRequest setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }
    public Integer getAppId() {
        return this.appId;
    }

    public StartTaskByAppRequest setBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }
    public String getBuildId() {
        return this.buildId;
    }

    public StartTaskByAppRequest setSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }
    public String getSiteType() {
        return this.siteType;
    }

}
