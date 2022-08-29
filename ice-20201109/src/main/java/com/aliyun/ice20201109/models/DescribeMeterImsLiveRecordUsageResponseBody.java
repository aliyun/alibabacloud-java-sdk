// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsLiveRecordUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterImsLiveRecordUsageResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterImsLiveRecordUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsLiveRecordUsageResponseBody self = new DescribeMeterImsLiveRecordUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsLiveRecordUsageResponseBody setData(java.util.List<DescribeMeterImsLiveRecordUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterImsLiveRecordUsageResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterImsLiveRecordUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterImsLiveRecordUsageResponseBodyData extends TeaModel {
        @NameInMap("Channels")
        public Double channels;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Type")
        public String type;

        public static DescribeMeterImsLiveRecordUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterImsLiveRecordUsageResponseBodyData self = new DescribeMeterImsLiveRecordUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterImsLiveRecordUsageResponseBodyData setChannels(Double channels) {
            this.channels = channels;
            return this;
        }
        public Double getChannels() {
            return this.channels;
        }

        public DescribeMeterImsLiveRecordUsageResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeMeterImsLiveRecordUsageResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeMeterImsLiveRecordUsageResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
