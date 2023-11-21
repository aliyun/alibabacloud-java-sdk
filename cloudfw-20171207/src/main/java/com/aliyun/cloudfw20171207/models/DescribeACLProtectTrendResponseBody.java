// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeACLProtectTrendResponseBody extends TeaModel {
    @NameInMap("InProtectCnt")
    public Long inProtectCnt;

    @NameInMap("InterVPCProtectCnt")
    public Long interVPCProtectCnt;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("OutProtectCnt")
    public Long outProtectCnt;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalProtectCnt")
    public Long totalProtectCnt;

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
        @NameInMap("ProtectCnt")
        public Integer protectCnt;

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
