// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UpdateFCTriggerRequest extends TeaModel {
    /**
     * <p>The feature trigger.</p>
     */
    @NameInMap("FunctionARN")
    public String functionARN;

    /**
     * <p>The remarks.</p>
     */
    @NameInMap("Notes")
    public String notes;

    /**
     * <p>The assigned Resource Access Management (RAM) role.</p>
     */
    @NameInMap("RoleARN")
    public String roleARN;

    /**
     * <p>The resources and filters for event listening.</p>
     */
    @NameInMap("SourceARN")
    public String sourceARN;

    /**
     * <p>The trigger that corresponds to the Function Compute service.</p>
     */
    @NameInMap("TriggerARN")
    public String triggerARN;

    public static UpdateFCTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFCTriggerRequest self = new UpdateFCTriggerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFCTriggerRequest setFunctionARN(String functionARN) {
        this.functionARN = functionARN;
        return this;
    }
    public String getFunctionARN() {
        return this.functionARN;
    }

    public UpdateFCTriggerRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public UpdateFCTriggerRequest setRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }
    public String getRoleARN() {
        return this.roleARN;
    }

    public UpdateFCTriggerRequest setSourceARN(String sourceARN) {
        this.sourceARN = sourceARN;
        return this;
    }
    public String getSourceARN() {
        return this.sourceARN;
    }

    public UpdateFCTriggerRequest setTriggerARN(String triggerARN) {
        this.triggerARN = triggerARN;
        return this;
    }
    public String getTriggerARN() {
        return this.triggerARN;
    }

}
