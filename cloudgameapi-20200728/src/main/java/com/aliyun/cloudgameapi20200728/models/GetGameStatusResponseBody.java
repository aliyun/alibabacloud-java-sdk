// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetGameStatusResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetGameStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGameStatusResponseBody self = new GetGameStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGameStatusResponseBody setData(GetGameStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGameStatusResponseBodyData getData() {
        return this.data;
    }

    public GetGameStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGameStatusResponseBodyDataPlayingUsers extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("StartPlayTime")
        public Long startPlayTime;

        public static GetGameStatusResponseBodyDataPlayingUsers build(java.util.Map<String, ?> map) throws Exception {
            GetGameStatusResponseBodyDataPlayingUsers self = new GetGameStatusResponseBodyDataPlayingUsers();
            return TeaModel.build(map, self);
        }

        public GetGameStatusResponseBodyDataPlayingUsers setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetGameStatusResponseBodyDataPlayingUsers setStartPlayTime(Long startPlayTime) {
            this.startPlayTime = startPlayTime;
            return this;
        }
        public Long getStartPlayTime() {
            return this.startPlayTime;
        }

    }

    public static class GetGameStatusResponseBodyData extends TeaModel {
        @NameInMap("GameId")
        public String gameId;

        @NameInMap("GameSession")
        public String gameSession;

        @NameInMap("GameStartAt")
        public Long gameStartAt;

        @NameInMap("PlayingCount")
        public Integer playingCount;

        @NameInMap("PlayingUsers")
        public java.util.List<GetGameStatusResponseBodyDataPlayingUsers> playingUsers;

        public static GetGameStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGameStatusResponseBodyData self = new GetGameStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGameStatusResponseBodyData setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public GetGameStatusResponseBodyData setGameSession(String gameSession) {
            this.gameSession = gameSession;
            return this;
        }
        public String getGameSession() {
            return this.gameSession;
        }

        public GetGameStatusResponseBodyData setGameStartAt(Long gameStartAt) {
            this.gameStartAt = gameStartAt;
            return this;
        }
        public Long getGameStartAt() {
            return this.gameStartAt;
        }

        public GetGameStatusResponseBodyData setPlayingCount(Integer playingCount) {
            this.playingCount = playingCount;
            return this;
        }
        public Integer getPlayingCount() {
            return this.playingCount;
        }

        public GetGameStatusResponseBodyData setPlayingUsers(java.util.List<GetGameStatusResponseBodyDataPlayingUsers> playingUsers) {
            this.playingUsers = playingUsers;
            return this;
        }
        public java.util.List<GetGameStatusResponseBodyDataPlayingUsers> getPlayingUsers() {
            return this.playingUsers;
        }

    }

}
