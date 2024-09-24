// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ResetUserPasswordRequest extends TeaModel {
    /**
     * <p>The method to notify the user after the password is reset.</p>
     * <blockquote>
     * <p>Alibaba Cloud accounts of the international site do not support sending notification through text messages.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NotifyType")
    public Integer notifyType;

    /**
     * <p>The names of the convenience users whose passwords you want to reset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("Users")
    public java.util.List<String> users;

    public static ResetUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetUserPasswordRequest self = new ResetUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetUserPasswordRequest setNotifyType(Integer notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public Integer getNotifyType() {
        return this.notifyType;
    }

    public ResetUserPasswordRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

}
