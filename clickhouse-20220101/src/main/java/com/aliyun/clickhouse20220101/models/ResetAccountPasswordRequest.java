// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ResetAccountPasswordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Account")
    public String account;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp108z124a8o7****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>123456Aa</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <strong>example:</strong>
     * <p>b17e1e0450dac425ea318253f6f852972d69731d6c7499c001468b695b6da219</p>
     */
    @NameInMap("PasswordSha256Hex")
    public String passwordSha256Hex;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
