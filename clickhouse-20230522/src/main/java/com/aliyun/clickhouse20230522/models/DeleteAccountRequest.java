// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteAccountRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Product")
    public String product;

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

    public DeleteAccountRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteAccountRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DeleteAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
