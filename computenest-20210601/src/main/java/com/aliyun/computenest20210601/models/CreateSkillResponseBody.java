// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateSkillResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A17F9930-E2DC-5E87-B6D6-B0BCD2B00834</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Skill ID</p>
     * 
     * <strong>example:</strong>
     * <p>s-051j4ot2aerr5dyc4</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    public static CreateSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillResponseBody self = new CreateSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSkillResponseBody setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

}
