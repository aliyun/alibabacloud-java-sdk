// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeFileModerationResultResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeFileModerationResultResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6CF2815C-C8C7-4A01-B52E-FF6E24F53492</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFileModerationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileModerationResultResponseBody self = new DescribeFileModerationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFileModerationResultResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeFileModerationResultResponseBody setData(DescribeFileModerationResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeFileModerationResultResponseBodyData getData() {
        return this.data;
    }

    public DescribeFileModerationResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeFileModerationResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFileModerationResultResponseBodyDataPageResultImageResultLabelResult extends TeaModel {
        /**
         * <p>The confidence score.</p>
         * 
         * <strong>example:</strong>
         * <p>25.0</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>这个是标题</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The label.</p>
         * 
         * <strong>example:</strong>
         * <p>nonlabel</p>
         */
        @NameInMap("Label")
        public String label;

        public static DescribeFileModerationResultResponseBodyDataPageResultImageResultLabelResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileModerationResultResponseBodyDataPageResultImageResultLabelResult self = new DescribeFileModerationResultResponseBodyDataPageResultImageResultLabelResult();
            return TeaModel.build(map, self);
        }

        public DescribeFileModerationResultResponseBodyDataPageResultImageResultLabelResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public DescribeFileModerationResultResponseBodyDataPageResultImageResultLabelResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFileModerationResultResponseBodyDataPageResultImageResultLabelResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class DescribeFileModerationResultResponseBodyDataPageResultImageResultLocation extends TeaModel {
        /**
         * <p>The height of the detected area.</p>
         * 
         * <strong>example:</strong>
         * <p>44</p>
         */
        @NameInMap("H")
        public Integer h;

        /**
         * <p>The width of the detected area.</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("W")
        public Integer w;

        /**
         * <p>The X coordinate of the point.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <p>The Y-coordinate of the point.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static DescribeFileModerationResultResponseBodyDataPageResultImageResultLocation build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileModerationResultResponseBodyDataPageResultImageResultLocation self = new DescribeFileModerationResultResponseBodyDataPageResultImageResultLocation();
            return TeaModel.build(map, self);
        }

        public DescribeFileModerationResultResponseBodyDataPageResultImageResultLocation setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public DescribeFileModerationResultResponseBodyDataPageResultImageResultLocation setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public DescribeFileModerationResultResponseBodyDataPageResultImageResultLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public DescribeFileModerationResultResponseBodyDataPageResultImageResultLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class DescribeFileModerationResultResponseBodyDataPageResultImageResult extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>这个是标题</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The label information.</p>
         */
        @NameInMap("LabelResult")
        public java.util.List<DescribeFileModerationResultResponseBodyDataPageResultImageResultLabelResult> labelResult;

        /**
         * <p>The location information.</p>
         */
        @NameInMap("Location")
        public DescribeFileModerationResultResponseBodyDataPageResultImageResultLocation location;

        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The service that was called.</p>
         * 
         * <strong>example:</strong>
         * <p>baselineCheck</p>
         */
        @NameInMap("Service")
        public String service;

        public static DescribeFileModerationResultResponseBodyDataPageResultImageResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileModerationResultResponseBodyDataPageResultImageResult self = new DescribeFileModerationResultResponseBodyDataPageResultImageResult();
            return TeaModel.build(map, self);
        }

        public DescribeFileModerationResultResponseBodyDataPageResultImageResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFileModerationResultResponseBodyDataPageResultImageResult setLabelResult(java.util.List<DescribeFileModerationResultResponseBodyDataPageResultImageResultLabelResult> labelResult) {
            this.labelResult = labelResult;
            return this;
        }
        public java.util.List<DescribeFileModerationResultResponseBodyDataPageResultImageResultLabelResult> getLabelResult() {
            return this.labelResult;
        }

        public DescribeFileModerationResultResponseBodyDataPageResultImageResult setLocation(DescribeFileModerationResultResponseBodyDataPageResultImageResultLocation location) {
            this.location = location;
            return this;
        }
        public DescribeFileModerationResultResponseBodyDataPageResultImageResultLocation getLocation() {
            return this.location;
        }

        public DescribeFileModerationResultResponseBodyDataPageResultImageResult setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeFileModerationResultResponseBodyDataPageResultImageResult setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

    public static class DescribeFileModerationResultResponseBodyDataPageResultTextResult extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一个标题</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The description of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>疑似广告内容</p>
         */
        @NameInMap("Descriptions")
        public String descriptions;

        /**
         * <p>The value of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>Details about the hit risk.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("RiskTips")
        public String riskTips;

        /**
         * <p>The risk keywords that were hit.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("RiskWords")
        public String riskWords;

        /**
         * <p>The service.</p>
         * 
         * <strong>example:</strong>
         * <p>chat_detection</p>
         */
        @NameInMap("Service")
        public String service;

        /**
         * <p>The text content.</p>
         * 
         * <strong>example:</strong>
         * <p>吧啦吧啦</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>Information about the text segment.</p>
         * 
         * <strong>example:</strong>
         * <p>[0,999]</p>
         */
        @NameInMap("TextSegment")
        public String textSegment;

        public static DescribeFileModerationResultResponseBodyDataPageResultTextResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileModerationResultResponseBodyDataPageResultTextResult self = new DescribeFileModerationResultResponseBodyDataPageResultTextResult();
            return TeaModel.build(map, self);
        }

        public DescribeFileModerationResultResponseBodyDataPageResultTextResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFileModerationResultResponseBodyDataPageResultTextResult setDescriptions(String descriptions) {
            this.descriptions = descriptions;
            return this;
        }
        public String getDescriptions() {
            return this.descriptions;
        }

        public DescribeFileModerationResultResponseBodyDataPageResultTextResult setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public DescribeFileModerationResultResponseBodyDataPageResultTextResult setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeFileModerationResultResponseBodyDataPageResultTextResult setRiskTips(String riskTips) {
            this.riskTips = riskTips;
            return this;
        }
        public String getRiskTips() {
            return this.riskTips;
        }

        public DescribeFileModerationResultResponseBodyDataPageResultTextResult setRiskWords(String riskWords) {
            this.riskWords = riskWords;
            return this;
        }
        public String getRiskWords() {
            return this.riskWords;
        }

        public DescribeFileModerationResultResponseBodyDataPageResultTextResult setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public DescribeFileModerationResultResponseBodyDataPageResultTextResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeFileModerationResultResponseBodyDataPageResultTextResult setTextSegment(String textSegment) {
            this.textSegment = textSegment;
            return this;
        }
        public String getTextSegment() {
            return this.textSegment;
        }

    }

    public static class DescribeFileModerationResultResponseBodyDataPageResult extends TeaModel {
        /**
         * <p>The image moderation results.</p>
         */
        @NameInMap("ImageResult")
        public java.util.List<DescribeFileModerationResultResponseBodyDataPageResultImageResult> imageResult;

        /**
         * <p>The URL of the image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://detect-obj.oss-cn-hangzhou.aliyuncs.com/sample/xxxx.jpg">https://detect-obj.oss-cn-hangzhou.aliyuncs.com/sample/xxxx.jpg</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The text moderation results.</p>
         */
        @NameInMap("TextResult")
        public java.util.List<DescribeFileModerationResultResponseBodyDataPageResultTextResult> textResult;

        /**
         * <p>The URL where the text content is stored.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://detect-obj.oss-cn-hangzhou.aliyuncs.com/sample/xxxx.txt">https://detect-obj.oss-cn-hangzhou.aliyuncs.com/sample/xxxx.txt</a></p>
         */
        @NameInMap("TextUrl")
        public String textUrl;

        public static DescribeFileModerationResultResponseBodyDataPageResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileModerationResultResponseBodyDataPageResult self = new DescribeFileModerationResultResponseBodyDataPageResult();
            return TeaModel.build(map, self);
        }

        public DescribeFileModerationResultResponseBodyDataPageResult setImageResult(java.util.List<DescribeFileModerationResultResponseBodyDataPageResultImageResult> imageResult) {
            this.imageResult = imageResult;
            return this;
        }
        public java.util.List<DescribeFileModerationResultResponseBodyDataPageResultImageResult> getImageResult() {
            return this.imageResult;
        }

        public DescribeFileModerationResultResponseBodyDataPageResult setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescribeFileModerationResultResponseBodyDataPageResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public DescribeFileModerationResultResponseBodyDataPageResult setTextResult(java.util.List<DescribeFileModerationResultResponseBodyDataPageResultTextResult> textResult) {
            this.textResult = textResult;
            return this;
        }
        public java.util.List<DescribeFileModerationResultResponseBodyDataPageResultTextResult> getTextResult() {
            return this.textResult;
        }

        public DescribeFileModerationResultResponseBodyDataPageResult setTextUrl(String textUrl) {
            this.textUrl = textUrl;
            return this;
        }
        public String getTextUrl() {
            return this.textUrl;
        }

    }

    public static class DescribeFileModerationResultResponseBodyDataPageSummaryImageSummaryImageLabels extends TeaModel {
        /**
         * <p>The description of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The label.</p>
         * 
         * <strong>example:</strong>
         * <p>contraband</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The number of times the label appears.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LabelSum")
        public Integer labelSum;

        public static DescribeFileModerationResultResponseBodyDataPageSummaryImageSummaryImageLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileModerationResultResponseBodyDataPageSummaryImageSummaryImageLabels self = new DescribeFileModerationResultResponseBodyDataPageSummaryImageSummaryImageLabels();
            return TeaModel.build(map, self);
        }

        public DescribeFileModerationResultResponseBodyDataPageSummaryImageSummaryImageLabels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFileModerationResultResponseBodyDataPageSummaryImageSummaryImageLabels setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeFileModerationResultResponseBodyDataPageSummaryImageSummaryImageLabels setLabelSum(Integer labelSum) {
            this.labelSum = labelSum;
            return this;
        }
        public Integer getLabelSum() {
            return this.labelSum;
        }

    }

    public static class DescribeFileModerationResultResponseBodyDataPageSummaryImageSummary extends TeaModel {
        /**
         * <p>The image labels.</p>
         */
        @NameInMap("ImageLabels")
        public java.util.List<DescribeFileModerationResultResponseBodyDataPageSummaryImageSummaryImageLabels> imageLabels;

        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static DescribeFileModerationResultResponseBodyDataPageSummaryImageSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileModerationResultResponseBodyDataPageSummaryImageSummary self = new DescribeFileModerationResultResponseBodyDataPageSummaryImageSummary();
            return TeaModel.build(map, self);
        }

        public DescribeFileModerationResultResponseBodyDataPageSummaryImageSummary setImageLabels(java.util.List<DescribeFileModerationResultResponseBodyDataPageSummaryImageSummaryImageLabels> imageLabels) {
            this.imageLabels = imageLabels;
            return this;
        }
        public java.util.List<DescribeFileModerationResultResponseBodyDataPageSummaryImageSummaryImageLabels> getImageLabels() {
            return this.imageLabels;
        }

        public DescribeFileModerationResultResponseBodyDataPageSummaryImageSummary setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class DescribeFileModerationResultResponseBodyDataPageSummaryTextSummaryTextLabels extends TeaModel {
        /**
         * <p>The description of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>未检测出风险</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The label.</p>
         * 
         * <strong>example:</strong>
         * <p>contraband</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The number of times the label appears.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LabelSum")
        public Integer labelSum;

        public static DescribeFileModerationResultResponseBodyDataPageSummaryTextSummaryTextLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileModerationResultResponseBodyDataPageSummaryTextSummaryTextLabels self = new DescribeFileModerationResultResponseBodyDataPageSummaryTextSummaryTextLabels();
            return TeaModel.build(map, self);
        }

        public DescribeFileModerationResultResponseBodyDataPageSummaryTextSummaryTextLabels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFileModerationResultResponseBodyDataPageSummaryTextSummaryTextLabels setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeFileModerationResultResponseBodyDataPageSummaryTextSummaryTextLabels setLabelSum(Integer labelSum) {
            this.labelSum = labelSum;
            return this;
        }
        public Integer getLabelSum() {
            return this.labelSum;
        }

    }

    public static class DescribeFileModerationResultResponseBodyDataPageSummaryTextSummary extends TeaModel {
        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The text labels.</p>
         */
        @NameInMap("TextLabels")
        public java.util.List<DescribeFileModerationResultResponseBodyDataPageSummaryTextSummaryTextLabels> textLabels;

        public static DescribeFileModerationResultResponseBodyDataPageSummaryTextSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileModerationResultResponseBodyDataPageSummaryTextSummary self = new DescribeFileModerationResultResponseBodyDataPageSummaryTextSummary();
            return TeaModel.build(map, self);
        }

        public DescribeFileModerationResultResponseBodyDataPageSummaryTextSummary setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeFileModerationResultResponseBodyDataPageSummaryTextSummary setTextLabels(java.util.List<DescribeFileModerationResultResponseBodyDataPageSummaryTextSummaryTextLabels> textLabels) {
            this.textLabels = textLabels;
            return this;
        }
        public java.util.List<DescribeFileModerationResultResponseBodyDataPageSummaryTextSummaryTextLabels> getTextLabels() {
            return this.textLabels;
        }

    }

    public static class DescribeFileModerationResultResponseBodyDataPageSummary extends TeaModel {
        /**
         * <p>The image summary information.</p>
         */
        @NameInMap("ImageSummary")
        public DescribeFileModerationResultResponseBodyDataPageSummaryImageSummary imageSummary;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageSum")
        public Integer pageSum;

        /**
         * <p>The text summary information.</p>
         */
        @NameInMap("TextSummary")
        public DescribeFileModerationResultResponseBodyDataPageSummaryTextSummary textSummary;

        public static DescribeFileModerationResultResponseBodyDataPageSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileModerationResultResponseBodyDataPageSummary self = new DescribeFileModerationResultResponseBodyDataPageSummary();
            return TeaModel.build(map, self);
        }

        public DescribeFileModerationResultResponseBodyDataPageSummary setImageSummary(DescribeFileModerationResultResponseBodyDataPageSummaryImageSummary imageSummary) {
            this.imageSummary = imageSummary;
            return this;
        }
        public DescribeFileModerationResultResponseBodyDataPageSummaryImageSummary getImageSummary() {
            return this.imageSummary;
        }

        public DescribeFileModerationResultResponseBodyDataPageSummary setPageSum(Integer pageSum) {
            this.pageSum = pageSum;
            return this;
        }
        public Integer getPageSum() {
            return this.pageSum;
        }

        public DescribeFileModerationResultResponseBodyDataPageSummary setTextSummary(DescribeFileModerationResultResponseBodyDataPageSummaryTextSummary textSummary) {
            this.textSummary = textSummary;
            return this;
        }
        public DescribeFileModerationResultResponseBodyDataPageSummaryTextSummary getTextSummary() {
            return this.textSummary;
        }

    }

    public static class DescribeFileModerationResultResponseBodyData extends TeaModel {
        /**
         * <p>The AccountId specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>accountIdtest123</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The ID of the data.</p>
         * 
         * <strong>example:</strong>
         * <p>26769ada6e264e7ba9aa048241e12be9</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The document type. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>doc</p>
         */
        @NameInMap("DocType")
        public String docType;

        /**
         * <p>A list of moderation results.</p>
         */
        @NameInMap("PageResult")
        public java.util.List<DescribeFileModerationResultResponseBodyDataPageResult> pageResult;

        /**
         * <p>The summary information.</p>
         */
        @NameInMap("PageSummary")
        public DescribeFileModerationResultResponseBodyDataPageSummary pageSummary;

        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The download URL for the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://detect-obj.oss-cn-hangzhou.aliyuncs.com/sample/xxxx.pdf">https://detect-obj.oss-cn-hangzhou.aliyuncs.com/sample/xxxx.pdf</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeFileModerationResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileModerationResultResponseBodyData self = new DescribeFileModerationResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeFileModerationResultResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public DescribeFileModerationResultResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public DescribeFileModerationResultResponseBodyData setDocType(String docType) {
            this.docType = docType;
            return this;
        }
        public String getDocType() {
            return this.docType;
        }

        public DescribeFileModerationResultResponseBodyData setPageResult(java.util.List<DescribeFileModerationResultResponseBodyDataPageResult> pageResult) {
            this.pageResult = pageResult;
            return this;
        }
        public java.util.List<DescribeFileModerationResultResponseBodyDataPageResult> getPageResult() {
            return this.pageResult;
        }

        public DescribeFileModerationResultResponseBodyData setPageSummary(DescribeFileModerationResultResponseBodyDataPageSummary pageSummary) {
            this.pageSummary = pageSummary;
            return this;
        }
        public DescribeFileModerationResultResponseBodyDataPageSummary getPageSummary() {
            return this.pageSummary;
        }

        public DescribeFileModerationResultResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeFileModerationResultResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
