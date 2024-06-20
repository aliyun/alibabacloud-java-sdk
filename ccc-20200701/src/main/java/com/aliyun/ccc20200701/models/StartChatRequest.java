// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartChatRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cf584733-<em><strong>-</strong></em>-9699-cb77aa3b7aa6</p>
     */
    @NameInMap("AccessChannelId")
    public String accessChannelId;

    /**
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>9XYGTGWtq2wFi_Bpg7aUnIoYi_vG_rO3bjEn0YtsxbHRHrYHlz1LDBLJAyZcLxieRQR4h_6AnWvTjJeNU5jg************Hwej7WgWrmA=</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserList")
    public java.util.List<StartChatRequestUserList> userList;

    public static StartChatRequest build(java.util.Map<String, ?> map) throws Exception {
        StartChatRequest self = new StartChatRequest();
        return TeaModel.build(map, self);
    }

    public StartChatRequest setAccessChannelId(String accessChannelId) {
        this.accessChannelId = accessChannelId;
        return this;
    }
    public String getAccessChannelId() {
        return this.accessChannelId;
    }

    public StartChatRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartChatRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public StartChatRequest setUserList(java.util.List<StartChatRequestUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<StartChatRequestUserList> getUserList() {
        return this.userList;
    }

    public static class StartChatRequestUserList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx.com/image">http://xxx.com/image</a></p>
         */
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Nickname")
        public String nickname;

        /**
         * <strong>example:</strong>
         * <p>fcd020fe-d8e4-40e5-8c77-1a272a174a7d</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>CUSTOMER</p>
         */
        @NameInMap("UserType")
        public String userType;

        public static StartChatRequestUserList build(java.util.Map<String, ?> map) throws Exception {
            StartChatRequestUserList self = new StartChatRequestUserList();
            return TeaModel.build(map, self);
        }

        public StartChatRequestUserList setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public StartChatRequestUserList setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public StartChatRequestUserList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public StartChatRequestUserList setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
