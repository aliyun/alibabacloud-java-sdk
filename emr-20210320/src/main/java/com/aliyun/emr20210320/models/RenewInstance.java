// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RenewInstance extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RenewDuration")
    public Integer renewDuration;

    @NameInMap("RenewDurationUnit")
    public String renewDurationUnit;

    public static RenewInstance build(java.util.Map<String, ?> map) throws Exception {
        RenewInstance self = new RenewInstance();
        return TeaModel.build(map, self);
    }

    public RenewInstance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RenewInstance setRenewDuration(Integer renewDuration) {
        this.renewDuration = renewDuration;
        return this;
    }
    public Integer getRenewDuration() {
        return this.renewDuration;
    }

    public RenewInstance setRenewDurationUnit(String renewDurationUnit) {
        this.renewDurationUnit = renewDurationUnit;
        return this;
    }
    public String getRenewDurationUnit() {
        return this.renewDurationUnit;
    }

}
