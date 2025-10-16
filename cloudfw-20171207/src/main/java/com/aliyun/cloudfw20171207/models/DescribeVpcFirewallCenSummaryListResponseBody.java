// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallCenSummaryListResponseBody extends TeaModel {
    @NameInMap("CenList")
    public java.util.List<DescribeVpcFirewallCenSummaryListResponseBodyCenList> cenList;

    /**
     * <strong>example:</strong>
     * <p>432D6CCA-5186-5B91-A2B8-10C8994B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVpcFirewallCenSummaryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallCenSummaryListResponseBody self = new DescribeVpcFirewallCenSummaryListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallCenSummaryListResponseBody setCenList(java.util.List<DescribeVpcFirewallCenSummaryListResponseBodyCenList> cenList) {
        this.cenList = cenList;
        return this;
    }
    public java.util.List<DescribeVpcFirewallCenSummaryListResponseBodyCenList> getCenList() {
        return this.cenList;
    }

    public DescribeVpcFirewallCenSummaryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallCenSummaryListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVpcFirewallCenSummaryListResponseBodyCenList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cen-maqfw3abcmjy56****</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CenName")
        public String cenName;

        @NameInMap("RegionNoList")
        public java.util.List<String> regionNoList;

        public static DescribeVpcFirewallCenSummaryListResponseBodyCenList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallCenSummaryListResponseBodyCenList self = new DescribeVpcFirewallCenSummaryListResponseBodyCenList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallCenSummaryListResponseBodyCenList setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeVpcFirewallCenSummaryListResponseBodyCenList setCenName(String cenName) {
            this.cenName = cenName;
            return this;
        }
        public String getCenName() {
            return this.cenName;
        }

        public DescribeVpcFirewallCenSummaryListResponseBodyCenList setRegionNoList(java.util.List<String> regionNoList) {
            this.regionNoList = regionNoList;
            return this;
        }
        public java.util.List<String> getRegionNoList() {
            return this.regionNoList;
        }

    }

}
