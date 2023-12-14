// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class AddDataSourceLogRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("CloudCode")
    public String cloudCode;

    @NameInMap("DataSourceInstanceId")
    public String dataSourceInstanceId;

    @NameInMap("DataSourceInstanceLogs")
    public String dataSourceInstanceLogs;

    @NameInMap("LogCode")
    public String logCode;

    @NameInMap("RegionId")
    public String regionId;

    public static AddDataSourceLogRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDataSourceLogRequest self = new AddDataSourceLogRequest();
        return TeaModel.build(map, self);
    }

    public AddDataSourceLogRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public AddDataSourceLogRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public AddDataSourceLogRequest setDataSourceInstanceId(String dataSourceInstanceId) {
        this.dataSourceInstanceId = dataSourceInstanceId;
        return this;
    }
    public String getDataSourceInstanceId() {
        return this.dataSourceInstanceId;
    }

    public AddDataSourceLogRequest setDataSourceInstanceLogs(String dataSourceInstanceLogs) {
        this.dataSourceInstanceLogs = dataSourceInstanceLogs;
        return this;
    }
    public String getDataSourceInstanceLogs() {
        return this.dataSourceInstanceLogs;
    }

    public AddDataSourceLogRequest setLogCode(String logCode) {
        this.logCode = logCode;
        return this;
    }
    public String getLogCode() {
        return this.logCode;
    }

    public AddDataSourceLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
