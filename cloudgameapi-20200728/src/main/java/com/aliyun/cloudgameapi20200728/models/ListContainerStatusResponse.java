// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListContainerStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DataList")
    @Validation(required = true)
    public java.util.List<ListContainerStatusResponseDataList> dataList;

    public static ListContainerStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContainerStatusResponse self = new ListContainerStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListContainerStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContainerStatusResponse setDataList(java.util.List<ListContainerStatusResponseDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListContainerStatusResponseDataList> getDataList() {
        return this.dataList;
    }

    public static class ListContainerStatusResponseDataListPlayerDetailList extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("IsInitiator")
        @Validation(required = true)
        public Boolean isInitiator;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        public static ListContainerStatusResponseDataListPlayerDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListContainerStatusResponseDataListPlayerDetailList self = new ListContainerStatusResponseDataListPlayerDetailList();
            return TeaModel.build(map, self);
        }

        public ListContainerStatusResponseDataListPlayerDetailList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListContainerStatusResponseDataListPlayerDetailList setIsInitiator(Boolean isInitiator) {
            this.isInitiator = isInitiator;
            return this;
        }
        public Boolean getIsInitiator() {
            return this.isInitiator;
        }

        public ListContainerStatusResponseDataListPlayerDetailList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListContainerStatusResponseDataList extends TeaModel {
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
        public java.util.List<ListContainerStatusResponseDataListPlayerDetailList> playerDetailList;

        public static ListContainerStatusResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            ListContainerStatusResponseDataList self = new ListContainerStatusResponseDataList();
            return TeaModel.build(map, self);
        }

        public ListContainerStatusResponseDataList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListContainerStatusResponseDataList setContainerQuitTime(Long containerQuitTime) {
            this.containerQuitTime = containerQuitTime;
            return this;
        }
        public Long getContainerQuitTime() {
            return this.containerQuitTime;
        }

        public ListContainerStatusResponseDataList setContainerStartTime(Long containerStartTime) {
            this.containerStartTime = containerStartTime;
            return this;
        }
        public Long getContainerStartTime() {
            return this.containerStartTime;
        }

        public ListContainerStatusResponseDataList setContainerState(String containerState) {
            this.containerState = containerState;
            return this;
        }
        public String getContainerState() {
            return this.containerState;
        }

        public ListContainerStatusResponseDataList setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public ListContainerStatusResponseDataList setGameSessionId(String gameSessionId) {
            this.gameSessionId = gameSessionId;
            return this;
        }
        public String getGameSessionId() {
            return this.gameSessionId;
        }

        public ListContainerStatusResponseDataList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListContainerStatusResponseDataList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListContainerStatusResponseDataList setResourceLevel(Integer resourceLevel) {
            this.resourceLevel = resourceLevel;
            return this;
        }
        public Integer getResourceLevel() {
            return this.resourceLevel;
        }

        public ListContainerStatusResponseDataList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public ListContainerStatusResponseDataList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListContainerStatusResponseDataList setPlayerDetailList(java.util.List<ListContainerStatusResponseDataListPlayerDetailList> playerDetailList) {
            this.playerDetailList = playerDetailList;
            return this;
        }
        public java.util.List<ListContainerStatusResponseDataListPlayerDetailList> getPlayerDetailList() {
            return this.playerDetailList;
        }

    }

}
