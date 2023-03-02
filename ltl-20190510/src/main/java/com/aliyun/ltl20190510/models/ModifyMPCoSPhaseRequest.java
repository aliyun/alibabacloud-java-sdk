// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ModifyMPCoSPhaseRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PhaseId")
    public String phaseId;

    @NameInMap("Remark")
    public String remark;

    public static ModifyMPCoSPhaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMPCoSPhaseRequest self = new ModifyMPCoSPhaseRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMPCoSPhaseRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public ModifyMPCoSPhaseRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public ModifyMPCoSPhaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyMPCoSPhaseRequest setPhaseId(String phaseId) {
        this.phaseId = phaseId;
        return this;
    }
    public String getPhaseId() {
        return this.phaseId;
    }

    public ModifyMPCoSPhaseRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
