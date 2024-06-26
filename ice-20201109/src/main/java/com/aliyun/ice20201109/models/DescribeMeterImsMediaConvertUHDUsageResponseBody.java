// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsMediaConvertUHDUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterImsMediaConvertUHDUsageResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>BEA98A0C-7870-15FE-B96F-8880BB600A2C</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>308028</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>SuperResolution.Standard.1080P</p>
         */
        @NameInMap("Specification")
        public String specification;

        /**
         * <strong>example:</strong>
         * <p>1656950400</p>
         */
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
