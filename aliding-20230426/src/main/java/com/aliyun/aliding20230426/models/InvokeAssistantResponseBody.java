// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokeAssistantResponseBody extends TeaModel {
    @NameInMap("messages")
    public java.util.List<InvokeAssistantResponseBodyMessages> messages;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>sessionId1</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("streamEnd")
    public Boolean streamEnd;

    public static InvokeAssistantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeAssistantResponseBody self = new InvokeAssistantResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeAssistantResponseBody setMessages(java.util.List<InvokeAssistantResponseBodyMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<InvokeAssistantResponseBodyMessages> getMessages() {
        return this.messages;
    }

    public InvokeAssistantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvokeAssistantResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public InvokeAssistantResponseBody setStreamEnd(Boolean streamEnd) {
        this.streamEnd = streamEnd;
        return this;
    }
    public Boolean getStreamEnd() {
        return this.streamEnd;
    }

    public static class InvokeAssistantResponseBodyMessagesContentCardCallback extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>aliding_messageId123</p>
         */
        @NameInMap("relatedMessageId")
        public String relatedMessageId;

        public static InvokeAssistantResponseBodyMessagesContentCardCallback build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContentCardCallback self = new InvokeAssistantResponseBodyMessagesContentCardCallback();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContentCardCallback setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public InvokeAssistantResponseBodyMessagesContentCardCallback setRelatedMessageId(String relatedMessageId) {
            this.relatedMessageId = relatedMessageId;
            return this;
        }
        public String getRelatedMessageId() {
            return this.relatedMessageId;
        }

    }

    public static class InvokeAssistantResponseBodyMessagesContentDingCard extends TeaModel {
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

        public static InvokeAssistantResponseBodyMessagesContentDingCard build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContentDingCard self = new InvokeAssistantResponseBodyMessagesContentDingCard();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContentDingCard setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public InvokeAssistantResponseBodyMessagesContentDingCard setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public InvokeAssistantResponseBodyMessagesContentDingCard setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public InvokeAssistantResponseBodyMessagesContentDingCard setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class InvokeAssistantResponseBodyMessagesContentDingNormalCardCardData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("cardParamMap")
        public java.util.Map<String, ?> cardParamMap;

        public static InvokeAssistantResponseBodyMessagesContentDingNormalCardCardData build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContentDingNormalCardCardData self = new InvokeAssistantResponseBodyMessagesContentDingNormalCardCardData();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContentDingNormalCardCardData setCardParamMap(java.util.Map<String, ?> cardParamMap) {
            this.cardParamMap = cardParamMap;
            return this;
        }
        public java.util.Map<String, ?> getCardParamMap() {
            return this.cardParamMap;
        }

    }

    public static class InvokeAssistantResponseBodyMessagesContentDingNormalCardCardUpdateOptions extends TeaModel {
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

        public static InvokeAssistantResponseBodyMessagesContentDingNormalCardCardUpdateOptions build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContentDingNormalCardCardUpdateOptions self = new InvokeAssistantResponseBodyMessagesContentDingNormalCardCardUpdateOptions();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContentDingNormalCardCardUpdateOptions setUpdateCardDataByKey(Boolean updateCardDataByKey) {
            this.updateCardDataByKey = updateCardDataByKey;
            return this;
        }
        public Boolean getUpdateCardDataByKey() {
            return this.updateCardDataByKey;
        }

        public InvokeAssistantResponseBodyMessagesContentDingNormalCardCardUpdateOptions setUpdatePrivateDataByKey(Boolean updatePrivateDataByKey) {
            this.updatePrivateDataByKey = updatePrivateDataByKey;
            return this;
        }
        public Boolean getUpdatePrivateDataByKey() {
            return this.updatePrivateDataByKey;
        }

    }

    public static class InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig extends TeaModel {
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

        public static InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig self = new InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setPullStrategy(String pullStrategy) {
            this.pullStrategy = pullStrategy;
            return this;
        }
        public String getPullStrategy() {
            return this.pullStrategy;
        }

        public InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

    }

    public static class InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs extends TeaModel {
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
        public InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig pullConfig;

        public static InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs self = new InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs setConstParams(java.util.Map<String, ?> constParams) {
            this.constParams = constParams;
            return this;
        }
        public java.util.Map<String, ?> getConstParams() {
            return this.constParams;
        }

        public InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs setDynamicDataSourceId(String dynamicDataSourceId) {
            this.dynamicDataSourceId = dynamicDataSourceId;
            return this;
        }
        public String getDynamicDataSourceId() {
            return this.dynamicDataSourceId;
        }

        public InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs setPullConfig(InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig pullConfig) {
            this.pullConfig = pullConfig;
            return this;
        }
        public InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig getPullConfig() {
            return this.pullConfig;
        }

    }

    public static class InvokeAssistantResponseBodyMessagesContentDingNormalCard extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("cardData")
        public InvokeAssistantResponseBodyMessagesContentDingNormalCardCardData cardData;

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
        public InvokeAssistantResponseBodyMessagesContentDingNormalCardCardUpdateOptions cardUpdateOptions;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dynamicDataSourceConfigs")
        public java.util.List<InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs> dynamicDataSourceConfigs;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("privateData")
        public java.util.Map<String, java.util.Map<String, ?>> privateData;

        public static InvokeAssistantResponseBodyMessagesContentDingNormalCard build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContentDingNormalCard self = new InvokeAssistantResponseBodyMessagesContentDingNormalCard();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContentDingNormalCard setCardData(InvokeAssistantResponseBodyMessagesContentDingNormalCardCardData cardData) {
            this.cardData = cardData;
            return this;
        }
        public InvokeAssistantResponseBodyMessagesContentDingNormalCardCardData getCardData() {
            return this.cardData;
        }

        public InvokeAssistantResponseBodyMessagesContentDingNormalCard setCardTemplateId(String cardTemplateId) {
            this.cardTemplateId = cardTemplateId;
            return this;
        }
        public String getCardTemplateId() {
            return this.cardTemplateId;
        }

        public InvokeAssistantResponseBodyMessagesContentDingNormalCard setCardUpdateOptions(InvokeAssistantResponseBodyMessagesContentDingNormalCardCardUpdateOptions cardUpdateOptions) {
            this.cardUpdateOptions = cardUpdateOptions;
            return this;
        }
        public InvokeAssistantResponseBodyMessagesContentDingNormalCardCardUpdateOptions getCardUpdateOptions() {
            return this.cardUpdateOptions;
        }

        public InvokeAssistantResponseBodyMessagesContentDingNormalCard setDynamicDataSourceConfigs(java.util.List<InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs> dynamicDataSourceConfigs) {
            this.dynamicDataSourceConfigs = dynamicDataSourceConfigs;
            return this;
        }
        public java.util.List<InvokeAssistantResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs> getDynamicDataSourceConfigs() {
            return this.dynamicDataSourceConfigs;
        }

        public InvokeAssistantResponseBodyMessagesContentDingNormalCard setPrivateData(java.util.Map<String, java.util.Map<String, ?>> privateData) {
            this.privateData = privateData;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getPrivateData() {
            return this.privateData;
        }

    }

    public static class InvokeAssistantResponseBodyMessagesContentMarkdown extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ol>
         * <li>markdown内容</li>
         * <li>markdown内容</li>
         * </ol>
         */
        @NameInMap("value")
        public String value;

        public static InvokeAssistantResponseBodyMessagesContentMarkdown build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContentMarkdown self = new InvokeAssistantResponseBodyMessagesContentMarkdown();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContentMarkdown setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InvokeAssistantResponseBodyMessagesContentStructViewPartsDataPart extends TeaModel {
        @NameInMap("data")
        public Object data;

        public static InvokeAssistantResponseBodyMessagesContentStructViewPartsDataPart build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContentStructViewPartsDataPart self = new InvokeAssistantResponseBodyMessagesContentStructViewPartsDataPart();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewPartsDataPart setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

    }

    public static class InvokeAssistantResponseBodyMessagesContentStructViewPartsReasonPart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("reason")
        public String reason;

        public static InvokeAssistantResponseBodyMessagesContentStructViewPartsReasonPart build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContentStructViewPartsReasonPart self = new InvokeAssistantResponseBodyMessagesContentStructViewPartsReasonPart();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewPartsReasonPart setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class InvokeAssistantResponseBodyMessagesContentStructViewPartsRecommendPartRecommends extends TeaModel {
        @NameInMap("mobileUrl")
        public String mobileUrl;

        @NameInMap("text")
        public String text;

        @NameInMap("url")
        public String url;

        public static InvokeAssistantResponseBodyMessagesContentStructViewPartsRecommendPartRecommends build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContentStructViewPartsRecommendPartRecommends self = new InvokeAssistantResponseBodyMessagesContentStructViewPartsRecommendPartRecommends();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewPartsRecommendPartRecommends setMobileUrl(String mobileUrl) {
            this.mobileUrl = mobileUrl;
            return this;
        }
        public String getMobileUrl() {
            return this.mobileUrl;
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewPartsRecommendPartRecommends setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewPartsRecommendPartRecommends setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class InvokeAssistantResponseBodyMessagesContentStructViewPartsRecommendPart extends TeaModel {
        @NameInMap("recommends")
        public java.util.List<InvokeAssistantResponseBodyMessagesContentStructViewPartsRecommendPartRecommends> recommends;

        public static InvokeAssistantResponseBodyMessagesContentStructViewPartsRecommendPart build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContentStructViewPartsRecommendPart self = new InvokeAssistantResponseBodyMessagesContentStructViewPartsRecommendPart();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewPartsRecommendPart setRecommends(java.util.List<InvokeAssistantResponseBodyMessagesContentStructViewPartsRecommendPartRecommends> recommends) {
            this.recommends = recommends;
            return this;
        }
        public java.util.List<InvokeAssistantResponseBodyMessagesContentStructViewPartsRecommendPartRecommends> getRecommends() {
            return this.recommends;
        }

    }

    public static class InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePartReferences extends TeaModel {
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

        public static InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePartReferences build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePartReferences self = new InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePartReferences();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePartReferences setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePartReferences setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePartReferences setSourceCode(String sourceCode) {
            this.sourceCode = sourceCode;
            return this;
        }
        public String getSourceCode() {
            return this.sourceCode;
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePartReferences setSourceIcon(String sourceIcon) {
            this.sourceIcon = sourceIcon;
            return this;
        }
        public String getSourceIcon() {
            return this.sourceIcon;
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePartReferences setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePartReferences setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePartReferences setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePart extends TeaModel {
        @NameInMap("references")
        public java.util.List<InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePartReferences> references;

        public static InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePart build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePart self = new InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePart();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePart setReferences(java.util.List<InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePartReferences> references) {
            this.references = references;
            return this;
        }
        public java.util.List<InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePartReferences> getReferences() {
            return this.references;
        }

    }

    public static class InvokeAssistantResponseBodyMessagesContentStructViewPartsTextPart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("text")
        public String text;

        public static InvokeAssistantResponseBodyMessagesContentStructViewPartsTextPart build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContentStructViewPartsTextPart self = new InvokeAssistantResponseBodyMessagesContentStructViewPartsTextPart();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewPartsTextPart setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class InvokeAssistantResponseBodyMessagesContentStructViewParts extends TeaModel {
        @NameInMap("append")
        public Boolean append;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dataPart")
        public InvokeAssistantResponseBodyMessagesContentStructViewPartsDataPart dataPart;

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
        public InvokeAssistantResponseBodyMessagesContentStructViewPartsReasonPart reasonPart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("recommendPart")
        public InvokeAssistantResponseBodyMessagesContentStructViewPartsRecommendPart recommendPart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("referencePart")
        public InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePart referencePart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("textPart")
        public InvokeAssistantResponseBodyMessagesContentStructViewPartsTextPart textPart;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>textPart</p>
         */
        @NameInMap("type")
        public String type;

        public static InvokeAssistantResponseBodyMessagesContentStructViewParts build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContentStructViewParts self = new InvokeAssistantResponseBodyMessagesContentStructViewParts();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewParts setAppend(Boolean append) {
            this.append = append;
            return this;
        }
        public Boolean getAppend() {
            return this.append;
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewParts setDataPart(InvokeAssistantResponseBodyMessagesContentStructViewPartsDataPart dataPart) {
            this.dataPart = dataPart;
            return this;
        }
        public InvokeAssistantResponseBodyMessagesContentStructViewPartsDataPart getDataPart() {
            return this.dataPart;
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewParts setFinish(Boolean finish) {
            this.finish = finish;
            return this;
        }
        public Boolean getFinish() {
            return this.finish;
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewParts setPartDesc(String partDesc) {
            this.partDesc = partDesc;
            return this;
        }
        public String getPartDesc() {
            return this.partDesc;
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewParts setPartId(String partId) {
            this.partId = partId;
            return this;
        }
        public String getPartId() {
            return this.partId;
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewParts setReasonPart(InvokeAssistantResponseBodyMessagesContentStructViewPartsReasonPart reasonPart) {
            this.reasonPart = reasonPart;
            return this;
        }
        public InvokeAssistantResponseBodyMessagesContentStructViewPartsReasonPart getReasonPart() {
            return this.reasonPart;
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewParts setRecommendPart(InvokeAssistantResponseBodyMessagesContentStructViewPartsRecommendPart recommendPart) {
            this.recommendPart = recommendPart;
            return this;
        }
        public InvokeAssistantResponseBodyMessagesContentStructViewPartsRecommendPart getRecommendPart() {
            return this.recommendPart;
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewParts setReferencePart(InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePart referencePart) {
            this.referencePart = referencePart;
            return this;
        }
        public InvokeAssistantResponseBodyMessagesContentStructViewPartsReferencePart getReferencePart() {
            return this.referencePart;
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewParts setTextPart(InvokeAssistantResponseBodyMessagesContentStructViewPartsTextPart textPart) {
            this.textPart = textPart;
            return this;
        }
        public InvokeAssistantResponseBodyMessagesContentStructViewPartsTextPart getTextPart() {
            return this.textPart;
        }

        public InvokeAssistantResponseBodyMessagesContentStructViewParts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class InvokeAssistantResponseBodyMessagesContentStructView extends TeaModel {
        @NameInMap("parts")
        public java.util.List<InvokeAssistantResponseBodyMessagesContentStructViewParts> parts;

        public static InvokeAssistantResponseBodyMessagesContentStructView build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContentStructView self = new InvokeAssistantResponseBodyMessagesContentStructView();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContentStructView setParts(java.util.List<InvokeAssistantResponseBodyMessagesContentStructViewParts> parts) {
            this.parts = parts;
            return this;
        }
        public java.util.List<InvokeAssistantResponseBodyMessagesContentStructViewParts> getParts() {
            return this.parts;
        }

    }

    public static class InvokeAssistantResponseBodyMessagesContentText extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>你好！</p>
         */
        @NameInMap("value")
        public String value;

        public static InvokeAssistantResponseBodyMessagesContentText build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContentText self = new InvokeAssistantResponseBodyMessagesContentText();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContentText setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InvokeAssistantResponseBodyMessagesContent extends TeaModel {
        @NameInMap("cardCallback")
        public InvokeAssistantResponseBodyMessagesContentCardCallback cardCallback;

        @NameInMap("dingCard")
        public InvokeAssistantResponseBodyMessagesContentDingCard dingCard;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dingNormalCard")
        public InvokeAssistantResponseBodyMessagesContentDingNormalCard dingNormalCard;

        @NameInMap("markdown")
        public InvokeAssistantResponseBodyMessagesContentMarkdown markdown;

        @NameInMap("structView")
        public InvokeAssistantResponseBodyMessagesContentStructView structView;

        @NameInMap("text")
        public InvokeAssistantResponseBodyMessagesContentText text;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>枚举字段，可为：text,markdown,cardCallback,dingCard,agentArtifact,dingNormalCard</p>
         */
        @NameInMap("type")
        public String type;

        public static InvokeAssistantResponseBodyMessagesContent build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessagesContent self = new InvokeAssistantResponseBodyMessagesContent();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessagesContent setCardCallback(InvokeAssistantResponseBodyMessagesContentCardCallback cardCallback) {
            this.cardCallback = cardCallback;
            return this;
        }
        public InvokeAssistantResponseBodyMessagesContentCardCallback getCardCallback() {
            return this.cardCallback;
        }

        public InvokeAssistantResponseBodyMessagesContent setDingCard(InvokeAssistantResponseBodyMessagesContentDingCard dingCard) {
            this.dingCard = dingCard;
            return this;
        }
        public InvokeAssistantResponseBodyMessagesContentDingCard getDingCard() {
            return this.dingCard;
        }

        public InvokeAssistantResponseBodyMessagesContent setDingNormalCard(InvokeAssistantResponseBodyMessagesContentDingNormalCard dingNormalCard) {
            this.dingNormalCard = dingNormalCard;
            return this;
        }
        public InvokeAssistantResponseBodyMessagesContentDingNormalCard getDingNormalCard() {
            return this.dingNormalCard;
        }

        public InvokeAssistantResponseBodyMessagesContent setMarkdown(InvokeAssistantResponseBodyMessagesContentMarkdown markdown) {
            this.markdown = markdown;
            return this;
        }
        public InvokeAssistantResponseBodyMessagesContentMarkdown getMarkdown() {
            return this.markdown;
        }

        public InvokeAssistantResponseBodyMessagesContent setStructView(InvokeAssistantResponseBodyMessagesContentStructView structView) {
            this.structView = structView;
            return this;
        }
        public InvokeAssistantResponseBodyMessagesContentStructView getStructView() {
            return this.structView;
        }

        public InvokeAssistantResponseBodyMessagesContent setText(InvokeAssistantResponseBodyMessagesContentText text) {
            this.text = text;
            return this;
        }
        public InvokeAssistantResponseBodyMessagesContentText getText() {
            return this.text;
        }

        public InvokeAssistantResponseBodyMessagesContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class InvokeAssistantResponseBodyMessages extends TeaModel {
        @NameInMap("content")
        public InvokeAssistantResponseBodyMessagesContent content;

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

        public static InvokeAssistantResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            InvokeAssistantResponseBodyMessages self = new InvokeAssistantResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public InvokeAssistantResponseBodyMessages setContent(InvokeAssistantResponseBodyMessagesContent content) {
            this.content = content;
            return this;
        }
        public InvokeAssistantResponseBodyMessagesContent getContent() {
            return this.content;
        }

        public InvokeAssistantResponseBodyMessages setContentDesc(String contentDesc) {
            this.contentDesc = contentDesc;
            return this;
        }
        public String getContentDesc() {
            return this.contentDesc;
        }

        public InvokeAssistantResponseBodyMessages setCreateAt(Long createAt) {
            this.createAt = createAt;
            return this;
        }
        public Long getCreateAt() {
            return this.createAt;
        }

        public InvokeAssistantResponseBodyMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
