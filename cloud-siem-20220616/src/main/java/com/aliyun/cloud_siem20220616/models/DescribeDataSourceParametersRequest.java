// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeDataSourceParametersRequest extends TeaModel {
    /**
     * <p>The code for the multicloud environment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hcloud</p>
     */
    @NameInMap("CloudCode")
    public String cloudCode;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><p><strong>ckafka</strong>: Tencent Cloud CKafka.</p>
     * </li>
     * <li><p><strong>obs</strong>: Huawei Cloud OBS.</p>
     * </li>
     * <li><p><strong>wafApi</strong>: Tencent Cloud WAF attack log download API.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>obs</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The region where the Data Management center for threat analysis is deployed. Select a region based on the region where your assets are located. Valid values:</p>
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

    public static DescribeDataSourceParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourceParametersRequest self = new DescribeDataSourceParametersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourceParametersRequest setCloudCode(String cloudCode) {
        this.cloudCode = cloudCode;
        return this;
    }
    public String getCloudCode() {
        return this.cloudCode;
    }

    public DescribeDataSourceParametersRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public DescribeDataSourceParametersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
