// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUnprotectedVulnTrendResponseBody extends TeaModel {
    /**
     * <p>The number of protected vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("CurProtectedCnt")
    public Integer curProtectedCnt;

    /**
     * <p>The number of unprotected vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("CurUnprotectedCnt")
    public Integer curUnprotectedCnt;

    /**
     * <p>The list of returned data.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeUnprotectedVulnTrendResponseBodyDataList> dataList;

    /**
     * <p>The end time. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1731551104</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The time interval.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>05BEF2B5-EAAA-509D-9824-E3C7DC17****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1749434787</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeUnprotectedVulnTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnprotectedVulnTrendResponseBody self = new DescribeUnprotectedVulnTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUnprotectedVulnTrendResponseBody setCurProtectedCnt(Integer curProtectedCnt) {
        this.curProtectedCnt = curProtectedCnt;
        return this;
    }
    public Integer getCurProtectedCnt() {
        return this.curProtectedCnt;
    }

    public DescribeUnprotectedVulnTrendResponseBody setCurUnprotectedCnt(Integer curUnprotectedCnt) {
        this.curUnprotectedCnt = curUnprotectedCnt;
        return this;
    }
    public Integer getCurUnprotectedCnt() {
        return this.curUnprotectedCnt;
    }

    public DescribeUnprotectedVulnTrendResponseBody setDataList(java.util.List<DescribeUnprotectedVulnTrendResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeUnprotectedVulnTrendResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeUnprotectedVulnTrendResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeUnprotectedVulnTrendResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeUnprotectedVulnTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUnprotectedVulnTrendResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class DescribeUnprotectedVulnTrendResponseBodyDataList extends TeaModel {
        /**
         * <p>The number of protected vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ProtectedVulnCnt")
        public Integer protectedVulnCnt;

        /**
         * <p>The timestamp of the vulnerability scan.</p>
         * 
         * <strong>example:</strong>
         * <p>1525833105</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The number of unprotected vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UnprotectedVulnCnt")
        public Integer unprotectedVulnCnt;

        public static DescribeUnprotectedVulnTrendResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUnprotectedVulnTrendResponseBodyDataList self = new DescribeUnprotectedVulnTrendResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeUnprotectedVulnTrendResponseBodyDataList setProtectedVulnCnt(Integer protectedVulnCnt) {
            this.protectedVulnCnt = protectedVulnCnt;
            return this;
        }
        public Integer getProtectedVulnCnt() {
            return this.protectedVulnCnt;
        }

        public DescribeUnprotectedVulnTrendResponseBodyDataList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeUnprotectedVulnTrendResponseBodyDataList setUnprotectedVulnCnt(Integer unprotectedVulnCnt) {
            this.unprotectedVulnCnt = unprotectedVulnCnt;
            return this;
        }
        public Integer getUnprotectedVulnCnt() {
            return this.unprotectedVulnCnt;
        }

    }

}
