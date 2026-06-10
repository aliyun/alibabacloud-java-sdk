// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetSkillSpaceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SkillSpaceId")
    public String skillSpaceId;

    public static GetSkillSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillSpaceRequest self = new GetSkillSpaceRequest();
        return TeaModel.build(map, self);
    }

    public GetSkillSpaceRequest setSkillSpaceId(String skillSpaceId) {
        this.skillSpaceId = skillSpaceId;
        return this;
    }
    public String getSkillSpaceId() {
        return this.skillSpaceId;
    }

}
