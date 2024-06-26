// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsEditUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterImsEditUsageResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>7F3AE2C6-5CC6-5712-BAC5-5A735A157687</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterImsEditUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsEditUsageResponseBody self = new DescribeMeterImsEditUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsEditUsageResponseBody setData(java.util.List<DescribeMeterImsEditUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterImsEditUsageResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterImsEditUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterImsEditUsageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1.23</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>1080P</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <strong>example:</strong>
         * <p>1656950400</p>
         */
        @NameInMap("Time")
        public Long time;

        public static DescribeMeterImsEditUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterImsEditUsageResponseBodyData self = new DescribeMeterImsEditUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterImsEditUsageResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeMeterImsEditUsageResponseBodyData setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public DescribeMeterImsEditUsageResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
