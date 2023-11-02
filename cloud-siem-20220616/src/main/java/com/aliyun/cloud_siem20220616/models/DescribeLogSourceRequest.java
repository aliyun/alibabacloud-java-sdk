// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeLogSourceRequest extends TeaModel {
    @NameInMap("LogType")
    public String logType;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeLogSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogSourceRequest self = new DescribeLogSourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogSourceRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public DescribeLogSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
