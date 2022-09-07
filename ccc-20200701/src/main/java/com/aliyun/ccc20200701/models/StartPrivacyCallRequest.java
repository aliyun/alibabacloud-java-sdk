// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartPrivacyCallRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Callee")
    public String callee;

    @NameInMap("Caller")
    public String caller;

    @NameInMap("InstanceId")
    public String instanceId;

    public static StartPrivacyCallRequest build(java.util.Map<String, ?> map) throws Exception {
        StartPrivacyCallRequest self = new StartPrivacyCallRequest();
        return TeaModel.build(map, self);
    }

    public StartPrivacyCallRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartPrivacyCallRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public StartPrivacyCallRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public StartPrivacyCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
