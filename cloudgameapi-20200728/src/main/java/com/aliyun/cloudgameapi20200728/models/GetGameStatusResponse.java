// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetGameStatusResponseData data;

    public static GetGameStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGameStatusResponse self = new GetGameStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetGameStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGameStatusResponse setData(GetGameStatusResponseData data) {
        this.data = data;
        return this;
    }
    public GetGameStatusResponseData getData() {
        return this.data;
    }

    public static class GetGameStatusResponseDataPlayingUsers extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("StartPlayTime")
        @Validation(required = true)
        public Long startPlayTime;

        public static GetGameStatusResponseDataPlayingUsers build(java.util.Map<String, ?> map) throws Exception {
            GetGameStatusResponseDataPlayingUsers self = new GetGameStatusResponseDataPlayingUsers();
            return TeaModel.build(map, self);
        }

        public GetGameStatusResponseDataPlayingUsers setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetGameStatusResponseDataPlayingUsers setStartPlayTime(Long startPlayTime) {
            this.startPlayTime = startPlayTime;
            return this;
        }
        public Long getStartPlayTime() {
            return this.startPlayTime;
        }

    }

    public static class GetGameStatusResponseData extends TeaModel {
        @NameInMap("GameId")
        @Validation(required = true)
        public String gameId;

        @NameInMap("GameSession")
        @Validation(required = true)
        public String gameSession;

        @NameInMap("GameStartAt")
        @Validation(required = true)
        public Long gameStartAt;

        @NameInMap("PlayingCount")
        @Validation(required = true)
        public Integer playingCount;

        @NameInMap("PlayingUsers")
        @Validation(required = true)
        public java.util.List<GetGameStatusResponseDataPlayingUsers> playingUsers;

        public static GetGameStatusResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetGameStatusResponseData self = new GetGameStatusResponseData();
            return TeaModel.build(map, self);
        }

        public GetGameStatusResponseData setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public GetGameStatusResponseData setGameSession(String gameSession) {
            this.gameSession = gameSession;
            return this;
        }
        public String getGameSession() {
            return this.gameSession;
        }

        public GetGameStatusResponseData setGameStartAt(Long gameStartAt) {
            this.gameStartAt = gameStartAt;
            return this;
        }
        public Long getGameStartAt() {
            return this.gameStartAt;
        }

        public GetGameStatusResponseData setPlayingCount(Integer playingCount) {
            this.playingCount = playingCount;
            return this;
        }
        public Integer getPlayingCount() {
            return this.playingCount;
        }

        public GetGameStatusResponseData setPlayingUsers(java.util.List<GetGameStatusResponseDataPlayingUsers> playingUsers) {
            this.playingUsers = playingUsers;
            return this;
        }
        public java.util.List<GetGameStatusResponseDataPlayingUsers> getPlayingUsers() {
            return this.playingUsers;
        }

    }

}
