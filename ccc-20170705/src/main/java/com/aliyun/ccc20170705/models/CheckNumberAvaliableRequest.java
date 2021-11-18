// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CheckNumberAvaliableRequest extends TeaModel {
    @NameInMap("Callee")
    public String callee;

    @NameInMap("Caller")
    public String caller;

    @NameInMap("InstanceId")
    public String instanceId;

    public static CheckNumberAvaliableRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckNumberAvaliableRequest self = new CheckNumberAvaliableRequest();
        return TeaModel.build(map, self);
    }

    public CheckNumberAvaliableRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public CheckNumberAvaliableRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public CheckNumberAvaliableRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
