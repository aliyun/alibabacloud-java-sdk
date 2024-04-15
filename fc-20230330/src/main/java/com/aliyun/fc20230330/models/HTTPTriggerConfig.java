// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class HTTPTriggerConfig extends TeaModel {
    @NameInMap("authConfig")
    public String authConfig;

    @NameInMap("authType")
    public String authType;

    @NameInMap("disableURLInternet")
    public Boolean disableURLInternet;

    @NameInMap("methods")
    public java.util.List<String> methods;

    public static HTTPTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        HTTPTriggerConfig self = new HTTPTriggerConfig();
        return TeaModel.build(map, self);
    }

    public HTTPTriggerConfig setAuthConfig(String authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public String getAuthConfig() {
        return this.authConfig;
    }

    public HTTPTriggerConfig setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public HTTPTriggerConfig setDisableURLInternet(Boolean disableURLInternet) {
        this.disableURLInternet = disableURLInternet;
        return this;
    }
    public Boolean getDisableURLInternet() {
        return this.disableURLInternet;
    }

    public HTTPTriggerConfig setMethods(java.util.List<String> methods) {
        this.methods = methods;
        return this;
    }
    public java.util.List<String> getMethods() {
        return this.methods;
    }

}
