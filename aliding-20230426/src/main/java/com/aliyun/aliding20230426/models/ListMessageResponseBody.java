// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListMessageResponseBody extends TeaModel {
    @NameInMap("messages")
    public java.util.List<ListMessageResponseBodyMessages> messages;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessageResponseBody self = new ListMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessageResponseBody setMessages(java.util.List<ListMessageResponseBodyMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<ListMessageResponseBodyMessages> getMessages() {
        return this.messages;
    }

    public ListMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMessageResponseBodyMessagesContentCardCallback extends TeaModel {
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

        public static ListMessageResponseBodyMessagesContentCardCallback build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContentCardCallback self = new ListMessageResponseBodyMessagesContentCardCallback();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContentCardCallback setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListMessageResponseBodyMessagesContentCardCallback setRelatedMessageId(String relatedMessageId) {
            this.relatedMessageId = relatedMessageId;
            return this;
        }
        public String getRelatedMessageId() {
            return this.relatedMessageId;
        }

    }

    public static class ListMessageResponseBodyMessagesContentDingCard extends TeaModel {
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

        public static ListMessageResponseBodyMessagesContentDingCard build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContentDingCard self = new ListMessageResponseBodyMessagesContentDingCard();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContentDingCard setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListMessageResponseBodyMessagesContentDingCard setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListMessageResponseBodyMessagesContentDingCard setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public ListMessageResponseBodyMessagesContentDingCard setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class ListMessageResponseBodyMessagesContentDingNormalCardCardData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("cardParamMap")
        public java.util.Map<String, ?> cardParamMap;

        public static ListMessageResponseBodyMessagesContentDingNormalCardCardData build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContentDingNormalCardCardData self = new ListMessageResponseBodyMessagesContentDingNormalCardCardData();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContentDingNormalCardCardData setCardParamMap(java.util.Map<String, ?> cardParamMap) {
            this.cardParamMap = cardParamMap;
            return this;
        }
        public java.util.Map<String, ?> getCardParamMap() {
            return this.cardParamMap;
        }

    }

    public static class ListMessageResponseBodyMessagesContentDingNormalCardCardUpdateOptions extends TeaModel {
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

        public static ListMessageResponseBodyMessagesContentDingNormalCardCardUpdateOptions build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContentDingNormalCardCardUpdateOptions self = new ListMessageResponseBodyMessagesContentDingNormalCardCardUpdateOptions();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContentDingNormalCardCardUpdateOptions setUpdateCardDataByKey(Boolean updateCardDataByKey) {
            this.updateCardDataByKey = updateCardDataByKey;
            return this;
        }
        public Boolean getUpdateCardDataByKey() {
            return this.updateCardDataByKey;
        }

        public ListMessageResponseBodyMessagesContentDingNormalCardCardUpdateOptions setUpdatePrivateDataByKey(Boolean updatePrivateDataByKey) {
            this.updatePrivateDataByKey = updatePrivateDataByKey;
            return this;
        }
        public Boolean getUpdatePrivateDataByKey() {
            return this.updatePrivateDataByKey;
        }

    }

    public static class ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig extends TeaModel {
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

        public static ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig self = new ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setPullStrategy(String pullStrategy) {
            this.pullStrategy = pullStrategy;
            return this;
        }
        public String getPullStrategy() {
            return this.pullStrategy;
        }

        public ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

    }

    public static class ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs extends TeaModel {
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
        public ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig pullConfig;

        public static ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs self = new ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs setConstParams(java.util.Map<String, ?> constParams) {
            this.constParams = constParams;
            return this;
        }
        public java.util.Map<String, ?> getConstParams() {
            return this.constParams;
        }

        public ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs setDynamicDataSourceId(String dynamicDataSourceId) {
            this.dynamicDataSourceId = dynamicDataSourceId;
            return this;
        }
        public String getDynamicDataSourceId() {
            return this.dynamicDataSourceId;
        }

        public ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs setPullConfig(ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig pullConfig) {
            this.pullConfig = pullConfig;
            return this;
        }
        public ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigsPullConfig getPullConfig() {
            return this.pullConfig;
        }

    }

    public static class ListMessageResponseBodyMessagesContentDingNormalCard extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("cardData")
        public ListMessageResponseBodyMessagesContentDingNormalCardCardData cardData;

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
        public ListMessageResponseBodyMessagesContentDingNormalCardCardUpdateOptions cardUpdateOptions;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dynamicDataSourceConfigs")
        public java.util.List<ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs> dynamicDataSourceConfigs;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("privateData")
        public java.util.Map<String, java.util.Map<String, ?>> privateData;

        public static ListMessageResponseBodyMessagesContentDingNormalCard build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContentDingNormalCard self = new ListMessageResponseBodyMessagesContentDingNormalCard();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContentDingNormalCard setCardData(ListMessageResponseBodyMessagesContentDingNormalCardCardData cardData) {
            this.cardData = cardData;
            return this;
        }
        public ListMessageResponseBodyMessagesContentDingNormalCardCardData getCardData() {
            return this.cardData;
        }

        public ListMessageResponseBodyMessagesContentDingNormalCard setCardTemplateId(String cardTemplateId) {
            this.cardTemplateId = cardTemplateId;
            return this;
        }
        public String getCardTemplateId() {
            return this.cardTemplateId;
        }

        public ListMessageResponseBodyMessagesContentDingNormalCard setCardUpdateOptions(ListMessageResponseBodyMessagesContentDingNormalCardCardUpdateOptions cardUpdateOptions) {
            this.cardUpdateOptions = cardUpdateOptions;
            return this;
        }
        public ListMessageResponseBodyMessagesContentDingNormalCardCardUpdateOptions getCardUpdateOptions() {
            return this.cardUpdateOptions;
        }

        public ListMessageResponseBodyMessagesContentDingNormalCard setDynamicDataSourceConfigs(java.util.List<ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs> dynamicDataSourceConfigs) {
            this.dynamicDataSourceConfigs = dynamicDataSourceConfigs;
            return this;
        }
        public java.util.List<ListMessageResponseBodyMessagesContentDingNormalCardDynamicDataSourceConfigs> getDynamicDataSourceConfigs() {
            return this.dynamicDataSourceConfigs;
        }

        public ListMessageResponseBodyMessagesContentDingNormalCard setPrivateData(java.util.Map<String, java.util.Map<String, ?>> privateData) {
            this.privateData = privateData;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getPrivateData() {
            return this.privateData;
        }

    }

    public static class ListMessageResponseBodyMessagesContentMarkdown extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ol>
         * <li>markdown内容</li>
         * <li>markdown内容</li>
         * </ol>
         */
        @NameInMap("value")
        public String value;

        public static ListMessageResponseBodyMessagesContentMarkdown build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContentMarkdown self = new ListMessageResponseBodyMessagesContentMarkdown();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContentMarkdown setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListMessageResponseBodyMessagesContentStructViewPartsDataPart extends TeaModel {
        @NameInMap("data")
        public Object data;

        public static ListMessageResponseBodyMessagesContentStructViewPartsDataPart build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContentStructViewPartsDataPart self = new ListMessageResponseBodyMessagesContentStructViewPartsDataPart();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContentStructViewPartsDataPart setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

    }

    public static class ListMessageResponseBodyMessagesContentStructViewPartsReasonPart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("reason")
        public String reason;

        public static ListMessageResponseBodyMessagesContentStructViewPartsReasonPart build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContentStructViewPartsReasonPart self = new ListMessageResponseBodyMessagesContentStructViewPartsReasonPart();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContentStructViewPartsReasonPart setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class ListMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends extends TeaModel {
        @NameInMap("mobileUrl")
        public String mobileUrl;

        @NameInMap("text")
        public String text;

        @NameInMap("url")
        public String url;

        public static ListMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends self = new ListMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends setMobileUrl(String mobileUrl) {
            this.mobileUrl = mobileUrl;
            return this;
        }
        public String getMobileUrl() {
            return this.mobileUrl;
        }

        public ListMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ListMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListMessageResponseBodyMessagesContentStructViewPartsRecommendPart extends TeaModel {
        @NameInMap("recommends")
        public java.util.List<ListMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends> recommends;

        public static ListMessageResponseBodyMessagesContentStructViewPartsRecommendPart build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContentStructViewPartsRecommendPart self = new ListMessageResponseBodyMessagesContentStructViewPartsRecommendPart();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContentStructViewPartsRecommendPart setRecommends(java.util.List<ListMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends> recommends) {
            this.recommends = recommends;
            return this;
        }
        public java.util.List<ListMessageResponseBodyMessagesContentStructViewPartsRecommendPartRecommends> getRecommends() {
            return this.recommends;
        }

    }

    public static class ListMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences extends TeaModel {
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

        public static ListMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences self = new ListMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public ListMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences setSourceCode(String sourceCode) {
            this.sourceCode = sourceCode;
            return this;
        }
        public String getSourceCode() {
            return this.sourceCode;
        }

        public ListMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences setSourceIcon(String sourceIcon) {
            this.sourceIcon = sourceIcon;
            return this;
        }
        public String getSourceIcon() {
            return this.sourceIcon;
        }

        public ListMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListMessageResponseBodyMessagesContentStructViewPartsReferencePart extends TeaModel {
        @NameInMap("references")
        public java.util.List<ListMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences> references;

        public static ListMessageResponseBodyMessagesContentStructViewPartsReferencePart build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContentStructViewPartsReferencePart self = new ListMessageResponseBodyMessagesContentStructViewPartsReferencePart();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContentStructViewPartsReferencePart setReferences(java.util.List<ListMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences> references) {
            this.references = references;
            return this;
        }
        public java.util.List<ListMessageResponseBodyMessagesContentStructViewPartsReferencePartReferences> getReferences() {
            return this.references;
        }

    }

    public static class ListMessageResponseBodyMessagesContentStructViewPartsTextPart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("text")
        public String text;

        public static ListMessageResponseBodyMessagesContentStructViewPartsTextPart build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContentStructViewPartsTextPart self = new ListMessageResponseBodyMessagesContentStructViewPartsTextPart();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContentStructViewPartsTextPart setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class ListMessageResponseBodyMessagesContentStructViewParts extends TeaModel {
        @NameInMap("append")
        public Boolean append;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dataPart")
        public ListMessageResponseBodyMessagesContentStructViewPartsDataPart dataPart;

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
        public ListMessageResponseBodyMessagesContentStructViewPartsReasonPart reasonPart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("recommendPart")
        public ListMessageResponseBodyMessagesContentStructViewPartsRecommendPart recommendPart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("referencePart")
        public ListMessageResponseBodyMessagesContentStructViewPartsReferencePart referencePart;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("textPart")
        public ListMessageResponseBodyMessagesContentStructViewPartsTextPart textPart;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>textPart</p>
         */
        @NameInMap("type")
        public String type;

        public static ListMessageResponseBodyMessagesContentStructViewParts build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContentStructViewParts self = new ListMessageResponseBodyMessagesContentStructViewParts();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContentStructViewParts setAppend(Boolean append) {
            this.append = append;
            return this;
        }
        public Boolean getAppend() {
            return this.append;
        }

        public ListMessageResponseBodyMessagesContentStructViewParts setDataPart(ListMessageResponseBodyMessagesContentStructViewPartsDataPart dataPart) {
            this.dataPart = dataPart;
            return this;
        }
        public ListMessageResponseBodyMessagesContentStructViewPartsDataPart getDataPart() {
            return this.dataPart;
        }

        public ListMessageResponseBodyMessagesContentStructViewParts setFinish(Boolean finish) {
            this.finish = finish;
            return this;
        }
        public Boolean getFinish() {
            return this.finish;
        }

        public ListMessageResponseBodyMessagesContentStructViewParts setPartDesc(String partDesc) {
            this.partDesc = partDesc;
            return this;
        }
        public String getPartDesc() {
            return this.partDesc;
        }

        public ListMessageResponseBodyMessagesContentStructViewParts setPartId(String partId) {
            this.partId = partId;
            return this;
        }
        public String getPartId() {
            return this.partId;
        }

        public ListMessageResponseBodyMessagesContentStructViewParts setReasonPart(ListMessageResponseBodyMessagesContentStructViewPartsReasonPart reasonPart) {
            this.reasonPart = reasonPart;
            return this;
        }
        public ListMessageResponseBodyMessagesContentStructViewPartsReasonPart getReasonPart() {
            return this.reasonPart;
        }

        public ListMessageResponseBodyMessagesContentStructViewParts setRecommendPart(ListMessageResponseBodyMessagesContentStructViewPartsRecommendPart recommendPart) {
            this.recommendPart = recommendPart;
            return this;
        }
        public ListMessageResponseBodyMessagesContentStructViewPartsRecommendPart getRecommendPart() {
            return this.recommendPart;
        }

        public ListMessageResponseBodyMessagesContentStructViewParts setReferencePart(ListMessageResponseBodyMessagesContentStructViewPartsReferencePart referencePart) {
            this.referencePart = referencePart;
            return this;
        }
        public ListMessageResponseBodyMessagesContentStructViewPartsReferencePart getReferencePart() {
            return this.referencePart;
        }

        public ListMessageResponseBodyMessagesContentStructViewParts setTextPart(ListMessageResponseBodyMessagesContentStructViewPartsTextPart textPart) {
            this.textPart = textPart;
            return this;
        }
        public ListMessageResponseBodyMessagesContentStructViewPartsTextPart getTextPart() {
            return this.textPart;
        }

        public ListMessageResponseBodyMessagesContentStructViewParts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMessageResponseBodyMessagesContentStructView extends TeaModel {
        @NameInMap("parts")
        public java.util.List<ListMessageResponseBodyMessagesContentStructViewParts> parts;

        public static ListMessageResponseBodyMessagesContentStructView build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContentStructView self = new ListMessageResponseBodyMessagesContentStructView();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContentStructView setParts(java.util.List<ListMessageResponseBodyMessagesContentStructViewParts> parts) {
            this.parts = parts;
            return this;
        }
        public java.util.List<ListMessageResponseBodyMessagesContentStructViewParts> getParts() {
            return this.parts;
        }

    }

    public static class ListMessageResponseBodyMessagesContentText extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>你好！</p>
         */
        @NameInMap("value")
        public String value;

        public static ListMessageResponseBodyMessagesContentText build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContentText self = new ListMessageResponseBodyMessagesContentText();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContentText setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListMessageResponseBodyMessagesContent extends TeaModel {
        @NameInMap("cardCallback")
        public ListMessageResponseBodyMessagesContentCardCallback cardCallback;

        @NameInMap("dingCard")
        public ListMessageResponseBodyMessagesContentDingCard dingCard;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dingNormalCard")
        public ListMessageResponseBodyMessagesContentDingNormalCard dingNormalCard;

        @NameInMap("markdown")
        public ListMessageResponseBodyMessagesContentMarkdown markdown;

        @NameInMap("structView")
        public ListMessageResponseBodyMessagesContentStructView structView;

        @NameInMap("text")
        public ListMessageResponseBodyMessagesContentText text;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>枚举字段，可为：text,markdown,cardCallback,dingCard,agentArtifact,dingNormalCard</p>
         */
        @NameInMap("type")
        public String type;

        public static ListMessageResponseBodyMessagesContent build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessagesContent self = new ListMessageResponseBodyMessagesContent();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessagesContent setCardCallback(ListMessageResponseBodyMessagesContentCardCallback cardCallback) {
            this.cardCallback = cardCallback;
            return this;
        }
        public ListMessageResponseBodyMessagesContentCardCallback getCardCallback() {
            return this.cardCallback;
        }

        public ListMessageResponseBodyMessagesContent setDingCard(ListMessageResponseBodyMessagesContentDingCard dingCard) {
            this.dingCard = dingCard;
            return this;
        }
        public ListMessageResponseBodyMessagesContentDingCard getDingCard() {
            return this.dingCard;
        }

        public ListMessageResponseBodyMessagesContent setDingNormalCard(ListMessageResponseBodyMessagesContentDingNormalCard dingNormalCard) {
            this.dingNormalCard = dingNormalCard;
            return this;
        }
        public ListMessageResponseBodyMessagesContentDingNormalCard getDingNormalCard() {
            return this.dingNormalCard;
        }

        public ListMessageResponseBodyMessagesContent setMarkdown(ListMessageResponseBodyMessagesContentMarkdown markdown) {
            this.markdown = markdown;
            return this;
        }
        public ListMessageResponseBodyMessagesContentMarkdown getMarkdown() {
            return this.markdown;
        }

        public ListMessageResponseBodyMessagesContent setStructView(ListMessageResponseBodyMessagesContentStructView structView) {
            this.structView = structView;
            return this;
        }
        public ListMessageResponseBodyMessagesContentStructView getStructView() {
            return this.structView;
        }

        public ListMessageResponseBodyMessagesContent setText(ListMessageResponseBodyMessagesContentText text) {
            this.text = text;
            return this;
        }
        public ListMessageResponseBodyMessagesContentText getText() {
            return this.text;
        }

        public ListMessageResponseBodyMessagesContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMessageResponseBodyMessages extends TeaModel {
        @NameInMap("content")
        public ListMessageResponseBodyMessagesContent content;

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

        public static ListMessageResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyMessages self = new ListMessageResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyMessages setContent(ListMessageResponseBodyMessagesContent content) {
            this.content = content;
            return this;
        }
        public ListMessageResponseBodyMessagesContent getContent() {
            return this.content;
        }

        public ListMessageResponseBodyMessages setContentDesc(String contentDesc) {
            this.contentDesc = contentDesc;
            return this;
        }
        public String getContentDesc() {
            return this.contentDesc;
        }

        public ListMessageResponseBodyMessages setCreateAt(Long createAt) {
            this.createAt = createAt;
            return this;
        }
        public Long getCreateAt() {
            return this.createAt;
        }

        public ListMessageResponseBodyMessages setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMessageResponseBodyMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListMessageResponseBodyMessages setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public ListMessageResponseBodyMessages setThreadId(String threadId) {
            this.threadId = threadId;
            return this;
        }
        public String getThreadId() {
            return this.threadId;
        }

    }

}
