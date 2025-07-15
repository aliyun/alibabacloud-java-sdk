// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainOnlineUserNumResponseBody extends TeaModel {
    /**
     * <p>The information about the streams.</p>
     */
    @NameInMap("OnlineUserInfo")
    public DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfo onlineUserInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3A3A8C3D-F8B2-4FBF-9319-771A11B855FA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of streams.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StreamCount")
    public Integer streamCount;

    /**
     * <p>The total number of online users at the specified point in time for all the live streams under the main streaming domain.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserCount")
    public Integer userCount;

    public static DescribeLiveDomainOnlineUserNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainOnlineUserNumResponseBody self = new DescribeLiveDomainOnlineUserNumResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainOnlineUserNumResponseBody setOnlineUserInfo(DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfo onlineUserInfo) {
        this.onlineUserInfo = onlineUserInfo;
        return this;
    }
    public DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfo getOnlineUserInfo() {
        return this.onlineUserInfo;
    }

    public DescribeLiveDomainOnlineUserNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainOnlineUserNumResponseBody setStreamCount(Integer streamCount) {
        this.streamCount = streamCount;
        return this;
    }
    public Integer getStreamCount() {
        return this.streamCount;
    }

    public DescribeLiveDomainOnlineUserNumResponseBody setUserCount(Integer userCount) {
        this.userCount = userCount;
        return this;
    }
    public Integer getUserCount() {
        return this.userCount;
    }

    public static class DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo extends TeaModel {
        /**
         * <p>The transcoding template. A value of origin indicates that the stream is a source stream.</p>
         * 
         * <strong>example:</strong>
         * <p>origin</p>
         */
        @NameInMap("TranscodeTemplate")
        public String transcodeTemplate;

        /**
         * <p>The number of online users for the stream, which can be a source stream or transcoded stream.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserNumber")
        public Long userNumber;

        public static DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo self = new DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo setTranscodeTemplate(String transcodeTemplate) {
            this.transcodeTemplate = transcodeTemplate;
            return this;
        }
        public String getTranscodeTemplate() {
            return this.transcodeTemplate;
        }

        public DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo setUserNumber(Long userNumber) {
            this.userNumber = userNumber;
            return this;
        }
        public Long getUserNumber() {
            return this.userNumber;
        }

    }

    public static class DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos extends TeaModel {
        @NameInMap("Info")
        public java.util.List<DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo> info;

        public static DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos self = new DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos setInfo(java.util.List<DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo> getInfo() {
            return this.info;
        }

    }

    public static class DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo extends TeaModel {
        /**
         * <p>The statistics on the stream.</p>
         */
        @NameInMap("Infos")
        public DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos infos;

        /**
         * <p>The name of the stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://example.com/test/liveStream****_3_1</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        public static DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo self = new DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo setInfos(DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos infos) {
            this.infos = infos;
            return this;
        }
        public DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos getInfos() {
            return this.infos;
        }

        public DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

    public static class DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfo extends TeaModel {
        @NameInMap("LiveStreamOnlineUserNumInfo")
        public java.util.List<DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo> liveStreamOnlineUserNumInfo;

        public static DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfo self = new DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfo setLiveStreamOnlineUserNumInfo(java.util.List<DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo> liveStreamOnlineUserNumInfo) {
            this.liveStreamOnlineUserNumInfo = liveStreamOnlineUserNumInfo;
            return this;
        }
        public java.util.List<DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo> getLiveStreamOnlineUserNumInfo() {
            return this.liveStreamOnlineUserNumInfo;
        }

    }

}
