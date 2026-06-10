// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class DeleteSkillSpaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>SkillSpace  ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ss-11111111111</p>
     */
    @NameInMap("SkillSpaceId")
    public String skillSpaceId;

    public static DeleteSkillSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSkillSpaceRequest self = new DeleteSkillSpaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSkillSpaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteSkillSpaceRequest setSkillSpaceId(String skillSpaceId) {
        this.skillSpaceId = skillSpaceId;
        return this;
    }
    public String getSkillSpaceId() {
        return this.skillSpaceId;
    }

}
