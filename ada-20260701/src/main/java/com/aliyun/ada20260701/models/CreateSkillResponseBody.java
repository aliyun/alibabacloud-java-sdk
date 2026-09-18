// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class CreateSkillResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the Skill.</p>
     * 
     * <strong>example:</strong>
     * <p>code-review</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID, which is used to locate and troubleshoot the request.</p>
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
     * <p>Indicates whether the Skill and its body or bundle are fully created and readable. A value of true is returned upon success. Business failures are returned as error responses.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The time when the Skill was last updated after creation. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1760000100000</p>
     */
    @NameInMap("UpdatedAt")
    public Long updatedAt;

    public static CreateSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillResponseBody self = new CreateSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSkillResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

    public CreateSkillResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateSkillResponseBody setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
