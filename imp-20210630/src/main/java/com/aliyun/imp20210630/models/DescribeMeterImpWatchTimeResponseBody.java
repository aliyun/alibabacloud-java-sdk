// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DescribeMeterImpWatchTimeResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterImpWatchTimeResponseBodyData> data;

    // Id
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterImpWatchTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImpWatchTimeResponseBody self = new DescribeMeterImpWatchTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImpWatchTimeResponseBody setData(java.util.List<DescribeMeterImpWatchTimeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterImpWatchTimeResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterImpWatchTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterImpWatchTimeResponseBodyData extends TeaModel {
        @NameInMap("LiveRtcDuration")
        public Long liveRtcDuration;

        @NameInMap("LiveRtmpDuration")
        public Long liveRtmpDuration;

        @NameInMap("LiveRtsDuration")
        public Long liveRtsDuration;

        @NameInMap("Time")
        public Long time;

        @NameInMap("VodDuration")
        public Long vodDuration;

        public static DescribeMeterImpWatchTimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterImpWatchTimeResponseBodyData self = new DescribeMeterImpWatchTimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterImpWatchTimeResponseBodyData setLiveRtcDuration(Long liveRtcDuration) {
            this.liveRtcDuration = liveRtcDuration;
            return this;
        }
        public Long getLiveRtcDuration() {
            return this.liveRtcDuration;
        }

        public DescribeMeterImpWatchTimeResponseBodyData setLiveRtmpDuration(Long liveRtmpDuration) {
            this.liveRtmpDuration = liveRtmpDuration;
            return this;
        }
        public Long getLiveRtmpDuration() {
            return this.liveRtmpDuration;
        }

        public DescribeMeterImpWatchTimeResponseBodyData setLiveRtsDuration(Long liveRtsDuration) {
            this.liveRtsDuration = liveRtsDuration;
            return this;
        }
        public Long getLiveRtsDuration() {
            return this.liveRtsDuration;
        }

        public DescribeMeterImpWatchTimeResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeMeterImpWatchTimeResponseBodyData setVodDuration(Long vodDuration) {
            this.vodDuration = vodDuration;
            return this;
        }
        public Long getVodDuration() {
            return this.vodDuration;
        }

    }

}
