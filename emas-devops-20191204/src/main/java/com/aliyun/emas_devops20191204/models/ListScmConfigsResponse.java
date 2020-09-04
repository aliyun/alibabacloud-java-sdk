// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListScmConfigsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public java.util.List<ListScmConfigsResponseItems> items;

    public static ListScmConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScmConfigsResponse self = new ListScmConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListScmConfigsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScmConfigsResponse setItems(java.util.List<ListScmConfigsResponseItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListScmConfigsResponseItems> getItems() {
        return this.items;
    }

    public static class ListScmConfigsResponseItemsCreatorAccount extends TeaModel {
        @NameInMap("Uid")
        @Validation(required = true)
        public String uid;

        @NameInMap("Username")
        @Validation(required = true)
        public String username;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("Email")
        @Validation(required = true)
        public String email;

        public static ListScmConfigsResponseItemsCreatorAccount build(java.util.Map<String, ?> map) throws Exception {
            ListScmConfigsResponseItemsCreatorAccount self = new ListScmConfigsResponseItemsCreatorAccount();
            return TeaModel.build(map, self);
        }

        public ListScmConfigsResponseItemsCreatorAccount setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListScmConfigsResponseItemsCreatorAccount setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListScmConfigsResponseItemsCreatorAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListScmConfigsResponseItemsCreatorAccount setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

    public static class ListScmConfigsResponseItemsModifierAccount extends TeaModel {
        @NameInMap("Uid")
        @Validation(required = true)
        public String uid;

        @NameInMap("Username")
        @Validation(required = true)
        public String username;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("Email")
        @Validation(required = true)
        public String email;

        public static ListScmConfigsResponseItemsModifierAccount build(java.util.Map<String, ?> map) throws Exception {
            ListScmConfigsResponseItemsModifierAccount self = new ListScmConfigsResponseItemsModifierAccount();
            return TeaModel.build(map, self);
        }

        public ListScmConfigsResponseItemsModifierAccount setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListScmConfigsResponseItemsModifierAccount setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListScmConfigsResponseItemsModifierAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListScmConfigsResponseItemsModifierAccount setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

    public static class ListScmConfigsResponseItems extends TeaModel {
        @NameInMap("Bid")
        @Validation(required = true)
        public String bid;

        @NameInMap("RepoDomain")
        @Validation(required = true)
        public String repoDomain;

        @NameInMap("ProtocolType")
        @Validation(required = true)
        public String protocolType;

        @NameInMap("RepoType")
        @Validation(required = true)
        public String repoType;

        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("Token")
        @Validation(required = true)
        public String token;

        @NameInMap("RsaPub")
        @Validation(required = true)
        public String rsaPub;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("CreatorAccount")
        @Validation(required = true)
        public ListScmConfigsResponseItemsCreatorAccount creatorAccount;

        @NameInMap("ModifierAccount")
        @Validation(required = true)
        public ListScmConfigsResponseItemsModifierAccount modifierAccount;

        public static ListScmConfigsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            ListScmConfigsResponseItems self = new ListScmConfigsResponseItems();
            return TeaModel.build(map, self);
        }

        public ListScmConfigsResponseItems setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public ListScmConfigsResponseItems setRepoDomain(String repoDomain) {
            this.repoDomain = repoDomain;
            return this;
        }
        public String getRepoDomain() {
            return this.repoDomain;
        }

        public ListScmConfigsResponseItems setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public ListScmConfigsResponseItems setRepoType(String repoType) {
            this.repoType = repoType;
            return this;
        }
        public String getRepoType() {
            return this.repoType;
        }

        public ListScmConfigsResponseItems setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListScmConfigsResponseItems setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public ListScmConfigsResponseItems setRsaPub(String rsaPub) {
            this.rsaPub = rsaPub;
            return this;
        }
        public String getRsaPub() {
            return this.rsaPub;
        }

        public ListScmConfigsResponseItems setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListScmConfigsResponseItems setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListScmConfigsResponseItems setCreatorAccount(ListScmConfigsResponseItemsCreatorAccount creatorAccount) {
            this.creatorAccount = creatorAccount;
            return this;
        }
        public ListScmConfigsResponseItemsCreatorAccount getCreatorAccount() {
            return this.creatorAccount;
        }

        public ListScmConfigsResponseItems setModifierAccount(ListScmConfigsResponseItemsModifierAccount modifierAccount) {
            this.modifierAccount = modifierAccount;
            return this;
        }
        public ListScmConfigsResponseItemsModifierAccount getModifierAccount() {
            return this.modifierAccount;
        }

    }

}
