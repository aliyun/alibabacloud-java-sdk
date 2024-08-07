// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListRdUsersResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListRdUsersResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
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
        /**
         * <p>Indicates whether the account can be used to view the logs and alerts within the account.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DelegatedOrNot")
        public Boolean delegatedOrNot;

        /**
         * <p>Indicates whether the account is added to the threat analysis feature for centralized management. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Joined")
        public Boolean joined;

        /**
         * <p>The time when the account was added to the threat analysis feature.</p>
         * 
         * <strong>example:</strong>
         * <p>2013-10-01 00:00:00</p>
         */
        @NameInMap("JoinedTime")
        public String joinedTime;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to purchase the threat analysis feature.</p>
         * 
         * <strong>example:</strong>
         * <p>123XXXXXXXXX</p>
         */
        @NameInMap("MainUserId")
        public Long mainUserId;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to perform operations supported by the threat analysis feature.</p>
         * 
         * <strong>example:</strong>
         * <p>123XXXXXXXX</p>
         */
        @NameInMap("SubUserId")
        public Long subUserId;

        /**
         * <p>The username of the Alibaba Cloud account that can be used to perform operations supported by the threat analysis feature.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_account_xxx</p>
         */
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
