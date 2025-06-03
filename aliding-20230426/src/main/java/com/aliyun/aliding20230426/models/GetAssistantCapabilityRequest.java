// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetAssistantCapabilityRequest extends TeaModel {
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
    public java.util.List<GetAssistantCapabilityRequestMessages> messages;

    /**
     * <strong>example:</strong>
     * <p>originalAssistantId1</p>
     */
    @NameInMap("originalAssistantId")
    public String originalAssistantId;

    /**
     * <strong>example:</strong>
     * <p>cfp</p>
     */
    @NameInMap("protocol")
    public String protocol;

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
     * <p>threadId</p>
     */
    @NameInMap("threadId")
    public String threadId;

    /**
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    public static GetAssistantCapabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssistantCapabilityRequest self = new GetAssistantCapabilityRequest();
        return TeaModel.build(map, self);
    }

    public GetAssistantCapabilityRequest setAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }
    public String getAssistantId() {
        return this.assistantId;
    }

    public GetAssistantCapabilityRequest setMessages(java.util.List<GetAssistantCapabilityRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<GetAssistantCapabilityRequestMessages> getMessages() {
        return this.messages;
    }

    public GetAssistantCapabilityRequest setOriginalAssistantId(String originalAssistantId) {
        this.originalAssistantId = originalAssistantId;
        return this;
    }
    public String getOriginalAssistantId() {
        return this.originalAssistantId;
    }

    public GetAssistantCapabilityRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public GetAssistantCapabilityRequest setSourceIdOfOriginalAssistantId(String sourceIdOfOriginalAssistantId) {
        this.sourceIdOfOriginalAssistantId = sourceIdOfOriginalAssistantId;
        return this;
    }
    public String getSourceIdOfOriginalAssistantId() {
        return this.sourceIdOfOriginalAssistantId;
    }

    public GetAssistantCapabilityRequest setSourceTypeOfOriginalAssistantId(String sourceTypeOfOriginalAssistantId) {
        this.sourceTypeOfOriginalAssistantId = sourceTypeOfOriginalAssistantId;
        return this;
    }
    public String getSourceTypeOfOriginalAssistantId() {
        return this.sourceTypeOfOriginalAssistantId;
    }

    public GetAssistantCapabilityRequest setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public GetAssistantCapabilityRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class GetAssistantCapabilityRequestMessagesContentCardCallback extends TeaModel {
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

        public static GetAssistantCapabilityRequestMessagesContentCardCallback build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContentCardCallback self = new GetAssistantCapabilityRequestMessagesContentCardCallback();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContentCardCallback setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAssistantCapabilityRequestMessagesContentCardCallback setRelatedMessageId(String relatedMessageId) {
            this.relatedMessageId = relatedMessageId;
            return this;
        }
        public String getRelatedMessageId() {
            return this.relatedMessageId;
        }

    }

    public static class GetAssistantCapabilityRequestMessagesContentDingCard extends TeaModel {
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

        public static GetAssistantCapabilityRequestMessagesContentDingCard build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContentDingCard self = new GetAssistantCapabilityRequestMessagesContentDingCard();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContentDingCard setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAssistantCapabilityRequestMessagesContentDingCard setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetAssistantCapabilityRequestMessagesContentDingCard setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public GetAssistantCapabilityRequestMessagesContentDingCard setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class GetAssistantCapabilityRequestMessagesContentDingNormalCardCardData extends TeaModel {
        @NameInMap("cardParamMap")
        public Object cardParamMap;

        public static GetAssistantCapabilityRequestMessagesContentDingNormalCardCardData build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContentDingNormalCardCardData self = new GetAssistantCapabilityRequestMessagesContentDingNormalCardCardData();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContentDingNormalCardCardData setCardParamMap(Object cardParamMap) {
            this.cardParamMap = cardParamMap;
            return this;
        }
        public Object getCardParamMap() {
            return this.cardParamMap;
        }

    }

    public static class GetAssistantCapabilityRequestMessagesContentDingNormalCardCardUpdateOptions extends TeaModel {
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

        public static GetAssistantCapabilityRequestMessagesContentDingNormalCardCardUpdateOptions build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContentDingNormalCardCardUpdateOptions self = new GetAssistantCapabilityRequestMessagesContentDingNormalCardCardUpdateOptions();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContentDingNormalCardCardUpdateOptions setUpdateCardDataByKey(Boolean updateCardDataByKey) {
            this.updateCardDataByKey = updateCardDataByKey;
            return this;
        }
        public Boolean getUpdateCardDataByKey() {
            return this.updateCardDataByKey;
        }

        public GetAssistantCapabilityRequestMessagesContentDingNormalCardCardUpdateOptions setUpdatePrivateDataByKey(Boolean updatePrivateDataByKey) {
            this.updatePrivateDataByKey = updatePrivateDataByKey;
            return this;
        }
        public Boolean getUpdatePrivateDataByKey() {
            return this.updatePrivateDataByKey;
        }

    }

    public static class GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig extends TeaModel {
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

        public static GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig self = new GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setPullStrategy(String pullStrategy) {
            this.pullStrategy = pullStrategy;
            return this;
        }
        public String getPullStrategy() {
            return this.pullStrategy;
        }

        public GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

    }

    public static class GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigs extends TeaModel {
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
        public GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig pullConfig;

        public static GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigs self = new GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigs();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigs setConstParams(java.util.Map<String, ?> constParams) {
            this.constParams = constParams;
            return this;
        }
        public java.util.Map<String, ?> getConstParams() {
            return this.constParams;
        }

        public GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigs setDynamicDataSourceId(String dynamicDataSourceId) {
            this.dynamicDataSourceId = dynamicDataSourceId;
            return this;
        }
        public String getDynamicDataSourceId() {
            return this.dynamicDataSourceId;
        }

        public GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigs setPullConfig(GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig pullConfig) {
            this.pullConfig = pullConfig;
            return this;
        }
        public GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig getPullConfig() {
            return this.pullConfig;
        }

    }

    public static class GetAssistantCapabilityRequestMessagesContentDingNormalCard extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("cardData")
        public GetAssistantCapabilityRequestMessagesContentDingNormalCardCardData cardData;

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
        public GetAssistantCapabilityRequestMessagesContentDingNormalCardCardUpdateOptions cardUpdateOptions;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dynamicDataSourceConfigs")
        public java.util.List<GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigs> dynamicDataSourceConfigs;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("privateData")
        public java.util.Map<String, ?> privateData;

        public static GetAssistantCapabilityRequestMessagesContentDingNormalCard build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContentDingNormalCard self = new GetAssistantCapabilityRequestMessagesContentDingNormalCard();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContentDingNormalCard setCardData(GetAssistantCapabilityRequestMessagesContentDingNormalCardCardData cardData) {
            this.cardData = cardData;
            return this;
        }
        public GetAssistantCapabilityRequestMessagesContentDingNormalCardCardData getCardData() {
            return this.cardData;
        }

        public GetAssistantCapabilityRequestMessagesContentDingNormalCard setCardTemplateId(String cardTemplateId) {
            this.cardTemplateId = cardTemplateId;
            return this;
        }
        public String getCardTemplateId() {
            return this.cardTemplateId;
        }

        public GetAssistantCapabilityRequestMessagesContentDingNormalCard setCardUpdateOptions(GetAssistantCapabilityRequestMessagesContentDingNormalCardCardUpdateOptions cardUpdateOptions) {
            this.cardUpdateOptions = cardUpdateOptions;
            return this;
        }
        public GetAssistantCapabilityRequestMessagesContentDingNormalCardCardUpdateOptions getCardUpdateOptions() {
            return this.cardUpdateOptions;
        }

        public GetAssistantCapabilityRequestMessagesContentDingNormalCard setDynamicDataSourceConfigs(java.util.List<GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigs> dynamicDataSourceConfigs) {
            this.dynamicDataSourceConfigs = dynamicDataSourceConfigs;
            return this;
        }
        public java.util.List<GetAssistantCapabilityRequestMessagesContentDingNormalCardDynamicDataSourceConfigs> getDynamicDataSourceConfigs() {
            return this.dynamicDataSourceConfigs;
        }

        public GetAssistantCapabilityRequestMessagesContentDingNormalCard setPrivateData(java.util.Map<String, ?> privateData) {
            this.privateData = privateData;
            return this;
        }
        public java.util.Map<String, ?> getPrivateData() {
            return this.privateData;
        }

    }

    public static class GetAssistantCapabilityRequestMessagesContentMarkdown extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ol>
         * <li>markdown内容</li>
         * <li>markdown内容</li>
         * </ol>
         */
        @NameInMap("value")
        public String value;

        public static GetAssistantCapabilityRequestMessagesContentMarkdown build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContentMarkdown self = new GetAssistantCapabilityRequestMessagesContentMarkdown();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContentMarkdown setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAssistantCapabilityRequestMessagesContentStructViewPartsDataPart extends TeaModel {
        @NameInMap("data")
        public Object data;

        public static GetAssistantCapabilityRequestMessagesContentStructViewPartsDataPart build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContentStructViewPartsDataPart self = new GetAssistantCapabilityRequestMessagesContentStructViewPartsDataPart();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewPartsDataPart setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

    }

    public static class GetAssistantCapabilityRequestMessagesContentStructViewPartsReasonPart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("reason")
        public String reason;

        public static GetAssistantCapabilityRequestMessagesContentStructViewPartsReasonPart build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContentStructViewPartsReasonPart self = new GetAssistantCapabilityRequestMessagesContentStructViewPartsReasonPart();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewPartsReasonPart setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class GetAssistantCapabilityRequestMessagesContentStructViewPartsRecommendPartRecommends extends TeaModel {
        @NameInMap("mobileUrl")
        public String mobileUrl;

        @NameInMap("text")
        public String text;

        @NameInMap("url")
        public String url;

        public static GetAssistantCapabilityRequestMessagesContentStructViewPartsRecommendPartRecommends build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContentStructViewPartsRecommendPartRecommends self = new GetAssistantCapabilityRequestMessagesContentStructViewPartsRecommendPartRecommends();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewPartsRecommendPartRecommends setMobileUrl(String mobileUrl) {
            this.mobileUrl = mobileUrl;
            return this;
        }
        public String getMobileUrl() {
            return this.mobileUrl;
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewPartsRecommendPartRecommends setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewPartsRecommendPartRecommends setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetAssistantCapabilityRequestMessagesContentStructViewPartsRecommendPart extends TeaModel {
        @NameInMap("recommends")
        public java.util.List<GetAssistantCapabilityRequestMessagesContentStructViewPartsRecommendPartRecommends> recommends;

        public static GetAssistantCapabilityRequestMessagesContentStructViewPartsRecommendPart build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContentStructViewPartsRecommendPart self = new GetAssistantCapabilityRequestMessagesContentStructViewPartsRecommendPart();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewPartsRecommendPart setRecommends(java.util.List<GetAssistantCapabilityRequestMessagesContentStructViewPartsRecommendPartRecommends> recommends) {
            this.recommends = recommends;
            return this;
        }
        public java.util.List<GetAssistantCapabilityRequestMessagesContentStructViewPartsRecommendPartRecommends> getRecommends() {
            return this.recommends;
        }

    }

    public static class GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePartReferences extends TeaModel {
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

        public static GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePartReferences build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePartReferences self = new GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePartReferences();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePartReferences setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePartReferences setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePartReferences setSourceCode(String sourceCode) {
            this.sourceCode = sourceCode;
            return this;
        }
        public String getSourceCode() {
            return this.sourceCode;
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePartReferences setSourceIcon(String sourceIcon) {
            this.sourceIcon = sourceIcon;
            return this;
        }
        public String getSourceIcon() {
            return this.sourceIcon;
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePartReferences setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePartReferences setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePartReferences setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePart extends TeaModel {
        @NameInMap("references")
        public java.util.List<GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePartReferences> references;

        public static GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePart build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePart self = new GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePart();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePart setReferences(java.util.List<GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePartReferences> references) {
            this.references = references;
            return this;
        }
        public java.util.List<GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePartReferences> getReferences() {
            return this.references;
        }

    }

    public static class GetAssistantCapabilityRequestMessagesContentStructViewPartsTextPart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("text")
        public String text;

        public static GetAssistantCapabilityRequestMessagesContentStructViewPartsTextPart build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContentStructViewPartsTextPart self = new GetAssistantCapabilityRequestMessagesContentStructViewPartsTextPart();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewPartsTextPart setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetAssistantCapabilityRequestMessagesContentStructViewParts extends TeaModel {
        @NameInMap("append")
        public Boolean append;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dataPart")
        public GetAssistantCapabilityRequestMessagesContentStructViewPartsDataPart dataPart;

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
        public GetAssistantCapabilityRequestMessagesContentStructViewPartsReasonPart reasonPart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("recommendPart")
        public GetAssistantCapabilityRequestMessagesContentStructViewPartsRecommendPart recommendPart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("referencePart")
        public GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePart referencePart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("textPart")
        public GetAssistantCapabilityRequestMessagesContentStructViewPartsTextPart textPart;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>textPart</p>
         */
        @NameInMap("type")
        public String type;

        public static GetAssistantCapabilityRequestMessagesContentStructViewParts build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContentStructViewParts self = new GetAssistantCapabilityRequestMessagesContentStructViewParts();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewParts setAppend(Boolean append) {
            this.append = append;
            return this;
        }
        public Boolean getAppend() {
            return this.append;
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewParts setDataPart(GetAssistantCapabilityRequestMessagesContentStructViewPartsDataPart dataPart) {
            this.dataPart = dataPart;
            return this;
        }
        public GetAssistantCapabilityRequestMessagesContentStructViewPartsDataPart getDataPart() {
            return this.dataPart;
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewParts setFinish(Boolean finish) {
            this.finish = finish;
            return this;
        }
        public Boolean getFinish() {
            return this.finish;
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewParts setPartDesc(String partDesc) {
            this.partDesc = partDesc;
            return this;
        }
        public String getPartDesc() {
            return this.partDesc;
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewParts setPartId(String partId) {
            this.partId = partId;
            return this;
        }
        public String getPartId() {
            return this.partId;
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewParts setReasonPart(GetAssistantCapabilityRequestMessagesContentStructViewPartsReasonPart reasonPart) {
            this.reasonPart = reasonPart;
            return this;
        }
        public GetAssistantCapabilityRequestMessagesContentStructViewPartsReasonPart getReasonPart() {
            return this.reasonPart;
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewParts setRecommendPart(GetAssistantCapabilityRequestMessagesContentStructViewPartsRecommendPart recommendPart) {
            this.recommendPart = recommendPart;
            return this;
        }
        public GetAssistantCapabilityRequestMessagesContentStructViewPartsRecommendPart getRecommendPart() {
            return this.recommendPart;
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewParts setReferencePart(GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePart referencePart) {
            this.referencePart = referencePart;
            return this;
        }
        public GetAssistantCapabilityRequestMessagesContentStructViewPartsReferencePart getReferencePart() {
            return this.referencePart;
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewParts setTextPart(GetAssistantCapabilityRequestMessagesContentStructViewPartsTextPart textPart) {
            this.textPart = textPart;
            return this;
        }
        public GetAssistantCapabilityRequestMessagesContentStructViewPartsTextPart getTextPart() {
            return this.textPart;
        }

        public GetAssistantCapabilityRequestMessagesContentStructViewParts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetAssistantCapabilityRequestMessagesContentStructView extends TeaModel {
        @NameInMap("parts")
        public java.util.List<GetAssistantCapabilityRequestMessagesContentStructViewParts> parts;

        public static GetAssistantCapabilityRequestMessagesContentStructView build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContentStructView self = new GetAssistantCapabilityRequestMessagesContentStructView();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContentStructView setParts(java.util.List<GetAssistantCapabilityRequestMessagesContentStructViewParts> parts) {
            this.parts = parts;
            return this;
        }
        public java.util.List<GetAssistantCapabilityRequestMessagesContentStructViewParts> getParts() {
            return this.parts;
        }

    }

    public static class GetAssistantCapabilityRequestMessagesContentText extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>你好！</p>
         */
        @NameInMap("value")
        public String value;

        public static GetAssistantCapabilityRequestMessagesContentText build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContentText self = new GetAssistantCapabilityRequestMessagesContentText();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContentText setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAssistantCapabilityRequestMessagesContent extends TeaModel {
        @NameInMap("cardCallback")
        public GetAssistantCapabilityRequestMessagesContentCardCallback cardCallback;

        @NameInMap("dingCard")
        public GetAssistantCapabilityRequestMessagesContentDingCard dingCard;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dingNormalCard")
        public GetAssistantCapabilityRequestMessagesContentDingNormalCard dingNormalCard;

        @NameInMap("markdown")
        public GetAssistantCapabilityRequestMessagesContentMarkdown markdown;

        @NameInMap("structView")
        public GetAssistantCapabilityRequestMessagesContentStructView structView;

        @NameInMap("text")
        public GetAssistantCapabilityRequestMessagesContentText text;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>枚举字段，可为：text,markdown,cardCallback,dingCard,agentArtifact,dingNormalCard</p>
         */
        @NameInMap("type")
        public String type;

        public static GetAssistantCapabilityRequestMessagesContent build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessagesContent self = new GetAssistantCapabilityRequestMessagesContent();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessagesContent setCardCallback(GetAssistantCapabilityRequestMessagesContentCardCallback cardCallback) {
            this.cardCallback = cardCallback;
            return this;
        }
        public GetAssistantCapabilityRequestMessagesContentCardCallback getCardCallback() {
            return this.cardCallback;
        }

        public GetAssistantCapabilityRequestMessagesContent setDingCard(GetAssistantCapabilityRequestMessagesContentDingCard dingCard) {
            this.dingCard = dingCard;
            return this;
        }
        public GetAssistantCapabilityRequestMessagesContentDingCard getDingCard() {
            return this.dingCard;
        }

        public GetAssistantCapabilityRequestMessagesContent setDingNormalCard(GetAssistantCapabilityRequestMessagesContentDingNormalCard dingNormalCard) {
            this.dingNormalCard = dingNormalCard;
            return this;
        }
        public GetAssistantCapabilityRequestMessagesContentDingNormalCard getDingNormalCard() {
            return this.dingNormalCard;
        }

        public GetAssistantCapabilityRequestMessagesContent setMarkdown(GetAssistantCapabilityRequestMessagesContentMarkdown markdown) {
            this.markdown = markdown;
            return this;
        }
        public GetAssistantCapabilityRequestMessagesContentMarkdown getMarkdown() {
            return this.markdown;
        }

        public GetAssistantCapabilityRequestMessagesContent setStructView(GetAssistantCapabilityRequestMessagesContentStructView structView) {
            this.structView = structView;
            return this;
        }
        public GetAssistantCapabilityRequestMessagesContentStructView getStructView() {
            return this.structView;
        }

        public GetAssistantCapabilityRequestMessagesContent setText(GetAssistantCapabilityRequestMessagesContentText text) {
            this.text = text;
            return this;
        }
        public GetAssistantCapabilityRequestMessagesContentText getText() {
            return this.text;
        }

        public GetAssistantCapabilityRequestMessagesContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetAssistantCapabilityRequestMessages extends TeaModel {
        @NameInMap("content")
        public GetAssistantCapabilityRequestMessagesContent content;

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

        public static GetAssistantCapabilityRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            GetAssistantCapabilityRequestMessages self = new GetAssistantCapabilityRequestMessages();
            return TeaModel.build(map, self);
        }

        public GetAssistantCapabilityRequestMessages setContent(GetAssistantCapabilityRequestMessagesContent content) {
            this.content = content;
            return this;
        }
        public GetAssistantCapabilityRequestMessagesContent getContent() {
            return this.content;
        }

        public GetAssistantCapabilityRequestMessages setContentDesc(String contentDesc) {
            this.contentDesc = contentDesc;
            return this;
        }
        public String getContentDesc() {
            return this.contentDesc;
        }

        public GetAssistantCapabilityRequestMessages setCreateAt(Long createAt) {
            this.createAt = createAt;
            return this;
        }
        public Long getCreateAt() {
            return this.createAt;
        }

        public GetAssistantCapabilityRequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
