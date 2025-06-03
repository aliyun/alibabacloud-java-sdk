// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMessageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>assistantId1</p>
     */
    @NameInMap("assistantId")
    public String assistantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("messages")
    public java.util.List<CreateMessageRequestMessages> messages;

    /**
     * <strong>example:</strong>
     * <p>assistantId</p>
     */
    @NameInMap("originalAssistantId")
    public String originalAssistantId;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>threadId123</p>
     */
    @NameInMap("threadId")
    public String threadId;

    public static CreateMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageRequest self = new CreateMessageRequest();
        return TeaModel.build(map, self);
    }

    public CreateMessageRequest setAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }
    public String getAssistantId() {
        return this.assistantId;
    }

    public CreateMessageRequest setMessages(java.util.List<CreateMessageRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<CreateMessageRequestMessages> getMessages() {
        return this.messages;
    }

    public CreateMessageRequest setOriginalAssistantId(String originalAssistantId) {
        this.originalAssistantId = originalAssistantId;
        return this;
    }
    public String getOriginalAssistantId() {
        return this.originalAssistantId;
    }

    public CreateMessageRequest setSourceIdOfOriginalAssistantId(String sourceIdOfOriginalAssistantId) {
        this.sourceIdOfOriginalAssistantId = sourceIdOfOriginalAssistantId;
        return this;
    }
    public String getSourceIdOfOriginalAssistantId() {
        return this.sourceIdOfOriginalAssistantId;
    }

    public CreateMessageRequest setSourceTypeOfOriginalAssistantId(String sourceTypeOfOriginalAssistantId) {
        this.sourceTypeOfOriginalAssistantId = sourceTypeOfOriginalAssistantId;
        return this;
    }
    public String getSourceTypeOfOriginalAssistantId() {
        return this.sourceTypeOfOriginalAssistantId;
    }

    public CreateMessageRequest setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public static class CreateMessageRequestMessagesContentCardCallback extends TeaModel {
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

        public static CreateMessageRequestMessagesContentCardCallback build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContentCardCallback self = new CreateMessageRequestMessagesContentCardCallback();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContentCardCallback setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateMessageRequestMessagesContentCardCallback setRelatedMessageId(String relatedMessageId) {
            this.relatedMessageId = relatedMessageId;
            return this;
        }
        public String getRelatedMessageId() {
            return this.relatedMessageId;
        }

    }

    public static class CreateMessageRequestMessagesContentDingCard extends TeaModel {
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

        public static CreateMessageRequestMessagesContentDingCard build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContentDingCard self = new CreateMessageRequestMessagesContentDingCard();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContentDingCard setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateMessageRequestMessagesContentDingCard setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateMessageRequestMessagesContentDingCard setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public CreateMessageRequestMessagesContentDingCard setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class CreateMessageRequestMessagesContentDingNormalCardCardData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("cardParamMap")
        public java.util.Map<String, ?> cardParamMap;

        public static CreateMessageRequestMessagesContentDingNormalCardCardData build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContentDingNormalCardCardData self = new CreateMessageRequestMessagesContentDingNormalCardCardData();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContentDingNormalCardCardData setCardParamMap(java.util.Map<String, ?> cardParamMap) {
            this.cardParamMap = cardParamMap;
            return this;
        }
        public java.util.Map<String, ?> getCardParamMap() {
            return this.cardParamMap;
        }

    }

    public static class CreateMessageRequestMessagesContentDingNormalCardCardUpdateOptions extends TeaModel {
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

        public static CreateMessageRequestMessagesContentDingNormalCardCardUpdateOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContentDingNormalCardCardUpdateOptions self = new CreateMessageRequestMessagesContentDingNormalCardCardUpdateOptions();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContentDingNormalCardCardUpdateOptions setUpdateCardDataByKey(Boolean updateCardDataByKey) {
            this.updateCardDataByKey = updateCardDataByKey;
            return this;
        }
        public Boolean getUpdateCardDataByKey() {
            return this.updateCardDataByKey;
        }

        public CreateMessageRequestMessagesContentDingNormalCardCardUpdateOptions setUpdatePrivateDataByKey(Boolean updatePrivateDataByKey) {
            this.updatePrivateDataByKey = updatePrivateDataByKey;
            return this;
        }
        public Boolean getUpdatePrivateDataByKey() {
            return this.updatePrivateDataByKey;
        }

    }

    public static class CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig extends TeaModel {
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

        public static CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig self = new CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setPullStrategy(String pullStrategy) {
            this.pullStrategy = pullStrategy;
            return this;
        }
        public String getPullStrategy() {
            return this.pullStrategy;
        }

        public CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

    }

    public static class CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigs extends TeaModel {
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
        public CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig pullConfig;

        public static CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigs self = new CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigs();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigs setConstParams(java.util.Map<String, ?> constParams) {
            this.constParams = constParams;
            return this;
        }
        public java.util.Map<String, ?> getConstParams() {
            return this.constParams;
        }

        public CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigs setDynamicDataSourceId(String dynamicDataSourceId) {
            this.dynamicDataSourceId = dynamicDataSourceId;
            return this;
        }
        public String getDynamicDataSourceId() {
            return this.dynamicDataSourceId;
        }

        public CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigs setPullConfig(CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig pullConfig) {
            this.pullConfig = pullConfig;
            return this;
        }
        public CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig getPullConfig() {
            return this.pullConfig;
        }

    }

    public static class CreateMessageRequestMessagesContentDingNormalCard extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("cardData")
        public CreateMessageRequestMessagesContentDingNormalCardCardData cardData;

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
        public CreateMessageRequestMessagesContentDingNormalCardCardUpdateOptions cardUpdateOptions;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dynamicDataSourceConfigs")
        public java.util.List<CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigs> dynamicDataSourceConfigs;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("privateData")
        public java.util.Map<String, java.util.Map<String, ?>> privateData;

        public static CreateMessageRequestMessagesContentDingNormalCard build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContentDingNormalCard self = new CreateMessageRequestMessagesContentDingNormalCard();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContentDingNormalCard setCardData(CreateMessageRequestMessagesContentDingNormalCardCardData cardData) {
            this.cardData = cardData;
            return this;
        }
        public CreateMessageRequestMessagesContentDingNormalCardCardData getCardData() {
            return this.cardData;
        }

        public CreateMessageRequestMessagesContentDingNormalCard setCardTemplateId(String cardTemplateId) {
            this.cardTemplateId = cardTemplateId;
            return this;
        }
        public String getCardTemplateId() {
            return this.cardTemplateId;
        }

        public CreateMessageRequestMessagesContentDingNormalCard setCardUpdateOptions(CreateMessageRequestMessagesContentDingNormalCardCardUpdateOptions cardUpdateOptions) {
            this.cardUpdateOptions = cardUpdateOptions;
            return this;
        }
        public CreateMessageRequestMessagesContentDingNormalCardCardUpdateOptions getCardUpdateOptions() {
            return this.cardUpdateOptions;
        }

        public CreateMessageRequestMessagesContentDingNormalCard setDynamicDataSourceConfigs(java.util.List<CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigs> dynamicDataSourceConfigs) {
            this.dynamicDataSourceConfigs = dynamicDataSourceConfigs;
            return this;
        }
        public java.util.List<CreateMessageRequestMessagesContentDingNormalCardDynamicDataSourceConfigs> getDynamicDataSourceConfigs() {
            return this.dynamicDataSourceConfigs;
        }

        public CreateMessageRequestMessagesContentDingNormalCard setPrivateData(java.util.Map<String, java.util.Map<String, ?>> privateData) {
            this.privateData = privateData;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getPrivateData() {
            return this.privateData;
        }

    }

    public static class CreateMessageRequestMessagesContentMarkdown extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ol>
         * <li>markdown内容</li>
         * <li>markdown内容</li>
         * </ol>
         */
        @NameInMap("value")
        public String value;

        public static CreateMessageRequestMessagesContentMarkdown build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContentMarkdown self = new CreateMessageRequestMessagesContentMarkdown();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContentMarkdown setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateMessageRequestMessagesContentStructViewPartsDataPart extends TeaModel {
        @NameInMap("data")
        public Object data;

        public static CreateMessageRequestMessagesContentStructViewPartsDataPart build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContentStructViewPartsDataPart self = new CreateMessageRequestMessagesContentStructViewPartsDataPart();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContentStructViewPartsDataPart setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

    }

    public static class CreateMessageRequestMessagesContentStructViewPartsReasonPart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("reason")
        public String reason;

        public static CreateMessageRequestMessagesContentStructViewPartsReasonPart build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContentStructViewPartsReasonPart self = new CreateMessageRequestMessagesContentStructViewPartsReasonPart();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContentStructViewPartsReasonPart setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class CreateMessageRequestMessagesContentStructViewPartsRecommendPartRecommends extends TeaModel {
        @NameInMap("mobileUrl")
        public String mobileUrl;

        @NameInMap("text")
        public String text;

        @NameInMap("url")
        public String url;

        public static CreateMessageRequestMessagesContentStructViewPartsRecommendPartRecommends build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContentStructViewPartsRecommendPartRecommends self = new CreateMessageRequestMessagesContentStructViewPartsRecommendPartRecommends();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContentStructViewPartsRecommendPartRecommends setMobileUrl(String mobileUrl) {
            this.mobileUrl = mobileUrl;
            return this;
        }
        public String getMobileUrl() {
            return this.mobileUrl;
        }

        public CreateMessageRequestMessagesContentStructViewPartsRecommendPartRecommends setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public CreateMessageRequestMessagesContentStructViewPartsRecommendPartRecommends setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateMessageRequestMessagesContentStructViewPartsRecommendPart extends TeaModel {
        @NameInMap("recommends")
        public java.util.List<CreateMessageRequestMessagesContentStructViewPartsRecommendPartRecommends> recommends;

        public static CreateMessageRequestMessagesContentStructViewPartsRecommendPart build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContentStructViewPartsRecommendPart self = new CreateMessageRequestMessagesContentStructViewPartsRecommendPart();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContentStructViewPartsRecommendPart setRecommends(java.util.List<CreateMessageRequestMessagesContentStructViewPartsRecommendPartRecommends> recommends) {
            this.recommends = recommends;
            return this;
        }
        public java.util.List<CreateMessageRequestMessagesContentStructViewPartsRecommendPartRecommends> getRecommends() {
            return this.recommends;
        }

    }

    public static class CreateMessageRequestMessagesContentStructViewPartsReferencePartReferences extends TeaModel {
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

        public static CreateMessageRequestMessagesContentStructViewPartsReferencePartReferences build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContentStructViewPartsReferencePartReferences self = new CreateMessageRequestMessagesContentStructViewPartsReferencePartReferences();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContentStructViewPartsReferencePartReferences setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public CreateMessageRequestMessagesContentStructViewPartsReferencePartReferences setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMessageRequestMessagesContentStructViewPartsReferencePartReferences setSourceCode(String sourceCode) {
            this.sourceCode = sourceCode;
            return this;
        }
        public String getSourceCode() {
            return this.sourceCode;
        }

        public CreateMessageRequestMessagesContentStructViewPartsReferencePartReferences setSourceIcon(String sourceIcon) {
            this.sourceIcon = sourceIcon;
            return this;
        }
        public String getSourceIcon() {
            return this.sourceIcon;
        }

        public CreateMessageRequestMessagesContentStructViewPartsReferencePartReferences setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public CreateMessageRequestMessagesContentStructViewPartsReferencePartReferences setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateMessageRequestMessagesContentStructViewPartsReferencePartReferences setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateMessageRequestMessagesContentStructViewPartsReferencePart extends TeaModel {
        @NameInMap("references")
        public java.util.List<CreateMessageRequestMessagesContentStructViewPartsReferencePartReferences> references;

        public static CreateMessageRequestMessagesContentStructViewPartsReferencePart build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContentStructViewPartsReferencePart self = new CreateMessageRequestMessagesContentStructViewPartsReferencePart();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContentStructViewPartsReferencePart setReferences(java.util.List<CreateMessageRequestMessagesContentStructViewPartsReferencePartReferences> references) {
            this.references = references;
            return this;
        }
        public java.util.List<CreateMessageRequestMessagesContentStructViewPartsReferencePartReferences> getReferences() {
            return this.references;
        }

    }

    public static class CreateMessageRequestMessagesContentStructViewPartsTextPart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("text")
        public String text;

        public static CreateMessageRequestMessagesContentStructViewPartsTextPart build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContentStructViewPartsTextPart self = new CreateMessageRequestMessagesContentStructViewPartsTextPart();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContentStructViewPartsTextPart setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class CreateMessageRequestMessagesContentStructViewParts extends TeaModel {
        @NameInMap("append")
        public Boolean append;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dataPart")
        public CreateMessageRequestMessagesContentStructViewPartsDataPart dataPart;

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
        public CreateMessageRequestMessagesContentStructViewPartsReasonPart reasonPart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("recommendPart")
        public CreateMessageRequestMessagesContentStructViewPartsRecommendPart recommendPart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("referencePart")
        public CreateMessageRequestMessagesContentStructViewPartsReferencePart referencePart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("textPart")
        public CreateMessageRequestMessagesContentStructViewPartsTextPart textPart;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>textPart</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateMessageRequestMessagesContentStructViewParts build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContentStructViewParts self = new CreateMessageRequestMessagesContentStructViewParts();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContentStructViewParts setAppend(Boolean append) {
            this.append = append;
            return this;
        }
        public Boolean getAppend() {
            return this.append;
        }

        public CreateMessageRequestMessagesContentStructViewParts setDataPart(CreateMessageRequestMessagesContentStructViewPartsDataPart dataPart) {
            this.dataPart = dataPart;
            return this;
        }
        public CreateMessageRequestMessagesContentStructViewPartsDataPart getDataPart() {
            return this.dataPart;
        }

        public CreateMessageRequestMessagesContentStructViewParts setFinish(Boolean finish) {
            this.finish = finish;
            return this;
        }
        public Boolean getFinish() {
            return this.finish;
        }

        public CreateMessageRequestMessagesContentStructViewParts setPartDesc(String partDesc) {
            this.partDesc = partDesc;
            return this;
        }
        public String getPartDesc() {
            return this.partDesc;
        }

        public CreateMessageRequestMessagesContentStructViewParts setPartId(String partId) {
            this.partId = partId;
            return this;
        }
        public String getPartId() {
            return this.partId;
        }

        public CreateMessageRequestMessagesContentStructViewParts setReasonPart(CreateMessageRequestMessagesContentStructViewPartsReasonPart reasonPart) {
            this.reasonPart = reasonPart;
            return this;
        }
        public CreateMessageRequestMessagesContentStructViewPartsReasonPart getReasonPart() {
            return this.reasonPart;
        }

        public CreateMessageRequestMessagesContentStructViewParts setRecommendPart(CreateMessageRequestMessagesContentStructViewPartsRecommendPart recommendPart) {
            this.recommendPart = recommendPart;
            return this;
        }
        public CreateMessageRequestMessagesContentStructViewPartsRecommendPart getRecommendPart() {
            return this.recommendPart;
        }

        public CreateMessageRequestMessagesContentStructViewParts setReferencePart(CreateMessageRequestMessagesContentStructViewPartsReferencePart referencePart) {
            this.referencePart = referencePart;
            return this;
        }
        public CreateMessageRequestMessagesContentStructViewPartsReferencePart getReferencePart() {
            return this.referencePart;
        }

        public CreateMessageRequestMessagesContentStructViewParts setTextPart(CreateMessageRequestMessagesContentStructViewPartsTextPart textPart) {
            this.textPart = textPart;
            return this;
        }
        public CreateMessageRequestMessagesContentStructViewPartsTextPart getTextPart() {
            return this.textPart;
        }

        public CreateMessageRequestMessagesContentStructViewParts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateMessageRequestMessagesContentStructView extends TeaModel {
        @NameInMap("parts")
        public java.util.List<CreateMessageRequestMessagesContentStructViewParts> parts;

        public static CreateMessageRequestMessagesContentStructView build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContentStructView self = new CreateMessageRequestMessagesContentStructView();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContentStructView setParts(java.util.List<CreateMessageRequestMessagesContentStructViewParts> parts) {
            this.parts = parts;
            return this;
        }
        public java.util.List<CreateMessageRequestMessagesContentStructViewParts> getParts() {
            return this.parts;
        }

    }

    public static class CreateMessageRequestMessagesContentText extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>你好！</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateMessageRequestMessagesContentText build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContentText self = new CreateMessageRequestMessagesContentText();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContentText setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateMessageRequestMessagesContent extends TeaModel {
        @NameInMap("cardCallback")
        public CreateMessageRequestMessagesContentCardCallback cardCallback;

        @NameInMap("dingCard")
        public CreateMessageRequestMessagesContentDingCard dingCard;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dingNormalCard")
        public CreateMessageRequestMessagesContentDingNormalCard dingNormalCard;

        @NameInMap("markdown")
        public CreateMessageRequestMessagesContentMarkdown markdown;

        @NameInMap("structView")
        public CreateMessageRequestMessagesContentStructView structView;

        @NameInMap("text")
        public CreateMessageRequestMessagesContentText text;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>枚举字段，可为：text,markdown,cardCallback,dingCard,agentArtifact,dingNormalCard</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateMessageRequestMessagesContent build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessagesContent self = new CreateMessageRequestMessagesContent();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessagesContent setCardCallback(CreateMessageRequestMessagesContentCardCallback cardCallback) {
            this.cardCallback = cardCallback;
            return this;
        }
        public CreateMessageRequestMessagesContentCardCallback getCardCallback() {
            return this.cardCallback;
        }

        public CreateMessageRequestMessagesContent setDingCard(CreateMessageRequestMessagesContentDingCard dingCard) {
            this.dingCard = dingCard;
            return this;
        }
        public CreateMessageRequestMessagesContentDingCard getDingCard() {
            return this.dingCard;
        }

        public CreateMessageRequestMessagesContent setDingNormalCard(CreateMessageRequestMessagesContentDingNormalCard dingNormalCard) {
            this.dingNormalCard = dingNormalCard;
            return this;
        }
        public CreateMessageRequestMessagesContentDingNormalCard getDingNormalCard() {
            return this.dingNormalCard;
        }

        public CreateMessageRequestMessagesContent setMarkdown(CreateMessageRequestMessagesContentMarkdown markdown) {
            this.markdown = markdown;
            return this;
        }
        public CreateMessageRequestMessagesContentMarkdown getMarkdown() {
            return this.markdown;
        }

        public CreateMessageRequestMessagesContent setStructView(CreateMessageRequestMessagesContentStructView structView) {
            this.structView = structView;
            return this;
        }
        public CreateMessageRequestMessagesContentStructView getStructView() {
            return this.structView;
        }

        public CreateMessageRequestMessagesContent setText(CreateMessageRequestMessagesContentText text) {
            this.text = text;
            return this;
        }
        public CreateMessageRequestMessagesContentText getText() {
            return this.text;
        }

        public CreateMessageRequestMessagesContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateMessageRequestMessages extends TeaModel {
        @NameInMap("content")
        public CreateMessageRequestMessagesContent content;

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

        public static CreateMessageRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageRequestMessages self = new CreateMessageRequestMessages();
            return TeaModel.build(map, self);
        }

        public CreateMessageRequestMessages setContent(CreateMessageRequestMessagesContent content) {
            this.content = content;
            return this;
        }
        public CreateMessageRequestMessagesContent getContent() {
            return this.content;
        }

        public CreateMessageRequestMessages setContentDesc(String contentDesc) {
            this.contentDesc = contentDesc;
            return this;
        }
        public String getContentDesc() {
            return this.contentDesc;
        }

        public CreateMessageRequestMessages setCreateAt(Long createAt) {
            this.createAt = createAt;
            return this;
        }
        public Long getCreateAt() {
            return this.createAt;
        }

        public CreateMessageRequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
