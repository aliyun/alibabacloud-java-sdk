// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeTraceLocationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionConfigs")
    @Validation(required = true)
    public java.util.List<DescribeTraceLocationResponseRegionConfigs> regionConfigs;

    public static DescribeTraceLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceLocationResponse self = new DescribeTraceLocationResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeTraceLocationResponseRegionConfigs extends TeaModel {
        @NameInMap("RegionNo")
        @Validation(required = true)
        public String regionNo;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        public static DescribeTraceLocationResponseRegionConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeTraceLocationResponseRegionConfigs self = new DescribeTraceLocationResponseRegionConfigs();
            return TeaModel.build(map, self);
        }

    }

}
