// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListHistoryContainerStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DataList")
    @Validation(required = true)
    public java.util.List<ListHistoryContainerStatusResponseDataList> dataList;

    public static ListHistoryContainerStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHistoryContainerStatusResponse self = new ListHistoryContainerStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListHistoryContainerStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHistoryContainerStatusResponse setDataList(java.util.List<ListHistoryContainerStatusResponseDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListHistoryContainerStatusResponseDataList> getDataList() {
        return this.dataList;
    }

    public static class ListHistoryContainerStatusResponseDataListPlayerDetailList extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("IsInitiator")
        @Validation(required = true)
        public Boolean isInitiator;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        public static ListHistoryContainerStatusResponseDataListPlayerDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListHistoryContainerStatusResponseDataListPlayerDetailList self = new ListHistoryContainerStatusResponseDataListPlayerDetailList();
            return TeaModel.build(map, self);
        }

        public ListHistoryContainerStatusResponseDataListPlayerDetailList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListHistoryContainerStatusResponseDataListPlayerDetailList setIsInitiator(Boolean isInitiator) {
            this.isInitiator = isInitiator;
            return this;
        }
        public Boolean getIsInitiator() {
            return this.isInitiator;
        }

        public ListHistoryContainerStatusResponseDataListPlayerDetailList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListHistoryContainerStatusResponseDataList extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("ContainerQuitTime")
        @Validation(required = true)
        public Long containerQuitTime;

        @NameInMap("ContainerStartTime")
        @Validation(required = true)
        public Long containerStartTime;

        @NameInMap("ContainerState")
        @Validation(required = true)
        public String containerState;

        @NameInMap("GameId")
        @Validation(required = true)
        public String gameId;

        @NameInMap("GameSessionId")
        @Validation(required = true)
        public String gameSessionId;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public String projectId;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("ResourceLevel")
        @Validation(required = true)
        public Integer resourceLevel;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public Long timestamp;

        @NameInMap("PlayerDetailList")
        @Validation(required = true)
        public java.util.List<ListHistoryContainerStatusResponseDataListPlayerDetailList> playerDetailList;

        public static ListHistoryContainerStatusResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            ListHistoryContainerStatusResponseDataList self = new ListHistoryContainerStatusResponseDataList();
            return TeaModel.build(map, self);
        }

        public ListHistoryContainerStatusResponseDataList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListHistoryContainerStatusResponseDataList setContainerQuitTime(Long containerQuitTime) {
            this.containerQuitTime = containerQuitTime;
            return this;
        }
        public Long getContainerQuitTime() {
            return this.containerQuitTime;
        }

        public ListHistoryContainerStatusResponseDataList setContainerStartTime(Long containerStartTime) {
            this.containerStartTime = containerStartTime;
            return this;
        }
        public Long getContainerStartTime() {
            return this.containerStartTime;
        }

        public ListHistoryContainerStatusResponseDataList setContainerState(String containerState) {
            this.containerState = containerState;
            return this;
        }
        public String getContainerState() {
            return this.containerState;
        }

        public ListHistoryContainerStatusResponseDataList setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public ListHistoryContainerStatusResponseDataList setGameSessionId(String gameSessionId) {
            this.gameSessionId = gameSessionId;
            return this;
        }
        public String getGameSessionId() {
            return this.gameSessionId;
        }

        public ListHistoryContainerStatusResponseDataList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListHistoryContainerStatusResponseDataList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListHistoryContainerStatusResponseDataList setResourceLevel(Integer resourceLevel) {
            this.resourceLevel = resourceLevel;
            return this;
        }
        public Integer getResourceLevel() {
            return this.resourceLevel;
        }

        public ListHistoryContainerStatusResponseDataList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public ListHistoryContainerStatusResponseDataList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListHistoryContainerStatusResponseDataList setPlayerDetailList(java.util.List<ListHistoryContainerStatusResponseDataListPlayerDetailList> playerDetailList) {
            this.playerDetailList = playerDetailList;
            return this;
        }
        public java.util.List<ListHistoryContainerStatusResponseDataListPlayerDetailList> getPlayerDetailList() {
            return this.playerDetailList;
        }

    }

}
