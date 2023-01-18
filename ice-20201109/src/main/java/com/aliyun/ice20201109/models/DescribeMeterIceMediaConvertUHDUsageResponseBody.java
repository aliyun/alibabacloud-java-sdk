// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterIceMediaConvertUHDUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterIceMediaConvertUHDUsageResponseBodyData> data;

    /**
     * <p>Id</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterIceMediaConvertUHDUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterIceMediaConvertUHDUsageResponseBody self = new DescribeMeterIceMediaConvertUHDUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterIceMediaConvertUHDUsageResponseBody setData(java.util.List<DescribeMeterIceMediaConvertUHDUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterIceMediaConvertUHDUsageResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterIceMediaConvertUHDUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterIceMediaConvertUHDUsageResponseBodyData extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Specification")
        public String specification;

        @NameInMap("Time")
        public Long time;

        public static DescribeMeterIceMediaConvertUHDUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterIceMediaConvertUHDUsageResponseBodyData self = new DescribeMeterIceMediaConvertUHDUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterIceMediaConvertUHDUsageResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeMeterIceMediaConvertUHDUsageResponseBodyData setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public DescribeMeterIceMediaConvertUHDUsageResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
