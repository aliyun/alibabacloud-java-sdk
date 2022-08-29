// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterIceMpsAiUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterIceMpsAiUsageResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterIceMpsAiUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterIceMpsAiUsageResponseBody self = new DescribeMeterIceMpsAiUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterIceMpsAiUsageResponseBody setData(java.util.List<DescribeMeterIceMpsAiUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterIceMpsAiUsageResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterIceMpsAiUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterIceMpsAiUsageResponseBodyData extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Type")
        public String type;

        public static DescribeMeterIceMpsAiUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterIceMpsAiUsageResponseBodyData self = new DescribeMeterIceMpsAiUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterIceMpsAiUsageResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeMeterIceMpsAiUsageResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeMeterIceMpsAiUsageResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
