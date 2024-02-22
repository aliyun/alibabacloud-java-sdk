// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ModifyDataSourceRequest extends TeaModel {
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
     * <p>The name of the data source.</p>
     */
    @NameInMap("DataSourceInstanceName")
    public String dataSourceInstanceName;

    /**
     * <p>The parameters of the data source in the JSON string format.</p>
     */
    @NameInMap("DataSourceInstanceParams")
    public String dataSourceInstanceParams;

    /**
     * <p>The remarks on the data source.</p>
     */
    @NameInMap("DataSourceInstanceRemark")
    public String dataSourceInstanceRemark;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <br>
     * <p>*   ckafka: Tencent Cloud Kafka (CKafka)</p>
     * <p>*   obs: Huawei Cloud Object Storage Service (OBS)</p>
     * <p>*   wafApi: download API of Tencent Cloud Web Application Firewall (WAF)</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
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
