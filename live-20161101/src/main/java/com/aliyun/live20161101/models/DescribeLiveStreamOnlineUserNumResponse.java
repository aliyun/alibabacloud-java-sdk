// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamOnlineUserNumResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalUserNumber")
    @Validation(required = true)
    public Long totalUserNumber;

    @NameInMap("OnlineUserInfo")
    @Validation(required = true)
    public DescribeLiveStreamOnlineUserNumResponseOnlineUserInfo onlineUserInfo;

    public static DescribeLiveStreamOnlineUserNumResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamOnlineUserNumResponse self = new DescribeLiveStreamOnlineUserNumResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamOnlineUserNumResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamOnlineUserNumResponse setTotalUserNumber(Long totalUserNumber) {
        this.totalUserNumber = totalUserNumber;
        return this;
    }
    public Long getTotalUserNumber() {
        return this.totalUserNumber;
    }

    public DescribeLiveStreamOnlineUserNumResponse setOnlineUserInfo(DescribeLiveStreamOnlineUserNumResponseOnlineUserInfo onlineUserInfo) {
        this.onlineUserInfo = onlineUserInfo;
        return this;
    }
    public DescribeLiveStreamOnlineUserNumResponseOnlineUserInfo getOnlineUserInfo() {
        return this.onlineUserInfo;
    }

    public static class DescribeLiveStreamOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo extends TeaModel {
        @NameInMap("StreamUrl")
        @Validation(required = true)
        public String streamUrl;

        @NameInMap("UserNumber")
        @Validation(required = true)
        public Long userNumber;

        @NameInMap("Time")
        @Validation(required = true)
        public String time;

        public static DescribeLiveStreamOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo self = new DescribeLiveStreamOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public DescribeLiveStreamOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo setUserNumber(Long userNumber) {
            this.userNumber = userNumber;
            return this;
        }
        public Long getUserNumber() {
            return this.userNumber;
        }

        public DescribeLiveStreamOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class DescribeLiveStreamOnlineUserNumResponseOnlineUserInfo extends TeaModel {
        @NameInMap("LiveStreamOnlineUserNumInfo")
        @Validation(required = true)
        public java.util.List<DescribeLiveStreamOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo> liveStreamOnlineUserNumInfo;

        public static DescribeLiveStreamOnlineUserNumResponseOnlineUserInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamOnlineUserNumResponseOnlineUserInfo self = new DescribeLiveStreamOnlineUserNumResponseOnlineUserInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamOnlineUserNumResponseOnlineUserInfo setLiveStreamOnlineUserNumInfo(java.util.List<DescribeLiveStreamOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo> liveStreamOnlineUserNumInfo) {
            this.liveStreamOnlineUserNumInfo = liveStreamOnlineUserNumInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo> getLiveStreamOnlineUserNumInfo() {
            return this.liveStreamOnlineUserNumInfo;
        }

    }

}
