// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    // 账户名称
    @NameInMap("Account")
    public String account;

    // 账户备注信息
    @NameInMap("Comment")
    public String comment;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    // 账户明文密码
    @NameInMap("Password")
    public String password;

    // 账户密码sha256hex 优先使用明文密码
    @NameInMap("PasswordSha256Hex")
    public String passwordSha256Hex;

    // 账户权限类型 Normal:普通账户 | Readonly:只读账户 | Dml:DML账户-禁止DDL | Super:超级账户
    @NameInMap("PrivilegeType")
    public String privilegeType;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountRequest self = new CreateAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CreateAccountRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateAccountRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateAccountRequest setPasswordSha256Hex(String passwordSha256Hex) {
        this.passwordSha256Hex = passwordSha256Hex;
        return this;
    }
    public String getPasswordSha256Hex() {
        return this.passwordSha256Hex;
    }

    public CreateAccountRequest setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
        return this;
    }
    public String getPrivilegeType() {
        return this.privilegeType;
    }

    public CreateAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
