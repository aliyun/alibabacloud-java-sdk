// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ModifyMPCoSPhaseGroupRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PhaseGroupId")
    public String phaseGroupId;

    @NameInMap("Remark")
    public String remark;

    public static ModifyMPCoSPhaseGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMPCoSPhaseGroupRequest self = new ModifyMPCoSPhaseGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMPCoSPhaseGroupRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public ModifyMPCoSPhaseGroupRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public ModifyMPCoSPhaseGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyMPCoSPhaseGroupRequest setPhaseGroupId(String phaseGroupId) {
        this.phaseGroupId = phaseGroupId;
        return this;
    }
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

    public ModifyMPCoSPhaseGroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
