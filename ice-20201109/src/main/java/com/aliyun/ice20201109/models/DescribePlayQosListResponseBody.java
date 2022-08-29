// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayQosListResponseBody extends TeaModel {
    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("QosInfoList")
    public java.util.List<DescribePlayQosListResponseBodyQosInfoList> qosInfoList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePlayQosListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayQosListResponseBody self = new DescribePlayQosListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlayQosListResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribePlayQosListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePlayQosListResponseBody setQosInfoList(java.util.List<DescribePlayQosListResponseBodyQosInfoList> qosInfoList) {
        this.qosInfoList = qosInfoList;
        return this;
    }
    public java.util.List<DescribePlayQosListResponseBodyQosInfoList> getQosInfoList() {
        return this.qosInfoList;
    }

    public DescribePlayQosListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePlayQosListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePlayQosListResponseBodyQosInfoList extends TeaModel {
        @NameInMap("QosFirstFrame")
        public String qosFirstFrame;

        @NameInMap("QosKbps")
        public String qosKbps;

        @NameInMap("QosPlay")
        public String qosPlay;

        @NameInMap("QosPlayFail")
        public String qosPlayFail;

        @NameInMap("QosRealPlay")
        public String qosRealPlay;

        @NameInMap("QosSeedFailRate")
        public String qosSeedFailRate;

        @NameInMap("QosStuckRate")
        public String qosStuckRate;

        @NameInMap("TraceId")
        public String traceId;

        public static DescribePlayQosListResponseBodyQosInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayQosListResponseBodyQosInfoList self = new DescribePlayQosListResponseBodyQosInfoList();
            return TeaModel.build(map, self);
        }

        public DescribePlayQosListResponseBodyQosInfoList setQosFirstFrame(String qosFirstFrame) {
            this.qosFirstFrame = qosFirstFrame;
            return this;
        }
        public String getQosFirstFrame() {
            return this.qosFirstFrame;
        }

        public DescribePlayQosListResponseBodyQosInfoList setQosKbps(String qosKbps) {
            this.qosKbps = qosKbps;
            return this;
        }
        public String getQosKbps() {
            return this.qosKbps;
        }

        public DescribePlayQosListResponseBodyQosInfoList setQosPlay(String qosPlay) {
            this.qosPlay = qosPlay;
            return this;
        }
        public String getQosPlay() {
            return this.qosPlay;
        }

        public DescribePlayQosListResponseBodyQosInfoList setQosPlayFail(String qosPlayFail) {
            this.qosPlayFail = qosPlayFail;
            return this;
        }
        public String getQosPlayFail() {
            return this.qosPlayFail;
        }

        public DescribePlayQosListResponseBodyQosInfoList setQosRealPlay(String qosRealPlay) {
            this.qosRealPlay = qosRealPlay;
            return this;
        }
        public String getQosRealPlay() {
            return this.qosRealPlay;
        }

        public DescribePlayQosListResponseBodyQosInfoList setQosSeedFailRate(String qosSeedFailRate) {
            this.qosSeedFailRate = qosSeedFailRate;
            return this;
        }
        public String getQosSeedFailRate() {
            return this.qosSeedFailRate;
        }

        public DescribePlayQosListResponseBodyQosInfoList setQosStuckRate(String qosStuckRate) {
            this.qosStuckRate = qosStuckRate;
            return this;
        }
        public String getQosStuckRate() {
            return this.qosStuckRate;
        }

        public DescribePlayQosListResponseBodyQosInfoList setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

}
