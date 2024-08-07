// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeDataSourceParametersRequest extends TeaModel {
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
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><strong>ckafka</strong>: Tencent Cloud TDMQ for CKafka</li>
     * <li><strong>obs</strong>: Huawei Cloud Object Storage Service (OBS)</li>
     * <li><strong>wafApi</strong>: download API of Tencent Cloud Web Application Firewall (WAF)</li>
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
