// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public DescribeRegionsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("regions")
    @Deprecated
    public DescribeRegionsResponseBodyRegions regions;

    /**
     * <strong>example:</strong>
     * <p>E6BD6C79-32B1-5D7E-A89A-93C5A6B7xxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
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

    @Deprecated
    public DescribeRegionsResponseBody setRegions(DescribeRegionsResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeRegionsResponseBodyRegions getRegions() {
        return this.regions;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRegionsResponseBodyDataRegions extends TeaModel {
        @NameInMap("localName")
        public String localName;

        @NameInMap("regionId")
        public String regionId;

        public static DescribeRegionsResponseBodyDataRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyDataRegions self = new DescribeRegionsResponseBodyDataRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyDataRegions setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeRegionsResponseBodyDataRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeRegionsResponseBodyData extends TeaModel {
        @NameInMap("regions")
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

    public static class DescribeRegionsResponseBodyRegionsRegion extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>华东1（杭州）</p>
         */
        @NameInMap("localName")
        public String localName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static DescribeRegionsResponseBodyRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionsRegion self = new DescribeRegionsResponseBodyRegionsRegion();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionsRegion setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeRegionsResponseBodyRegionsRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeRegionsResponseBodyRegions extends TeaModel {
        @NameInMap("Region")
        public java.util.List<DescribeRegionsResponseBodyRegionsRegion> region;

        public static DescribeRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegions self = new DescribeRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegions setRegion(java.util.List<DescribeRegionsResponseBodyRegionsRegion> region) {
            this.region = region;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyRegionsRegion> getRegion() {
            return this.region;
        }

    }

}
