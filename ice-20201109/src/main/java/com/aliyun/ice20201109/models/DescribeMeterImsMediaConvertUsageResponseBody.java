// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsMediaConvertUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterImsMediaConvertUsageResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterImsMediaConvertUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsMediaConvertUsageResponseBody self = new DescribeMeterImsMediaConvertUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsMediaConvertUsageResponseBody setData(java.util.List<DescribeMeterImsMediaConvertUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterImsMediaConvertUsageResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterImsMediaConvertUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterImsMediaConvertUsageResponseBodyData extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Specification")
        public String specification;

        @NameInMap("Time")
        public Long time;

        public static DescribeMeterImsMediaConvertUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterImsMediaConvertUsageResponseBodyData self = new DescribeMeterImsMediaConvertUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterImsMediaConvertUsageResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeMeterImsMediaConvertUsageResponseBodyData setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public DescribeMeterImsMediaConvertUsageResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
