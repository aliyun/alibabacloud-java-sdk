// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ModifyDataSourceLogRequest extends TeaModel {
    /**
     * <p>The ID of the cloud account.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The code of the cloud service provider. Valid values:</p>
     * <br>
     * <p>*   qcloud: Tencent Cloud</p>
     * <p>*   aliyun: Alibaba Cloud</p>
     * <p>*   hcloud: Huawei Cloud</p>
     */
    @NameInMap("CloudCode")
    public String cloudCode;

    /**
     * <p>The ID of the data source. The ID is an MD5 hash value that is calculated by the threat analysis feature based on specific parameters. You can call the [DescribeDataSourceInstance](https://api.aliyun-inc.com/#/publishment/document/cloud-siem/863fdf54478f4cc5877e27c2a5fe9e44?tenantUuid=f382fccd88b94c5c8c864def6815b854\&activeTabKey=api%7CDescribeDataSourceInstance) operation to query the IDs of data sources.</p>
     */
    @NameInMap("DataSourceInstanceId")
    public String dataSourceInstanceId;

    /**
     * <p>The parameters of the data source. Set this parameter to a JSON string.</p>
     */
    @NameInMap("DataSourceInstanceLogs")
    public String dataSourceInstanceLogs;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <br>
     * <p>*   obs: Huawei Cloud Object Storage Service (OBS)</p>
     * <p>*   wafApi: download API of Tencent Cloud Web Application Firewall (WAF)</p>
     * <p>*   ckafka: Tencent Cloud Kafka (CKafka)</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The log code.</p>
     */
    @NameInMap("LogCode")
    public String logCode;

    /**
     * <p>The ID of the log. The ID is an MD5 hash value that is calculated by the threat analysis feature based on specific parameters. You can call the [ListDataSourceLogs](https://api.aliyun-inc.com/#/publishment/document/cloud-siem/863fdf54478f4cc5877e27c2a5fe9e44?tenantUuid=f382fccd88b94c5c8c864def6815b854\&activeTabKey=api%7CListDataSourceLogs) to query log IDs.</p>
     */
    @NameInMap("LogInstanceId")
    public String logInstanceId;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
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
