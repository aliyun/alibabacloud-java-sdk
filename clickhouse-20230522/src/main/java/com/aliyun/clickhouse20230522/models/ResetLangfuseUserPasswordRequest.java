// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ResetLangfuseUserPasswordRequest extends TeaModel {
    /**
     * <p>The Langfuse instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lfs-****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The email address of the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:john@company.com">john@company.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The new user password. The password must meet the following rules:</p>
     * <p>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
     * <p>The supported special characters are !@#$%^&amp;*()_+-=.</p>
     * <p>The password must be 8 to 32 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2F9e9@******</p>
     */
    @NameInMap("NewPassword")
    public String newPassword;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ResetLangfuseUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetLangfuseUserPasswordRequest self = new ResetLangfuseUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetLangfuseUserPasswordRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ResetLangfuseUserPasswordRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ResetLangfuseUserPasswordRequest setNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }
    public String getNewPassword() {
        return this.newPassword;
    }

    public ResetLangfuseUserPasswordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
