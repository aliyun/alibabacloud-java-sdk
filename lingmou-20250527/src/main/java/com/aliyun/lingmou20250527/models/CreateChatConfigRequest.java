// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateChatConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>M1ONzwuILu-nPT7pvr6maKvQ</p>
     */
    @NameInMap("avatarId")
    public String avatarId;

    /**
     * <strong>example:</strong>
     * <p>M1ONzwuILu-nPT7pvr6maKvQ</p>
     */
    @NameInMap("backgroundId")
    public String backgroundId;

    public static CreateChatConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChatConfigRequest self = new CreateChatConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateChatConfigRequest setAvatarId(String avatarId) {
        this.avatarId = avatarId;
        return this;
    }
    public String getAvatarId() {
        return this.avatarId;
    }

    public CreateChatConfigRequest setBackgroundId(String backgroundId) {
        this.backgroundId = backgroundId;
        return this;
    }
    public String getBackgroundId() {
        return this.backgroundId;
    }

}
