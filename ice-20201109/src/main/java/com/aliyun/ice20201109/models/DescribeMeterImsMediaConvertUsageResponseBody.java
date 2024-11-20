// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsMediaConvertUsageResponseBody extends TeaModel {
    /**
     * <p>The usage statistics of IMS on VOD transcoding.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeMeterImsMediaConvertUsageResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FBBB5210-2B78-58FB-A6FE-9DD887BB2C61</p>
     */
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
        /**
         * <p>The usage duration, in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The transcoding specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>H264.HD</p>
         */
        @NameInMap("Specification")
        public String specification;

        /**
         * <p>The beginning time of usage. The value is a 10-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1656950400</p>
         */
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
