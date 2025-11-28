// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class ConfirmTrainPicAvatarRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>M1_eTNYgO5lOys5g7ObvC_nw</p>
     */
    @NameInMap("avatarId")
    public String avatarId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CUSTOMER_CONFIRMED</p>
     */
    @NameInMap("status")
    public String status;

    public static ConfirmTrainPicAvatarRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmTrainPicAvatarRequest self = new ConfirmTrainPicAvatarRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmTrainPicAvatarRequest setAvatarId(String avatarId) {
        this.avatarId = avatarId;
        return this;
    }
    public String getAvatarId() {
        return this.avatarId;
    }

    public ConfirmTrainPicAvatarRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
