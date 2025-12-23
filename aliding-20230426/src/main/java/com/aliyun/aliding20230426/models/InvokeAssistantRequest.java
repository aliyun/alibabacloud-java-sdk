// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokeAssistantRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>assistantId1</p>
     */
    @NameInMap("assistantId")
    public String assistantId;

    @NameInMap("clientEnum")
    public String clientEnum;

    @NameInMap("extLoginUser")
    public InvokeAssistantRequestExtLoginUser extLoginUser;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("messages")
    public java.util.List<InvokeAssistantRequestMessages> messages;

    /**
     * <strong>example:</strong>
     * <p>assistantId2</p>
     */
    @NameInMap("originalAssistantId")
    public String originalAssistantId;

    /**
     * <strong>example:</strong>
     * <p>sessionId1</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>agentKey1</p>
     */
    @NameInMap("sourceIdOfOriginalAssistantId")
    public String sourceIdOfOriginalAssistantId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sourceTypeOfOriginalAssistantId")
    public String sourceTypeOfOriginalAssistantId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    public static InvokeAssistantRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeAssistantRequest self = new InvokeAssistantRequest();
        return TeaModel.build(map, self);
    }

    public InvokeAssistantRequest setAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }
    public String getAssistantId() {
        return this.assistantId;
    }

    public InvokeAssistantRequest setClientEnum(String clientEnum) {
        this.clientEnum = clientEnum;
        return this;
    }
    public String getClientEnum() {
        return this.clientEnum;
    }

    public InvokeAssistantRequest setExtLoginUser(InvokeAssistantRequestExtLoginUser extLoginUser) {
        this.extLoginUser = extLoginUser;
        return this;
    }
    public InvokeAssistantRequestExtLoginUser getExtLoginUser() {
        return this.extLoginUser;
    }

    public InvokeAssistantRequest setMessages(java.util.List<InvokeAssistantRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<InvokeAssistantRequestMessages> getMessages() {
        return this.messages;
    }

    public InvokeAssistantRequest setOriginalAssistantId(String originalAssistantId) {
        this.originalAssistantId = originalAssistantId;
        return this;
    }
    public String getOriginalAssistantId() {
        return this.originalAssistantId;
    }

    public InvokeAssistantRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public InvokeAssistantRequest setSourceIdOfOriginalAssistantId(String sourceIdOfOriginalAssistantId) {
        this.sourceIdOfOriginalAssistantId = sourceIdOfOriginalAssistantId;
        return this;
    }
    public String getSourceIdOfOriginalAssistantId() {
        return this.sourceIdOfOriginalAssistantId;
    }

    public InvokeAssistantRequest setSourceTypeOfOriginalAssistantId(String sourceTypeOfOriginalAssistantId) {
        this.sourceTypeOfOriginalAssistantId = sourceTypeOfOriginalAssistantId;
        return this;
    }
    public String getSourceTypeOfOriginalAssistantId() {
        return this.sourceTypeOfOriginalAssistantId;
    }

    public InvokeAssistantRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public static class InvokeAssistantRequestExtLoginUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mozi</p>
         */
        @NameInMap("extLoginUserDomain")
        public String extLoginUserDomain;

        /**
         * <strong>example:</strong>
         * <p>outeruserId123</p>
         */
        @NameInMap("extLoginUserId")
        public String extLoginUserId;

        /**
         * <strong>example:</strong>
         * <p>外部游客1</p>
         */
        @NameInMap("extLoginUserName")
        public String extLoginUserName;

        public static InvokeAssistantRequestExtLoginUser build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestExtLoginUser self = new InvokeAssistantRequestExtLoginUser();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestExtLoginUser setExtLoginUserDomain(String extLoginUserDomain) {
            this.extLoginUserDomain = extLoginUserDomain;
            return this;
        }
        public String getExtLoginUserDomain() {
            return this.extLoginUserDomain;
        }

        public InvokeAssistantRequestExtLoginUser setExtLoginUserId(String extLoginUserId) {
            this.extLoginUserId = extLoginUserId;
            return this;
        }
        public String getExtLoginUserId() {
            return this.extLoginUserId;
        }

        public InvokeAssistantRequestExtLoginUser setExtLoginUserName(String extLoginUserName) {
            this.extLoginUserName = extLoginUserName;
            return this;
        }
        public String getExtLoginUserName() {
            return this.extLoginUserName;
        }

    }

    public static class InvokeAssistantRequestMessagesContentCardCallback extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliding_messageId123</p>
         */
        @NameInMap("relatedMessageId")
        public String relatedMessageId;

        public static InvokeAssistantRequestMessagesContentCardCallback build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContentCardCallback self = new InvokeAssistantRequestMessagesContentCardCallback();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContentCardCallback setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public InvokeAssistantRequestMessagesContentCardCallback setRelatedMessageId(String relatedMessageId) {
            this.relatedMessageId = relatedMessageId;
            return this;
        }
        public String getRelatedMessageId() {
            return this.relatedMessageId;
        }

    }

    public static class InvokeAssistantRequestMessagesContentDingCard extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>basic_card_schema</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("finished")
        public Boolean finished;

        /**
         * <strong>example:</strong>
         * <p>templateId123</p>
         */
        @NameInMap("templateId")
        public String templateId;

        public static InvokeAssistantRequestMessagesContentDingCard build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContentDingCard self = new InvokeAssistantRequestMessagesContentDingCard();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContentDingCard setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public InvokeAssistantRequestMessagesContentDingCard setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public InvokeAssistantRequestMessagesContentDingCard setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public InvokeAssistantRequestMessagesContentDingCard setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class InvokeAssistantRequestMessagesContentDingNormalCardCardData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("cardParamMap")
        public java.util.Map<String, ?> cardParamMap;

        public static InvokeAssistantRequestMessagesContentDingNormalCardCardData build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContentDingNormalCardCardData self = new InvokeAssistantRequestMessagesContentDingNormalCardCardData();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContentDingNormalCardCardData setCardParamMap(java.util.Map<String, ?> cardParamMap) {
            this.cardParamMap = cardParamMap;
            return this;
        }
        public java.util.Map<String, ?> getCardParamMap() {
            return this.cardParamMap;
        }

    }

    public static class InvokeAssistantRequestMessagesContentDingNormalCardCardUpdateOptions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("updateCardDataByKey")
        public Boolean updateCardDataByKey;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("updatePrivateDataByKey")
        public Boolean updatePrivateDataByKey;

        public static InvokeAssistantRequestMessagesContentDingNormalCardCardUpdateOptions build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContentDingNormalCardCardUpdateOptions self = new InvokeAssistantRequestMessagesContentDingNormalCardCardUpdateOptions();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContentDingNormalCardCardUpdateOptions setUpdateCardDataByKey(Boolean updateCardDataByKey) {
            this.updateCardDataByKey = updateCardDataByKey;
            return this;
        }
        public Boolean getUpdateCardDataByKey() {
            return this.updateCardDataByKey;
        }

        public InvokeAssistantRequestMessagesContentDingNormalCardCardUpdateOptions setUpdatePrivateDataByKey(Boolean updatePrivateDataByKey) {
            this.updatePrivateDataByKey = updatePrivateDataByKey;
            return this;
        }
        public Boolean getUpdatePrivateDataByKey() {
            return this.updatePrivateDataByKey;
        }

    }

    public static class InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("interval")
        public Integer interval;

        /**
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("pullStrategy")
        public String pullStrategy;

        /**
         * <strong>example:</strong>
         * <p>SECONDS</p>
         */
        @NameInMap("timeUnit")
        public String timeUnit;

        public static InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig self = new InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setPullStrategy(String pullStrategy) {
            this.pullStrategy = pullStrategy;
            return this;
        }
        public String getPullStrategy() {
            return this.pullStrategy;
        }

        public InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

    }

    public static class InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("constParams")
        public java.util.Map<String, ?> constParams;

        /**
         * <strong>example:</strong>
         * <p>dynamicDataSourceId1</p>
         */
        @NameInMap("dynamicDataSourceId")
        public String dynamicDataSourceId;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("pullConfig")
        public InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig pullConfig;

        public static InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigs build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigs self = new InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigs();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigs setConstParams(java.util.Map<String, ?> constParams) {
            this.constParams = constParams;
            return this;
        }
        public java.util.Map<String, ?> getConstParams() {
            return this.constParams;
        }

        public InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigs setDynamicDataSourceId(String dynamicDataSourceId) {
            this.dynamicDataSourceId = dynamicDataSourceId;
            return this;
        }
        public String getDynamicDataSourceId() {
            return this.dynamicDataSourceId;
        }

        public InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigs setPullConfig(InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig pullConfig) {
            this.pullConfig = pullConfig;
            return this;
        }
        public InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig getPullConfig() {
            return this.pullConfig;
        }

    }

    public static class InvokeAssistantRequestMessagesContentDingNormalCard extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("cardData")
        public InvokeAssistantRequestMessagesContentDingNormalCardCardData cardData;

        /**
         * <strong>example:</strong>
         * <p>templateId1</p>
         */
        @NameInMap("cardTemplateId")
        public String cardTemplateId;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("cardUpdateOptions")
        public InvokeAssistantRequestMessagesContentDingNormalCardCardUpdateOptions cardUpdateOptions;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dynamicDataSourceConfigs")
        public java.util.List<InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigs> dynamicDataSourceConfigs;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("privateData")
        public java.util.Map<String, java.util.Map<String, ?>> privateData;

        public static InvokeAssistantRequestMessagesContentDingNormalCard build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContentDingNormalCard self = new InvokeAssistantRequestMessagesContentDingNormalCard();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContentDingNormalCard setCardData(InvokeAssistantRequestMessagesContentDingNormalCardCardData cardData) {
            this.cardData = cardData;
            return this;
        }
        public InvokeAssistantRequestMessagesContentDingNormalCardCardData getCardData() {
            return this.cardData;
        }

        public InvokeAssistantRequestMessagesContentDingNormalCard setCardTemplateId(String cardTemplateId) {
            this.cardTemplateId = cardTemplateId;
            return this;
        }
        public String getCardTemplateId() {
            return this.cardTemplateId;
        }

        public InvokeAssistantRequestMessagesContentDingNormalCard setCardUpdateOptions(InvokeAssistantRequestMessagesContentDingNormalCardCardUpdateOptions cardUpdateOptions) {
            this.cardUpdateOptions = cardUpdateOptions;
            return this;
        }
        public InvokeAssistantRequestMessagesContentDingNormalCardCardUpdateOptions getCardUpdateOptions() {
            return this.cardUpdateOptions;
        }

        public InvokeAssistantRequestMessagesContentDingNormalCard setDynamicDataSourceConfigs(java.util.List<InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigs> dynamicDataSourceConfigs) {
            this.dynamicDataSourceConfigs = dynamicDataSourceConfigs;
            return this;
        }
        public java.util.List<InvokeAssistantRequestMessagesContentDingNormalCardDynamicDataSourceConfigs> getDynamicDataSourceConfigs() {
            return this.dynamicDataSourceConfigs;
        }

        public InvokeAssistantRequestMessagesContentDingNormalCard setPrivateData(java.util.Map<String, java.util.Map<String, ?>> privateData) {
            this.privateData = privateData;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getPrivateData() {
            return this.privateData;
        }

    }

    public static class InvokeAssistantRequestMessagesContentMarkdown extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ol>
         * <li>markdown内容</li>
         * <li>markdown内容</li>
         * </ol>
         */
        @NameInMap("value")
        public String value;

        public static InvokeAssistantRequestMessagesContentMarkdown build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContentMarkdown self = new InvokeAssistantRequestMessagesContentMarkdown();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContentMarkdown setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InvokeAssistantRequestMessagesContentStructViewPartsDataPart extends TeaModel {
        @NameInMap("data")
        public Object data;

        public static InvokeAssistantRequestMessagesContentStructViewPartsDataPart build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContentStructViewPartsDataPart self = new InvokeAssistantRequestMessagesContentStructViewPartsDataPart();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContentStructViewPartsDataPart setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

    }

    public static class InvokeAssistantRequestMessagesContentStructViewPartsReasonPart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("reason")
        public String reason;

        public static InvokeAssistantRequestMessagesContentStructViewPartsReasonPart build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContentStructViewPartsReasonPart self = new InvokeAssistantRequestMessagesContentStructViewPartsReasonPart();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContentStructViewPartsReasonPart setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class InvokeAssistantRequestMessagesContentStructViewPartsRecommendPartRecommends extends TeaModel {
        @NameInMap("mobileUrl")
        public String mobileUrl;

        @NameInMap("text")
        public String text;

        @NameInMap("url")
        public String url;

        public static InvokeAssistantRequestMessagesContentStructViewPartsRecommendPartRecommends build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContentStructViewPartsRecommendPartRecommends self = new InvokeAssistantRequestMessagesContentStructViewPartsRecommendPartRecommends();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContentStructViewPartsRecommendPartRecommends setMobileUrl(String mobileUrl) {
            this.mobileUrl = mobileUrl;
            return this;
        }
        public String getMobileUrl() {
            return this.mobileUrl;
        }

        public InvokeAssistantRequestMessagesContentStructViewPartsRecommendPartRecommends setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public InvokeAssistantRequestMessagesContentStructViewPartsRecommendPartRecommends setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class InvokeAssistantRequestMessagesContentStructViewPartsRecommendPart extends TeaModel {
        @NameInMap("recommends")
        public java.util.List<InvokeAssistantRequestMessagesContentStructViewPartsRecommendPartRecommends> recommends;

        public static InvokeAssistantRequestMessagesContentStructViewPartsRecommendPart build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContentStructViewPartsRecommendPart self = new InvokeAssistantRequestMessagesContentStructViewPartsRecommendPart();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContentStructViewPartsRecommendPart setRecommends(java.util.List<InvokeAssistantRequestMessagesContentStructViewPartsRecommendPartRecommends> recommends) {
            this.recommends = recommends;
            return this;
        }
        public java.util.List<InvokeAssistantRequestMessagesContentStructViewPartsRecommendPartRecommends> getRecommends() {
            return this.recommends;
        }

    }

    public static class InvokeAssistantRequestMessagesContentStructViewPartsReferencePartReferences extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public String index;

        /**
         * <strong>example:</strong>
         * <p>mcp是....</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>ata</p>
         */
        @NameInMap("sourceCode")
        public String sourceCode;

        @NameInMap("sourceIcon")
        public String sourceIcon;

        /**
         * <strong>example:</strong>
         * <p>摘要</p>
         */
        @NameInMap("summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>《mcp原理介绍》</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="https://taobao.com">https://taobao.com</a></p>
         */
        @NameInMap("url")
        public String url;

        public static InvokeAssistantRequestMessagesContentStructViewPartsReferencePartReferences build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContentStructViewPartsReferencePartReferences self = new InvokeAssistantRequestMessagesContentStructViewPartsReferencePartReferences();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContentStructViewPartsReferencePartReferences setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public InvokeAssistantRequestMessagesContentStructViewPartsReferencePartReferences setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InvokeAssistantRequestMessagesContentStructViewPartsReferencePartReferences setSourceCode(String sourceCode) {
            this.sourceCode = sourceCode;
            return this;
        }
        public String getSourceCode() {
            return this.sourceCode;
        }

        public InvokeAssistantRequestMessagesContentStructViewPartsReferencePartReferences setSourceIcon(String sourceIcon) {
            this.sourceIcon = sourceIcon;
            return this;
        }
        public String getSourceIcon() {
            return this.sourceIcon;
        }

        public InvokeAssistantRequestMessagesContentStructViewPartsReferencePartReferences setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public InvokeAssistantRequestMessagesContentStructViewPartsReferencePartReferences setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public InvokeAssistantRequestMessagesContentStructViewPartsReferencePartReferences setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class InvokeAssistantRequestMessagesContentStructViewPartsReferencePart extends TeaModel {
        @NameInMap("references")
        public java.util.List<InvokeAssistantRequestMessagesContentStructViewPartsReferencePartReferences> references;

        public static InvokeAssistantRequestMessagesContentStructViewPartsReferencePart build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContentStructViewPartsReferencePart self = new InvokeAssistantRequestMessagesContentStructViewPartsReferencePart();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContentStructViewPartsReferencePart setReferences(java.util.List<InvokeAssistantRequestMessagesContentStructViewPartsReferencePartReferences> references) {
            this.references = references;
            return this;
        }
        public java.util.List<InvokeAssistantRequestMessagesContentStructViewPartsReferencePartReferences> getReferences() {
            return this.references;
        }

    }

    public static class InvokeAssistantRequestMessagesContentStructViewPartsTextPart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("text")
        public String text;

        public static InvokeAssistantRequestMessagesContentStructViewPartsTextPart build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContentStructViewPartsTextPart self = new InvokeAssistantRequestMessagesContentStructViewPartsTextPart();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContentStructViewPartsTextPart setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class InvokeAssistantRequestMessagesContentStructViewParts extends TeaModel {
        @NameInMap("append")
        public Boolean append;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dataPart")
        public InvokeAssistantRequestMessagesContentStructViewPartsDataPart dataPart;

        @NameInMap("finish")
        public Boolean finish;

        /**
         * <strong>example:</strong>
         * <p>这是正文内容部分</p>
         */
        @NameInMap("partDesc")
        public String partDesc;

        /**
         * <strong>example:</strong>
         * <p>artifactId123</p>
         */
        @NameInMap("partId")
        public String partId;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("reasonPart")
        public InvokeAssistantRequestMessagesContentStructViewPartsReasonPart reasonPart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("recommendPart")
        public InvokeAssistantRequestMessagesContentStructViewPartsRecommendPart recommendPart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("referencePart")
        public InvokeAssistantRequestMessagesContentStructViewPartsReferencePart referencePart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("textPart")
        public InvokeAssistantRequestMessagesContentStructViewPartsTextPart textPart;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>textPart</p>
         */
        @NameInMap("type")
        public String type;

        public static InvokeAssistantRequestMessagesContentStructViewParts build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContentStructViewParts self = new InvokeAssistantRequestMessagesContentStructViewParts();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContentStructViewParts setAppend(Boolean append) {
            this.append = append;
            return this;
        }
        public Boolean getAppend() {
            return this.append;
        }

        public InvokeAssistantRequestMessagesContentStructViewParts setDataPart(InvokeAssistantRequestMessagesContentStructViewPartsDataPart dataPart) {
            this.dataPart = dataPart;
            return this;
        }
        public InvokeAssistantRequestMessagesContentStructViewPartsDataPart getDataPart() {
            return this.dataPart;
        }

        public InvokeAssistantRequestMessagesContentStructViewParts setFinish(Boolean finish) {
            this.finish = finish;
            return this;
        }
        public Boolean getFinish() {
            return this.finish;
        }

        public InvokeAssistantRequestMessagesContentStructViewParts setPartDesc(String partDesc) {
            this.partDesc = partDesc;
            return this;
        }
        public String getPartDesc() {
            return this.partDesc;
        }

        public InvokeAssistantRequestMessagesContentStructViewParts setPartId(String partId) {
            this.partId = partId;
            return this;
        }
        public String getPartId() {
            return this.partId;
        }

        public InvokeAssistantRequestMessagesContentStructViewParts setReasonPart(InvokeAssistantRequestMessagesContentStructViewPartsReasonPart reasonPart) {
            this.reasonPart = reasonPart;
            return this;
        }
        public InvokeAssistantRequestMessagesContentStructViewPartsReasonPart getReasonPart() {
            return this.reasonPart;
        }

        public InvokeAssistantRequestMessagesContentStructViewParts setRecommendPart(InvokeAssistantRequestMessagesContentStructViewPartsRecommendPart recommendPart) {
            this.recommendPart = recommendPart;
            return this;
        }
        public InvokeAssistantRequestMessagesContentStructViewPartsRecommendPart getRecommendPart() {
            return this.recommendPart;
        }

        public InvokeAssistantRequestMessagesContentStructViewParts setReferencePart(InvokeAssistantRequestMessagesContentStructViewPartsReferencePart referencePart) {
            this.referencePart = referencePart;
            return this;
        }
        public InvokeAssistantRequestMessagesContentStructViewPartsReferencePart getReferencePart() {
            return this.referencePart;
        }

        public InvokeAssistantRequestMessagesContentStructViewParts setTextPart(InvokeAssistantRequestMessagesContentStructViewPartsTextPart textPart) {
            this.textPart = textPart;
            return this;
        }
        public InvokeAssistantRequestMessagesContentStructViewPartsTextPart getTextPart() {
            return this.textPart;
        }

        public InvokeAssistantRequestMessagesContentStructViewParts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class InvokeAssistantRequestMessagesContentStructView extends TeaModel {
        @NameInMap("parts")
        public java.util.List<InvokeAssistantRequestMessagesContentStructViewParts> parts;

        public static InvokeAssistantRequestMessagesContentStructView build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContentStructView self = new InvokeAssistantRequestMessagesContentStructView();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContentStructView setParts(java.util.List<InvokeAssistantRequestMessagesContentStructViewParts> parts) {
            this.parts = parts;
            return this;
        }
        public java.util.List<InvokeAssistantRequestMessagesContentStructViewParts> getParts() {
            return this.parts;
        }

    }

    public static class InvokeAssistantRequestMessagesContentText extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>你好！</p>
         */
        @NameInMap("value")
        public String value;

        public static InvokeAssistantRequestMessagesContentText build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContentText self = new InvokeAssistantRequestMessagesContentText();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContentText setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InvokeAssistantRequestMessagesContent extends TeaModel {
        @NameInMap("cardCallback")
        public InvokeAssistantRequestMessagesContentCardCallback cardCallback;

        @NameInMap("dingCard")
        public InvokeAssistantRequestMessagesContentDingCard dingCard;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dingNormalCard")
        public InvokeAssistantRequestMessagesContentDingNormalCard dingNormalCard;

        @NameInMap("markdown")
        public InvokeAssistantRequestMessagesContentMarkdown markdown;

        @NameInMap("structView")
        public InvokeAssistantRequestMessagesContentStructView structView;

        @NameInMap("text")
        public InvokeAssistantRequestMessagesContentText text;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>枚举字段，可为：text,markdown,cardCallback,dingCard,agentArtifact,dingNormalCard</p>
         */
        @NameInMap("type")
        public String type;

        public static InvokeAssistantRequestMessagesContent build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessagesContent self = new InvokeAssistantRequestMessagesContent();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessagesContent setCardCallback(InvokeAssistantRequestMessagesContentCardCallback cardCallback) {
            this.cardCallback = cardCallback;
            return this;
        }
        public InvokeAssistantRequestMessagesContentCardCallback getCardCallback() {
            return this.cardCallback;
        }

        public InvokeAssistantRequestMessagesContent setDingCard(InvokeAssistantRequestMessagesContentDingCard dingCard) {
            this.dingCard = dingCard;
            return this;
        }
        public InvokeAssistantRequestMessagesContentDingCard getDingCard() {
            return this.dingCard;
        }

        public InvokeAssistantRequestMessagesContent setDingNormalCard(InvokeAssistantRequestMessagesContentDingNormalCard dingNormalCard) {
            this.dingNormalCard = dingNormalCard;
            return this;
        }
        public InvokeAssistantRequestMessagesContentDingNormalCard getDingNormalCard() {
            return this.dingNormalCard;
        }

        public InvokeAssistantRequestMessagesContent setMarkdown(InvokeAssistantRequestMessagesContentMarkdown markdown) {
            this.markdown = markdown;
            return this;
        }
        public InvokeAssistantRequestMessagesContentMarkdown getMarkdown() {
            return this.markdown;
        }

        public InvokeAssistantRequestMessagesContent setStructView(InvokeAssistantRequestMessagesContentStructView structView) {
            this.structView = structView;
            return this;
        }
        public InvokeAssistantRequestMessagesContentStructView getStructView() {
            return this.structView;
        }

        public InvokeAssistantRequestMessagesContent setText(InvokeAssistantRequestMessagesContentText text) {
            this.text = text;
            return this;
        }
        public InvokeAssistantRequestMessagesContentText getText() {
            return this.text;
        }

        public InvokeAssistantRequestMessagesContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class InvokeAssistantRequestMessages extends TeaModel {
        @NameInMap("content")
        public InvokeAssistantRequestMessagesContent content;

        /**
         * <strong>example:</strong>
         * <p>这是一张小猫钓鱼图</p>
         */
        @NameInMap("contentDesc")
        public String contentDesc;

        /**
         * <strong>example:</strong>
         * <p>1642448000000</p>
         */
        @NameInMap("createAt")
        public Long createAt;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static InvokeAssistantRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantRequestMessages self = new InvokeAssistantRequestMessages();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantRequestMessages setContent(InvokeAssistantRequestMessagesContent content) {
            this.content = content;
            return this;
        }
        public InvokeAssistantRequestMessagesContent getContent() {
            return this.content;
        }

        public InvokeAssistantRequestMessages setContentDesc(String contentDesc) {
            this.contentDesc = contentDesc;
            return this;
        }
        public String getContentDesc() {
            return this.contentDesc;
        }

        public InvokeAssistantRequestMessages setCreateAt(Long createAt) {
            this.createAt = createAt;
            return this;
        }
        public Long getCreateAt() {
            return this.createAt;
        }

        public InvokeAssistantRequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
