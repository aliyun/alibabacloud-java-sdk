// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class DescribeTraceLocationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionConfigs")
    public java.util.List<DescribeTraceLocationResponseBodyRegionConfigs> regionConfigs;

    public static DescribeTraceLocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceLocationResponseBody self = new DescribeTraceLocationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTraceLocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTraceLocationResponseBody setRegionConfigs(java.util.List<DescribeTraceLocationResponseBodyRegionConfigs> regionConfigs) {
        this.regionConfigs = regionConfigs;
        return this;
    }
    public java.util.List<DescribeTraceLocationResponseBodyRegionConfigs> getRegionConfigs() {
        return this.regionConfigs;
    }

    public static class DescribeTraceLocationResponseBodyRegionConfigs extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("RegionNo")
        public String regionNo;

        public static DescribeTraceLocationResponseBodyRegionConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeTraceLocationResponseBodyRegionConfigs self = new DescribeTraceLocationResponseBodyRegionConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeTraceLocationResponseBodyRegionConfigs setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeTraceLocationResponseBodyRegionConfigs setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

    }

}
