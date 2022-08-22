// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetConferenceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetConferenceResponseBodyResult result;

    public static GetConferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConferenceResponseBody self = new GetConferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConferenceResponseBody setResult(GetConferenceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetConferenceResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetConferenceResponseBodyResult extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("ConferenceId")
        public String conferenceId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("PlaybackUrl")
        public String playbackUrl;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("UserId")
        public String userId;

        public static GetConferenceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetConferenceResponseBodyResult self = new GetConferenceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetConferenceResponseBodyResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetConferenceResponseBodyResult setConferenceId(String conferenceId) {
            this.conferenceId = conferenceId;
            return this;
        }
        public String getConferenceId() {
            return this.conferenceId;
        }

        public GetConferenceResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetConferenceResponseBodyResult setPlaybackUrl(String playbackUrl) {
            this.playbackUrl = playbackUrl;
            return this;
        }
        public String getPlaybackUrl() {
            return this.playbackUrl;
        }

        public GetConferenceResponseBodyResult setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public GetConferenceResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetConferenceResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetConferenceResponseBodyResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
