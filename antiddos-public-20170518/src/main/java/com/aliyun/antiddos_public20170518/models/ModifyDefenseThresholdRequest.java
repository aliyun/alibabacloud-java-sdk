// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class ModifyDefenseThresholdRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Bps")
    public Integer bps;

    @NameInMap("Pps")
    public Integer pps;

    @NameInMap("IsAuto")
    public Boolean isAuto;

    public static ModifyDefenseThresholdRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseThresholdRequest self = new ModifyDefenseThresholdRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseThresholdRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyDefenseThresholdRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyDefenseThresholdRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public ModifyDefenseThresholdRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyDefenseThresholdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDefenseThresholdRequest setBps(Integer bps) {
        this.bps = bps;
        return this;
    }
    public Integer getBps() {
        return this.bps;
    }

    public ModifyDefenseThresholdRequest setPps(Integer pps) {
        this.pps = pps;
        return this;
    }
    public Integer getPps() {
        return this.pps;
    }

    public ModifyDefenseThresholdRequest setIsAuto(Boolean isAuto) {
        this.isAuto = isAuto;
        return this;
    }
    public Boolean getIsAuto() {
        return this.isAuto;
    }

}
