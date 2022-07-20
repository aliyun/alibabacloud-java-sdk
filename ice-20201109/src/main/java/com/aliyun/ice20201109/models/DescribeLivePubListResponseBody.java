// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeLivePubListResponseBody extends TeaModel {
    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PubInfoList")
    public java.util.List<DescribeLivePubListResponseBodyPubInfoList> pubInfoList;

    // Id
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeLivePubListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePubListResponseBody self = new DescribeLivePubListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLivePubListResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribeLivePubListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeLivePubListResponseBody setPubInfoList(java.util.List<DescribeLivePubListResponseBodyPubInfoList> pubInfoList) {
        this.pubInfoList = pubInfoList;
        return this;
    }
    public java.util.List<DescribeLivePubListResponseBodyPubInfoList> getPubInfoList() {
        return this.pubInfoList;
    }

    public DescribeLivePubListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLivePubListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLivePubListResponseBodyPubInfoList extends TeaModel {
        @NameInMap("Area")
        public String area;

        @NameInMap("CpuUsageRate")
        public String cpuUsageRate;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("EndTs")
        public String endTs;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Kbps")
        public String kbps;

        @NameInMap("PubHeapUpDuration")
        public String pubHeapUpDuration;

        @NameInMap("PubMachineType")
        public String pubMachineType;

        @NameInMap("SecondPlayRate")
        public String secondPlayRate;

        @NameInMap("StartTs")
        public String startTs;

        @NameInMap("StreamName")
        public String streamName;

        public static DescribeLivePubListResponseBodyPubInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePubListResponseBodyPubInfoList self = new DescribeLivePubListResponseBodyPubInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeLivePubListResponseBodyPubInfoList setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeLivePubListResponseBodyPubInfoList setCpuUsageRate(String cpuUsageRate) {
            this.cpuUsageRate = cpuUsageRate;
            return this;
        }
        public String getCpuUsageRate() {
            return this.cpuUsageRate;
        }

        public DescribeLivePubListResponseBodyPubInfoList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLivePubListResponseBodyPubInfoList setEndTs(String endTs) {
            this.endTs = endTs;
            return this;
        }
        public String getEndTs() {
            return this.endTs;
        }

        public DescribeLivePubListResponseBodyPubInfoList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public DescribeLivePubListResponseBodyPubInfoList setKbps(String kbps) {
            this.kbps = kbps;
            return this;
        }
        public String getKbps() {
            return this.kbps;
        }

        public DescribeLivePubListResponseBodyPubInfoList setPubHeapUpDuration(String pubHeapUpDuration) {
            this.pubHeapUpDuration = pubHeapUpDuration;
            return this;
        }
        public String getPubHeapUpDuration() {
            return this.pubHeapUpDuration;
        }

        public DescribeLivePubListResponseBodyPubInfoList setPubMachineType(String pubMachineType) {
            this.pubMachineType = pubMachineType;
            return this;
        }
        public String getPubMachineType() {
            return this.pubMachineType;
        }

        public DescribeLivePubListResponseBodyPubInfoList setSecondPlayRate(String secondPlayRate) {
            this.secondPlayRate = secondPlayRate;
            return this;
        }
        public String getSecondPlayRate() {
            return this.secondPlayRate;
        }

        public DescribeLivePubListResponseBodyPubInfoList setStartTs(String startTs) {
            this.startTs = startTs;
            return this;
        }
        public String getStartTs() {
            return this.startTs;
        }

        public DescribeLivePubListResponseBodyPubInfoList setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

}
