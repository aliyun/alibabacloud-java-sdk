// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokeSkillRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Params")
    public java.util.Map<String, ?> params;

    /**
     * <strong>example:</strong>
     * <p>a1d033dd-xxxx-49cf-b49b-2068081bb551</p>
     */
    @NameInMap("SkillId")
    public String skillId;

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

}
