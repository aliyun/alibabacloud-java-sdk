// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainOnlineUserNumResponseBody extends TeaModel {
    @NameInMap("StreamCount")
    public Integer streamCount;

    @NameInMap("OnlineUserInfo")
    public DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfo onlineUserInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserCount")
    public Integer userCount;

    public static DescribeLiveDomainOnlineUserNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainOnlineUserNumResponseBody self = new DescribeLiveDomainOnlineUserNumResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainOnlineUserNumResponseBody setStreamCount(Integer streamCount) {
        this.streamCount = streamCount;
        return this;
    }
    public Integer getStreamCount() {
        return this.streamCount;
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

    public DescribeLiveDomainOnlineUserNumResponseBody setUserCount(Integer userCount) {
        this.userCount = userCount;
        return this;
    }
    public Integer getUserCount() {
        return this.userCount;
    }

    public static class DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo extends TeaModel {
        @NameInMap("TranscodeTemplate")
        public String transcodeTemplate;

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
        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("Infos")
        public DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos infos;

        public static DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo self = new DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfo setInfos(DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos infos) {
            this.infos = infos;
            return this;
        }
        public DescribeLiveDomainOnlineUserNumResponseBodyOnlineUserInfoLiveStreamOnlineUserNumInfoInfos getInfos() {
            return this.infos;
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
