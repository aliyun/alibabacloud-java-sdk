// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ModifyDataSourceRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("CloudCode")
    public String cloudCode;

    @NameInMap("DataSourceInstanceId")
    public String dataSourceInstanceId;

    @NameInMap("DataSourceInstanceName")
    public String dataSourceInstanceName;

    @NameInMap("DataSourceInstanceParams")
    public String dataSourceInstanceParams;

    @NameInMap("DataSourceInstanceRemark")
    public String dataSourceInstanceRemark;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataSourceRequest self = new ModifyDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDataSourceRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ModifyDataSourceRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public ModifyDataSourceRequest setDataSourceInstanceId(String dataSourceInstanceId) {
        this.dataSourceInstanceId = dataSourceInstanceId;
        return this;
    }
    public String getDataSourceInstanceId() {
        return this.dataSourceInstanceId;
    }

    public ModifyDataSourceRequest setDataSourceInstanceName(String dataSourceInstanceName) {
        this.dataSourceInstanceName = dataSourceInstanceName;
        return this;
    }
    public String getDataSourceInstanceName() {
        return this.dataSourceInstanceName;
    }

    public ModifyDataSourceRequest setDataSourceInstanceParams(String dataSourceInstanceParams) {
        this.dataSourceInstanceParams = dataSourceInstanceParams;
        return this;
    }
    public String getDataSourceInstanceParams() {
        return this.dataSourceInstanceParams;
    }

    public ModifyDataSourceRequest setDataSourceInstanceRemark(String dataSourceInstanceRemark) {
        this.dataSourceInstanceRemark = dataSourceInstanceRemark;
        return this;
    }
    public String getDataSourceInstanceRemark() {
        return this.dataSourceInstanceRemark;
    }

    public ModifyDataSourceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ModifyDataSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
