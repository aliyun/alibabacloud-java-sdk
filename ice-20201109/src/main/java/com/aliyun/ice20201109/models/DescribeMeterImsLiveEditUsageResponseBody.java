// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsLiveEditUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterImsLiveEditUsageResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterImsLiveEditUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsLiveEditUsageResponseBody self = new DescribeMeterImsLiveEditUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsLiveEditUsageResponseBody setData(java.util.List<DescribeMeterImsLiveEditUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterImsLiveEditUsageResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterImsLiveEditUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterImsLiveEditUsageResponseBodyData extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Time")
        public Long time;

        public static DescribeMeterImsLiveEditUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterImsLiveEditUsageResponseBodyData self = new DescribeMeterImsLiveEditUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterImsLiveEditUsageResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeMeterImsLiveEditUsageResponseBodyData setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public DescribeMeterImsLiveEditUsageResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
