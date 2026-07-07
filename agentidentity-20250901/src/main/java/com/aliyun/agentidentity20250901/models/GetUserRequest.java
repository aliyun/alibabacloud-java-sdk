// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetUserRequest extends TeaModel {
    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("UserPoolId")
    public String userPoolId;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static GetUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserRequest self = new GetUserRequest();
        return TeaModel.build(map, self);
    }

    public GetUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public GetUserRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }
    public String getUserPoolId() {
        return this.userPoolId;
    }

    public GetUserRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
