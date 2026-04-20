// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DropUserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("superUser")
    public String superUser;

    /**
     * <strong>example:</strong>
     * <p>p4_234253434</p>
     */
    @NameInMap("userName")
    public String userName;

    public static DropUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DropUserRequest self = new DropUserRequest();
        return TeaModel.build(map, self);
    }

    public DropUserRequest setSuperUser(String superUser) {
        this.superUser = superUser;
        return this;
    }
    public String getSuperUser() {
        return this.superUser;
    }

    public DropUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
