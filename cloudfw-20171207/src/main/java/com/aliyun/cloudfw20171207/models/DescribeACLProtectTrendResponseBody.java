// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeACLProtectTrendResponseBody extends TeaModel {
    /**
     * <p>The number of internal requests that are blocked by the ACL feature.</p>
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
    public Long interVPCProtectCnt;

    /**
     * <p>The interval for returning data. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The number of external requests that are blocked by the ACL feature.</p>
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
     * <p>The total number of requests that are blocked by the ACL feature.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("TotalProtectCnt")
    public Long totalProtectCnt;

    /**
     * <p>The statistics on the requests that are blocked by the ACL feature.</p>
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
         * <p>The number of requests that are blocked by ACL on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProtectCnt")
        public Integer protectCnt;

        /**
         * <p>The UNIX timestamp at midnight (00:00:00) of each day, which indicates the date of the current day. Unit: seconds.</p>
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
