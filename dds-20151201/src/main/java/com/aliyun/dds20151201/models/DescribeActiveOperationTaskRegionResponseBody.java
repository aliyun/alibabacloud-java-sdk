// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskRegionResponseBody extends TeaModel {
    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionList")
    public java.util.List<DescribeActiveOperationTaskRegionResponseBodyRegionList> regionList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3C4A2494-XXXX-XXXX-93CF-548DB3375193</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeActiveOperationTaskRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTaskRegionResponseBody self = new DescribeActiveOperationTaskRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTaskRegionResponseBody setRegionList(java.util.List<DescribeActiveOperationTaskRegionResponseBodyRegionList> regionList) {
        this.regionList = regionList;
        return this;
    }
    public java.util.List<DescribeActiveOperationTaskRegionResponseBodyRegionList> getRegionList() {
        return this.regionList;
    }

    public DescribeActiveOperationTaskRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeActiveOperationTaskRegionResponseBodyRegionList extends TeaModel {
        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        public static DescribeActiveOperationTaskRegionResponseBodyRegionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveOperationTaskRegionResponseBodyRegionList self = new DescribeActiveOperationTaskRegionResponseBodyRegionList();
            return TeaModel.build(map, self);
        }

        public DescribeActiveOperationTaskRegionResponseBodyRegionList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeActiveOperationTaskRegionResponseBodyRegionList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
