// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class AutoRenewInstance extends TeaModel {
    /**
     * <p>自动续费。</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>自动续费时长。</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>自动付费时长单位。</p>
     */
    @NameInMap("AutoRenewDurationUnit")
    public String autoRenewDurationUnit;

    /**
     * <p>emr实例自动续费时长。</p>
     */
    @NameInMap("EmrAutoRenewDuration")
    public Integer emrAutoRenewDuration;

    /**
     * <p>emr实例自动续费时长单位。</p>
     */
    @NameInMap("EmrAutoRenewDurationUnit")
    public String emrAutoRenewDurationUnit;

    /**
     * <p>节点ID。</p>
     */
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

    public AutoRenewInstance setEmrAutoRenewDuration(Integer emrAutoRenewDuration) {
        this.emrAutoRenewDuration = emrAutoRenewDuration;
        return this;
    }
    public Integer getEmrAutoRenewDuration() {
        return this.emrAutoRenewDuration;
    }

    public AutoRenewInstance setEmrAutoRenewDurationUnit(String emrAutoRenewDurationUnit) {
        this.emrAutoRenewDurationUnit = emrAutoRenewDurationUnit;
        return this;
    }
    public String getEmrAutoRenewDurationUnit() {
        return this.emrAutoRenewDurationUnit;
    }

    public AutoRenewInstance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
