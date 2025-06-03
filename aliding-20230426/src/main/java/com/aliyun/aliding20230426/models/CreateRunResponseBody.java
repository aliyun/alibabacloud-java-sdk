// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateRunResponseBody extends TeaModel {
    @NameInMap("messages")
    public java.util.List<CreateRunResponseBodyMessages> messages;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("run")
    public CreateRunResponseBodyRun run;

    public static CreateRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRunResponseBody self = new CreateRunResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRunResponseBody setMessages(java.util.List<CreateRunResponseBodyMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<CreateRunResponseBodyMessages> getMessages() {
        return this.messages;
    }

    public CreateRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRunResponseBody setRun(CreateRunResponseBodyRun run) {
        this.run = run;
        return this;
    }
    public CreateRunResponseBodyRun getRun() {
        return this.run;
    }

    public static class CreateRunResponseBodyMessagesContentCardCallback extends TeaModel {
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

        public static CreateRunResponseBodyMessagesContentCardCallback build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContentCardCallback self = new CreateRunResponseBodyMessagesContentCardCallback();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContentCardCallback setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateRunResponseBodyMessagesContentCardCallback setRelatedMessageId(String relatedMessageId) {
            this.relatedMessageId = relatedMessageId;
            return this;
        }
        public String getRelatedMessageId() {
            return this.relatedMessageId;
        }

    }

    public static class CreateRunResponseBodyMessagesContentDingCard extends TeaModel {
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

        public static CreateRunResponseBodyMessagesContentDingCard build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContentDingCard self = new CreateRunResponseBodyMessagesContentDingCard();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContentDingCard setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateRunResponseBodyMessagesContentDingCard setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateRunResponseBodyMessagesContentDingCard setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public CreateRunResponseBodyMessagesContentDingCard setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class CreateRunResponseBodyMessagesContentDingNormalCardCardData extends TeaModel {
        @NameInMap("cardParamMap")
        public Object cardParamMap;

        public static CreateRunResponseBodyMessagesContentDingNormalCardCardData build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContentDingNormalCardCardData self = new CreateRunResponseBodyMessagesContentDingNormalCardCardData();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContentDingNormalCardCardData setCardParamMap(Object cardParamMap) {
            this.cardParamMap = cardParamMap;
            return this;
        }
        public Object getCardParamMap() {
            return this.cardParamMap;
        }

    }

    public static class CreateRunResponseBodyMessagesContentDingNormalCardCardUpdateOptions extends TeaModel {
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

        public static CreateRunResponseBodyMessagesContentDingNormalCardCardUpdateOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContentDingNormalCardCardUpdateOptions self = new CreateRunResponseBodyMessagesContentDingNormalCardCardUpdateOptions();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContentDingNormalCardCardUpdateOptions setUpdateCardDataByKey(Boolean updateCardDataByKey) {
            this.updateCardDataByKey = updateCardDataByKey;
            return this;
        }
        public Boolean getUpdateCardDataByKey() {
            return this.updateCardDataByKey;
        }

        public CreateRunResponseBodyMessagesContentDingNormalCardCardUpdateOptions setUpdatePrivateDataByKey(Boolean updatePrivateDataByKey) {
            this.updatePrivateDataByKey = updatePrivateDataByKey;
            return this;
        }
        public Boolean getUpdatePrivateDataByKey() {
            return this.updatePrivateDataByKey;
        }

    }

    public static class CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig extends TeaModel {
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

        public static CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig self = new CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setPullStrategy(String pullStrategy) {
            this.pullStrategy = pullStrategy;
            return this;
        }
        public String getPullStrategy() {
            return this.pullStrategy;
        }

        public CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

    }

    public static class CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs extends TeaModel {
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
        public CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig pullConfig;

        public static CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs self = new CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs setConstParams(java.util.Map<String, ?> constParams) {
            this.constParams = constParams;
            return this;
        }
        public java.util.Map<String, ?> getConstParams() {
            return this.constParams;
        }

        public CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs setDynamicDataSourceId(String dynamicDataSourceId) {
            this.dynamicDataSourceId = dynamicDataSourceId;
            return this;
        }
        public String getDynamicDataSourceId() {
            return this.dynamicDataSourceId;
        }

        public CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs setPullConfig(CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig pullConfig) {
            this.pullConfig = pullConfig;
            return this;
        }
        public CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig getPullConfig() {
            return this.pullConfig;
        }

    }

    public static class CreateRunResponseBodyMessagesContentDingNormalCard extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("cardData")
        public CreateRunResponseBodyMessagesContentDingNormalCardCardData cardData;

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
        public CreateRunResponseBodyMessagesContentDingNormalCardCardUpdateOptions cardUpdateOptions;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dynamicDataSourceConfigs")
        public java.util.List<CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs> dynamicDataSourceConfigs;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("privateData")
        public java.util.Map<String, java.util.Map<String, ?>> privateData;

        public static CreateRunResponseBodyMessagesContentDingNormalCard build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContentDingNormalCard self = new CreateRunResponseBodyMessagesContentDingNormalCard();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContentDingNormalCard setCardData(CreateRunResponseBodyMessagesContentDingNormalCardCardData cardData) {
            this.cardData = cardData;
            return this;
        }
        public CreateRunResponseBodyMessagesContentDingNormalCardCardData getCardData() {
            return this.cardData;
        }

        public CreateRunResponseBodyMessagesContentDingNormalCard setCardTemplateId(String cardTemplateId) {
            this.cardTemplateId = cardTemplateId;
            return this;
        }
        public String getCardTemplateId() {
            return this.cardTemplateId;
        }

        public CreateRunResponseBodyMessagesContentDingNormalCard setCardUpdateOptions(CreateRunResponseBodyMessagesContentDingNormalCardCardUpdateOptions cardUpdateOptions) {
            this.cardUpdateOptions = cardUpdateOptions;
            return this;
        }
        public CreateRunResponseBodyMessagesContentDingNormalCardCardUpdateOptions getCardUpdateOptions() {
            return this.cardUpdateOptions;
        }

        public CreateRunResponseBodyMessagesContentDingNormalCard setDynamicDataSourceConfigs(java.util.List<CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs> dynamicDataSourceConfigs) {
            this.dynamicDataSourceConfigs = dynamicDataSourceConfigs;
            return this;
        }
        public java.util.List<CreateRunResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs> getDynamicDataSourceConfigs() {
            return this.dynamicDataSourceConfigs;
        }

        public CreateRunResponseBodyMessagesContentDingNormalCard setPrivateData(java.util.Map<String, java.util.Map<String, ?>> privateData) {
            this.privateData = privateData;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getPrivateData() {
            return this.privateData;
        }

    }

    public static class CreateRunResponseBodyMessagesContentMarkdown extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ol>
         * <li>markdown内容</li>
         * <li>markdown内容</li>
         * </ol>
         */
        @NameInMap("value")
        public String value;

        public static CreateRunResponseBodyMessagesContentMarkdown build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContentMarkdown self = new CreateRunResponseBodyMessagesContentMarkdown();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContentMarkdown setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateRunResponseBodyMessagesContentStructViewPartsDataPart extends TeaModel {
        @NameInMap("data")
        public Object data;

        public static CreateRunResponseBodyMessagesContentStructViewPartsDataPart build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContentStructViewPartsDataPart self = new CreateRunResponseBodyMessagesContentStructViewPartsDataPart();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContentStructViewPartsDataPart setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

    }

    public static class CreateRunResponseBodyMessagesContentStructViewPartsReasonPart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("reason")
        public String reason;

        public static CreateRunResponseBodyMessagesContentStructViewPartsReasonPart build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContentStructViewPartsReasonPart self = new CreateRunResponseBodyMessagesContentStructViewPartsReasonPart();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContentStructViewPartsReasonPart setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class CreateRunResponseBodyMessagesContentStructViewPartsRecommendPartRecommends extends TeaModel {
        @NameInMap("mobileUrl")
        public String mobileUrl;

        @NameInMap("text")
        public String text;

        @NameInMap("url")
        public String url;

        public static CreateRunResponseBodyMessagesContentStructViewPartsRecommendPartRecommends build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContentStructViewPartsRecommendPartRecommends self = new CreateRunResponseBodyMessagesContentStructViewPartsRecommendPartRecommends();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContentStructViewPartsRecommendPartRecommends setMobileUrl(String mobileUrl) {
            this.mobileUrl = mobileUrl;
            return this;
        }
        public String getMobileUrl() {
            return this.mobileUrl;
        }

        public CreateRunResponseBodyMessagesContentStructViewPartsRecommendPartRecommends setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public CreateRunResponseBodyMessagesContentStructViewPartsRecommendPartRecommends setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateRunResponseBodyMessagesContentStructViewPartsRecommendPart extends TeaModel {
        @NameInMap("recommends")
        public java.util.List<CreateRunResponseBodyMessagesContentStructViewPartsRecommendPartRecommends> recommends;

        public static CreateRunResponseBodyMessagesContentStructViewPartsRecommendPart build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContentStructViewPartsRecommendPart self = new CreateRunResponseBodyMessagesContentStructViewPartsRecommendPart();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContentStructViewPartsRecommendPart setRecommends(java.util.List<CreateRunResponseBodyMessagesContentStructViewPartsRecommendPartRecommends> recommends) {
            this.recommends = recommends;
            return this;
        }
        public java.util.List<CreateRunResponseBodyMessagesContentStructViewPartsRecommendPartRecommends> getRecommends() {
            return this.recommends;
        }

    }

    public static class CreateRunResponseBodyMessagesContentStructViewPartsReferencePartReferences extends TeaModel {
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

        public static CreateRunResponseBodyMessagesContentStructViewPartsReferencePartReferences build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContentStructViewPartsReferencePartReferences self = new CreateRunResponseBodyMessagesContentStructViewPartsReferencePartReferences();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContentStructViewPartsReferencePartReferences setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public CreateRunResponseBodyMessagesContentStructViewPartsReferencePartReferences setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateRunResponseBodyMessagesContentStructViewPartsReferencePartReferences setSourceCode(String sourceCode) {
            this.sourceCode = sourceCode;
            return this;
        }
        public String getSourceCode() {
            return this.sourceCode;
        }

        public CreateRunResponseBodyMessagesContentStructViewPartsReferencePartReferences setSourceIcon(String sourceIcon) {
            this.sourceIcon = sourceIcon;
            return this;
        }
        public String getSourceIcon() {
            return this.sourceIcon;
        }

        public CreateRunResponseBodyMessagesContentStructViewPartsReferencePartReferences setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public CreateRunResponseBodyMessagesContentStructViewPartsReferencePartReferences setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateRunResponseBodyMessagesContentStructViewPartsReferencePartReferences setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateRunResponseBodyMessagesContentStructViewPartsReferencePart extends TeaModel {
        @NameInMap("references")
        public java.util.List<CreateRunResponseBodyMessagesContentStructViewPartsReferencePartReferences> references;

        public static CreateRunResponseBodyMessagesContentStructViewPartsReferencePart build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContentStructViewPartsReferencePart self = new CreateRunResponseBodyMessagesContentStructViewPartsReferencePart();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContentStructViewPartsReferencePart setReferences(java.util.List<CreateRunResponseBodyMessagesContentStructViewPartsReferencePartReferences> references) {
            this.references = references;
            return this;
        }
        public java.util.List<CreateRunResponseBodyMessagesContentStructViewPartsReferencePartReferences> getReferences() {
            return this.references;
        }

    }

    public static class CreateRunResponseBodyMessagesContentStructViewPartsTextPart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("text")
        public String text;

        public static CreateRunResponseBodyMessagesContentStructViewPartsTextPart build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContentStructViewPartsTextPart self = new CreateRunResponseBodyMessagesContentStructViewPartsTextPart();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContentStructViewPartsTextPart setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class CreateRunResponseBodyMessagesContentStructViewParts extends TeaModel {
        @NameInMap("append")
        public Boolean append;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dataPart")
        public CreateRunResponseBodyMessagesContentStructViewPartsDataPart dataPart;

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
        public CreateRunResponseBodyMessagesContentStructViewPartsReasonPart reasonPart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("recommendPart")
        public CreateRunResponseBodyMessagesContentStructViewPartsRecommendPart recommendPart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("referencePart")
        public CreateRunResponseBodyMessagesContentStructViewPartsReferencePart referencePart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("textPart")
        public CreateRunResponseBodyMessagesContentStructViewPartsTextPart textPart;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>textPart</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateRunResponseBodyMessagesContentStructViewParts build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContentStructViewParts self = new CreateRunResponseBodyMessagesContentStructViewParts();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContentStructViewParts setAppend(Boolean append) {
            this.append = append;
            return this;
        }
        public Boolean getAppend() {
            return this.append;
        }

        public CreateRunResponseBodyMessagesContentStructViewParts setDataPart(CreateRunResponseBodyMessagesContentStructViewPartsDataPart dataPart) {
            this.dataPart = dataPart;
            return this;
        }
        public CreateRunResponseBodyMessagesContentStructViewPartsDataPart getDataPart() {
            return this.dataPart;
        }

        public CreateRunResponseBodyMessagesContentStructViewParts setFinish(Boolean finish) {
            this.finish = finish;
            return this;
        }
        public Boolean getFinish() {
            return this.finish;
        }

        public CreateRunResponseBodyMessagesContentStructViewParts setPartDesc(String partDesc) {
            this.partDesc = partDesc;
            return this;
        }
        public String getPartDesc() {
            return this.partDesc;
        }

        public CreateRunResponseBodyMessagesContentStructViewParts setPartId(String partId) {
            this.partId = partId;
            return this;
        }
        public String getPartId() {
            return this.partId;
        }

        public CreateRunResponseBodyMessagesContentStructViewParts setReasonPart(CreateRunResponseBodyMessagesContentStructViewPartsReasonPart reasonPart) {
            this.reasonPart = reasonPart;
            return this;
        }
        public CreateRunResponseBodyMessagesContentStructViewPartsReasonPart getReasonPart() {
            return this.reasonPart;
        }

        public CreateRunResponseBodyMessagesContentStructViewParts setRecommendPart(CreateRunResponseBodyMessagesContentStructViewPartsRecommendPart recommendPart) {
            this.recommendPart = recommendPart;
            return this;
        }
        public CreateRunResponseBodyMessagesContentStructViewPartsRecommendPart getRecommendPart() {
            return this.recommendPart;
        }

        public CreateRunResponseBodyMessagesContentStructViewParts setReferencePart(CreateRunResponseBodyMessagesContentStructViewPartsReferencePart referencePart) {
            this.referencePart = referencePart;
            return this;
        }
        public CreateRunResponseBodyMessagesContentStructViewPartsReferencePart getReferencePart() {
            return this.referencePart;
        }

        public CreateRunResponseBodyMessagesContentStructViewParts setTextPart(CreateRunResponseBodyMessagesContentStructViewPartsTextPart textPart) {
            this.textPart = textPart;
            return this;
        }
        public CreateRunResponseBodyMessagesContentStructViewPartsTextPart getTextPart() {
            return this.textPart;
        }

        public CreateRunResponseBodyMessagesContentStructViewParts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateRunResponseBodyMessagesContentStructView extends TeaModel {
        @NameInMap("parts")
        public java.util.List<CreateRunResponseBodyMessagesContentStructViewParts> parts;

        public static CreateRunResponseBodyMessagesContentStructView build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContentStructView self = new CreateRunResponseBodyMessagesContentStructView();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContentStructView setParts(java.util.List<CreateRunResponseBodyMessagesContentStructViewParts> parts) {
            this.parts = parts;
            return this;
        }
        public java.util.List<CreateRunResponseBodyMessagesContentStructViewParts> getParts() {
            return this.parts;
        }

    }

    public static class CreateRunResponseBodyMessagesContentText extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>你好！</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateRunResponseBodyMessagesContentText build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContentText self = new CreateRunResponseBodyMessagesContentText();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContentText setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateRunResponseBodyMessagesContent extends TeaModel {
        @NameInMap("cardCallback")
        public CreateRunResponseBodyMessagesContentCardCallback cardCallback;

        @NameInMap("dingCard")
        public CreateRunResponseBodyMessagesContentDingCard dingCard;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dingNormalCard")
        public CreateRunResponseBodyMessagesContentDingNormalCard dingNormalCard;

        @NameInMap("markdown")
        public CreateRunResponseBodyMessagesContentMarkdown markdown;

        @NameInMap("structView")
        public CreateRunResponseBodyMessagesContentStructView structView;

        @NameInMap("text")
        public CreateRunResponseBodyMessagesContentText text;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>枚举字段，可为：text,markdown,cardCallback,dingCard,agentArtifact,dingNormalCard</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateRunResponseBodyMessagesContent build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessagesContent self = new CreateRunResponseBodyMessagesContent();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessagesContent setCardCallback(CreateRunResponseBodyMessagesContentCardCallback cardCallback) {
            this.cardCallback = cardCallback;
            return this;
        }
        public CreateRunResponseBodyMessagesContentCardCallback getCardCallback() {
            return this.cardCallback;
        }

        public CreateRunResponseBodyMessagesContent setDingCard(CreateRunResponseBodyMessagesContentDingCard dingCard) {
            this.dingCard = dingCard;
            return this;
        }
        public CreateRunResponseBodyMessagesContentDingCard getDingCard() {
            return this.dingCard;
        }

        public CreateRunResponseBodyMessagesContent setDingNormalCard(CreateRunResponseBodyMessagesContentDingNormalCard dingNormalCard) {
            this.dingNormalCard = dingNormalCard;
            return this;
        }
        public CreateRunResponseBodyMessagesContentDingNormalCard getDingNormalCard() {
            return this.dingNormalCard;
        }

        public CreateRunResponseBodyMessagesContent setMarkdown(CreateRunResponseBodyMessagesContentMarkdown markdown) {
            this.markdown = markdown;
            return this;
        }
        public CreateRunResponseBodyMessagesContentMarkdown getMarkdown() {
            return this.markdown;
        }

        public CreateRunResponseBodyMessagesContent setStructView(CreateRunResponseBodyMessagesContentStructView structView) {
            this.structView = structView;
            return this;
        }
        public CreateRunResponseBodyMessagesContentStructView getStructView() {
            return this.structView;
        }

        public CreateRunResponseBodyMessagesContent setText(CreateRunResponseBodyMessagesContentText text) {
            this.text = text;
            return this;
        }
        public CreateRunResponseBodyMessagesContentText getText() {
            return this.text;
        }

        public CreateRunResponseBodyMessagesContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateRunResponseBodyMessages extends TeaModel {
        @NameInMap("content")
        public CreateRunResponseBodyMessagesContent content;

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

        public static CreateRunResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyMessages self = new CreateRunResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyMessages setContent(CreateRunResponseBodyMessagesContent content) {
            this.content = content;
            return this;
        }
        public CreateRunResponseBodyMessagesContent getContent() {
            return this.content;
        }

        public CreateRunResponseBodyMessages setContentDesc(String contentDesc) {
            this.contentDesc = contentDesc;
            return this;
        }
        public String getContentDesc() {
            return this.contentDesc;
        }

        public CreateRunResponseBodyMessages setCreateAt(Long createAt) {
            this.createAt = createAt;
            return this;
        }
        public Long getCreateAt() {
            return this.createAt;
        }

        public CreateRunResponseBodyMessages setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateRunResponseBodyMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateRunResponseBodyMessages setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public CreateRunResponseBodyMessages setThreadId(String threadId) {
            this.threadId = threadId;
            return this;
        }
        public String getThreadId() {
            return this.threadId;
        }

    }

    public static class CreateRunResponseBodyRun extends TeaModel {
        @NameInMap("cancelledAt")
        public Long cancelledAt;

        @NameInMap("completedAt")
        public Long completedAt;

        @NameInMap("createAt")
        public Long createAt;

        @NameInMap("expiresAt")
        public Long expiresAt;

        @NameInMap("failedAt")
        public Long failedAt;

        @NameInMap("id")
        public String id;

        @NameInMap("lastErrorMsg")
        public String lastErrorMsg;

        @NameInMap("startedAt")
        public Long startedAt;

        @NameInMap("status")
        public String status;

        @NameInMap("threadId")
        public String threadId;

        public static CreateRunResponseBodyRun build(java.util.Map<String, ?> map) throws Exception {
            CreateRunResponseBodyRun self = new CreateRunResponseBodyRun();
            return TeaModel.build(map, self);
        }

        public CreateRunResponseBodyRun setCancelledAt(Long cancelledAt) {
            this.cancelledAt = cancelledAt;
            return this;
        }
        public Long getCancelledAt() {
            return this.cancelledAt;
        }

        public CreateRunResponseBodyRun setCompletedAt(Long completedAt) {
            this.completedAt = completedAt;
            return this;
        }
        public Long getCompletedAt() {
            return this.completedAt;
        }

        public CreateRunResponseBodyRun setCreateAt(Long createAt) {
            this.createAt = createAt;
            return this;
        }
        public Long getCreateAt() {
            return this.createAt;
        }

        public CreateRunResponseBodyRun setExpiresAt(Long expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public Long getExpiresAt() {
            return this.expiresAt;
        }

        public CreateRunResponseBodyRun setFailedAt(Long failedAt) {
            this.failedAt = failedAt;
            return this;
        }
        public Long getFailedAt() {
            return this.failedAt;
        }

        public CreateRunResponseBodyRun setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateRunResponseBodyRun setLastErrorMsg(String lastErrorMsg) {
            this.lastErrorMsg = lastErrorMsg;
            return this;
        }
        public String getLastErrorMsg() {
            return this.lastErrorMsg;
        }

        public CreateRunResponseBodyRun setStartedAt(Long startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public Long getStartedAt() {
            return this.startedAt;
        }

        public CreateRunResponseBodyRun setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateRunResponseBodyRun setThreadId(String threadId) {
            this.threadId = threadId;
            return this;
        }
        public String getThreadId() {
            return this.threadId;
        }

    }

}
