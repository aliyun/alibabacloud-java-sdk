// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class DeleteSkillRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request. Generate a value from your client that is unique across different requests. <strong>ClientToken</strong> supports only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Skill  ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s-xxxxx</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    public static DeleteSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSkillRequest self = new DeleteSkillRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSkillRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteSkillRequest setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

}
