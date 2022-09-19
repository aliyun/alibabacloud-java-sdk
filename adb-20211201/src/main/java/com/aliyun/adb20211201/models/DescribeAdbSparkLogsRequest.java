// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbSparkLogsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAdbSparkLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbSparkLogsRequest self = new DescribeAdbSparkLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdbSparkLogsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeAdbSparkLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
