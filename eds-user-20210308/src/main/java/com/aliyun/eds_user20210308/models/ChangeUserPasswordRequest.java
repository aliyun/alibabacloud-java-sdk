// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ChangeUserPasswordRequest extends TeaModel {
    /**
     * <p>The channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The username of the convenience account whose password is to be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>alice***</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The new password for the user. The password must meet the password length and character type policies of the current enterprise. If no policy is configured, the password must be at least 10 characters in length and contain uppercase letters, lowercase letters, and digits.</p>
     * 
     * <strong>example:</strong>
     * <p>Admin@12***</p>
     */
    @NameInMap("NewPassword")
    public String newPassword;

    public static ChangeUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeUserPasswordRequest self = new ChangeUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ChangeUserPasswordRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
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
