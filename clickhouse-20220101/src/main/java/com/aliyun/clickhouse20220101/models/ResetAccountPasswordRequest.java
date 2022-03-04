// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ResetAccountPasswordRequest extends TeaModel {
    // 账户名称
    @NameInMap("Account")
    public String account;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    // 账户明文密码
    @NameInMap("Password")
    public String password;

    // 账户密码sha256hex 优先使用明文密码
    @NameInMap("PasswordSha256Hex")
    public String passwordSha256Hex;

    @NameInMap("RegionId")
    public String regionId;

    public static ResetAccountPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountPasswordRequest self = new ResetAccountPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetAccountPasswordRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ResetAccountPasswordRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ResetAccountPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ResetAccountPasswordRequest setPasswordSha256Hex(String passwordSha256Hex) {
        this.passwordSha256Hex = passwordSha256Hex;
        return this;
    }
    public String getPasswordSha256Hex() {
        return this.passwordSha256Hex;
    }

    public ResetAccountPasswordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
