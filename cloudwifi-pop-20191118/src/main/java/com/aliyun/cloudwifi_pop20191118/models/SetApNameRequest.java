// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SetApNameRequest extends TeaModel {
    @NameInMap("ApMac")
    public String apMac;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Name")
    public String name;

    public static SetApNameRequest build(java.util.Map<String, ?> map) throws Exception {
        SetApNameRequest self = new SetApNameRequest();
        return TeaModel.build(map, self);
    }

    public SetApNameRequest setApMac(String apMac) {
        this.apMac = apMac;
        return this;
    }
    public String getApMac() {
        return this.apMac;
    }

    public SetApNameRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public SetApNameRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SetApNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
