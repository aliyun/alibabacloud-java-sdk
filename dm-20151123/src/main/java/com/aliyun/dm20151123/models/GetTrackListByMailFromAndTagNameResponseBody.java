// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetTrackListByMailFromAndTagNameResponseBody extends TeaModel {
    @NameInMap("OffsetCreateTime")
    public String offsetCreateTime;

    @NameInMap("OffsetCreateTimeDesc")
    public String offsetCreateTimeDesc;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

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

    public GetTrackListByMailFromAndTagNameResponseBody setTrackList(GetTrackListByMailFromAndTagNameResponseBodyTrackList trackList) {
        this.trackList = trackList;
        return this;
    }
    public GetTrackListByMailFromAndTagNameResponseBodyTrackList getTrackList() {
        return this.trackList;
    }

    public static class GetTrackListByMailFromAndTagNameResponseBodyTrackListStat extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("RcptClickCount")
        public String rcptClickCount;

        @NameInMap("RcptClickRate")
        public String rcptClickRate;

        @NameInMap("RcptOpenCount")
        public String rcptOpenCount;

        @NameInMap("RcptOpenRate")
        public String rcptOpenRate;

        @NameInMap("RcptUniqueClickCount")
        public String rcptUniqueClickCount;

        @NameInMap("RcptUniqueClickRate")
        public String rcptUniqueClickRate;

        @NameInMap("RcptUniqueOpenCount")
        public String rcptUniqueOpenCount;

        @NameInMap("RcptUniqueOpenRate")
        public String rcptUniqueOpenRate;

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
