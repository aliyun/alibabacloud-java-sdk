// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeLogFieldsRequest extends TeaModel {
    /**
     * <p>The log source of the rule.</p>
     */
    @NameInMap("LogSource")
    public String logSource;

    /**
     * <p>The log type of the rule.</p>
     */
    @NameInMap("LogType")
    public String logType;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
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
