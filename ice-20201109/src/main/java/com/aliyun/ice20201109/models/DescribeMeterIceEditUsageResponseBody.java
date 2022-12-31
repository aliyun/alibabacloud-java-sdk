// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterIceEditUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterIceEditUsageResponseBodyData> data;

    // Id
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterIceEditUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterIceEditUsageResponseBody self = new DescribeMeterIceEditUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterIceEditUsageResponseBody setData(java.util.List<DescribeMeterIceEditUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterIceEditUsageResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterIceEditUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterIceEditUsageResponseBodyData extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Time")
        public Long time;

        public static DescribeMeterIceEditUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterIceEditUsageResponseBodyData self = new DescribeMeterIceEditUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterIceEditUsageResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeMeterIceEditUsageResponseBodyData setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public DescribeMeterIceEditUsageResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
