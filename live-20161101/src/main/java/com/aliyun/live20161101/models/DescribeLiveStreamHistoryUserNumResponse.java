// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamHistoryUserNumResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LiveStreamUserNumInfos")
    @Validation(required = true)
    public DescribeLiveStreamHistoryUserNumResponseLiveStreamUserNumInfos liveStreamUserNumInfos;

    public static DescribeLiveStreamHistoryUserNumResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamHistoryUserNumResponse self = new DescribeLiveStreamHistoryUserNumResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamHistoryUserNumResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamHistoryUserNumResponse setLiveStreamUserNumInfos(DescribeLiveStreamHistoryUserNumResponseLiveStreamUserNumInfos liveStreamUserNumInfos) {
        this.liveStreamUserNumInfos = liveStreamUserNumInfos;
        return this;
    }
    public DescribeLiveStreamHistoryUserNumResponseLiveStreamUserNumInfos getLiveStreamUserNumInfos() {
        return this.liveStreamUserNumInfos;
    }

    public static class DescribeLiveStreamHistoryUserNumResponseLiveStreamUserNumInfosLiveStreamUserNumInfo extends TeaModel {
        @NameInMap("StreamTime")
        @Validation(required = true)
        public String streamTime;

        @NameInMap("UserNum")
        @Validation(required = true)
        public String userNum;

        public static DescribeLiveStreamHistoryUserNumResponseLiveStreamUserNumInfosLiveStreamUserNumInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamHistoryUserNumResponseLiveStreamUserNumInfosLiveStreamUserNumInfo self = new DescribeLiveStreamHistoryUserNumResponseLiveStreamUserNumInfosLiveStreamUserNumInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamHistoryUserNumResponseLiveStreamUserNumInfosLiveStreamUserNumInfo setStreamTime(String streamTime) {
            this.streamTime = streamTime;
            return this;
        }
        public String getStreamTime() {
            return this.streamTime;
        }

        public DescribeLiveStreamHistoryUserNumResponseLiveStreamUserNumInfosLiveStreamUserNumInfo setUserNum(String userNum) {
            this.userNum = userNum;
            return this;
        }
        public String getUserNum() {
            return this.userNum;
        }

    }

    public static class DescribeLiveStreamHistoryUserNumResponseLiveStreamUserNumInfos extends TeaModel {
        @NameInMap("LiveStreamUserNumInfo")
        @Validation(required = true)
        public java.util.List<DescribeLiveStreamHistoryUserNumResponseLiveStreamUserNumInfosLiveStreamUserNumInfo> liveStreamUserNumInfo;

        public static DescribeLiveStreamHistoryUserNumResponseLiveStreamUserNumInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamHistoryUserNumResponseLiveStreamUserNumInfos self = new DescribeLiveStreamHistoryUserNumResponseLiveStreamUserNumInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamHistoryUserNumResponseLiveStreamUserNumInfos setLiveStreamUserNumInfo(java.util.List<DescribeLiveStreamHistoryUserNumResponseLiveStreamUserNumInfosLiveStreamUserNumInfo> liveStreamUserNumInfo) {
            this.liveStreamUserNumInfo = liveStreamUserNumInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamHistoryUserNumResponseLiveStreamUserNumInfosLiveStreamUserNumInfo> getLiveStreamUserNumInfo() {
            return this.liveStreamUserNumInfo;
        }

    }

}
