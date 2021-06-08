// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class BatchStopGameSessionsRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public String projectId;

    @NameInMap("GameId")
    public String gameId;

    @NameInMap("Token")
    public String token;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("TrackInfo")
    public String trackInfo;

    @NameInMap("Tags")
    public String tags;

    public static BatchStopGameSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchStopGameSessionsRequest self = new BatchStopGameSessionsRequest();
        return TeaModel.build(map, self);
    }

    public BatchStopGameSessionsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public BatchStopGameSessionsRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public BatchStopGameSessionsRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public BatchStopGameSessionsRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public BatchStopGameSessionsRequest setTrackInfo(String trackInfo) {
        this.trackInfo = trackInfo;
        return this;
    }
    public String getTrackInfo() {
        return this.trackInfo;
    }

    public BatchStopGameSessionsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
