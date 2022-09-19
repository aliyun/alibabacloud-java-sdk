// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlDevParameterAttributeRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DevParamsId")
    public Long devParamsId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAdbMySqlDevParameterAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbMySqlDevParameterAttributeRequest self = new DescribeAdbMySqlDevParameterAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdbMySqlDevParameterAttributeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAdbMySqlDevParameterAttributeRequest setDevParamsId(Long devParamsId) {
        this.devParamsId = devParamsId;
        return this;
    }
    public Long getDevParamsId() {
        return this.devParamsId;
    }

    public DescribeAdbMySqlDevParameterAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
