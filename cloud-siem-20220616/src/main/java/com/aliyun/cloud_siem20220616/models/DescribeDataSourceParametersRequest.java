// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeDataSourceParametersRequest extends TeaModel {
    @NameInMap("CloudCode")
    public String cloudCode;

    @NameInMap("DataSourceType")
    public String dataSourceType;

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
