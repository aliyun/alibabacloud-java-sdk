// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UserSummaryModel extends TeaModel {
    /**
     * <p>The list of access tokens for the user.</p>
     */
    @NameInMap("AccessTokens")
    public java.util.List<AccessTokenModel> accessTokens;

    @NameInMap("Host")
    public String host;

    /**
     * <p>The ID of the associated Alibaba Cloud RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p>1444832459****</p>
     */
    @NameInMap("RamUser")
    public String ramUser;

    /**
     * <p>The user status.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>test_user</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static UserSummaryModel build(java.util.Map<String, ?> map) throws Exception {
        UserSummaryModel self = new UserSummaryModel();
        return TeaModel.build(map, self);
    }

    public UserSummaryModel setAccessTokens(java.util.List<AccessTokenModel> accessTokens) {
        this.accessTokens = accessTokens;
        return this;
    }
    public java.util.List<AccessTokenModel> getAccessTokens() {
        return this.accessTokens;
    }

    public UserSummaryModel setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public UserSummaryModel setRamUser(String ramUser) {
        this.ramUser = ramUser;
        return this;
    }
    public String getRamUser() {
        return this.ramUser;
    }

    public UserSummaryModel setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UserSummaryModel setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
