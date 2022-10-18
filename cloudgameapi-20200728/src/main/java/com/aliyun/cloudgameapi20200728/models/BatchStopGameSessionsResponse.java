// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class BatchStopGameSessionsResponse extends TeaModel {
    @NameInMap("GameId")
    @Validation(required = true)
    public String gameId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public String projectId;

    @NameInMap("QueueState")
    @Validation(required = true)
    public Integer queueState;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TrackInfo")
    @Validation(required = true)
    public String trackInfo;

    public static BatchStopGameSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStopGameSessionsResponse self = new BatchStopGameSessionsResponse();
        return TeaModel.build(map, self);
    }

    public BatchStopGameSessionsResponse setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public BatchStopGameSessionsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchStopGameSessionsResponse setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public BatchStopGameSessionsResponse setQueueState(Integer queueState) {
        this.queueState = queueState;
        return this;
    }
    public Integer getQueueState() {
        return this.queueState;
    }

    public BatchStopGameSessionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchStopGameSessionsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchStopGameSessionsResponse setTrackInfo(String trackInfo) {
        this.trackInfo = trackInfo;
        return this;
    }
    public String getTrackInfo() {
        return this.trackInfo;
    }

}
