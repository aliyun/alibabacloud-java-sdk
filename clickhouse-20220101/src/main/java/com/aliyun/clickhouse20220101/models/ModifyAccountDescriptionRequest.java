// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyAccountDescriptionRequest extends TeaModel {
    // 账户名称
    @NameInMap("Account")
    public String account;

    // 账户备注
    @NameInMap("Comment")
    public String comment;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyAccountDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountDescriptionRequest self = new ModifyAccountDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountDescriptionRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ModifyAccountDescriptionRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ModifyAccountDescriptionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyAccountDescriptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
