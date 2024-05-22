// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAvatarRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AvatarId")
    public String avatarId;

    public static GetAvatarRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAvatarRequest self = new GetAvatarRequest();
        return TeaModel.build(map, self);
    }

    public GetAvatarRequest setAvatarId(String avatarId) {
        this.avatarId = avatarId;
        return this;
    }
    public String getAvatarId() {
        return this.avatarId;
    }

}
