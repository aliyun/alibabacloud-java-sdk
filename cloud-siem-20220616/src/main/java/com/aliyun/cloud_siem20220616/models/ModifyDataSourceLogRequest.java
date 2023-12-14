// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ModifyDataSourceLogRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("CloudCode")
    public String cloudCode;

    @NameInMap("DataSourceInstanceId")
    public String dataSourceInstanceId;

    @NameInMap("DataSourceInstanceLogs")
    public String dataSourceInstanceLogs;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("LogCode")
    public String logCode;

    @NameInMap("LogInstanceId")
    public String logInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDataSourceLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataSourceLogRequest self = new ModifyDataSourceLogRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDataSourceLogRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ModifyDataSourceLogRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public ModifyDataSourceLogRequest setDataSourceInstanceId(String dataSourceInstanceId) {
        this.dataSourceInstanceId = dataSourceInstanceId;
        return this;
    }
    public String getDataSourceInstanceId() {
        return this.dataSourceInstanceId;
    }

    public ModifyDataSourceLogRequest setDataSourceInstanceLogs(String dataSourceInstanceLogs) {
        this.dataSourceInstanceLogs = dataSourceInstanceLogs;
        return this;
    }
    public String getDataSourceInstanceLogs() {
        return this.dataSourceInstanceLogs;
    }

    public ModifyDataSourceLogRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ModifyDataSourceLogRequest setLogCode(String logCode) {
        this.logCode = logCode;
        return this;
    }
    public String getLogCode() {
        return this.logCode;
    }

    public ModifyDataSourceLogRequest setLogInstanceId(String logInstanceId) {
        this.logInstanceId = logInstanceId;
        return this;
    }
    public String getLogInstanceId() {
        return this.logInstanceId;
    }

    public ModifyDataSourceLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
