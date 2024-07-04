// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class OSUser extends TeaModel {
    /**
     * <p>用户组。</p>
     * 
     * <strong>example:</strong>
     * <p>hadoop</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>用户密码。</p>
     * 
     * <strong>example:</strong>
     * <p>12345****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>用户名称。</p>
     * 
     * <strong>example:</strong>
     * <p>王五</p>
     */
    @NameInMap("User")
    public String user;

    public static OSUser build(java.util.Map<String, ?> map) throws Exception {
        OSUser self = new OSUser();
        return TeaModel.build(map, self);
    }

    public OSUser setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public OSUser setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public OSUser setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
