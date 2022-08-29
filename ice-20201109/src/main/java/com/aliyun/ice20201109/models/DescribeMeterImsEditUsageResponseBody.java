// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsEditUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterImsEditUsageResponseBodyData> data;

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
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Profile")
        public String profile;

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
