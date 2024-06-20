// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartPrivacyCallRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIPUBB7A727C170949</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1888888****</p>
     */
    @NameInMap("Callee")
    public String callee;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0109810****</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
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
