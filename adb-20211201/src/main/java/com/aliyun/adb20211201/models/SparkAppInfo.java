// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SparkAppInfo extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Detail")
    public Detail detail;

    @NameInMap("Message")
    public String message;

    @NameInMap("State")
    public String state;

    public static SparkAppInfo build(java.util.Map<String, ?> map) throws Exception {
        SparkAppInfo self = new SparkAppInfo();
        return TeaModel.build(map, self);
    }

    public SparkAppInfo setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SparkAppInfo setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SparkAppInfo setDetail(Detail detail) {
        this.detail = detail;
        return this;
    }
    public Detail getDetail() {
        return this.detail;
    }

    public SparkAppInfo setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SparkAppInfo setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
