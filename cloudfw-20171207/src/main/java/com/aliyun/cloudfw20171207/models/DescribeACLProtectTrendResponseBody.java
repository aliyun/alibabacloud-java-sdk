// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeACLProtectTrendResponseBody extends TeaModel {
    /**
     * <p>The number of inbound interceptions by Internet access control.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("InProtectCnt")
    public Long inProtectCnt;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InterVPCProtectCnt")
    @Deprecated
    public Long interVPCProtectCnt;

    /**
     * <p>The interval at which data is returned. Unit: seconds. A result is returned at each interval.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The number of outbound interceptions by Internet access control.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("OutProtectCnt")
    public Long outProtectCnt;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9063AB86-6FFA-5B2D-A16D-697C966DECA3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The cumulative total of AlertCnt across all time points within the query time range. This value indicates the total number of sessions that matched an ACL policy and triggered the monitor (alert) action during the entire time period.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalAlertCnt")
    public Long totalAlertCnt;

    /**
     * <p>The cumulative total of PassCnt across all time points within the query time range. This value indicates the total number of sessions that matched an ACL policy and were allowed during the entire time period.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalPassCnt")
    public Long totalPassCnt;

    /**
     * <p>The total number of Internet access control interceptions.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("TotalProtectCnt")
    public Long totalProtectCnt;

    /**
     * <p>The list of Internet access control intercept trend data.</p>
     */
    @NameInMap("TrendList")
    public java.util.List<DescribeACLProtectTrendResponseBodyTrendList> trendList;

    public static DescribeACLProtectTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeACLProtectTrendResponseBody self = new DescribeACLProtectTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeACLProtectTrendResponseBody setInProtectCnt(Long inProtectCnt) {
        this.inProtectCnt = inProtectCnt;
        return this;
    }
    public Long getInProtectCnt() {
        return this.inProtectCnt;
    }

    @Deprecated
    public DescribeACLProtectTrendResponseBody setInterVPCProtectCnt(Long interVPCProtectCnt) {
        this.interVPCProtectCnt = interVPCProtectCnt;
        return this;
    }
    public Long getInterVPCProtectCnt() {
        return this.interVPCProtectCnt;
    }

    public DescribeACLProtectTrendResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeACLProtectTrendResponseBody setOutProtectCnt(Long outProtectCnt) {
        this.outProtectCnt = outProtectCnt;
        return this;
    }
    public Long getOutProtectCnt() {
        return this.outProtectCnt;
    }

    public DescribeACLProtectTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeACLProtectTrendResponseBody setTotalAlertCnt(Long totalAlertCnt) {
        this.totalAlertCnt = totalAlertCnt;
        return this;
    }
    public Long getTotalAlertCnt() {
        return this.totalAlertCnt;
    }

    public DescribeACLProtectTrendResponseBody setTotalPassCnt(Long totalPassCnt) {
        this.totalPassCnt = totalPassCnt;
        return this;
    }
    public Long getTotalPassCnt() {
        return this.totalPassCnt;
    }

    public DescribeACLProtectTrendResponseBody setTotalProtectCnt(Long totalProtectCnt) {
        this.totalProtectCnt = totalProtectCnt;
        return this;
    }
    public Long getTotalProtectCnt() {
        return this.totalProtectCnt;
    }

    public DescribeACLProtectTrendResponseBody setTrendList(java.util.List<DescribeACLProtectTrendResponseBodyTrendList> trendList) {
        this.trendList = trendList;
        return this;
    }
    public java.util.List<DescribeACLProtectTrendResponseBodyTrendList> getTrendList() {
        return this.trendList;
    }

    public static class DescribeACLProtectTrendResponseBodyTrendList extends TeaModel {
        /**
         * <p>The total number of sessions that matched an ACL policy and triggered the monitor (alert) action at this point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AlertCnt")
        public Integer alertCnt;

        /**
         * <p>The total number of sessions that matched an ACL policy and were allowed at this point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PassCnt")
        public Integer passCnt;

        /**
         * <p>The number of Internet access control interceptions on the day.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProtectCnt")
        public Integer protectCnt;

        /**
         * <p>The timestamp of 00:00 on each day. Unit: seconds. Indicates the date.</p>
         * 
         * <strong>example:</strong>
         * <p>1697299200</p>
         */
        @NameInMap("Time")
        public Long time;

        public static DescribeACLProtectTrendResponseBodyTrendList build(java.util.Map<String, ?> map) throws Exception {
            DescribeACLProtectTrendResponseBodyTrendList self = new DescribeACLProtectTrendResponseBodyTrendList();
            return TeaModel.build(map, self);
        }

        public DescribeACLProtectTrendResponseBodyTrendList setAlertCnt(Integer alertCnt) {
            this.alertCnt = alertCnt;
            return this;
        }
        public Integer getAlertCnt() {
            return this.alertCnt;
        }

        public DescribeACLProtectTrendResponseBodyTrendList setPassCnt(Integer passCnt) {
            this.passCnt = passCnt;
            return this;
        }
        public Integer getPassCnt() {
            return this.passCnt;
        }

        public DescribeACLProtectTrendResponseBodyTrendList setProtectCnt(Integer protectCnt) {
            this.protectCnt = protectCnt;
            return this;
        }
        public Integer getProtectCnt() {
            return this.protectCnt;
        }

        public DescribeACLProtectTrendResponseBodyTrendList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
