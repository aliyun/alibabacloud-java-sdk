// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class GetTrackListResponseBody extends TeaModel {
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

    @NameInMap("data")
    public GetTrackListResponseBodyData data;

    public static GetTrackListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrackListResponseBody self = new GetTrackListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrackListResponseBody setOffsetCreateTime(String offsetCreateTime) {
        this.offsetCreateTime = offsetCreateTime;
        return this;
    }
    public String getOffsetCreateTime() {
        return this.offsetCreateTime;
    }

    public GetTrackListResponseBody setOffsetCreateTimeDesc(String offsetCreateTimeDesc) {
        this.offsetCreateTimeDesc = offsetCreateTimeDesc;
        return this;
    }
    public String getOffsetCreateTimeDesc() {
        return this.offsetCreateTimeDesc;
    }

    public GetTrackListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetTrackListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetTrackListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrackListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public GetTrackListResponseBody setData(GetTrackListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTrackListResponseBodyData getData() {
        return this.data;
    }

    public static class GetTrackListResponseBodyDataStat extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("RcptClickCount")
        public Long rcptClickCount;

        @NameInMap("RcptClickRate")
        public String rcptClickRate;

        @NameInMap("RcptOpenCount")
        public Long rcptOpenCount;

        @NameInMap("RcptOpenRate")
        public String rcptOpenRate;

        @NameInMap("RcptUniqueClickCount")
        public Long rcptUniqueClickCount;

        @NameInMap("RcptUniqueClickRate")
        public String rcptUniqueClickRate;

        @NameInMap("RcptUniqueOpenCount")
        public Long rcptUniqueOpenCount;

        @NameInMap("RcptUniqueOpenRate")
        public String rcptUniqueOpenRate;

        @NameInMap("TotalNumber")
        public Long totalNumber;

        public static GetTrackListResponseBodyDataStat build(java.util.Map<String, ?> map) throws Exception {
            GetTrackListResponseBodyDataStat self = new GetTrackListResponseBodyDataStat();
            return TeaModel.build(map, self);
        }

        public GetTrackListResponseBodyDataStat setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetTrackListResponseBodyDataStat setRcptClickCount(Long rcptClickCount) {
            this.rcptClickCount = rcptClickCount;
            return this;
        }
        public Long getRcptClickCount() {
            return this.rcptClickCount;
        }

        public GetTrackListResponseBodyDataStat setRcptClickRate(String rcptClickRate) {
            this.rcptClickRate = rcptClickRate;
            return this;
        }
        public String getRcptClickRate() {
            return this.rcptClickRate;
        }

        public GetTrackListResponseBodyDataStat setRcptOpenCount(Long rcptOpenCount) {
            this.rcptOpenCount = rcptOpenCount;
            return this;
        }
        public Long getRcptOpenCount() {
            return this.rcptOpenCount;
        }

        public GetTrackListResponseBodyDataStat setRcptOpenRate(String rcptOpenRate) {
            this.rcptOpenRate = rcptOpenRate;
            return this;
        }
        public String getRcptOpenRate() {
            return this.rcptOpenRate;
        }

        public GetTrackListResponseBodyDataStat setRcptUniqueClickCount(Long rcptUniqueClickCount) {
            this.rcptUniqueClickCount = rcptUniqueClickCount;
            return this;
        }
        public Long getRcptUniqueClickCount() {
            return this.rcptUniqueClickCount;
        }

        public GetTrackListResponseBodyDataStat setRcptUniqueClickRate(String rcptUniqueClickRate) {
            this.rcptUniqueClickRate = rcptUniqueClickRate;
            return this;
        }
        public String getRcptUniqueClickRate() {
            return this.rcptUniqueClickRate;
        }

        public GetTrackListResponseBodyDataStat setRcptUniqueOpenCount(Long rcptUniqueOpenCount) {
            this.rcptUniqueOpenCount = rcptUniqueOpenCount;
            return this;
        }
        public Long getRcptUniqueOpenCount() {
            return this.rcptUniqueOpenCount;
        }

        public GetTrackListResponseBodyDataStat setRcptUniqueOpenRate(String rcptUniqueOpenRate) {
            this.rcptUniqueOpenRate = rcptUniqueOpenRate;
            return this;
        }
        public String getRcptUniqueOpenRate() {
            return this.rcptUniqueOpenRate;
        }

        public GetTrackListResponseBodyDataStat setTotalNumber(Long totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Long getTotalNumber() {
            return this.totalNumber;
        }

    }

    public static class GetTrackListResponseBodyData extends TeaModel {
        @NameInMap("stat")
        public java.util.List<GetTrackListResponseBodyDataStat> stat;

        public static GetTrackListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrackListResponseBodyData self = new GetTrackListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrackListResponseBodyData setStat(java.util.List<GetTrackListResponseBodyDataStat> stat) {
            this.stat = stat;
            return this;
        }
        public java.util.List<GetTrackListResponseBodyDataStat> getStat() {
            return this.stat;
        }

    }

}
