// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterIceLiveMediaConvertUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterIceLiveMediaConvertUsageResponseBodyData> data;

    // Id
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterIceLiveMediaConvertUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterIceLiveMediaConvertUsageResponseBody self = new DescribeMeterIceLiveMediaConvertUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterIceLiveMediaConvertUsageResponseBody setData(java.util.List<DescribeMeterIceLiveMediaConvertUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterIceLiveMediaConvertUsageResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterIceLiveMediaConvertUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterIceLiveMediaConvertUsageResponseBodyData extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Specification")
        public String specification;

        @NameInMap("Time")
        public Long time;

        public static DescribeMeterIceLiveMediaConvertUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterIceLiveMediaConvertUsageResponseBodyData self = new DescribeMeterIceLiveMediaConvertUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterIceLiveMediaConvertUsageResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeMeterIceLiveMediaConvertUsageResponseBodyData setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public DescribeMeterIceLiveMediaConvertUsageResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
