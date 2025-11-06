// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeRegionsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeRegionsResponseBody setData(DescribeRegionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeRegionsResponseBodyData getData() {
        return this.data;
    }

    public DescribeRegionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRegionsResponseBodyDataRegions extends TeaModel {
        @NameInMap("RegionCnName")
        public String regionCnName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        public static DescribeRegionsResponseBodyDataRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyDataRegions self = new DescribeRegionsResponseBodyDataRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyDataRegions setRegionCnName(String regionCnName) {
            this.regionCnName = regionCnName;
            return this;
        }
        public String getRegionCnName() {
            return this.regionCnName;
        }

        public DescribeRegionsResponseBodyDataRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsResponseBodyDataRegions setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

    public static class DescribeRegionsResponseBodyData extends TeaModel {
        @NameInMap("Regions")
        public java.util.List<DescribeRegionsResponseBodyDataRegions> regions;

        public static DescribeRegionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyData self = new DescribeRegionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyData setRegions(java.util.List<DescribeRegionsResponseBodyDataRegions> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyDataRegions> getRegions() {
            return this.regions;
        }

    }

}
