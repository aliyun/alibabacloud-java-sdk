// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListContainerStatusResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<ListContainerStatusResponseBodyDataList> dataList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListContainerStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContainerStatusResponseBody self = new ListContainerStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContainerStatusResponseBody setDataList(java.util.List<ListContainerStatusResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListContainerStatusResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public ListContainerStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListContainerStatusResponseBodyDataListPlayerDetailList extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("IsInitiator")
        public Boolean isInitiator;

        @NameInMap("StartTime")
        public Long startTime;

        public static ListContainerStatusResponseBodyDataListPlayerDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListContainerStatusResponseBodyDataListPlayerDetailList self = new ListContainerStatusResponseBodyDataListPlayerDetailList();
            return TeaModel.build(map, self);
        }

        public ListContainerStatusResponseBodyDataListPlayerDetailList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListContainerStatusResponseBodyDataListPlayerDetailList setIsInitiator(Boolean isInitiator) {
            this.isInitiator = isInitiator;
            return this;
        }
        public Boolean getIsInitiator() {
            return this.isInitiator;
        }

        public ListContainerStatusResponseBodyDataListPlayerDetailList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListContainerStatusResponseBodyDataList extends TeaModel {
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
        public java.util.List<ListContainerStatusResponseBodyDataListPlayerDetailList> playerDetailList;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Tags")
        public String tags;

        // 系统时间戳
        @NameInMap("Timestamp")
        public Long timestamp;

        public static ListContainerStatusResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListContainerStatusResponseBodyDataList self = new ListContainerStatusResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListContainerStatusResponseBodyDataList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListContainerStatusResponseBodyDataList setContainerQuitTime(Long containerQuitTime) {
            this.containerQuitTime = containerQuitTime;
            return this;
        }
        public Long getContainerQuitTime() {
            return this.containerQuitTime;
        }

        public ListContainerStatusResponseBodyDataList setContainerStartTime(Long containerStartTime) {
            this.containerStartTime = containerStartTime;
            return this;
        }
        public Long getContainerStartTime() {
            return this.containerStartTime;
        }

        public ListContainerStatusResponseBodyDataList setContainerState(String containerState) {
            this.containerState = containerState;
            return this;
        }
        public String getContainerState() {
            return this.containerState;
        }

        public ListContainerStatusResponseBodyDataList setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public ListContainerStatusResponseBodyDataList setGameSessionId(String gameSessionId) {
            this.gameSessionId = gameSessionId;
            return this;
        }
        public String getGameSessionId() {
            return this.gameSessionId;
        }

        public ListContainerStatusResponseBodyDataList setPlayerDetailList(java.util.List<ListContainerStatusResponseBodyDataListPlayerDetailList> playerDetailList) {
            this.playerDetailList = playerDetailList;
            return this;
        }
        public java.util.List<ListContainerStatusResponseBodyDataListPlayerDetailList> getPlayerDetailList() {
            return this.playerDetailList;
        }

        public ListContainerStatusResponseBodyDataList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListContainerStatusResponseBodyDataList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public ListContainerStatusResponseBodyDataList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
