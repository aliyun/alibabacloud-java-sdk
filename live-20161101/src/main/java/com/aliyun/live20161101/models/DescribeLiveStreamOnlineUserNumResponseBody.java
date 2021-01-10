// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamOnlineUserNumResponseBody extends TeaModel {
    @NameInMap("OnlineUserInfo")
    public DescribeLiveStreamOnlineUserNumResponseBodyOnlineUserInfo onlineUserInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalUserNumber")
    public Long totalUserNumber;

    public static DescribeLiveStreamOnlineUserNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamOnlineUserNumResponseBody self = new DescribeLiveStreamOnlineUserNumResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamOnlineUserNumResponseBody setOnlineUserInfo(DescribeLiveStreamOnlineUserNumResponseBodyOnlineUserInfo onlineUserInfo) {
        this.onlineUserInfo = onlineUserInfo;
        return this;
    }
    public DescribeLiveStreamOnlineUserNumResponseBodyOnlineUserInfo getOnlineUserInfo() {
        return this.onlineUserInfo;
    }

    public DescribeLiveStreamOnlineUserNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamOnlineUserNumResponseBody setTotalUserNumber(Long totalUserNumber) {
        this.totalUserNumber = totalUserNumber;
        return this;
    }
    public Long getTotalUserNumber() {
        return this.totalUserNumber;
    }

    public static class DescribeLiveStreamOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("UserNumber")
        public Long userNumber;

        @NameInMap("StreamUrl")
        public String streamUrl;

        public static DescribeLiveStreamOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo self = new DescribeLiveStreamOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeLiveStreamOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo setUserNumber(Long userNumber) {
            this.userNumber = userNumber;
            return this;
        }
        public Long getUserNumber() {
            return this.userNumber;
        }

        public DescribeLiveStreamOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

    }

    public static class DescribeLiveStreamOnlineUserNumResponseBodyOnlineUserInfo extends TeaModel {
        @NameInMap("LiveStreamOnlineUserNumInfo")
        public java.util.List<DescribeLiveStreamOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo> liveStreamOnlineUserNumInfo;

        public static DescribeLiveStreamOnlineUserNumResponseBodyOnlineUserInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamOnlineUserNumResponseBodyOnlineUserInfo self = new DescribeLiveStreamOnlineUserNumResponseBodyOnlineUserInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamOnlineUserNumResponseBodyOnlineUserInfo setLiveStreamOnlineUserNumInfo(java.util.List<DescribeLiveStreamOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo> liveStreamOnlineUserNumInfo) {
            this.liveStreamOnlineUserNumInfo = liveStreamOnlineUserNumInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo> getLiveStreamOnlineUserNumInfo() {
            return this.liveStreamOnlineUserNumInfo;
        }

    }

}
