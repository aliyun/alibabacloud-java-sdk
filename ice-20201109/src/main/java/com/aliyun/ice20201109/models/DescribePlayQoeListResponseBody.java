// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayQoeListResponseBody extends TeaModel {
    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("QoeInfoList")
    public java.util.List<DescribePlayQoeListResponseBodyQoeInfoList> qoeInfoList;

    // Id
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePlayQoeListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayQoeListResponseBody self = new DescribePlayQoeListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlayQoeListResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribePlayQoeListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePlayQoeListResponseBody setQoeInfoList(java.util.List<DescribePlayQoeListResponseBodyQoeInfoList> qoeInfoList) {
        this.qoeInfoList = qoeInfoList;
        return this;
    }
    public java.util.List<DescribePlayQoeListResponseBodyQoeInfoList> getQoeInfoList() {
        return this.qoeInfoList;
    }

    public DescribePlayQoeListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePlayQoeListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePlayQoeListResponseBodyQoeInfoList extends TeaModel {
        @NameInMap("QoeFinishedVV")
        public Float qoeFinishedVV;

        @NameInMap("QoeFinishedVVRate")
        public Float qoeFinishedVVRate;

        @NameInMap("QoeUFinishedVVTime")
        public Float qoeUFinishedVVTime;

        @NameInMap("QoeUV")
        public Float qoeUV;

        @NameInMap("QoeUVVDuration")
        public Float qoeUVVDuration;

        @NameInMap("QoeUVVTime")
        public Float qoeUVVTime;

        @NameInMap("QoeVDuration")
        public Float qoeVDuration;

        @NameInMap("QoeVVDuration")
        public Float qoeVVDuration;

        @NameInMap("Vpsid")
        public String vpsid;

        public static DescribePlayQoeListResponseBodyQoeInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayQoeListResponseBodyQoeInfoList self = new DescribePlayQoeListResponseBodyQoeInfoList();
            return TeaModel.build(map, self);
        }

        public DescribePlayQoeListResponseBodyQoeInfoList setQoeFinishedVV(Float qoeFinishedVV) {
            this.qoeFinishedVV = qoeFinishedVV;
            return this;
        }
        public Float getQoeFinishedVV() {
            return this.qoeFinishedVV;
        }

        public DescribePlayQoeListResponseBodyQoeInfoList setQoeFinishedVVRate(Float qoeFinishedVVRate) {
            this.qoeFinishedVVRate = qoeFinishedVVRate;
            return this;
        }
        public Float getQoeFinishedVVRate() {
            return this.qoeFinishedVVRate;
        }

        public DescribePlayQoeListResponseBodyQoeInfoList setQoeUFinishedVVTime(Float qoeUFinishedVVTime) {
            this.qoeUFinishedVVTime = qoeUFinishedVVTime;
            return this;
        }
        public Float getQoeUFinishedVVTime() {
            return this.qoeUFinishedVVTime;
        }

        public DescribePlayQoeListResponseBodyQoeInfoList setQoeUV(Float qoeUV) {
            this.qoeUV = qoeUV;
            return this;
        }
        public Float getQoeUV() {
            return this.qoeUV;
        }

        public DescribePlayQoeListResponseBodyQoeInfoList setQoeUVVDuration(Float qoeUVVDuration) {
            this.qoeUVVDuration = qoeUVVDuration;
            return this;
        }
        public Float getQoeUVVDuration() {
            return this.qoeUVVDuration;
        }

        public DescribePlayQoeListResponseBodyQoeInfoList setQoeUVVTime(Float qoeUVVTime) {
            this.qoeUVVTime = qoeUVVTime;
            return this;
        }
        public Float getQoeUVVTime() {
            return this.qoeUVVTime;
        }

        public DescribePlayQoeListResponseBodyQoeInfoList setQoeVDuration(Float qoeVDuration) {
            this.qoeVDuration = qoeVDuration;
            return this;
        }
        public Float getQoeVDuration() {
            return this.qoeVDuration;
        }

        public DescribePlayQoeListResponseBodyQoeInfoList setQoeVVDuration(Float qoeVVDuration) {
            this.qoeVVDuration = qoeVVDuration;
            return this;
        }
        public Float getQoeVVDuration() {
            return this.qoeVVDuration;
        }

        public DescribePlayQoeListResponseBodyQoeInfoList setVpsid(String vpsid) {
            this.vpsid = vpsid;
            return this;
        }
        public String getVpsid() {
            return this.vpsid;
        }

    }

}
