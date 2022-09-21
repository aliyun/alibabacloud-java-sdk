// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class AutoRenewInstanceParam extends TeaModel {
    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("AutoRenewDuration")
    public String autoRenewDuration;

    @NameInMap("AutoRenewDurationUnit")
    public String autoRenewDurationUnit;

    @NameInMap("InstanceId")
    public String instanceId;

    public static AutoRenewInstanceParam build(java.util.Map<String, ?> map) throws Exception {
        AutoRenewInstanceParam self = new AutoRenewInstanceParam();
        return TeaModel.build(map, self);
    }

    public AutoRenewInstanceParam setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public AutoRenewInstanceParam setAutoRenewDuration(String autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public String getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public AutoRenewInstanceParam setAutoRenewDurationUnit(String autoRenewDurationUnit) {
        this.autoRenewDurationUnit = autoRenewDurationUnit;
        return this;
    }
    public String getAutoRenewDurationUnit() {
        return this.autoRenewDurationUnit;
    }

    public AutoRenewInstanceParam setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
