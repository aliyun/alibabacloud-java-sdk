// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateUserAvatarRequest extends TeaModel {
    @NameInMap("AvatarMediaId")
    public String avatarMediaId;

    public static UpdateUserAvatarRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserAvatarRequest self = new UpdateUserAvatarRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserAvatarRequest setAvatarMediaId(String avatarMediaId) {
        this.avatarMediaId = avatarMediaId;
        return this;
    }
    public String getAvatarMediaId() {
        return this.avatarMediaId;
    }

}
