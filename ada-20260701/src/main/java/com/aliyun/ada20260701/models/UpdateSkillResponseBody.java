// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class UpdateSkillResponseBody extends TeaModel {
    /**
     * <p>The Skill name.</p>
     * 
     * <strong>example:</strong>
     * <p>code-review</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Skill ID。</p>
     * 
     * <strong>example:</strong>
     * <p>skill_example123</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    /**
     * <p>Returns <code>true</code> when the Skill update and optional bundle replacement have been fully committed and confirmed by read-back.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The time when the Skill was updated, in UNIX millisecond timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1760000200000</p>
     */
    @NameInMap("UpdatedAt")
    public Long updatedAt;

    public static UpdateSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillResponseBody self = new UpdateSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSkillResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSkillResponseBody setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

    public UpdateSkillResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateSkillResponseBody setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
