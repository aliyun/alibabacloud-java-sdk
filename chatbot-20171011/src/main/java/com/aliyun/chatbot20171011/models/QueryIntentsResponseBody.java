// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryIntentsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Intents")
    public java.util.List<QueryIntentsResponseBodyIntents> intents;

    public static QueryIntentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIntentsResponseBody self = new QueryIntentsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIntentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryIntentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIntentsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryIntentsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryIntentsResponseBody setIntents(java.util.List<QueryIntentsResponseBodyIntents> intents) {
        this.intents = intents;
        return this;
    }
    public java.util.List<QueryIntentsResponseBodyIntents> getIntents() {
        return this.intents;
    }

    public static class QueryIntentsResponseBodyIntentsSlotTags extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("UserSayId")
        public String userSayId;

        public static QueryIntentsResponseBodyIntentsSlotTags build(java.util.Map<String, ?> map) throws Exception {
            QueryIntentsResponseBodyIntentsSlotTags self = new QueryIntentsResponseBodyIntentsSlotTags();
            return TeaModel.build(map, self);
        }

        public QueryIntentsResponseBodyIntentsSlotTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryIntentsResponseBodyIntentsSlotTags setUserSayId(String userSayId) {
            this.userSayId = userSayId;
            return this;
        }
        public String getUserSayId() {
            return this.userSayId;
        }

    }

    public static class QueryIntentsResponseBodyIntentsSlot extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("LifeSpan")
        public Integer lifeSpan;

        @NameInMap("SlotId")
        public String slotId;

        @NameInMap("IsNecessary")
        public Boolean isNecessary;

        @NameInMap("IsArray")
        public Boolean isArray;

        @NameInMap("Tags")
        public java.util.List<QueryIntentsResponseBodyIntentsSlotTags> tags;

        @NameInMap("Question")
        public java.util.List<String> question;

        @NameInMap("Name")
        public String name;

        public static QueryIntentsResponseBodyIntentsSlot build(java.util.Map<String, ?> map) throws Exception {
            QueryIntentsResponseBodyIntentsSlot self = new QueryIntentsResponseBodyIntentsSlot();
            return TeaModel.build(map, self);
        }

        public QueryIntentsResponseBodyIntentsSlot setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryIntentsResponseBodyIntentsSlot setLifeSpan(Integer lifeSpan) {
            this.lifeSpan = lifeSpan;
            return this;
        }
        public Integer getLifeSpan() {
            return this.lifeSpan;
        }

        public QueryIntentsResponseBodyIntentsSlot setSlotId(String slotId) {
            this.slotId = slotId;
            return this;
        }
        public String getSlotId() {
            return this.slotId;
        }

        public QueryIntentsResponseBodyIntentsSlot setIsNecessary(Boolean isNecessary) {
            this.isNecessary = isNecessary;
            return this;
        }
        public Boolean getIsNecessary() {
            return this.isNecessary;
        }

        public QueryIntentsResponseBodyIntentsSlot setIsArray(Boolean isArray) {
            this.isArray = isArray;
            return this;
        }
        public Boolean getIsArray() {
            return this.isArray;
        }

        public QueryIntentsResponseBodyIntentsSlot setTags(java.util.List<QueryIntentsResponseBodyIntentsSlotTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<QueryIntentsResponseBodyIntentsSlotTags> getTags() {
            return this.tags;
        }

        public QueryIntentsResponseBodyIntentsSlot setQuestion(java.util.List<String> question) {
            this.question = question;
            return this;
        }
        public java.util.List<String> getQuestion() {
            return this.question;
        }

        public QueryIntentsResponseBodyIntentsSlot setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryIntentsResponseBodyIntentsUserSayData extends TeaModel {
        @NameInMap("SlotId")
        public String slotId;

        @NameInMap("Text")
        public String text;

        public static QueryIntentsResponseBodyIntentsUserSayData build(java.util.Map<String, ?> map) throws Exception {
            QueryIntentsResponseBodyIntentsUserSayData self = new QueryIntentsResponseBodyIntentsUserSayData();
            return TeaModel.build(map, self);
        }

        public QueryIntentsResponseBodyIntentsUserSayData setSlotId(String slotId) {
            this.slotId = slotId;
            return this;
        }
        public String getSlotId() {
            return this.slotId;
        }

        public QueryIntentsResponseBodyIntentsUserSayData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryIntentsResponseBodyIntentsUserSay extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QueryIntentsResponseBodyIntentsUserSayData> data;

        @NameInMap("UserSayId")
        public String userSayId;

        @NameInMap("Strict")
        public Boolean strict;

        public static QueryIntentsResponseBodyIntentsUserSay build(java.util.Map<String, ?> map) throws Exception {
            QueryIntentsResponseBodyIntentsUserSay self = new QueryIntentsResponseBodyIntentsUserSay();
            return TeaModel.build(map, self);
        }

        public QueryIntentsResponseBodyIntentsUserSay setData(java.util.List<QueryIntentsResponseBodyIntentsUserSayData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryIntentsResponseBodyIntentsUserSayData> getData() {
            return this.data;
        }

        public QueryIntentsResponseBodyIntentsUserSay setUserSayId(String userSayId) {
            this.userSayId = userSayId;
            return this;
        }
        public String getUserSayId() {
            return this.userSayId;
        }

        public QueryIntentsResponseBodyIntentsUserSay setStrict(Boolean strict) {
            this.strict = strict;
            return this;
        }
        public Boolean getStrict() {
            return this.strict;
        }

    }

    public static class QueryIntentsResponseBodyIntentsRuleCheck extends TeaModel {
        @NameInMap("Error")
        public java.util.List<String> error;

        @NameInMap("Warning")
        public java.util.List<String> warning;

        @NameInMap("Text")
        public String text;

        @NameInMap("Strict")
        public Boolean strict;

        public static QueryIntentsResponseBodyIntentsRuleCheck build(java.util.Map<String, ?> map) throws Exception {
            QueryIntentsResponseBodyIntentsRuleCheck self = new QueryIntentsResponseBodyIntentsRuleCheck();
            return TeaModel.build(map, self);
        }

        public QueryIntentsResponseBodyIntentsRuleCheck setError(java.util.List<String> error) {
            this.error = error;
            return this;
        }
        public java.util.List<String> getError() {
            return this.error;
        }

        public QueryIntentsResponseBodyIntentsRuleCheck setWarning(java.util.List<String> warning) {
            this.warning = warning;
            return this;
        }
        public java.util.List<String> getWarning() {
            return this.warning;
        }

        public QueryIntentsResponseBodyIntentsRuleCheck setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryIntentsResponseBodyIntentsRuleCheck setStrict(Boolean strict) {
            this.strict = strict;
            return this;
        }
        public Boolean getStrict() {
            return this.strict;
        }

    }

    public static class QueryIntentsResponseBodyIntents extends TeaModel {
        @NameInMap("ModifyUserId")
        public String modifyUserId;

        @NameInMap("ModifyUserName")
        public String modifyUserName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateUserName")
        public String createUserName;

        @NameInMap("Slot")
        public java.util.List<QueryIntentsResponseBodyIntentsSlot> slot;

        @NameInMap("UserSay")
        public java.util.List<QueryIntentsResponseBodyIntentsUserSay> userSay;

        @NameInMap("Name")
        public String name;

        @NameInMap("RuleCheck")
        public java.util.List<QueryIntentsResponseBodyIntentsRuleCheck> ruleCheck;

        @NameInMap("CreateUserId")
        public String createUserId;

        @NameInMap("IntentId")
        public Long intentId;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static QueryIntentsResponseBodyIntents build(java.util.Map<String, ?> map) throws Exception {
            QueryIntentsResponseBodyIntents self = new QueryIntentsResponseBodyIntents();
            return TeaModel.build(map, self);
        }

        public QueryIntentsResponseBodyIntents setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public QueryIntentsResponseBodyIntents setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        public QueryIntentsResponseBodyIntents setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryIntentsResponseBodyIntents setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public QueryIntentsResponseBodyIntents setSlot(java.util.List<QueryIntentsResponseBodyIntentsSlot> slot) {
            this.slot = slot;
            return this;
        }
        public java.util.List<QueryIntentsResponseBodyIntentsSlot> getSlot() {
            return this.slot;
        }

        public QueryIntentsResponseBodyIntents setUserSay(java.util.List<QueryIntentsResponseBodyIntentsUserSay> userSay) {
            this.userSay = userSay;
            return this;
        }
        public java.util.List<QueryIntentsResponseBodyIntentsUserSay> getUserSay() {
            return this.userSay;
        }

        public QueryIntentsResponseBodyIntents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryIntentsResponseBodyIntents setRuleCheck(java.util.List<QueryIntentsResponseBodyIntentsRuleCheck> ruleCheck) {
            this.ruleCheck = ruleCheck;
            return this;
        }
        public java.util.List<QueryIntentsResponseBodyIntentsRuleCheck> getRuleCheck() {
            return this.ruleCheck;
        }

        public QueryIntentsResponseBodyIntents setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public QueryIntentsResponseBodyIntents setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

        public QueryIntentsResponseBodyIntents setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
