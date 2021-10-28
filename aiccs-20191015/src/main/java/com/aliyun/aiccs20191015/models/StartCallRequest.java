// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartCallRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("Callee")
    public String callee;

    @NameInMap("Caller")
    public String caller;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    public static StartCallRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCallRequest self = new StartCallRequest();
        return TeaModel.build(map, self);
    }

    public StartCallRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public StartCallRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public StartCallRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public StartCallRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
