// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListIntentResponseBody extends TeaModel {
    @NameInMap("Intents")
    public java.util.List<ListIntentResponseBodyIntents> intents;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListIntentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntentResponseBody self = new ListIntentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntentResponseBody setIntents(java.util.List<ListIntentResponseBodyIntents> intents) {
        this.intents = intents;
        return this;
    }
    public java.util.List<ListIntentResponseBodyIntents> getIntents() {
        return this.intents;
    }

    public ListIntentResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIntentResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIntentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIntentResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListIntentResponseBodyIntentsSlotInfos extends TeaModel {
        // 是否数组
        @NameInMap("Array")
        public Boolean array;

        // 是否敏感
        @NameInMap("Encrypt")
        public Boolean encrypt;

        // 是否交互式收集
        @NameInMap("Interactive")
        public Boolean interactive;

        // 槽位名
        @NameInMap("Name")
        public String name;

        // 槽位ID
        @NameInMap("SlotId")
        public String slotId;

        // 槽位值（实体名）
        @NameInMap("Value")
        public String value;

        public static ListIntentResponseBodyIntentsSlotInfos build(java.util.Map<String, ?> map) throws Exception {
            ListIntentResponseBodyIntentsSlotInfos self = new ListIntentResponseBodyIntentsSlotInfos();
            return TeaModel.build(map, self);
        }

        public ListIntentResponseBodyIntentsSlotInfos setArray(Boolean array) {
            this.array = array;
            return this;
        }
        public Boolean getArray() {
            return this.array;
        }

        public ListIntentResponseBodyIntentsSlotInfos setEncrypt(Boolean encrypt) {
            this.encrypt = encrypt;
            return this;
        }
        public Boolean getEncrypt() {
            return this.encrypt;
        }

        public ListIntentResponseBodyIntentsSlotInfos setInteractive(Boolean interactive) {
            this.interactive = interactive;
            return this;
        }
        public Boolean getInteractive() {
            return this.interactive;
        }

        public ListIntentResponseBodyIntentsSlotInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIntentResponseBodyIntentsSlotInfos setSlotId(String slotId) {
            this.slotId = slotId;
            return this;
        }
        public String getSlotId() {
            return this.slotId;
        }

        public ListIntentResponseBodyIntentsSlotInfos setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListIntentResponseBodyIntents extends TeaModel {
        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateUserId")
        public String createUserId;

        @NameInMap("CreateUserName")
        public String createUserName;

        @NameInMap("IntentId")
        public Long intentId;

        @NameInMap("IntentName")
        public String intentName;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("ModifyUserId")
        public String modifyUserId;

        @NameInMap("ModifyUserName")
        public String modifyUserName;

        @NameInMap("SlotInfos")
        public java.util.List<ListIntentResponseBodyIntentsSlotInfos> slotInfos;

        public static ListIntentResponseBodyIntents build(java.util.Map<String, ?> map) throws Exception {
            ListIntentResponseBodyIntents self = new ListIntentResponseBodyIntents();
            return TeaModel.build(map, self);
        }

        public ListIntentResponseBodyIntents setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public ListIntentResponseBodyIntents setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIntentResponseBodyIntents setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListIntentResponseBodyIntents setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public ListIntentResponseBodyIntents setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

        public ListIntentResponseBodyIntents setIntentName(String intentName) {
            this.intentName = intentName;
            return this;
        }
        public String getIntentName() {
            return this.intentName;
        }

        public ListIntentResponseBodyIntents setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListIntentResponseBodyIntents setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public ListIntentResponseBodyIntents setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        public ListIntentResponseBodyIntents setSlotInfos(java.util.List<ListIntentResponseBodyIntentsSlotInfos> slotInfos) {
            this.slotInfos = slotInfos;
            return this;
        }
        public java.util.List<ListIntentResponseBodyIntentsSlotInfos> getSlotInfos() {
            return this.slotInfos;
        }

    }

}
