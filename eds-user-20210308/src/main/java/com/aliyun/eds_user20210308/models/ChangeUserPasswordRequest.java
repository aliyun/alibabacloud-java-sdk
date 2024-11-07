// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ChangeUserPasswordRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>alice***</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <strong>example:</strong>
     * <p>Admin@12***</p>
     */
    @NameInMap("NewPassword")
    public String newPassword;

    public static ChangeUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeUserPasswordRequest self = new ChangeUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ChangeUserPasswordRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ChangeUserPasswordRequest setNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }
    public String getNewPassword() {
        return this.newPassword;
    }

}
