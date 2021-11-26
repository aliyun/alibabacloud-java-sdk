// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class DescribeAnycastPopLocationsResponseBody extends TeaModel {
    @NameInMap("AnycastPopLocationList")
    public java.util.List<DescribeAnycastPopLocationsResponseBodyAnycastPopLocationList> anycastPopLocationList;

    @NameInMap("Count")
    public String count;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAnycastPopLocationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnycastPopLocationsResponseBody self = new DescribeAnycastPopLocationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAnycastPopLocationsResponseBody setAnycastPopLocationList(java.util.List<DescribeAnycastPopLocationsResponseBodyAnycastPopLocationList> anycastPopLocationList) {
        this.anycastPopLocationList = anycastPopLocationList;
        return this;
    }
    public java.util.List<DescribeAnycastPopLocationsResponseBodyAnycastPopLocationList> getAnycastPopLocationList() {
        return this.anycastPopLocationList;
    }

    public DescribeAnycastPopLocationsResponseBody setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public DescribeAnycastPopLocationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAnycastPopLocationsResponseBodyAnycastPopLocationList extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        public static DescribeAnycastPopLocationsResponseBodyAnycastPopLocationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAnycastPopLocationsResponseBodyAnycastPopLocationList self = new DescribeAnycastPopLocationsResponseBodyAnycastPopLocationList();
            return TeaModel.build(map, self);
        }

        public DescribeAnycastPopLocationsResponseBodyAnycastPopLocationList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAnycastPopLocationsResponseBodyAnycastPopLocationList setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

}
