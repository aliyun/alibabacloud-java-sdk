// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeIntentResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateUserId")
    public String createUserId;

    @NameInMap("CreateUserName")
    public String createUserName;

    @NameInMap("DialogId")
    public Long dialogId;

    @NameInMap("IntentId")
    public Long intentId;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("ModifyUserId")
    public String modifyUserId;

    @NameInMap("ModifyUserName")
    public String modifyUserName;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleCheck")
    public java.util.List<DescribeIntentResponseBodyRuleCheck> ruleCheck;

    @NameInMap("Slot")
    public java.util.List<DescribeIntentResponseBodySlot> slot;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserSay")
    public java.util.List<DescribeIntentResponseBodyUserSay> userSay;

    public static DescribeIntentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntentResponseBody self = new DescribeIntentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIntentResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeIntentResponseBody setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public DescribeIntentResponseBody setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public DescribeIntentResponseBody setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

    public DescribeIntentResponseBody setIntentId(Long intentId) {
        this.intentId = intentId;
        return this;
    }
    public Long getIntentId() {
        return this.intentId;
    }

    public DescribeIntentResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeIntentResponseBody setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
        return this;
    }
    public String getModifyUserId() {
        return this.modifyUserId;
    }

    public DescribeIntentResponseBody setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public DescribeIntentResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeIntentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIntentResponseBody setRuleCheck(java.util.List<DescribeIntentResponseBodyRuleCheck> ruleCheck) {
        this.ruleCheck = ruleCheck;
        return this;
    }
    public java.util.List<DescribeIntentResponseBodyRuleCheck> getRuleCheck() {
        return this.ruleCheck;
    }

    public DescribeIntentResponseBody setSlot(java.util.List<DescribeIntentResponseBodySlot> slot) {
        this.slot = slot;
        return this;
    }
    public java.util.List<DescribeIntentResponseBodySlot> getSlot() {
        return this.slot;
    }

    public DescribeIntentResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeIntentResponseBody setUserSay(java.util.List<DescribeIntentResponseBodyUserSay> userSay) {
        this.userSay = userSay;
        return this;
    }
    public java.util.List<DescribeIntentResponseBodyUserSay> getUserSay() {
        return this.userSay;
    }

    public static class DescribeIntentResponseBodyRuleCheck extends TeaModel {
        @NameInMap("Error")
        public java.util.List<String> error;

        @NameInMap("Strict")
        public Boolean strict;

        @NameInMap("Text")
        public String text;

        @NameInMap("Warning")
        public java.util.List<String> warning;

        public static DescribeIntentResponseBodyRuleCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeIntentResponseBodyRuleCheck self = new DescribeIntentResponseBodyRuleCheck();
            return TeaModel.build(map, self);
        }

        public DescribeIntentResponseBodyRuleCheck setError(java.util.List<String> error) {
            this.error = error;
            return this;
        }
        public java.util.List<String> getError() {
            return this.error;
        }

        public DescribeIntentResponseBodyRuleCheck setStrict(Boolean strict) {
            this.strict = strict;
            return this;
        }
        public Boolean getStrict() {
            return this.strict;
        }

        public DescribeIntentResponseBodyRuleCheck setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeIntentResponseBodyRuleCheck setWarning(java.util.List<String> warning) {
            this.warning = warning;
            return this;
        }
        public java.util.List<String> getWarning() {
            return this.warning;
        }

    }

    public static class DescribeIntentResponseBodySlotTags extends TeaModel {
        @NameInMap("UserSayId")
        public String userSayId;

        @NameInMap("Value")
        public String value;

        public static DescribeIntentResponseBodySlotTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeIntentResponseBodySlotTags self = new DescribeIntentResponseBodySlotTags();
            return TeaModel.build(map, self);
        }

        public DescribeIntentResponseBodySlotTags setUserSayId(String userSayId) {
            this.userSayId = userSayId;
            return this;
        }
        public String getUserSayId() {
            return this.userSayId;
        }

        public DescribeIntentResponseBodySlotTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeIntentResponseBodySlot extends TeaModel {
        @NameInMap("IsArray")
        public Boolean isArray;

        @NameInMap("IsNecessary")
        public Boolean isNecessary;

        @NameInMap("LifeSpan")
        public Integer lifeSpan;

        @NameInMap("Name")
        public String name;

        @NameInMap("Question")
        public java.util.List<String> question;

        @NameInMap("SlotId")
        public String slotId;

        @NameInMap("Tags")
        public java.util.List<DescribeIntentResponseBodySlotTags> tags;

        @NameInMap("Value")
        public String value;

        public static DescribeIntentResponseBodySlot build(java.util.Map<String, ?> map) throws Exception {
            DescribeIntentResponseBodySlot self = new DescribeIntentResponseBodySlot();
            return TeaModel.build(map, self);
        }

        public DescribeIntentResponseBodySlot setIsArray(Boolean isArray) {
            this.isArray = isArray;
            return this;
        }
        public Boolean getIsArray() {
            return this.isArray;
        }

        public DescribeIntentResponseBodySlot setIsNecessary(Boolean isNecessary) {
            this.isNecessary = isNecessary;
            return this;
        }
        public Boolean getIsNecessary() {
            return this.isNecessary;
        }

        public DescribeIntentResponseBodySlot setLifeSpan(Integer lifeSpan) {
            this.lifeSpan = lifeSpan;
            return this;
        }
        public Integer getLifeSpan() {
            return this.lifeSpan;
        }

        public DescribeIntentResponseBodySlot setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeIntentResponseBodySlot setQuestion(java.util.List<String> question) {
            this.question = question;
            return this;
        }
        public java.util.List<String> getQuestion() {
            return this.question;
        }

        public DescribeIntentResponseBodySlot setSlotId(String slotId) {
            this.slotId = slotId;
            return this;
        }
        public String getSlotId() {
            return this.slotId;
        }

        public DescribeIntentResponseBodySlot setTags(java.util.List<DescribeIntentResponseBodySlotTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeIntentResponseBodySlotTags> getTags() {
            return this.tags;
        }

        public DescribeIntentResponseBodySlot setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeIntentResponseBodyUserSayData extends TeaModel {
        @NameInMap("SlotId")
        public String slotId;

        @NameInMap("Text")
        public String text;

        public static DescribeIntentResponseBodyUserSayData build(java.util.Map<String, ?> map) throws Exception {
            DescribeIntentResponseBodyUserSayData self = new DescribeIntentResponseBodyUserSayData();
            return TeaModel.build(map, self);
        }

        public DescribeIntentResponseBodyUserSayData setSlotId(String slotId) {
            this.slotId = slotId;
            return this;
        }
        public String getSlotId() {
            return this.slotId;
        }

        public DescribeIntentResponseBodyUserSayData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class DescribeIntentResponseBodyUserSay extends TeaModel {
        @NameInMap("Data")
        public java.util.List<DescribeIntentResponseBodyUserSayData> data;

        @NameInMap("Strict")
        public Boolean strict;

        @NameInMap("UserSayId")
        public String userSayId;

        public static DescribeIntentResponseBodyUserSay build(java.util.Map<String, ?> map) throws Exception {
            DescribeIntentResponseBodyUserSay self = new DescribeIntentResponseBodyUserSay();
            return TeaModel.build(map, self);
        }

        public DescribeIntentResponseBodyUserSay setData(java.util.List<DescribeIntentResponseBodyUserSayData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeIntentResponseBodyUserSayData> getData() {
            return this.data;
        }

        public DescribeIntentResponseBodyUserSay setStrict(Boolean strict) {
            this.strict = strict;
            return this;
        }
        public Boolean getStrict() {
            return this.strict;
        }

        public DescribeIntentResponseBodyUserSay setUserSayId(String userSayId) {
            this.userSayId = userSayId;
            return this;
        }
        public String getUserSayId() {
            return this.userSayId;
        }

    }

}
