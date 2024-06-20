// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartPredictiveCallRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1312353****</p>
     */
    @NameInMap("Callee")
    public String callee;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0109810****</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9774c36c-12fe-4e37-adce-89bc77ce****</p>
     */
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    @NameInMap("ContactFlowVariables")
    public String contactFlowVariables;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1312353****</p>
     */
    @NameInMap("MaskedCallee")
    public String maskedCallee;

    /**
     * <strong>example:</strong>
     * <p>skillgroup@ccc-test</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    @NameInMap("Tags")
    public String tags;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    public static StartPredictiveCallRequest build(java.util.Map<String, ?> map) throws Exception {
        StartPredictiveCallRequest self = new StartPredictiveCallRequest();
        return TeaModel.build(map, self);
    }

    public StartPredictiveCallRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public StartPredictiveCallRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public StartPredictiveCallRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public StartPredictiveCallRequest setContactFlowVariables(String contactFlowVariables) {
        this.contactFlowVariables = contactFlowVariables;
        return this;
    }
    public String getContactFlowVariables() {
        return this.contactFlowVariables;
    }

    public StartPredictiveCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartPredictiveCallRequest setMaskedCallee(String maskedCallee) {
        this.maskedCallee = maskedCallee;
        return this;
    }
    public String getMaskedCallee() {
        return this.maskedCallee;
    }

    public StartPredictiveCallRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public StartPredictiveCallRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public StartPredictiveCallRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

}
