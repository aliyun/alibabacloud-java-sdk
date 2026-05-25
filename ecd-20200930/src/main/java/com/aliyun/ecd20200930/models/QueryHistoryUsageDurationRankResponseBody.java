// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryHistoryUsageDurationRankResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AAAAAWvmfbFWy0uSlxZ6pIAKAnuwt1ezsRqxI6hPibm27fMH</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>94</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("UsageDurationList")
    public java.util.List<QueryHistoryUsageDurationRankResponseBodyUsageDurationList> usageDurationList;

    public static QueryHistoryUsageDurationRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoryUsageDurationRankResponseBody self = new QueryHistoryUsageDurationRankResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHistoryUsageDurationRankResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryHistoryUsageDurationRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHistoryUsageDurationRankResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryHistoryUsageDurationRankResponseBody setUsageDurationList(java.util.List<QueryHistoryUsageDurationRankResponseBodyUsageDurationList> usageDurationList) {
        this.usageDurationList = usageDurationList;
        return this;
    }
    public java.util.List<QueryHistoryUsageDurationRankResponseBodyUsageDurationList> getUsageDurationList() {
        return this.usageDurationList;
    }

    public static class QueryHistoryUsageDurationRankResponseBodyUsageDurationList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>ecd-8cndajrdrd424sb99</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <strong>example:</strong>
         * <p>TestName</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <strong>example:</strong>
         * <p>endUserId</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("UsageDuration")
        public Long usageDuration;

        public static QueryHistoryUsageDurationRankResponseBodyUsageDurationList build(java.util.Map<String, ?> map) throws Exception {
            QueryHistoryUsageDurationRankResponseBodyUsageDurationList self = new QueryHistoryUsageDurationRankResponseBodyUsageDurationList();
            return TeaModel.build(map, self);
        }

        public QueryHistoryUsageDurationRankResponseBodyUsageDurationList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public QueryHistoryUsageDurationRankResponseBodyUsageDurationList setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public QueryHistoryUsageDurationRankResponseBodyUsageDurationList setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public QueryHistoryUsageDurationRankResponseBodyUsageDurationList setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public QueryHistoryUsageDurationRankResponseBodyUsageDurationList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryHistoryUsageDurationRankResponseBodyUsageDurationList setUsageDuration(Long usageDuration) {
            this.usageDuration = usageDuration;
            return this;
        }
        public Long getUsageDuration() {
            return this.usageDuration;
        }

    }

}
