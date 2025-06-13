// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetTrackListResponseBody extends TeaModel {
    /**
     * <p>Used for pagination. Not set for the first query, but for subsequent queries, it should be set to the value of OffsetCreateTime from the previous response. (This field is deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>(This field is deprecated)</p>
     */
    @NameInMap("OffsetCreateTime")
    public String offsetCreateTime;

    /**
     * <p>(This field is deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>(This field is deprecated)</p>
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
     * <p>Number of items per page</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
     * <p>Total number of items</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Integer total;

    @NameInMap("TotalPages")
    public Integer totalPages;

    /**
     * <p>Tracking data records</p>
     */
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

    public GetTrackListResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public GetTrackListResponseBody setData(GetTrackListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTrackListResponseBodyData getData() {
        return this.data;
    }

    public static class GetTrackListResponseBodyDataStat extends TeaModel {
        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-29T13:28Z</p>
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
         * <p>Number of Opens</p>
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

        public static GetTrackListResponseBodyDataStat build(java.util.Map<String, ?> map) throws Exception {
            GetTrackListResponseBodyDataStat self = new GetTrackListResponseBodyDataStat();
            return TeaModel.build(map, self);
        }

        public GetTrackListResponseBodyDataStat setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetTrackListResponseBodyDataStat setRcptClickCount(String rcptClickCount) {
            this.rcptClickCount = rcptClickCount;
            return this;
        }
        public String getRcptClickCount() {
            return this.rcptClickCount;
        }

        public GetTrackListResponseBodyDataStat setRcptClickRate(String rcptClickRate) {
            this.rcptClickRate = rcptClickRate;
            return this;
        }
        public String getRcptClickRate() {
            return this.rcptClickRate;
        }

        public GetTrackListResponseBodyDataStat setRcptOpenCount(String rcptOpenCount) {
            this.rcptOpenCount = rcptOpenCount;
            return this;
        }
        public String getRcptOpenCount() {
            return this.rcptOpenCount;
        }

        public GetTrackListResponseBodyDataStat setRcptOpenRate(String rcptOpenRate) {
            this.rcptOpenRate = rcptOpenRate;
            return this;
        }
        public String getRcptOpenRate() {
            return this.rcptOpenRate;
        }

        public GetTrackListResponseBodyDataStat setRcptUniqueClickCount(String rcptUniqueClickCount) {
            this.rcptUniqueClickCount = rcptUniqueClickCount;
            return this;
        }
        public String getRcptUniqueClickCount() {
            return this.rcptUniqueClickCount;
        }

        public GetTrackListResponseBodyDataStat setRcptUniqueClickRate(String rcptUniqueClickRate) {
            this.rcptUniqueClickRate = rcptUniqueClickRate;
            return this;
        }
        public String getRcptUniqueClickRate() {
            return this.rcptUniqueClickRate;
        }

        public GetTrackListResponseBodyDataStat setRcptUniqueOpenCount(String rcptUniqueOpenCount) {
            this.rcptUniqueOpenCount = rcptUniqueOpenCount;
            return this;
        }
        public String getRcptUniqueOpenCount() {
            return this.rcptUniqueOpenCount;
        }

        public GetTrackListResponseBodyDataStat setRcptUniqueOpenRate(String rcptUniqueOpenRate) {
            this.rcptUniqueOpenRate = rcptUniqueOpenRate;
            return this;
        }
        public String getRcptUniqueOpenRate() {
            return this.rcptUniqueOpenRate;
        }

        public GetTrackListResponseBodyDataStat setTotalNumber(String totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public String getTotalNumber() {
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
