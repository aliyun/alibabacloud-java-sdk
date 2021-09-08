// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class BatchStopGameSessionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("QueueState")
    public Integer queueState;

    @NameInMap("Message")
    public String message;

    @NameInMap("GameId")
    public String gameId;

    @NameInMap("TrackInfo")
    public String trackInfo;

    public static BatchStopGameSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchStopGameSessionsResponseBody self = new BatchStopGameSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchStopGameSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchStopGameSessionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchStopGameSessionsResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public BatchStopGameSessionsResponseBody setQueueState(Integer queueState) {
        this.queueState = queueState;
        return this;
    }
    public Integer getQueueState() {
        return this.queueState;
    }

    public BatchStopGameSessionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchStopGameSessionsResponseBody setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public BatchStopGameSessionsResponseBody setTrackInfo(String trackInfo) {
        this.trackInfo = trackInfo;
        return this;
    }
    public String getTrackInfo() {
        return this.trackInfo;
    }

}
