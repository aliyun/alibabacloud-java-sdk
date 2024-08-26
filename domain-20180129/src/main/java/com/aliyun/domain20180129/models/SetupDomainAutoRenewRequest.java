// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SetupDomainAutoRenewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>S2019270W570xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SET</p>
     */
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
