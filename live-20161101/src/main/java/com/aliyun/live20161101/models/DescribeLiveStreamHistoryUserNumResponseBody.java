// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamHistoryUserNumResponseBody extends TeaModel {
    @NameInMap("LiveStreamUserNumInfos")
    public DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfos liveStreamUserNumInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveStreamHistoryUserNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamHistoryUserNumResponseBody self = new DescribeLiveStreamHistoryUserNumResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamHistoryUserNumResponseBody setLiveStreamUserNumInfos(DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfos liveStreamUserNumInfos) {
        this.liveStreamUserNumInfos = liveStreamUserNumInfos;
        return this;
    }
    public DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfos getLiveStreamUserNumInfos() {
        return this.liveStreamUserNumInfos;
    }

    public DescribeLiveStreamHistoryUserNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfosLiveStreamUserNumInfo extends TeaModel {
        @NameInMap("UserNum")
        public String userNum;

        @NameInMap("StreamTime")
        public String streamTime;

        public static DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfosLiveStreamUserNumInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfosLiveStreamUserNumInfo self = new DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfosLiveStreamUserNumInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfosLiveStreamUserNumInfo setUserNum(String userNum) {
            this.userNum = userNum;
            return this;
        }
        public String getUserNum() {
            return this.userNum;
        }

        public DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfosLiveStreamUserNumInfo setStreamTime(String streamTime) {
            this.streamTime = streamTime;
            return this;
        }
        public String getStreamTime() {
            return this.streamTime;
        }

    }

    public static class DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfos extends TeaModel {
        @NameInMap("LiveStreamUserNumInfo")
        public java.util.List<DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfosLiveStreamUserNumInfo> liveStreamUserNumInfo;

        public static DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfos self = new DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfos setLiveStreamUserNumInfo(java.util.List<DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfosLiveStreamUserNumInfo> liveStreamUserNumInfo) {
            this.liveStreamUserNumInfo = liveStreamUserNumInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfosLiveStreamUserNumInfo> getLiveStreamUserNumInfo() {
            return this.liveStreamUserNumInfo;
        }

    }

}
