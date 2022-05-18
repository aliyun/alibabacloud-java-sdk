// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DescribeMeterImpWatchLiveTimeByLiveIdResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterImpWatchLiveTimeByLiveIdResponseBodyData> data;

    // Id
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterImpWatchLiveTimeByLiveIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImpWatchLiveTimeByLiveIdResponseBody self = new DescribeMeterImpWatchLiveTimeByLiveIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImpWatchLiveTimeByLiveIdResponseBody setData(java.util.List<DescribeMeterImpWatchLiveTimeByLiveIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterImpWatchLiveTimeByLiveIdResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterImpWatchLiveTimeByLiveIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterImpWatchLiveTimeByLiveIdResponseBodyData extends TeaModel {
        @NameInMap("WatchTimeInLatency")
        public Long watchTimeInLatency;

        @NameInMap("WatchTimeInLowLatency")
        public Long watchTimeInLowLatency;

        public static DescribeMeterImpWatchLiveTimeByLiveIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterImpWatchLiveTimeByLiveIdResponseBodyData self = new DescribeMeterImpWatchLiveTimeByLiveIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterImpWatchLiveTimeByLiveIdResponseBodyData setWatchTimeInLatency(Long watchTimeInLatency) {
            this.watchTimeInLatency = watchTimeInLatency;
            return this;
        }
        public Long getWatchTimeInLatency() {
            return this.watchTimeInLatency;
        }

        public DescribeMeterImpWatchLiveTimeByLiveIdResponseBodyData setWatchTimeInLowLatency(Long watchTimeInLowLatency) {
            this.watchTimeInLowLatency = watchTimeInLowLatency;
            return this;
        }
        public Long getWatchTimeInLowLatency() {
            return this.watchTimeInLowLatency;
        }

    }

}
