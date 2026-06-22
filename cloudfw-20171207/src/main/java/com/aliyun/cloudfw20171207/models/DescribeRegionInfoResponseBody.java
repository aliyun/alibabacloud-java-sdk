// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRegionInfoResponseBody extends TeaModel {
    /**
     * <p>The data list.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeRegionInfoResponseBodyDataList> dataList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25E655B0-CAED-53D4-8054-F983126****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRegionInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionInfoResponseBody self = new DescribeRegionInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionInfoResponseBody setDataList(java.util.List<DescribeRegionInfoResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeRegionInfoResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeRegionInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRegionInfoResponseBodyDataList extends TeaModel {
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The region name.</p>
         * 
         * <strong>example:</strong>
         * <p>Shanghai</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        public static DescribeRegionInfoResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionInfoResponseBodyDataList self = new DescribeRegionInfoResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeRegionInfoResponseBodyDataList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionInfoResponseBodyDataList setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

}
