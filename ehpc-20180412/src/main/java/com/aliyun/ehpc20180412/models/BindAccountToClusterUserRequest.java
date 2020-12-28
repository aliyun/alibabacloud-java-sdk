// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class BindAccountToClusterUserRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("UserPwd")
    public String userPwd;

    @NameInMap("AccountUid")
    public String accountUid;

    @NameInMap("AccountName")
    public String accountName;

    public static BindAccountToClusterUserRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAccountToClusterUserRequest self = new BindAccountToClusterUserRequest();
        return TeaModel.build(map, self);
    }

    public BindAccountToClusterUserRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public BindAccountToClusterUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public BindAccountToClusterUserRequest setUserPwd(String userPwd) {
        this.userPwd = userPwd;
        return this;
    }
    public String getUserPwd() {
        return this.userPwd;
    }

    public BindAccountToClusterUserRequest setAccountUid(String accountUid) {
        this.accountUid = accountUid;
        return this;
    }
    public String getAccountUid() {
        return this.accountUid;
    }

    public BindAccountToClusterUserRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

}
