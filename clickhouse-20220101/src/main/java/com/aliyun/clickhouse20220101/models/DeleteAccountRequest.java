// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DeleteAccountRequest extends TeaModel {
    // 账户名称
    @NameInMap("Account")
    public String account;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccountRequest self = new DeleteAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public DeleteAccountRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
