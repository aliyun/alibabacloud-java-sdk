// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListHistoryContainerStatusResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<ListHistoryContainerStatusResponseBodyDataList> dataList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListHistoryContainerStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHistoryContainerStatusResponseBody self = new ListHistoryContainerStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHistoryContainerStatusResponseBody setDataList(java.util.List<ListHistoryContainerStatusResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListHistoryContainerStatusResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public ListHistoryContainerStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHistoryContainerStatusResponseBodyDataListPlayerDetailList extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("IsInitiator")
        public Boolean isInitiator;

        @NameInMap("StartTime")
        public Long startTime;

        public static ListHistoryContainerStatusResponseBodyDataListPlayerDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListHistoryContainerStatusResponseBodyDataListPlayerDetailList self = new ListHistoryContainerStatusResponseBodyDataListPlayerDetailList();
            return TeaModel.build(map, self);
        }

        public ListHistoryContainerStatusResponseBodyDataListPlayerDetailList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListHistoryContainerStatusResponseBodyDataListPlayerDetailList setIsInitiator(Boolean isInitiator) {
            this.isInitiator = isInitiator;
            return this;
        }
        public Boolean getIsInitiator() {
            return this.isInitiator;
        }

        public ListHistoryContainerStatusResponseBodyDataListPlayerDetailList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListHistoryContainerStatusResponseBodyDataList extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("ContainerQuitTime")
        public Long containerQuitTime;

        @NameInMap("ContainerStartTime")
        public Long containerStartTime;

        @NameInMap("ContainerState")
        public String containerState;

        @NameInMap("GameId")
        public String gameId;

        @NameInMap("GameSessionId")
        public String gameSessionId;

        @NameInMap("PlayerDetailList")
        public java.util.List<ListHistoryContainerStatusResponseBodyDataListPlayerDetailList> playerDetailList;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static ListHistoryContainerStatusResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListHistoryContainerStatusResponseBodyDataList self = new ListHistoryContainerStatusResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListHistoryContainerStatusResponseBodyDataList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListHistoryContainerStatusResponseBodyDataList setContainerQuitTime(Long containerQuitTime) {
            this.containerQuitTime = containerQuitTime;
            return this;
        }
        public Long getContainerQuitTime() {
            return this.containerQuitTime;
        }

        public ListHistoryContainerStatusResponseBodyDataList setContainerStartTime(Long containerStartTime) {
            this.containerStartTime = containerStartTime;
            return this;
        }
        public Long getContainerStartTime() {
            return this.containerStartTime;
        }

        public ListHistoryContainerStatusResponseBodyDataList setContainerState(String containerState) {
            this.containerState = containerState;
            return this;
        }
        public String getContainerState() {
            return this.containerState;
        }

        public ListHistoryContainerStatusResponseBodyDataList setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public ListHistoryContainerStatusResponseBodyDataList setGameSessionId(String gameSessionId) {
            this.gameSessionId = gameSessionId;
            return this;
        }
        public String getGameSessionId() {
            return this.gameSessionId;
        }

        public ListHistoryContainerStatusResponseBodyDataList setPlayerDetailList(java.util.List<ListHistoryContainerStatusResponseBodyDataListPlayerDetailList> playerDetailList) {
            this.playerDetailList = playerDetailList;
            return this;
        }
        public java.util.List<ListHistoryContainerStatusResponseBodyDataListPlayerDetailList> getPlayerDetailList() {
            return this.playerDetailList;
        }

        public ListHistoryContainerStatusResponseBodyDataList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListHistoryContainerStatusResponseBodyDataList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public ListHistoryContainerStatusResponseBodyDataList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
