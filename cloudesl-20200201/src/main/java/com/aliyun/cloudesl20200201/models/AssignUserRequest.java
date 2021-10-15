// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class AssignUserRequest extends TeaModel {
    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("Stores")
    public String stores;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserType")
    public String userType;

    public static AssignUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignUserRequest self = new AssignUserRequest();
        return TeaModel.build(map, self);
    }

    public AssignUserRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
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
