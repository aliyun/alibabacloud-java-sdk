// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeDataSourceParametersRequest extends TeaModel {
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
