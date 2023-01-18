// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterIceMediaConvertUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterIceMediaConvertUsageResponseBodyData> data;

    /**
     * <p>Id</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterIceMediaConvertUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterIceMediaConvertUsageResponseBody self = new DescribeMeterIceMediaConvertUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterIceMediaConvertUsageResponseBody setData(java.util.List<DescribeMeterIceMediaConvertUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterIceMediaConvertUsageResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterIceMediaConvertUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterIceMediaConvertUsageResponseBodyData extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Specification")
        public String specification;

        @NameInMap("Time")
        public Long time;

        public static DescribeMeterIceMediaConvertUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterIceMediaConvertUsageResponseBodyData self = new DescribeMeterIceMediaConvertUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterIceMediaConvertUsageResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeMeterIceMediaConvertUsageResponseBodyData setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public DescribeMeterIceMediaConvertUsageResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
