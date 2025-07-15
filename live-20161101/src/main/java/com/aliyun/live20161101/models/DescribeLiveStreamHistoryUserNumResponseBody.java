// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamHistoryUserNumResponseBody extends TeaModel {
    /**
     * <p>The number of historical online users for the live stream.</p>
     */
    @NameInMap("LiveStreamUserNumInfos")
    public DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfos liveStreamUserNumInfos;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F5FF8</p>
     */
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
        /**
         * <p>The time when the stream started. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-10-20T06:20:00Z</p>
         */
        @NameInMap("StreamTime")
        public String streamTime;

        /**
         * <p>The number of users at the current point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserNum")
        public String userNum;

        public static DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfosLiveStreamUserNumInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfosLiveStreamUserNumInfo self = new DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfosLiveStreamUserNumInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfosLiveStreamUserNumInfo setStreamTime(String streamTime) {
            this.streamTime = streamTime;
            return this;
        }
        public String getStreamTime() {
            return this.streamTime;
        }

        public DescribeLiveStreamHistoryUserNumResponseBodyLiveStreamUserNumInfosLiveStreamUserNumInfo setUserNum(String userNum) {
            this.userNum = userNum;
            return this;
        }
        public String getUserNum() {
            return this.userNum;
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
