// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteDataSourceLogRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("CloudCode")
    public String cloudCode;

    @NameInMap("DataSourceInstanceId")
    public String dataSourceInstanceId;

    @NameInMap("LogInstanceId")
    public String logInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDataSourceLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourceLogRequest self = new DeleteDataSourceLogRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourceLogRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DeleteDataSourceLogRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public DeleteDataSourceLogRequest setDataSourceInstanceId(String dataSourceInstanceId) {
        this.dataSourceInstanceId = dataSourceInstanceId;
        return this;
    }
    public String getDataSourceInstanceId() {
        return this.dataSourceInstanceId;
    }

    public DeleteDataSourceLogRequest setLogInstanceId(String logInstanceId) {
        this.logInstanceId = logInstanceId;
        return this;
    }
    public String getLogInstanceId() {
        return this.logInstanceId;
    }

    public DeleteDataSourceLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
