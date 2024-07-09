// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UpdateFCTriggerRequest extends TeaModel {
    /**
     * <p>The feature trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:1223455566666:123:services/myservice/functions/myfunction</p>
     */
    @NameInMap("FunctionARN")
    public String functionARN;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Notes")
    public String notes;

    /**
     * <p>The assigned RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram:: 1234567890:role/aliyuncdneventnotificationrole</p>
     */
    @NameInMap("RoleARN")
    public String roleARN;

    /**
     * <p>The resources and filters for event listening.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:cdn:*:1234567890:domain/example.com</p>
     */
    @NameInMap("SourceARN")
    public String sourceARN;

    /**
     * <p>The trigger that corresponds to the Function Compute service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-beijing: 1234567890:services/FCTestService/functions/printEvent/triggers/testtrigger</p>
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
