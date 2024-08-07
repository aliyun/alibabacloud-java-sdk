// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class AddDataSourceLogRequest extends TeaModel {
    /**
     * <p>The ID of the cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123xxxxxxx</p>
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
     * <p>The ID of the data source. The ID is an MD5 hash value that is calculated by the threat analysis feature based on specific parameters. You can call the <a href="https://api.aliyun-inc.com/#/publishment/document/cloud-siem/863fdf54478f4cc5877e27c2a5fe9e44?tenantUuid=f382fccd88b94c5c8c864def6815b854%5C&activeTabKey=api%7CListDataSourceLogs">ListDataSourceLogs</a> operation to query the IDs of data sources.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>220ba97c9d1fdb0b9c7e8c7ca328d7ea</p>
     */
    @NameInMap("DataSourceInstanceId")
    public String dataSourceInstanceId;

    /**
     * <p>The parameters of the data source. Set this parameter to a JSON array.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;LogCode&quot;:&quot;cloud_siem_qcloud_waf_alert_log&quot;,&quot;LogParas&quot;:&quot;[{\&quot;ParaCode\&quot;:\&quot;api_name\&quot;,\&quot;ParaValue\&quot;:\&quot;GetAttackDownloadRecords\&quot;}]&quot;}]</p>
     */
    @NameInMap("DataSourceInstanceLogs")
    public String dataSourceInstanceLogs;

    /**
     * <p>The log code.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_siem_waf_xxxxx</p>
     */
    @NameInMap("LogCode")
    public String logCode;

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
