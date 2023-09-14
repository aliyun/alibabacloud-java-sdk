// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RenewInstance extends TeaModel {
    /**
     * <p>emr实例续费时长。</p>
     */
    @NameInMap("EmrRenewDuration")
    public Integer emrRenewDuration;

    /**
     * <p>emr实例续费时长单位。</p>
     */
    @NameInMap("EmrRenewDurationUnit")
    public String emrRenewDurationUnit;

    /**
     * <p>节点ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>续费时长。</p>
     */
    @NameInMap("RenewDuration")
    public Integer renewDuration;

    /**
     * <p>付费时长单位。</p>
     */
    @NameInMap("RenewDurationUnit")
    public String renewDurationUnit;

    public static RenewInstance build(java.util.Map<String, ?> map) throws Exception {
        RenewInstance self = new RenewInstance();
        return TeaModel.build(map, self);
    }

    public RenewInstance setEmrRenewDuration(Integer emrRenewDuration) {
        this.emrRenewDuration = emrRenewDuration;
        return this;
    }
    public Integer getEmrRenewDuration() {
        return this.emrRenewDuration;
    }

    public RenewInstance setEmrRenewDurationUnit(String emrRenewDurationUnit) {
        this.emrRenewDurationUnit = emrRenewDurationUnit;
        return this;
    }
    public String getEmrRenewDurationUnit() {
        return this.emrRenewDurationUnit;
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
