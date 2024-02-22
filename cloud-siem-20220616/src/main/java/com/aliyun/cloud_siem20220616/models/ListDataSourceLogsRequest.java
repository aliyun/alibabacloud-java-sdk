// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDataSourceLogsRequest extends TeaModel {
    /**
     * <p>The ID of the cloud account.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The code that is used for multi-cloud environments. Valid values:</p>
     * <br>
     * <p>*   qcloud: Tencent Cloud</p>
     * <p>*   aliyun: Alibaba Cloud</p>
     * <p>*   hcloud: Huawei Cloud</p>
     */
    @NameInMap("CloudCode")
    public String cloudCode;

    /**
     * <p>The ID of the data source. The value is obtained after the threat analysis feature calculates the MD5 hash value of a parameter.</p>
     */
    @NameInMap("DataSourceInstanceId")
    public String dataSourceInstanceId;

    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions inside China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListDataSourceLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceLogsRequest self = new ListDataSourceLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourceLogsRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ListDataSourceLogsRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public ListDataSourceLogsRequest setDataSourceInstanceId(String dataSourceInstanceId) {
        this.dataSourceInstanceId = dataSourceInstanceId;
        return this;
    }
    public String getDataSourceInstanceId() {
        return this.dataSourceInstanceId;
    }

    public ListDataSourceLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
