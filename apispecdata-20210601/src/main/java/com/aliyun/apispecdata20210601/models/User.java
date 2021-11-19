// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601.models;

import com.aliyun.tea.*;

public class User extends TeaModel {
    // 第三方用户工号
    @NameInMap("ExternalEmployeeId")
    public String externalEmployeeId;

    // 用户所属组织ID，集团内部用户默认为0
    @NameInMap("ExternalOrganiazationId")
    public String externalOrganiazationId;

    // 第三方用户ID，集团内部用户对应bucId
    @NameInMap("ExternalUserId")
    public String externalUserId;

    // 用户花名
    @NameInMap("Name")
    public String name;

    // 用户类型，集团内部用户默认为buc
    @NameInMap("UserType")
    public String userType;

    public static User build(java.util.Map<String, ?> map) throws Exception {
        User self = new User();
        return TeaModel.build(map, self);
    }

    public User setExternalEmployeeId(String externalEmployeeId) {
        this.externalEmployeeId = externalEmployeeId;
        return this;
    }
    public String getExternalEmployeeId() {
        return this.externalEmployeeId;
    }

    public User setExternalOrganiazationId(String externalOrganiazationId) {
        this.externalOrganiazationId = externalOrganiazationId;
        return this;
    }
    public String getExternalOrganiazationId() {
        return this.externalOrganiazationId;
    }

    public User setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public User setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
