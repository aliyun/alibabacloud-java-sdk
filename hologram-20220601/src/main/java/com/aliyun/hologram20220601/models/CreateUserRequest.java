// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("superUser")
    public Boolean superUser;

    /**
     * <strong>example:</strong>
     * <p>p4_2346134</p>
     */
    @NameInMap("userName")
    public String userName;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserRequest setSuperUser(Boolean superUser) {
        this.superUser = superUser;
        return this;
    }
    public Boolean getSuperUser() {
        return this.superUser;
    }

    public CreateUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
