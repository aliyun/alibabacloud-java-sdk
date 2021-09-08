// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListHistoryContainerStatusResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 容器状态信息集合
    @NameInMap("DataList")
    public java.util.List<ListHistoryContainerStatusResponseBodyDataList> dataList;

    public static ListHistoryContainerStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHistoryContainerStatusResponseBody self = new ListHistoryContainerStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHistoryContainerStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHistoryContainerStatusResponseBody setDataList(java.util.List<ListHistoryContainerStatusResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListHistoryContainerStatusResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public static class ListHistoryContainerStatusResponseBodyDataListPlayerDetailList extends TeaModel {
        // 账号ID
        @NameInMap("AccountId")
        public String accountId;

        // 玩家进入游戏时间
        @NameInMap("StartTime")
        public Long startTime;

        // 是否主机
        @NameInMap("IsInitiator")
        public Boolean isInitiator;

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

        public ListHistoryContainerStatusResponseBodyDataListPlayerDetailList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListHistoryContainerStatusResponseBodyDataListPlayerDetailList setIsInitiator(Boolean isInitiator) {
            this.isInitiator = isInitiator;
            return this;
        }
        public Boolean getIsInitiator() {
            return this.isInitiator;
        }

    }

    public static class ListHistoryContainerStatusResponseBodyDataList extends TeaModel {
        // 容器状态
        @NameInMap("ContainerState")
        public String containerState;

        // 容器启动时间（Linux时间戳，单位毫秒）
        @NameInMap("ContainerStartTime")
        public Long containerStartTime;

        // 项目ID
        @NameInMap("ProjectId")
        public String projectId;

        // 容器退出时间（Linux时间戳，单位毫秒）
        @NameInMap("ContainerQuitTime")
        public Long containerQuitTime;

        // 自定义标识
        @NameInMap("Tags")
        public String tags;

        // 主机账号ID
        @NameInMap("AccountId")
        public String accountId;

        // 游戏ID
        @NameInMap("GameId")
        public String gameId;

        // 游戏会话ID
        @NameInMap("GameSessionId")
        public String gameSessionId;

        // 玩家信息集合
        @NameInMap("PlayerDetailList")
        public java.util.List<ListHistoryContainerStatusResponseBodyDataListPlayerDetailList> playerDetailList;

        public static ListHistoryContainerStatusResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListHistoryContainerStatusResponseBodyDataList self = new ListHistoryContainerStatusResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListHistoryContainerStatusResponseBodyDataList setContainerState(String containerState) {
            this.containerState = containerState;
            return this;
        }
        public String getContainerState() {
            return this.containerState;
        }

        public ListHistoryContainerStatusResponseBodyDataList setContainerStartTime(Long containerStartTime) {
            this.containerStartTime = containerStartTime;
            return this;
        }
        public Long getContainerStartTime() {
            return this.containerStartTime;
        }

        public ListHistoryContainerStatusResponseBodyDataList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListHistoryContainerStatusResponseBodyDataList setContainerQuitTime(Long containerQuitTime) {
            this.containerQuitTime = containerQuitTime;
            return this;
        }
        public Long getContainerQuitTime() {
            return this.containerQuitTime;
        }

        public ListHistoryContainerStatusResponseBodyDataList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public ListHistoryContainerStatusResponseBodyDataList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
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

    }

}
