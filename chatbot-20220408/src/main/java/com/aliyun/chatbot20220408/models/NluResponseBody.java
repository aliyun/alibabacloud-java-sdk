// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class NluResponseBody extends TeaModel {
    // 本条语言理解应答消息的ID
    @NameInMap("MessageId")
    public String messageId;

    // 消息的列表
    @NameInMap("Messages")
    public java.util.List<NluResponseBodyMessages> messages;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    public static NluResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NluResponseBody self = new NluResponseBody();
        return TeaModel.build(map, self);
    }

    public NluResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public NluResponseBody setMessages(java.util.List<NluResponseBodyMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<NluResponseBodyMessages> getMessages() {
        return this.messages;
    }

    public NluResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class NluResponseBodyMessagesDialogHubNluInfoGlobalDictList extends TeaModel {
        // 名词
        @NameInMap("StandardWord")
        public String standardWord;

        // 同义词
        @NameInMap("Word")
        public String word;

        public static NluResponseBodyMessagesDialogHubNluInfoGlobalDictList build(java.util.Map<String, ?> map) throws Exception {
            NluResponseBodyMessagesDialogHubNluInfoGlobalDictList self = new NluResponseBodyMessagesDialogHubNluInfoGlobalDictList();
            return TeaModel.build(map, self);
        }

        public NluResponseBodyMessagesDialogHubNluInfoGlobalDictList setStandardWord(String standardWord) {
            this.standardWord = standardWord;
            return this;
        }
        public String getStandardWord() {
            return this.standardWord;
        }

        public NluResponseBodyMessagesDialogHubNluInfoGlobalDictList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class NluResponseBodyMessagesDialogHubNluInfoGlobalSensitiveWordList extends TeaModel {
        // 名词
        @NameInMap("StandardWord")
        public String standardWord;

        // 同义词
        @NameInMap("Word")
        public String word;

        public static NluResponseBodyMessagesDialogHubNluInfoGlobalSensitiveWordList build(java.util.Map<String, ?> map) throws Exception {
            NluResponseBodyMessagesDialogHubNluInfoGlobalSensitiveWordList self = new NluResponseBodyMessagesDialogHubNluInfoGlobalSensitiveWordList();
            return TeaModel.build(map, self);
        }

        public NluResponseBodyMessagesDialogHubNluInfoGlobalSensitiveWordList setStandardWord(String standardWord) {
            this.standardWord = standardWord;
            return this;
        }
        public String getStandardWord() {
            return this.standardWord;
        }

        public NluResponseBodyMessagesDialogHubNluInfoGlobalSensitiveWordList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class NluResponseBodyMessagesDialogHubNluInfo extends TeaModel {
        // 全局名词列表
        @NameInMap("GlobalDictList")
        public java.util.List<NluResponseBodyMessagesDialogHubNluInfoGlobalDictList> globalDictList;

        // 全局敏感词列表
        @NameInMap("GlobalSensitiveWordList")
        public java.util.List<NluResponseBodyMessagesDialogHubNluInfoGlobalSensitiveWordList> globalSensitiveWordList;

        public static NluResponseBodyMessagesDialogHubNluInfo build(java.util.Map<String, ?> map) throws Exception {
            NluResponseBodyMessagesDialogHubNluInfo self = new NluResponseBodyMessagesDialogHubNluInfo();
            return TeaModel.build(map, self);
        }

        public NluResponseBodyMessagesDialogHubNluInfo setGlobalDictList(java.util.List<NluResponseBodyMessagesDialogHubNluInfoGlobalDictList> globalDictList) {
            this.globalDictList = globalDictList;
            return this;
        }
        public java.util.List<NluResponseBodyMessagesDialogHubNluInfoGlobalDictList> getGlobalDictList() {
            return this.globalDictList;
        }

        public NluResponseBodyMessagesDialogHubNluInfo setGlobalSensitiveWordList(java.util.List<NluResponseBodyMessagesDialogHubNluInfoGlobalSensitiveWordList> globalSensitiveWordList) {
            this.globalSensitiveWordList = globalSensitiveWordList;
            return this;
        }
        public java.util.List<NluResponseBodyMessagesDialogHubNluInfoGlobalSensitiveWordList> getGlobalSensitiveWordList() {
            return this.globalSensitiveWordList;
        }

    }

    public static class NluResponseBodyMessagesDsNluInfoEntityList extends TeaModel {
        // 实体名称
        @NameInMap("Name")
        public String name;

        // 实体原词（实体成员）
        @NameInMap("Origin")
        public String origin;

        // 实体类型，当前只有text类型
        @NameInMap("Type")
        public String type;

        // 实体同义词
        @NameInMap("Value")
        public String value;

        public static NluResponseBodyMessagesDsNluInfoEntityList build(java.util.Map<String, ?> map) throws Exception {
            NluResponseBodyMessagesDsNluInfoEntityList self = new NluResponseBodyMessagesDsNluInfoEntityList();
            return TeaModel.build(map, self);
        }

        public NluResponseBodyMessagesDsNluInfoEntityList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public NluResponseBodyMessagesDsNluInfoEntityList setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public NluResponseBodyMessagesDsNluInfoEntityList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public NluResponseBodyMessagesDsNluInfoEntityList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class NluResponseBodyMessagesDsNluInfoIntentListSlotList extends TeaModel {
        // 实体名称
        @NameInMap("Name")
        public String name;

        // 实体原词（实体成员）
        @NameInMap("Origin")
        public String origin;

        // 实体类型，当前只有text类型
        @NameInMap("Type")
        public String type;

        // 实体同义词
        @NameInMap("Value")
        public String value;

        public static NluResponseBodyMessagesDsNluInfoIntentListSlotList build(java.util.Map<String, ?> map) throws Exception {
            NluResponseBodyMessagesDsNluInfoIntentListSlotList self = new NluResponseBodyMessagesDsNluInfoIntentListSlotList();
            return TeaModel.build(map, self);
        }

        public NluResponseBodyMessagesDsNluInfoIntentListSlotList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public NluResponseBodyMessagesDsNluInfoIntentListSlotList setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public NluResponseBodyMessagesDsNluInfoIntentListSlotList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public NluResponseBodyMessagesDsNluInfoIntentListSlotList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class NluResponseBodyMessagesDsNluInfoIntentList extends TeaModel {
        // 意图id
        @NameInMap("IntentId")
        public Long intentId;

        // 匹配详情（匹配过程）
        @NameInMap("MatchDetail")
        public String matchDetail;

        // 匹配类型，其枚举值含义如下：  Similarity：query与意图通过意图话术相似度匹配 Lgf：query与意图通过LGF匹配 Classify：query与意图通过模型训练匹配 FewShotLearning：query与意图通过系统内置fewshot模型匹配 BuildIn： query与系统内置意图匹配
        @NameInMap("MatchType")
        public String matchType;

        // 意图名称
        @NameInMap("Name")
        public String name;

        // 分数
        @NameInMap("Score")
        public Double score;

        // 命中意图的槽位列表
        @NameInMap("SlotList")
        public java.util.List<NluResponseBodyMessagesDsNluInfoIntentListSlotList> slotList;

        public static NluResponseBodyMessagesDsNluInfoIntentList build(java.util.Map<String, ?> map) throws Exception {
            NluResponseBodyMessagesDsNluInfoIntentList self = new NluResponseBodyMessagesDsNluInfoIntentList();
            return TeaModel.build(map, self);
        }

        public NluResponseBodyMessagesDsNluInfoIntentList setIntentId(Long intentId) {
            this.intentId = intentId;
            return this;
        }
        public Long getIntentId() {
            return this.intentId;
        }

        public NluResponseBodyMessagesDsNluInfoIntentList setMatchDetail(String matchDetail) {
            this.matchDetail = matchDetail;
            return this;
        }
        public String getMatchDetail() {
            return this.matchDetail;
        }

        public NluResponseBodyMessagesDsNluInfoIntentList setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public NluResponseBodyMessagesDsNluInfoIntentList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public NluResponseBodyMessagesDsNluInfoIntentList setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public NluResponseBodyMessagesDsNluInfoIntentList setSlotList(java.util.List<NluResponseBodyMessagesDsNluInfoIntentListSlotList> slotList) {
            this.slotList = slotList;
            return this;
        }
        public java.util.List<NluResponseBodyMessagesDsNluInfoIntentListSlotList> getSlotList() {
            return this.slotList;
        }

    }

    public static class NluResponseBodyMessagesDsNluInfo extends TeaModel {
        // 实体列表
        @NameInMap("EntityList")
        public java.util.List<NluResponseBodyMessagesDsNluInfoEntityList> entityList;

        // 意图列表
        @NameInMap("IntentList")
        public java.util.List<NluResponseBodyMessagesDsNluInfoIntentList> intentList;

        public static NluResponseBodyMessagesDsNluInfo build(java.util.Map<String, ?> map) throws Exception {
            NluResponseBodyMessagesDsNluInfo self = new NluResponseBodyMessagesDsNluInfo();
            return TeaModel.build(map, self);
        }

        public NluResponseBodyMessagesDsNluInfo setEntityList(java.util.List<NluResponseBodyMessagesDsNluInfoEntityList> entityList) {
            this.entityList = entityList;
            return this;
        }
        public java.util.List<NluResponseBodyMessagesDsNluInfoEntityList> getEntityList() {
            return this.entityList;
        }

        public NluResponseBodyMessagesDsNluInfo setIntentList(java.util.List<NluResponseBodyMessagesDsNluInfoIntentList> intentList) {
            this.intentList = intentList;
            return this;
        }
        public java.util.List<NluResponseBodyMessagesDsNluInfoIntentList> getIntentList() {
            return this.intentList;
        }

    }

    public static class NluResponseBodyMessages extends TeaModel {
        // 对话中控的nlu信息
        @NameInMap("DialogHubNluInfo")
        public NluResponseBodyMessagesDialogHubNluInfo dialogHubNluInfo;

        // 对话工厂的nlu信息
        @NameInMap("DsNluInfo")
        public NluResponseBodyMessagesDsNluInfo dsNluInfo;

        public static NluResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            NluResponseBodyMessages self = new NluResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public NluResponseBodyMessages setDialogHubNluInfo(NluResponseBodyMessagesDialogHubNluInfo dialogHubNluInfo) {
            this.dialogHubNluInfo = dialogHubNluInfo;
            return this;
        }
        public NluResponseBodyMessagesDialogHubNluInfo getDialogHubNluInfo() {
            return this.dialogHubNluInfo;
        }

        public NluResponseBodyMessages setDsNluInfo(NluResponseBodyMessagesDsNluInfo dsNluInfo) {
            this.dsNluInfo = dsNluInfo;
            return this;
        }
        public NluResponseBodyMessagesDsNluInfo getDsNluInfo() {
            return this.dsNluInfo;
        }

    }

}
