// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateEvaluatorSkillResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The name of the created skill.</p>
     * 
     * <strong>example:</strong>
     * <p>trace_context_loader</p>
     */
    @NameInMap("skillName")
    public String skillName;

    public static CreateEvaluatorSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluatorSkillResponseBody self = new CreateEvaluatorSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEvaluatorSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEvaluatorSkillResponseBody setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

}
