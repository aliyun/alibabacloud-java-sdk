// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class AutoRenewInstance extends TeaModel {
    /**
     * <p>自动续费。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>自动续费时长。</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>自动付费时长单位。</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("AutoRenewDurationUnit")
    public String autoRenewDurationUnit;

    /**
     * <p>emr实例自动续费时长。</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("EmrAutoRenewDuration")
    public Integer emrAutoRenewDuration;

    /**
     * <p>emr实例自动续费时长单位。</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("EmrAutoRenewDurationUnit")
    public String emrAutoRenewDurationUnit;

    /**
     * <p>节点ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1cudc25w2bfwl5****</p>
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
