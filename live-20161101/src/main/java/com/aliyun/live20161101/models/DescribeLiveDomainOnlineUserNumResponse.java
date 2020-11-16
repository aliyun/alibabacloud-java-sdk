// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainOnlineUserNumResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StreamCount")
    @Validation(required = true)
    public Integer streamCount;

    @NameInMap("UserCount")
    @Validation(required = true)
    public Integer userCount;

    @NameInMap("OnlineUserInfo")
    @Validation(required = true)
    public DescribeLiveDomainOnlineUserNumResponseOnlineUserInfo onlineUserInfo;

    public static DescribeLiveDomainOnlineUserNumResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainOnlineUserNumResponse self = new DescribeLiveDomainOnlineUserNumResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainOnlineUserNumResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainOnlineUserNumResponse setStreamCount(Integer streamCount) {
        this.streamCount = streamCount;
        return this;
    }
    public Integer getStreamCount() {
        return this.streamCount;
    }

    public DescribeLiveDomainOnlineUserNumResponse setUserCount(Integer userCount) {
        this.userCount = userCount;
        return this;
    }
    public Integer getUserCount() {
        return this.userCount;
    }

    public DescribeLiveDomainOnlineUserNumResponse setOnlineUserInfo(DescribeLiveDomainOnlineUserNumResponseOnlineUserInfo onlineUserInfo) {
        this.onlineUserInfo = onlineUserInfo;
        return this;
    }
    public DescribeLiveDomainOnlineUserNumResponseOnlineUserInfo getOnlineUserInfo() {
        return this.onlineUserInfo;
    }

    public static class DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo extends TeaModel {
        @NameInMap("TranscodeTemplate")
        @Validation(required = true)
        public String transcodeTemplate;

        @NameInMap("UserNumber")
        @Validation(required = true)
        public Long userNumber;

        public static DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo self = new DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo setTranscodeTemplate(String transcodeTemplate) {
            this.transcodeTemplate = transcodeTemplate;
            return this;
        }
        public String getTranscodeTemplate() {
            return this.transcodeTemplate;
        }

        public DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo setUserNumber(Long userNumber) {
            this.userNumber = userNumber;
            return this;
        }
        public Long getUserNumber() {
            return this.userNumber;
        }

    }

    public static class DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfoInfos extends TeaModel {
        @NameInMap("Info")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo> info;

        public static DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfoInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfoInfos self = new DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfoInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfoInfos setInfo(java.util.List<DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfoInfosInfo> getInfo() {
            return this.info;
        }

    }

    public static class DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo extends TeaModel {
        @NameInMap("StreamName")
        @Validation(required = true)
        public String streamName;

        @NameInMap("Infos")
        @Validation(required = true)
        public DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfoInfos infos;

        public static DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo self = new DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo setInfos(DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfoInfos infos) {
            this.infos = infos;
            return this;
        }
        public DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfoInfos getInfos() {
            return this.infos;
        }

    }

    public static class DescribeLiveDomainOnlineUserNumResponseOnlineUserInfo extends TeaModel {
        @NameInMap("LiveStreamOnlineUserNumInfo")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo> liveStreamOnlineUserNumInfo;

        public static DescribeLiveDomainOnlineUserNumResponseOnlineUserInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainOnlineUserNumResponseOnlineUserInfo self = new DescribeLiveDomainOnlineUserNumResponseOnlineUserInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainOnlineUserNumResponseOnlineUserInfo setLiveStreamOnlineUserNumInfo(java.util.List<DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo> liveStreamOnlineUserNumInfo) {
            this.liveStreamOnlineUserNumInfo = liveStreamOnlineUserNumInfo;
            return this;
        }
        public java.util.List<DescribeLiveDomainOnlineUserNumResponseOnlineUserInfoLiveStreamOnlineUserNumInfo> getLiveStreamOnlineUserNumInfo() {
            return this.liveStreamOnlineUserNumInfo;
        }

    }

}
