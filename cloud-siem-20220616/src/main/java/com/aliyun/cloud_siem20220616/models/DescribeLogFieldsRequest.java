// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeLogFieldsRequest extends TeaModel {
    @NameInMap("LogSource")
    public String logSource;

    @NameInMap("LogType")
    public String logType;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeLogFieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogFieldsRequest self = new DescribeLogFieldsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogFieldsRequest setLogSource(String logSource) {
        this.logSource = logSource;
        return this;
    }
    public String getLogSource() {
        return this.logSource;
    }

    public DescribeLogFieldsRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public DescribeLogFieldsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
