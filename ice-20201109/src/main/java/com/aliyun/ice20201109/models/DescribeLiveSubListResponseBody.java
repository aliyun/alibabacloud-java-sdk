// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeLiveSubListResponseBody extends TeaModel {
    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubInfoList")
    public java.util.List<DescribeLiveSubListResponseBodySubInfoList> subInfoList;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeLiveSubListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveSubListResponseBody self = new DescribeLiveSubListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveSubListResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribeLiveSubListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveSubListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveSubListResponseBody setSubInfoList(java.util.List<DescribeLiveSubListResponseBodySubInfoList> subInfoList) {
        this.subInfoList = subInfoList;
        return this;
    }
    public java.util.List<DescribeLiveSubListResponseBodySubInfoList> getSubInfoList() {
        return this.subInfoList;
    }

    public DescribeLiveSubListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLiveSubListResponseBodySubInfoList extends TeaModel {
        @NameInMap("CacheDuration")
        public String cacheDuration;

        @NameInMap("CpuUsageRate")
        public String cpuUsageRate;

        @NameInMap("FirstFrameDuration")
        public String firstFrameDuration;

        @NameInMap("PlayFps")
        public String playFps;

        @NameInMap("SecondPlayRate")
        public String secondPlayRate;

        @NameInMap("SubNetBitrate")
        public String subNetBitrate;

        @NameInMap("SubRate")
        public String subRate;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("VideoStuck")
        public String videoStuck;

        public static DescribeLiveSubListResponseBodySubInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveSubListResponseBodySubInfoList self = new DescribeLiveSubListResponseBodySubInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveSubListResponseBodySubInfoList setCacheDuration(String cacheDuration) {
            this.cacheDuration = cacheDuration;
            return this;
        }
        public String getCacheDuration() {
            return this.cacheDuration;
        }

        public DescribeLiveSubListResponseBodySubInfoList setCpuUsageRate(String cpuUsageRate) {
            this.cpuUsageRate = cpuUsageRate;
            return this;
        }
        public String getCpuUsageRate() {
            return this.cpuUsageRate;
        }

        public DescribeLiveSubListResponseBodySubInfoList setFirstFrameDuration(String firstFrameDuration) {
            this.firstFrameDuration = firstFrameDuration;
            return this;
        }
        public String getFirstFrameDuration() {
            return this.firstFrameDuration;
        }

        public DescribeLiveSubListResponseBodySubInfoList setPlayFps(String playFps) {
            this.playFps = playFps;
            return this;
        }
        public String getPlayFps() {
            return this.playFps;
        }

        public DescribeLiveSubListResponseBodySubInfoList setSecondPlayRate(String secondPlayRate) {
            this.secondPlayRate = secondPlayRate;
            return this;
        }
        public String getSecondPlayRate() {
            return this.secondPlayRate;
        }

        public DescribeLiveSubListResponseBodySubInfoList setSubNetBitrate(String subNetBitrate) {
            this.subNetBitrate = subNetBitrate;
            return this;
        }
        public String getSubNetBitrate() {
            return this.subNetBitrate;
        }

        public DescribeLiveSubListResponseBodySubInfoList setSubRate(String subRate) {
            this.subRate = subRate;
            return this;
        }
        public String getSubRate() {
            return this.subRate;
        }

        public DescribeLiveSubListResponseBodySubInfoList setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public DescribeLiveSubListResponseBodySubInfoList setVideoStuck(String videoStuck) {
            this.videoStuck = videoStuck;
            return this;
        }
        public String getVideoStuck() {
            return this.videoStuck;
        }

    }

}
