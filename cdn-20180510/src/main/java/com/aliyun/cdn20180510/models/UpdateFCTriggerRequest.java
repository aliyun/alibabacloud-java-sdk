// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UpdateFCTriggerRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("TriggerARN")
    public String triggerARN;

    @NameInMap("SourceARN")
    public String sourceARN;

    @NameInMap("FunctionARN")
    public String functionARN;

    @NameInMap("RoleARN")
    public String roleARN;

    @NameInMap("Notes")
    public String notes;

    public static UpdateFCTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFCTriggerRequest self = new UpdateFCTriggerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFCTriggerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateFCTriggerRequest setTriggerARN(String triggerARN) {
        this.triggerARN = triggerARN;
        return this;
    }
    public String getTriggerARN() {
        return this.triggerARN;
    }

    public UpdateFCTriggerRequest setSourceARN(String sourceARN) {
        this.sourceARN = sourceARN;
        return this;
    }
    public String getSourceARN() {
        return this.sourceARN;
    }

    public UpdateFCTriggerRequest setFunctionARN(String functionARN) {
        this.functionARN = functionARN;
        return this;
    }
    public String getFunctionARN() {
        return this.functionARN;
    }

    public UpdateFCTriggerRequest setRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }
    public String getRoleARN() {
        return this.roleARN;
    }

    public UpdateFCTriggerRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

}
