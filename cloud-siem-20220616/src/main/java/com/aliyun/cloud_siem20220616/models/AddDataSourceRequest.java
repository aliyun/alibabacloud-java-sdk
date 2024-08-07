// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class AddDataSourceRequest extends TeaModel {
    /**
     * <p>The ID of the cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>123xxxxxxxx</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The code of the cloud service provider.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>qcloud</li>
     * <li>hcloud</li>
     * <li>aliyun</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hcloud</p>
     */
    @NameInMap("CloudCode")
    public String cloudCode;

    /**
     * <p>The name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>beijing_waf_kafka</p>
     */
    @NameInMap("DataSourceInstanceName")
    public String dataSourceInstanceName;

    /**
     * <p>The parameters of the data source. Set this parameter to a JSON array.</p>
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
     * <li>obs: Huawei Cloud Object Storage Service (OBS)</li>
     * <li>wafApi: download API of Tencent Cloud Web Application Firewall (WAF)</li>
     * <li>ckafka: Tencent Cloud Kafka (CKafka)</li>
     * </ul>
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
