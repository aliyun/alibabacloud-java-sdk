// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class AssignUserRequest extends TeaModel {
    @NameInMap("Stores")
    public String stores;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static AssignUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignUserRequest self = new AssignUserRequest();
        return TeaModel.build(map, self);
    }

    public AssignUserRequest setStores(String stores) {
        this.stores = stores;
        return this;
    }
    public String getStores() {
        return this.stores;
    }

    public AssignUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public AssignUserRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
