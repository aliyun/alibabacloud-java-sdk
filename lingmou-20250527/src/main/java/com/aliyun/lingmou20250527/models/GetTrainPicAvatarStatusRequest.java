// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class GetTrainPicAvatarStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>M1YJTNTH2yoLmLnzKdYHeGBg</p>
     */
    @NameInMap("avatarId")
    public String avatarId;

    public static GetTrainPicAvatarStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrainPicAvatarStatusRequest self = new GetTrainPicAvatarStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetTrainPicAvatarStatusRequest setAvatarId(String avatarId) {
        this.avatarId = avatarId;
        return this;
    }
    public String getAvatarId() {
        return this.avatarId;
    }

}
