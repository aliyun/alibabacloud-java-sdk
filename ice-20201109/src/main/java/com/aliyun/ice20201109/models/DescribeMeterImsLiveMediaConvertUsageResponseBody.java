// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsLiveMediaConvertUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterImsLiveMediaConvertUsageResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterImsLiveMediaConvertUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsLiveMediaConvertUsageResponseBody self = new DescribeMeterImsLiveMediaConvertUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsLiveMediaConvertUsageResponseBody setData(java.util.List<DescribeMeterImsLiveMediaConvertUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterImsLiveMediaConvertUsageResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterImsLiveMediaConvertUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterImsLiveMediaConvertUsageResponseBodyData extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Specification")
        public String specification;

        @NameInMap("Time")
        public Long time;

        public static DescribeMeterImsLiveMediaConvertUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterImsLiveMediaConvertUsageResponseBodyData self = new DescribeMeterImsLiveMediaConvertUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterImsLiveMediaConvertUsageResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeMeterImsLiveMediaConvertUsageResponseBodyData setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public DescribeMeterImsLiveMediaConvertUsageResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
