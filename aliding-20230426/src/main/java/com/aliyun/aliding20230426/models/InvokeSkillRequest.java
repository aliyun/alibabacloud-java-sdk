// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokeSkillRequest extends TeaModel {
    @NameInMap("Params")
    public java.util.Map<String, ?> params;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    @NameInMap("Stream")
    public Boolean stream;

    @NameInMap("sourceIdOfAssistantId")
    public String sourceIdOfAssistantId;

    public static InvokeSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeSkillRequest self = new InvokeSkillRequest();
        return TeaModel.build(map, self);
    }

    public InvokeSkillRequest setParams(java.util.Map<String, ?> params) {
        this.params = params;
        return this;
    }
    public java.util.Map<String, ?> getParams() {
        return this.params;
    }

    public InvokeSkillRequest setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

    public InvokeSkillRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public InvokeSkillRequest setSourceIdOfAssistantId(String sourceIdOfAssistantId) {
        this.sourceIdOfAssistantId = sourceIdOfAssistantId;
        return this;
    }
    public String getSourceIdOfAssistantId() {
        return this.sourceIdOfAssistantId;
    }

}
