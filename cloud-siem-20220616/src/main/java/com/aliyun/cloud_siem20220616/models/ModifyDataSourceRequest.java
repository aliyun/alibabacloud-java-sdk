// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ModifyDataSourceRequest extends TeaModel {
    /**
     * <p>The ID of the cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>123xxxxxx</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The code of the cloud service provider. Valid values:</p>
     * <ul>
     * <li>qcloud: Tencent Cloud</li>
     * <li>aliyun: Alibaba Cloud</li>
     * <li>hcloud: Huawei Cloud</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hcloud</p>
     */
    @NameInMap("CloudCode")
    public String cloudCode;

    /**
     * <p>The ID of the data source. The ID is an MD5 hash value that is calculated by the threat analysis feature based on specific parameters. You can call the <a href="https://api.aliyun-inc.com/#/publishment/document/cloud-siem/863fdf54478f4cc5877e27c2a5fe9e44?tenantUuid=f382fccd88b94c5c8c864def6815b854%5C&activeTabKey=api%7CDescribeDataSourceInstance">DescribeDataSourceInstance</a> operation to query the IDs of data sources.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>220ba97c9d1fdb0b9c7e8c7ca328d7ea</p>
     */
    @NameInMap("DataSourceInstanceId")
    public String dataSourceInstanceId;

    /**
     * <p>The name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>beijing_waf_kafka</p>
     */
    @NameInMap("DataSourceInstanceName")
    public String dataSourceInstanceName;

    /**
     * <p>The parameters of the data source in the JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;paraCode&quot;:&quot;region_code&quot;,&quot;paraValue&quot;:&quot;ap-guangzhou&quot;}]</p>
     */
    @NameInMap("DataSourceInstanceParams")
    public String dataSourceInstanceParams;

    /**
     * <p>The remarks on the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_alert_log</p>
     */
    @NameInMap("DataSourceInstanceRemark")
    public String dataSourceInstanceRemark;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li>ckafka: Tencent Cloud Kafka (CKafka)</li>
     * <li>obs: Huawei Cloud Object Storage Service (OBS)</li>
     * <li>wafApi: download API of Tencent Cloud Web Application Firewall (WAF)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>obs</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions in China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
