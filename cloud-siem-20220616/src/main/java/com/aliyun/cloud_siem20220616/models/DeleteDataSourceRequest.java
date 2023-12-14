// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteDataSourceRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("CloudCode")
    public String cloudCode;

    @NameInMap("DataSourceInstanceId")
    public String dataSourceInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourceRequest self = new DeleteDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourceRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DeleteDataSourceRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public DeleteDataSourceRequest setDataSourceInstanceId(String dataSourceInstanceId) {
        this.dataSourceInstanceId = dataSourceInstanceId;
        return this;
    }
    public String getDataSourceInstanceId() {
        return this.dataSourceInstanceId;
    }

    public DeleteDataSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
