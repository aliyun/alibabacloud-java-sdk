// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UnbindAccountToClusterUserRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("AccountUid")
    public String accountUid;

    public static UnbindAccountToClusterUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindAccountToClusterUserRequest self = new UnbindAccountToClusterUserRequest();
        return TeaModel.build(map, self);
    }

    public UnbindAccountToClusterUserRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UnbindAccountToClusterUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UnbindAccountToClusterUserRequest setAccountUid(String accountUid) {
        this.accountUid = accountUid;
        return this;
    }
    public String getAccountUid() {
        return this.accountUid;
    }

}
