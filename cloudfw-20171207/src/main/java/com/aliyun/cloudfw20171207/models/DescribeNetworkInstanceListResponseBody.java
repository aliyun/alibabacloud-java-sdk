// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNetworkInstanceListResponseBody extends TeaModel {
    @NameInMap("NetworkInstanceList")
    public java.util.List<DescribeNetworkInstanceListResponseBodyNetworkInstanceList> networkInstanceList;

    /**
     * <strong>example:</strong>
     * <p>D2373503-3921-59F2-93A6-3DA7FB7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeNetworkInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInstanceListResponseBody self = new DescribeNetworkInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInstanceListResponseBody setNetworkInstanceList(java.util.List<DescribeNetworkInstanceListResponseBodyNetworkInstanceList> networkInstanceList) {
        this.networkInstanceList = networkInstanceList;
        return this;
    }
    public java.util.List<DescribeNetworkInstanceListResponseBodyNetworkInstanceList> getNetworkInstanceList() {
        return this.networkInstanceList;
    }

    public DescribeNetworkInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkInstanceListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNetworkInstanceListResponseBodyNetworkInstanceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vpc-m5ewlqkuf7or****</p>
         */
        @NameInMap("NetworkInstanceId")
        public String networkInstanceId;

        /**
         * <strong>example:</strong>
         * <p>vpc-test</p>
         */
        @NameInMap("NetworkInstanceName")
        public String networkInstanceName;

        /**
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetworkInstanceType")
        public String networkInstanceType;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        public static DescribeNetworkInstanceListResponseBodyNetworkInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInstanceListResponseBodyNetworkInstanceList self = new DescribeNetworkInstanceListResponseBodyNetworkInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInstanceListResponseBodyNetworkInstanceList setNetworkInstanceId(String networkInstanceId) {
            this.networkInstanceId = networkInstanceId;
            return this;
        }
        public String getNetworkInstanceId() {
            return this.networkInstanceId;
        }

        public DescribeNetworkInstanceListResponseBodyNetworkInstanceList setNetworkInstanceName(String networkInstanceName) {
            this.networkInstanceName = networkInstanceName;
            return this;
        }
        public String getNetworkInstanceName() {
            return this.networkInstanceName;
        }

        public DescribeNetworkInstanceListResponseBodyNetworkInstanceList setNetworkInstanceType(String networkInstanceType) {
            this.networkInstanceType = networkInstanceType;
            return this;
        }
        public String getNetworkInstanceType() {
            return this.networkInstanceType;
        }

        public DescribeNetworkInstanceListResponseBodyNetworkInstanceList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

    }

}
