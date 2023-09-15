// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SetupDomainAutoRenewRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Operation")
    public String operation;

    public static SetupDomainAutoRenewRequest build(java.util.Map<String, ?> map) throws Exception {
        SetupDomainAutoRenewRequest self = new SetupDomainAutoRenewRequest();
        return TeaModel.build(map, self);
    }

    public SetupDomainAutoRenewRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetupDomainAutoRenewRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

}
