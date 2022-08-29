// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsMediaConvertUHDUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterImsMediaConvertUHDUsageResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterImsMediaConvertUHDUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsMediaConvertUHDUsageResponseBody self = new DescribeMeterImsMediaConvertUHDUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsMediaConvertUHDUsageResponseBody setData(java.util.List<DescribeMeterImsMediaConvertUHDUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterImsMediaConvertUHDUsageResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterImsMediaConvertUHDUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterImsMediaConvertUHDUsageResponseBodyData extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Specification")
        public String specification;

        @NameInMap("Time")
        public Long time;

        public static DescribeMeterImsMediaConvertUHDUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterImsMediaConvertUHDUsageResponseBodyData self = new DescribeMeterImsMediaConvertUHDUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterImsMediaConvertUHDUsageResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeMeterImsMediaConvertUHDUsageResponseBodyData setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public DescribeMeterImsMediaConvertUHDUsageResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
