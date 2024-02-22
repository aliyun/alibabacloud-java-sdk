// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class AddDataSourceRequest extends TeaModel {
    /**
     * <p>The ID of the cloud account.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The code of the cloud service provider.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   qcloud</p>
     * <p>*   hcloud</p>
     * <p>*   aliyun</p>
     */
    @NameInMap("CloudCode")
    public String cloudCode;

    /**
     * <p>The name of the data source.</p>
     */
    @NameInMap("DataSourceInstanceName")
    public String dataSourceInstanceName;

    /**
     * <p>The parameters of the data source. Set this parameter to a JSON array.</p>
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
     * <p>*   obs: Huawei Cloud Object Storage Service (OBS)</p>
     * <p>*   wafApi: download API of Tencent Cloud Web Application Firewall (WAF)</p>
     * <p>*   ckafka: Tencent Cloud Kafka (CKafka)</p>
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

    public static AddDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDataSourceRequest self = new AddDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public AddDataSourceRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public AddDataSourceRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public AddDataSourceRequest setDataSourceInstanceName(String dataSourceInstanceName) {
        this.dataSourceInstanceName = dataSourceInstanceName;
        return this;
    }
    public String getDataSourceInstanceName() {
        return this.dataSourceInstanceName;
    }

    public AddDataSourceRequest setDataSourceInstanceParams(String dataSourceInstanceParams) {
        this.dataSourceInstanceParams = dataSourceInstanceParams;
        return this;
    }
    public String getDataSourceInstanceParams() {
        return this.dataSourceInstanceParams;
    }

    public AddDataSourceRequest setDataSourceInstanceRemark(String dataSourceInstanceRemark) {
        this.dataSourceInstanceRemark = dataSourceInstanceRemark;
        return this;
    }
    public String getDataSourceInstanceRemark() {
        return this.dataSourceInstanceRemark;
    }

    public AddDataSourceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public AddDataSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
