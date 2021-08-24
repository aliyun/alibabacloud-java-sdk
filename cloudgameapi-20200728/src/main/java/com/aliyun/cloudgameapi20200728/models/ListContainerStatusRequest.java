// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListContainerStatusRequest extends TeaModel {
    @NameInMap("GameSessionIdList")
    @Validation(required = true)
    public java.util.List<ListContainerStatusRequestGameSessionIdList> gameSessionIdList;

    public static ListContainerStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContainerStatusRequest self = new ListContainerStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListContainerStatusRequest setGameSessionIdList(java.util.List<ListContainerStatusRequestGameSessionIdList> gameSessionIdList) {
        this.gameSessionIdList = gameSessionIdList;
        return this;
    }
    public java.util.List<ListContainerStatusRequestGameSessionIdList> getGameSessionIdList() {
        return this.gameSessionIdList;
    }

    public static class ListContainerStatusRequestGameSessionIdList extends TeaModel {
        @NameInMap("GameSessionId")
        @Validation(required = true)
        public String gameSessionId;

        public static ListContainerStatusRequestGameSessionIdList build(java.util.Map<String, ?> map) throws Exception {
            ListContainerStatusRequestGameSessionIdList self = new ListContainerStatusRequestGameSessionIdList();
            return TeaModel.build(map, self);
        }

        public ListContainerStatusRequestGameSessionIdList setGameSessionId(String gameSessionId) {
            this.gameSessionId = gameSessionId;
            return this;
        }
        public String getGameSessionId() {
            return this.gameSessionId;
        }

    }

}
