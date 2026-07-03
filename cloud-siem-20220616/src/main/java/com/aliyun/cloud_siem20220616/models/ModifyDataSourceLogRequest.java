// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ModifyDataSourceLogRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>123xxxxxxx</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The code for the multicloud environment. Valid values:</p>
     * <ul>
     * <li><p>qcloud: Tencent Cloud.</p>
     * </li>
     * <li><p>aliyun: Alibaba Cloud.</p>
     * </li>
     * <li><p>hcloud: Huawei Cloud.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hcloud</p>
     */
    @NameInMap("CloudCode")
    public String cloudCode;

    /**
     * <p>The ID of the data source. The threat analysis feature generates this ID by calculating an MD5 hash of the parameters.
     * Call the <a href="https://help.aliyun.com/document_detail/2639736.html">DescribeDataSourceInstance</a> operation to obtain the data source ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ef33097c9d1fdb0b9c7e8c7ca320pkl1</p>
     */
    @NameInMap("DataSourceInstanceId")
    public String dataSourceInstanceId;

    /**
     * <p>The details of the data source parameters, in a JSON array format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;LogCode&quot;:&quot;cloud_siem_qcloud_waf_alert_log&quot;,&quot;LogParas&quot;:&quot;[{\&quot;ParaCode\&quot;:\&quot;api_name\&quot;,\&quot;ParaValue\&quot;:\&quot;GetAttackDownloadRecords\&quot;}]&quot;}]</p>
     */
    @NameInMap("DataSourceInstanceLogs")
    public String dataSourceInstanceLogs;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><p>obs: Huawei Cloud Object Storage Service (OBS).</p>
     * </li>
     * <li><p>wafApi: Tencent Cloud Web Application Firewall (WAF) download API.</p>
     * </li>
     * <li><p>ckafka: Tencent Cloud CKafka.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>obs</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The code of the log.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_siem_waf_xxxxx</p>
     */
    @NameInMap("LogCode")
    public String logCode;

    /**
     * <p>The ID of the log. The threat analysis feature generates this ID by calculating an MD5 hash of the parameters. Call the <a href="https://help.aliyun.com/document_detail/2639707.html">ListDataSourceLogs</a> operation to obtain the log ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ef33097c9d1fdb0b9c7e8c7ca320pkl1</p>
     */
    @NameInMap("LogInstanceId")
    public String logInstanceId;

    /**
     * <p>The region where the Data Management hub is located. Select a region based on the location of your assets. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland or China (Hong Kong).</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
