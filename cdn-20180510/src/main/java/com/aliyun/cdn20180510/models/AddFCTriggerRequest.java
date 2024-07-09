// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class AddFCTriggerRequest extends TeaModel {
    /**
     * <p>The name of the event.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LogFileCreated</p>
     */
    @NameInMap("EventMetaName")
    public String eventMetaName;

    /**
     * <p>The version of the event.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("EventMetaVersion")
    public String eventMetaVersion;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Notes")
    public String notes;

    /**
     * <p>The assigned Resource Access Management (RAM) role.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram:: 1234567890:role/aliyuncdneventnotificationrole</p>
     */
    @NameInMap("RoleARN")
    public String roleARN;

    /**
     * <p>The resources and filters for event listening.</p>
     * <p>This parameter is required.</p>
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

    public static AddFCTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFCTriggerRequest self = new AddFCTriggerRequest();
        return TeaModel.build(map, self);
    }

    public AddFCTriggerRequest setEventMetaName(String eventMetaName) {
        this.eventMetaName = eventMetaName;
        return this;
    }
    public String getEventMetaName() {
        return this.eventMetaName;
    }

    public AddFCTriggerRequest setEventMetaVersion(String eventMetaVersion) {
        this.eventMetaVersion = eventMetaVersion;
        return this;
    }
    public String getEventMetaVersion() {
        return this.eventMetaVersion;
    }

    public AddFCTriggerRequest setFunctionARN(String functionARN) {
        this.functionARN = functionARN;
        return this;
    }
    public String getFunctionARN() {
        return this.functionARN;
    }

    public AddFCTriggerRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public AddFCTriggerRequest setRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }
    public String getRoleARN() {
        return this.roleARN;
    }

    public AddFCTriggerRequest setSourceARN(String sourceARN) {
        this.sourceARN = sourceARN;
        return this;
    }
    public String getSourceARN() {
        return this.sourceARN;
    }

    public AddFCTriggerRequest setTriggerARN(String triggerARN) {
        this.triggerARN = triggerARN;
        return this;
    }
    public String getTriggerARN() {
        return this.triggerARN;
    }

}
