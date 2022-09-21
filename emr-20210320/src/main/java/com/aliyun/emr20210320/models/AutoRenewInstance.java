// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class AutoRenewInstance extends TeaModel {
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    @NameInMap("AutoRenewDurationUnit")
    public String autoRenewDurationUnit;

    @NameInMap("InstanceId")
    public String instanceId;

    public static AutoRenewInstance build(java.util.Map<String, ?> map) throws Exception {
        AutoRenewInstance self = new AutoRenewInstance();
        return TeaModel.build(map, self);
    }

    public AutoRenewInstance setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public AutoRenewInstance setAutoRenewDuration(Integer autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public AutoRenewInstance setAutoRenewDurationUnit(String autoRenewDurationUnit) {
        this.autoRenewDurationUnit = autoRenewDurationUnit;
        return this;
    }
    public String getAutoRenewDurationUnit() {
        return this.autoRenewDurationUnit;
    }

    public AutoRenewInstance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
