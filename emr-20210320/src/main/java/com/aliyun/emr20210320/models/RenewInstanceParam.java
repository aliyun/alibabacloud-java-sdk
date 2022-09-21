// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RenewInstanceParam extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RenewDuration")
    public Long renewDuration;

    @NameInMap("RenewDurationUnit")
    public String renewDurationUnit;

    public static RenewInstanceParam build(java.util.Map<String, ?> map) throws Exception {
        RenewInstanceParam self = new RenewInstanceParam();
        return TeaModel.build(map, self);
    }

    public RenewInstanceParam setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RenewInstanceParam setRenewDuration(Long renewDuration) {
        this.renewDuration = renewDuration;
        return this;
    }
    public Long getRenewDuration() {
        return this.renewDuration;
    }

    public RenewInstanceParam setRenewDurationUnit(String renewDurationUnit) {
        this.renewDurationUnit = renewDurationUnit;
        return this;
    }
    public String getRenewDurationUnit() {
        return this.renewDurationUnit;
    }

}
