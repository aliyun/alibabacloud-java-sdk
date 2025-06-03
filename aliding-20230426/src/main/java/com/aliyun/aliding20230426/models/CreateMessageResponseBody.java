// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMessageResponseBody extends TeaModel {
    @NameInMap("messages")
    public java.util.List<CreateMessageResponseBodyMessages> messages;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageResponseBody self = new CreateMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMessageResponseBody setMessages(java.util.List<CreateMessageResponseBodyMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<CreateMessageResponseBodyMessages> getMessages() {
        return this.messages;
    }

    public CreateMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateMessageResponseBodyMessagesContentCardCallback extends TeaModel {
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

        public static CreateMessageResponseBodyMessagesContentCardCallback build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContentCardCallback self = new CreateMessageResponseBodyMessagesContentCardCallback();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContentCardCallback setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateMessageResponseBodyMessagesContentCardCallback setRelatedMessageId(String relatedMessageId) {
            this.relatedMessageId = relatedMessageId;
            return this;
        }
        public String getRelatedMessageId() {
            return this.relatedMessageId;
        }

    }

    public static class CreateMessageResponseBodyMessagesContentDingCard extends TeaModel {
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

        public static CreateMessageResponseBodyMessagesContentDingCard build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContentDingCard self = new CreateMessageResponseBodyMessagesContentDingCard();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContentDingCard setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateMessageResponseBodyMessagesContentDingCard setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateMessageResponseBodyMessagesContentDingCard setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public CreateMessageResponseBodyMessagesContentDingCard setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class CreateMessageResponseBodyMessagesContentDingNormalCardCardData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("cardParamMap")
        public java.util.Map<String, ?> cardParamMap;

        public static CreateMessageResponseBodyMessagesContentDingNormalCardCardData build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContentDingNormalCardCardData self = new CreateMessageResponseBodyMessagesContentDingNormalCardCardData();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContentDingNormalCardCardData setCardParamMap(java.util.Map<String, ?> cardParamMap) {
            this.cardParamMap = cardParamMap;
            return this;
        }
        public java.util.Map<String, ?> getCardParamMap() {
            return this.cardParamMap;
        }

    }

    public static class CreateMessageResponseBodyMessagesContentDingNormalCardCardUpdateOptions extends TeaModel {
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

        public static CreateMessageResponseBodyMessagesContentDingNormalCardCardUpdateOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContentDingNormalCardCardUpdateOptions self = new CreateMessageResponseBodyMessagesContentDingNormalCardCardUpdateOptions();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContentDingNormalCardCardUpdateOptions setUpdateCardDataByKey(Boolean updateCardDataByKey) {
            this.updateCardDataByKey = updateCardDataByKey;
            return this;
        }
        public Boolean getUpdateCardDataByKey() {
            return this.updateCardDataByKey;
        }

        public CreateMessageResponseBodyMessagesContentDingNormalCardCardUpdateOptions setUpdatePrivateDataByKey(Boolean updatePrivateDataByKey) {
            this.updatePrivateDataByKey = updatePrivateDataByKey;
            return this;
        }
        public Boolean getUpdatePrivateDataByKey() {
            return this.updatePrivateDataByKey;
        }

    }

    public static class CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig extends TeaModel {
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

        public static CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig self = new CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setPullStrategy(String pullStrategy) {
            this.pullStrategy = pullStrategy;
            return this;
        }
        public String getPullStrategy() {
            return this.pullStrategy;
        }

        public CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

    }

    public static class CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs extends TeaModel {
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
        public CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig pullConfig;

        public static CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs self = new CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs setConstParams(java.util.Map<String, ?> constParams) {
            this.constParams = constParams;
            return this;
        }
        public java.util.Map<String, ?> getConstParams() {
            return this.constParams;
        }

        public CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs setDynamicDataSourceId(String dynamicDataSourceId) {
            this.dynamicDataSourceId = dynamicDataSourceId;
            return this;
        }
        public String getDynamicDataSourceId() {
            return this.dynamicDataSourceId;
        }

        public CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs setPullConfig(CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig pullConfig) {
            this.pullConfig = pullConfig;
            return this;
        }
        public CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig getPullConfig() {
            return this.pullConfig;
        }

    }

    public static class CreateMessageResponseBodyMessagesContentDingNormalCard extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("cardData")
        public CreateMessageResponseBodyMessagesContentDingNormalCardCardData cardData;

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
        public CreateMessageResponseBodyMessagesContentDingNormalCardCardUpdateOptions cardUpdateOptions;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dynamicDataSourceConfigs")
        public java.util.List<CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs> dynamicDataSourceConfigs;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("privateData")
        public java.util.Map<String, java.util.Map<String, ?>> privateData;

        public static CreateMessageResponseBodyMessagesContentDingNormalCard build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContentDingNormalCard self = new CreateMessageResponseBodyMessagesContentDingNormalCard();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContentDingNormalCard setCardData(CreateMessageResponseBodyMessagesContentDingNormalCardCardData cardData) {
            this.cardData = cardData;
            return this;
        }
        public CreateMessageResponseBodyMessagesContentDingNormalCardCardData getCardData() {
            return this.cardData;
        }

        public CreateMessageResponseBodyMessagesContentDingNormalCard setCardTemplateId(String cardTemplateId) {
            this.cardTemplateId = cardTemplateId;
            return this;
        }
        public String getCardTemplateId() {
            return this.cardTemplateId;
        }

        public CreateMessageResponseBodyMessagesContentDingNormalCard setCardUpdateOptions(CreateMessageResponseBodyMessagesContentDingNormalCardCardUpdateOptions cardUpdateOptions) {
            this.cardUpdateOptions = cardUpdateOptions;
            return this;
        }
        public CreateMessageResponseBodyMessagesContentDingNormalCardCardUpdateOptions getCardUpdateOptions() {
            return this.cardUpdateOptions;
        }

        public CreateMessageResponseBodyMessagesContentDingNormalCard setDynamicDataSourceConfigs(java.util.List<CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs> dynamicDataSourceConfigs) {
            this.dynamicDataSourceConfigs = dynamicDataSourceConfigs;
            return this;
        }
        public java.util.List<CreateMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs> getDynamicDataSourceConfigs() {
            return this.dynamicDataSourceConfigs;
        }

        public CreateMessageResponseBodyMessagesContentDingNormalCard setPrivateData(java.util.Map<String, java.util.Map<String, ?>> privateData) {
            this.privateData = privateData;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getPrivateData() {
            return this.privateData;
        }

    }

    public static class CreateMessageResponseBodyMessagesContentMarkdown extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ol>
         * <li>markdown内容</li>
         * <li>markdown内容</li>
         * </ol>
         */
        @NameInMap("value")
        public String value;

        public static CreateMessageResponseBodyMessagesContentMarkdown build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContentMarkdown self = new CreateMessageResponseBodyMessagesContentMarkdown();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContentMarkdown setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateMessageResponseBodyMessagesContentStructViewPartsDataPart extends TeaModel {
        @NameInMap("data")
        public Object data;

        public static CreateMessageResponseBodyMessagesContentStructViewPartsDataPart build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContentStructViewPartsDataPart self = new CreateMessageResponseBodyMessagesContentStructViewPartsDataPart();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContentStructViewPartsDataPart setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

    }

    public static class CreateMessageResponseBodyMessagesContentStructViewPartsReasonPart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("reason")
        public String reason;

        public static CreateMessageResponseBodyMessagesContentStructViewPartsReasonPart build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContentStructViewPartsReasonPart self = new CreateMessageResponseBodyMessagesContentStructViewPartsReasonPart();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContentStructViewPartsReasonPart setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class CreateMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends extends TeaModel {
        @NameInMap("mobileUrl")
        public String mobileUrl;

        @NameInMap("text")
        public String text;

        @NameInMap("url")
        public String url;

        public static CreateMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends self = new CreateMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends setMobileUrl(String mobileUrl) {
            this.mobileUrl = mobileUrl;
            return this;
        }
        public String getMobileUrl() {
            return this.mobileUrl;
        }

        public CreateMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public CreateMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateMessageResponseBodyMessagesContentStructViewPartsRecommendPart extends TeaModel {
        @NameInMap("recommends")
        public java.util.List<CreateMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends> recommends;

        public static CreateMessageResponseBodyMessagesContentStructViewPartsRecommendPart build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContentStructViewPartsRecommendPart self = new CreateMessageResponseBodyMessagesContentStructViewPartsRecommendPart();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContentStructViewPartsRecommendPart setRecommends(java.util.List<CreateMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends> recommends) {
            this.recommends = recommends;
            return this;
        }
        public java.util.List<CreateMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends> getRecommends() {
            return this.recommends;
        }

    }

    public static class CreateMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences extends TeaModel {
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

        public static CreateMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences self = new CreateMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public CreateMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences setSourceCode(String sourceCode) {
            this.sourceCode = sourceCode;
            return this;
        }
        public String getSourceCode() {
            return this.sourceCode;
        }

        public CreateMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences setSourceIcon(String sourceIcon) {
            this.sourceIcon = sourceIcon;
            return this;
        }
        public String getSourceIcon() {
            return this.sourceIcon;
        }

        public CreateMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public CreateMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateMessageResponseBodyMessagesContentStructViewPartsReferencePart extends TeaModel {
        @NameInMap("references")
        public java.util.List<CreateMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences> references;

        public static CreateMessageResponseBodyMessagesContentStructViewPartsReferencePart build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContentStructViewPartsReferencePart self = new CreateMessageResponseBodyMessagesContentStructViewPartsReferencePart();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContentStructViewPartsReferencePart setReferences(java.util.List<CreateMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences> references) {
            this.references = references;
            return this;
        }
        public java.util.List<CreateMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences> getReferences() {
            return this.references;
        }

    }

    public static class CreateMessageResponseBodyMessagesContentStructViewPartsTextPart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("text")
        public String text;

        public static CreateMessageResponseBodyMessagesContentStructViewPartsTextPart build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContentStructViewPartsTextPart self = new CreateMessageResponseBodyMessagesContentStructViewPartsTextPart();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContentStructViewPartsTextPart setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class CreateMessageResponseBodyMessagesContentStructViewParts extends TeaModel {
        @NameInMap("append")
        public Boolean append;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dataPart")
        public CreateMessageResponseBodyMessagesContentStructViewPartsDataPart dataPart;

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
        public CreateMessageResponseBodyMessagesContentStructViewPartsReasonPart reasonPart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("recommendPart")
        public CreateMessageResponseBodyMessagesContentStructViewPartsRecommendPart recommendPart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("referencePart")
        public CreateMessageResponseBodyMessagesContentStructViewPartsReferencePart referencePart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("textPart")
        public CreateMessageResponseBodyMessagesContentStructViewPartsTextPart textPart;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>textPart</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateMessageResponseBodyMessagesContentStructViewParts build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContentStructViewParts self = new CreateMessageResponseBodyMessagesContentStructViewParts();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContentStructViewParts setAppend(Boolean append) {
            this.append = append;
            return this;
        }
        public Boolean getAppend() {
            return this.append;
        }

        public CreateMessageResponseBodyMessagesContentStructViewParts setDataPart(CreateMessageResponseBodyMessagesContentStructViewPartsDataPart dataPart) {
            this.dataPart = dataPart;
            return this;
        }
        public CreateMessageResponseBodyMessagesContentStructViewPartsDataPart getDataPart() {
            return this.dataPart;
        }

        public CreateMessageResponseBodyMessagesContentStructViewParts setFinish(Boolean finish) {
            this.finish = finish;
            return this;
        }
        public Boolean getFinish() {
            return this.finish;
        }

        public CreateMessageResponseBodyMessagesContentStructViewParts setPartDesc(String partDesc) {
            this.partDesc = partDesc;
            return this;
        }
        public String getPartDesc() {
            return this.partDesc;
        }

        public CreateMessageResponseBodyMessagesContentStructViewParts setPartId(String partId) {
            this.partId = partId;
            return this;
        }
        public String getPartId() {
            return this.partId;
        }

        public CreateMessageResponseBodyMessagesContentStructViewParts setReasonPart(CreateMessageResponseBodyMessagesContentStructViewPartsReasonPart reasonPart) {
            this.reasonPart = reasonPart;
            return this;
        }
        public CreateMessageResponseBodyMessagesContentStructViewPartsReasonPart getReasonPart() {
            return this.reasonPart;
        }

        public CreateMessageResponseBodyMessagesContentStructViewParts setRecommendPart(CreateMessageResponseBodyMessagesContentStructViewPartsRecommendPart recommendPart) {
            this.recommendPart = recommendPart;
            return this;
        }
        public CreateMessageResponseBodyMessagesContentStructViewPartsRecommendPart getRecommendPart() {
            return this.recommendPart;
        }

        public CreateMessageResponseBodyMessagesContentStructViewParts setReferencePart(CreateMessageResponseBodyMessagesContentStructViewPartsReferencePart referencePart) {
            this.referencePart = referencePart;
            return this;
        }
        public CreateMessageResponseBodyMessagesContentStructViewPartsReferencePart getReferencePart() {
            return this.referencePart;
        }

        public CreateMessageResponseBodyMessagesContentStructViewParts setTextPart(CreateMessageResponseBodyMessagesContentStructViewPartsTextPart textPart) {
            this.textPart = textPart;
            return this;
        }
        public CreateMessageResponseBodyMessagesContentStructViewPartsTextPart getTextPart() {
            return this.textPart;
        }

        public CreateMessageResponseBodyMessagesContentStructViewParts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateMessageResponseBodyMessagesContentStructView extends TeaModel {
        @NameInMap("parts")
        public java.util.List<CreateMessageResponseBodyMessagesContentStructViewParts> parts;

        public static CreateMessageResponseBodyMessagesContentStructView build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContentStructView self = new CreateMessageResponseBodyMessagesContentStructView();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContentStructView setParts(java.util.List<CreateMessageResponseBodyMessagesContentStructViewParts> parts) {
            this.parts = parts;
            return this;
        }
        public java.util.List<CreateMessageResponseBodyMessagesContentStructViewParts> getParts() {
            return this.parts;
        }

    }

    public static class CreateMessageResponseBodyMessagesContentText extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>你好！</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateMessageResponseBodyMessagesContentText build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContentText self = new CreateMessageResponseBodyMessagesContentText();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContentText setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateMessageResponseBodyMessagesContent extends TeaModel {
        @NameInMap("cardCallback")
        public CreateMessageResponseBodyMessagesContentCardCallback cardCallback;

        @NameInMap("dingCard")
        public CreateMessageResponseBodyMessagesContentDingCard dingCard;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dingNormalCard")
        public CreateMessageResponseBodyMessagesContentDingNormalCard dingNormalCard;

        @NameInMap("markdown")
        public CreateMessageResponseBodyMessagesContentMarkdown markdown;

        @NameInMap("structView")
        public CreateMessageResponseBodyMessagesContentStructView structView;

        @NameInMap("text")
        public CreateMessageResponseBodyMessagesContentText text;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>枚举字段，可为：text,markdown,cardCallback,dingCard,agentArtifact,dingNormalCard</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateMessageResponseBodyMessagesContent build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessagesContent self = new CreateMessageResponseBodyMessagesContent();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessagesContent setCardCallback(CreateMessageResponseBodyMessagesContentCardCallback cardCallback) {
            this.cardCallback = cardCallback;
            return this;
        }
        public CreateMessageResponseBodyMessagesContentCardCallback getCardCallback() {
            return this.cardCallback;
        }

        public CreateMessageResponseBodyMessagesContent setDingCard(CreateMessageResponseBodyMessagesContentDingCard dingCard) {
            this.dingCard = dingCard;
            return this;
        }
        public CreateMessageResponseBodyMessagesContentDingCard getDingCard() {
            return this.dingCard;
        }

        public CreateMessageResponseBodyMessagesContent setDingNormalCard(CreateMessageResponseBodyMessagesContentDingNormalCard dingNormalCard) {
            this.dingNormalCard = dingNormalCard;
            return this;
        }
        public CreateMessageResponseBodyMessagesContentDingNormalCard getDingNormalCard() {
            return this.dingNormalCard;
        }

        public CreateMessageResponseBodyMessagesContent setMarkdown(CreateMessageResponseBodyMessagesContentMarkdown markdown) {
            this.markdown = markdown;
            return this;
        }
        public CreateMessageResponseBodyMessagesContentMarkdown getMarkdown() {
            return this.markdown;
        }

        public CreateMessageResponseBodyMessagesContent setStructView(CreateMessageResponseBodyMessagesContentStructView structView) {
            this.structView = structView;
            return this;
        }
        public CreateMessageResponseBodyMessagesContentStructView getStructView() {
            return this.structView;
        }

        public CreateMessageResponseBodyMessagesContent setText(CreateMessageResponseBodyMessagesContentText text) {
            this.text = text;
            return this;
        }
        public CreateMessageResponseBodyMessagesContentText getText() {
            return this.text;
        }

        public CreateMessageResponseBodyMessagesContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateMessageResponseBodyMessages extends TeaModel {
        @NameInMap("content")
        public CreateMessageResponseBodyMessagesContent content;

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
         * <p>messageId1</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>runId1</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <strong>example:</strong>
         * <p>threadId1</p>
         */
        @NameInMap("threadId")
        public String threadId;

        public static CreateMessageResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageResponseBodyMessages self = new CreateMessageResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public CreateMessageResponseBodyMessages setContent(CreateMessageResponseBodyMessagesContent content) {
            this.content = content;
            return this;
        }
        public CreateMessageResponseBodyMessagesContent getContent() {
            return this.content;
        }

        public CreateMessageResponseBodyMessages setContentDesc(String contentDesc) {
            this.contentDesc = contentDesc;
            return this;
        }
        public String getContentDesc() {
            return this.contentDesc;
        }

        public CreateMessageResponseBodyMessages setCreateAt(Long createAt) {
            this.createAt = createAt;
            return this;
        }
        public Long getCreateAt() {
            return this.createAt;
        }

        public CreateMessageResponseBodyMessages setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateMessageResponseBodyMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateMessageResponseBodyMessages setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public CreateMessageResponseBodyMessages setThreadId(String threadId) {
            this.threadId = threadId;
            return this;
        }
        public String getThreadId() {
            return this.threadId;
        }

    }

}
