// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentEscalationPolicyForModify extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("escalationStageList")
    public java.util.List<IncidentEscalationStageForView> escalationStageList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    public static IncidentEscalationPolicyForModify build(java.util.Map<String, ?> map) throws Exception {
        IncidentEscalationPolicyForModify self = new IncidentEscalationPolicyForModify();
        return TeaModel.build(map, self);
    }

    public IncidentEscalationPolicyForModify setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IncidentEscalationPolicyForModify setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public IncidentEscalationPolicyForModify setEscalationStageList(java.util.List<IncidentEscalationStageForView> escalationStageList) {
        this.escalationStageList = escalationStageList;
        return this;
    }
    public java.util.List<IncidentEscalationStageForView> getEscalationStageList() {
        return this.escalationStageList;
    }

    public IncidentEscalationPolicyForModify setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
