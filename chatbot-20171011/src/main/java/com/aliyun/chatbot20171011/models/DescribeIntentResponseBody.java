// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeIntentResponseBody extends TeaModel {
    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DialogId")
    public Long dialogId;

    @NameInMap("CreateUserId")
    public String createUserId;

    @NameInMap("CreateUserName")
    public String createUserName;

    @NameInMap("Name")
    public String name;

    @NameInMap("IntentId")
    public Long intentId;

    @NameInMap("Type")
    public String type;

    @NameInMap("ModifyUserId")
    public String modifyUserId;

    @NameInMap("UserSay")
    public java.util.List<DescribeIntentResponseBodyUserSay> userSay;

    @NameInMap("ModifyUserName")
    public String modifyUserName;

    @NameInMap("Slot")
    public java.util.List<DescribeIntentResponseBodySlot> slot;

    @NameInMap("RuleCheck")
    public java.util.List<DescribeIntentResponseBodyRuleCheck> ruleCheck;

    public static DescribeIntentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntentResponseBody self = new DescribeIntentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIntentResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeIntentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIntentResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeIntentResponseBody setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
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

    public DescribeIntentResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeIntentResponseBody setIntentId(Long intentId) {
        this.intentId = intentId;
        return this;
    }
    public Long getIntentId() {
        return this.intentId;
    }

    public DescribeIntentResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeIntentResponseBody setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
        return this;
    }
    public String getModifyUserId() {
        return this.modifyUserId;
    }

    public DescribeIntentResponseBody setUserSay(java.util.List<DescribeIntentResponseBodyUserSay> userSay) {
        this.userSay = userSay;
        return this;
    }
    public java.util.List<DescribeIntentResponseBodyUserSay> getUserSay() {
        return this.userSay;
    }

    public DescribeIntentResponseBody setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public DescribeIntentResponseBody setSlot(java.util.List<DescribeIntentResponseBodySlot> slot) {
        this.slot = slot;
        return this;
    }
    public java.util.List<DescribeIntentResponseBodySlot> getSlot() {
        return this.slot;
    }

    public DescribeIntentResponseBody setRuleCheck(java.util.List<DescribeIntentResponseBodyRuleCheck> ruleCheck) {
        this.ruleCheck = ruleCheck;
        return this;
    }
    public java.util.List<DescribeIntentResponseBodyRuleCheck> getRuleCheck() {
        return this.ruleCheck;
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

        @NameInMap("UserSayId")
        public String userSayId;

        @NameInMap("Strict")
        public Boolean strict;

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

        public DescribeIntentResponseBodyUserSay setUserSayId(String userSayId) {
            this.userSayId = userSayId;
            return this;
        }
        public String getUserSayId() {
            return this.userSayId;
        }

        public DescribeIntentResponseBodyUserSay setStrict(Boolean strict) {
            this.strict = strict;
            return this;
        }
        public Boolean getStrict() {
            return this.strict;
        }

    }

    public static class DescribeIntentResponseBodySlotTags extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("UserSayId")
        public String userSayId;

        public static DescribeIntentResponseBodySlotTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeIntentResponseBodySlotTags self = new DescribeIntentResponseBodySlotTags();
            return TeaModel.build(map, self);
        }

        public DescribeIntentResponseBodySlotTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeIntentResponseBodySlotTags setUserSayId(String userSayId) {
            this.userSayId = userSayId;
            return this;
        }
        public String getUserSayId() {
            return this.userSayId;
        }

    }

    public static class DescribeIntentResponseBodySlot extends TeaModel {
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
        public java.util.List<DescribeIntentResponseBodySlotTags> tags;

        @NameInMap("Question")
        public java.util.List<String> question;

        @NameInMap("Name")
        public String name;

        public static DescribeIntentResponseBodySlot build(java.util.Map<String, ?> map) throws Exception {
            DescribeIntentResponseBodySlot self = new DescribeIntentResponseBodySlot();
            return TeaModel.build(map, self);
        }

        public DescribeIntentResponseBodySlot setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeIntentResponseBodySlot setLifeSpan(Integer lifeSpan) {
            this.lifeSpan = lifeSpan;
            return this;
        }
        public Integer getLifeSpan() {
            return this.lifeSpan;
        }

        public DescribeIntentResponseBodySlot setSlotId(String slotId) {
            this.slotId = slotId;
            return this;
        }
        public String getSlotId() {
            return this.slotId;
        }

        public DescribeIntentResponseBodySlot setIsNecessary(Boolean isNecessary) {
            this.isNecessary = isNecessary;
            return this;
        }
        public Boolean getIsNecessary() {
            return this.isNecessary;
        }

        public DescribeIntentResponseBodySlot setIsArray(Boolean isArray) {
            this.isArray = isArray;
            return this;
        }
        public Boolean getIsArray() {
            return this.isArray;
        }

        public DescribeIntentResponseBodySlot setTags(java.util.List<DescribeIntentResponseBodySlotTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeIntentResponseBodySlotTags> getTags() {
            return this.tags;
        }

        public DescribeIntentResponseBodySlot setQuestion(java.util.List<String> question) {
            this.question = question;
            return this;
        }
        public java.util.List<String> getQuestion() {
            return this.question;
        }

        public DescribeIntentResponseBodySlot setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeIntentResponseBodyRuleCheck extends TeaModel {
        @NameInMap("Error")
        public java.util.List<String> error;

        @NameInMap("Warning")
        public java.util.List<String> warning;

        @NameInMap("Text")
        public String text;

        @NameInMap("Strict")
        public Boolean strict;

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

        public DescribeIntentResponseBodyRuleCheck setWarning(java.util.List<String> warning) {
            this.warning = warning;
            return this;
        }
        public java.util.List<String> getWarning() {
            return this.warning;
        }

        public DescribeIntentResponseBodyRuleCheck setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeIntentResponseBodyRuleCheck setStrict(Boolean strict) {
            this.strict = strict;
            return this;
        }
        public Boolean getStrict() {
            return this.strict;
        }

    }

}
