// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListRdUsersResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListRdUsersResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListRdUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRdUsersResponseBody self = new ListRdUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRdUsersResponseBody setData(java.util.List<ListRdUsersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListRdUsersResponseBodyData> getData() {
        return this.data;
    }

    public ListRdUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRdUsersResponseBodyData extends TeaModel {
        @NameInMap("DelegatedOrNot")
        public Boolean delegatedOrNot;

        @NameInMap("Joined")
        public Boolean joined;

        @NameInMap("JoinedTime")
        public String joinedTime;

        @NameInMap("MainUserId")
        public Long mainUserId;

        @NameInMap("SubUserId")
        public Long subUserId;

        @NameInMap("SubUserName")
        public String subUserName;

        public static ListRdUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRdUsersResponseBodyData self = new ListRdUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRdUsersResponseBodyData setDelegatedOrNot(Boolean delegatedOrNot) {
            this.delegatedOrNot = delegatedOrNot;
            return this;
        }
        public Boolean getDelegatedOrNot() {
            return this.delegatedOrNot;
        }

        public ListRdUsersResponseBodyData setJoined(Boolean joined) {
            this.joined = joined;
            return this;
        }
        public Boolean getJoined() {
            return this.joined;
        }

        public ListRdUsersResponseBodyData setJoinedTime(String joinedTime) {
            this.joinedTime = joinedTime;
            return this;
        }
        public String getJoinedTime() {
            return this.joinedTime;
        }

        public ListRdUsersResponseBodyData setMainUserId(Long mainUserId) {
            this.mainUserId = mainUserId;
            return this;
        }
        public Long getMainUserId() {
            return this.mainUserId;
        }

        public ListRdUsersResponseBodyData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

        public ListRdUsersResponseBodyData setSubUserName(String subUserName) {
            this.subUserName = subUserName;
            return this;
        }
        public String getSubUserName() {
            return this.subUserName;
        }

    }

}
