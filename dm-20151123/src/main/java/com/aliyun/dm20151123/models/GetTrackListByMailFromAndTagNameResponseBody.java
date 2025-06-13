// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetTrackListByMailFromAndTagNameResponseBody extends TeaModel {
    /**
     * <p>Used for pagination. Not set for the first query; for subsequent queries, set to the value of OffsetCreateTime from the previous response. (This field is deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>（本字段已废弃）</p>
     */
    @NameInMap("OffsetCreateTime")
    public String offsetCreateTime;

    /**
     * <p>(This field is deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>（本字段已废弃）</p>
     */
    @NameInMap("OffsetCreateTimeDesc")
    public String offsetCreateTimeDesc;

    /**
     * <p>Current page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Page size</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>10A1AD70-E48E-476D-98D9-39BD92193837</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>(This field is deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Total")
    public Integer total;

    @NameInMap("TotalPages")
    public String totalPages;

    /**
     * <p>Tracking data records</p>
     */
    @NameInMap("TrackList")
    public GetTrackListByMailFromAndTagNameResponseBodyTrackList trackList;

    public static GetTrackListByMailFromAndTagNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrackListByMailFromAndTagNameResponseBody self = new GetTrackListByMailFromAndTagNameResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrackListByMailFromAndTagNameResponseBody setOffsetCreateTime(String offsetCreateTime) {
        this.offsetCreateTime = offsetCreateTime;
        return this;
    }
    public String getOffsetCreateTime() {
        return this.offsetCreateTime;
    }

    public GetTrackListByMailFromAndTagNameResponseBody setOffsetCreateTimeDesc(String offsetCreateTimeDesc) {
        this.offsetCreateTimeDesc = offsetCreateTimeDesc;
        return this;
    }
    public String getOffsetCreateTimeDesc() {
        return this.offsetCreateTimeDesc;
    }

    public GetTrackListByMailFromAndTagNameResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetTrackListByMailFromAndTagNameResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetTrackListByMailFromAndTagNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrackListByMailFromAndTagNameResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public GetTrackListByMailFromAndTagNameResponseBody setTotalPages(String totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public String getTotalPages() {
        return this.totalPages;
    }

    public GetTrackListByMailFromAndTagNameResponseBody setTrackList(GetTrackListByMailFromAndTagNameResponseBodyTrackList trackList) {
        this.trackList = trackList;
        return this;
    }
    public GetTrackListByMailFromAndTagNameResponseBodyTrackList getTrackList() {
        return this.trackList;
    }

    public static class GetTrackListByMailFromAndTagNameResponseBodyTrackListStat extends TeaModel {
        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-11T10:11Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Click count</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RcptClickCount")
        public String rcptClickCount;

        /**
         * <p>Click rate</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RcptClickRate")
        public String rcptClickRate;

        /**
         * <p>Number of opens</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RcptOpenCount")
        public String rcptOpenCount;

        /**
         * <p>Open rate</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RcptOpenRate")
        public String rcptOpenRate;

        /**
         * <p>Unique click count</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RcptUniqueClickCount")
        public String rcptUniqueClickCount;

        /**
         * <p>Unique click rate</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RcptUniqueClickRate")
        public String rcptUniqueClickRate;

        /**
         * <p>Unique open count</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RcptUniqueOpenCount")
        public String rcptUniqueOpenCount;

        /**
         * <p>Unique open rate</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RcptUniqueOpenRate")
        public String rcptUniqueOpenRate;

        /**
         * <p>Total number</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalNumber")
        public String totalNumber;

        public static GetTrackListByMailFromAndTagNameResponseBodyTrackListStat build(java.util.Map<String, ?> map) throws Exception {
            GetTrackListByMailFromAndTagNameResponseBodyTrackListStat self = new GetTrackListByMailFromAndTagNameResponseBodyTrackListStat();
            return TeaModel.build(map, self);
        }

        public GetTrackListByMailFromAndTagNameResponseBodyTrackListStat setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetTrackListByMailFromAndTagNameResponseBodyTrackListStat setRcptClickCount(String rcptClickCount) {
            this.rcptClickCount = rcptClickCount;
            return this;
        }
        public String getRcptClickCount() {
            return this.rcptClickCount;
        }

        public GetTrackListByMailFromAndTagNameResponseBodyTrackListStat setRcptClickRate(String rcptClickRate) {
            this.rcptClickRate = rcptClickRate;
            return this;
        }
        public String getRcptClickRate() {
            return this.rcptClickRate;
        }

        public GetTrackListByMailFromAndTagNameResponseBodyTrackListStat setRcptOpenCount(String rcptOpenCount) {
            this.rcptOpenCount = rcptOpenCount;
            return this;
        }
        public String getRcptOpenCount() {
            return this.rcptOpenCount;
        }

        public GetTrackListByMailFromAndTagNameResponseBodyTrackListStat setRcptOpenRate(String rcptOpenRate) {
            this.rcptOpenRate = rcptOpenRate;
            return this;
        }
        public String getRcptOpenRate() {
            return this.rcptOpenRate;
        }

        public GetTrackListByMailFromAndTagNameResponseBodyTrackListStat setRcptUniqueClickCount(String rcptUniqueClickCount) {
            this.rcptUniqueClickCount = rcptUniqueClickCount;
            return this;
        }
        public String getRcptUniqueClickCount() {
            return this.rcptUniqueClickCount;
        }

        public GetTrackListByMailFromAndTagNameResponseBodyTrackListStat setRcptUniqueClickRate(String rcptUniqueClickRate) {
            this.rcptUniqueClickRate = rcptUniqueClickRate;
            return this;
        }
        public String getRcptUniqueClickRate() {
            return this.rcptUniqueClickRate;
        }

        public GetTrackListByMailFromAndTagNameResponseBodyTrackListStat setRcptUniqueOpenCount(String rcptUniqueOpenCount) {
            this.rcptUniqueOpenCount = rcptUniqueOpenCount;
            return this;
        }
        public String getRcptUniqueOpenCount() {
            return this.rcptUniqueOpenCount;
        }

        public GetTrackListByMailFromAndTagNameResponseBodyTrackListStat setRcptUniqueOpenRate(String rcptUniqueOpenRate) {
            this.rcptUniqueOpenRate = rcptUniqueOpenRate;
            return this;
        }
        public String getRcptUniqueOpenRate() {
            return this.rcptUniqueOpenRate;
        }

        public GetTrackListByMailFromAndTagNameResponseBodyTrackListStat setTotalNumber(String totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public String getTotalNumber() {
            return this.totalNumber;
        }

    }

    public static class GetTrackListByMailFromAndTagNameResponseBodyTrackList extends TeaModel {
        @NameInMap("Stat")
        public java.util.List<GetTrackListByMailFromAndTagNameResponseBodyTrackListStat> stat;

        public static GetTrackListByMailFromAndTagNameResponseBodyTrackList build(java.util.Map<String, ?> map) throws Exception {
            GetTrackListByMailFromAndTagNameResponseBodyTrackList self = new GetTrackListByMailFromAndTagNameResponseBodyTrackList();
            return TeaModel.build(map, self);
        }

        public GetTrackListByMailFromAndTagNameResponseBodyTrackList setStat(java.util.List<GetTrackListByMailFromAndTagNameResponseBodyTrackListStat> stat) {
            this.stat = stat;
            return this;
        }
        public java.util.List<GetTrackListByMailFromAndTagNameResponseBodyTrackListStat> getStat() {
            return this.stat;
        }

    }

}
