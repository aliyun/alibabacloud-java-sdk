// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class DeleteSkillRequest extends TeaModel {
    /**
     * <p>A token that you provide to ensure request idempotence. The value must be unique for each request. <strong>ClientToken</strong> can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The skill ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s-06e9dca2-0ac9-4d2e-a965-e9db9c057e00</p>
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
