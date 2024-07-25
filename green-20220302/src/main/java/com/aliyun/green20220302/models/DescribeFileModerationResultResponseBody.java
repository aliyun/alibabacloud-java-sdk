// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeFileModerationResultResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeFileModerationResultResponseBodyData data;

    /**
     * <p>The message that is returned in response to the request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
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
         * <p>Confidence score, 0 to 100, reserved to 2 decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>25.0</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The details of the labels.</p>
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
         * <p>The H value of the coordinate point.</p>
         * 
         * <strong>example:</strong>
         * <p>44</p>
         */
        @NameInMap("H")
        public Integer h;

        /**
         * <p>The W value of the coordinate point.</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("W")
        public Integer w;

        /**
         * <p>The X value of the coordinate point.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <p>The Y value of the coordinate point.</p>
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
         * <p>Description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a title.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Label information.</p>
         */
        @NameInMap("LabelResult")
        public java.util.List<DescribeFileModerationResultResponseBodyDataPageResultImageResultLabelResult> labelResult;

        /**
         * <p>Location information.</p>
         */
        @NameInMap("Location")
        public DescribeFileModerationResultResponseBodyDataPageResultImageResultLocation location;

        /**
         * <p>The moderation service.</p>
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
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>This is a title.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The details of the labels.</p>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The risk details that are hit.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("RiskTips")
        public String riskTips;

        /**
         * <p>The risk words that are hit.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("RiskWords")
        public String riskWords;

        /**
         * <p>The moderation service.</p>
         * 
         * <strong>example:</strong>
         * <p>chat_detection</p>
         */
        @NameInMap("Service")
        public String service;

        /**
         * <p>Text content.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a text.</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>Text segmentation information.</p>
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

        public DescribeFileModerationResultResponseBodyDataPageResultTextResult setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
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
         * <p>Image detection results.</p>
         */
        @NameInMap("ImageResult")
        public java.util.List<DescribeFileModerationResultResponseBodyDataPageResultImageResult> imageResult;

        /**
         * <p>The image url.</p>
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
         * <p>Text detection results.</p>
         */
        @NameInMap("TextResult")
        public java.util.List<DescribeFileModerationResultResponseBodyDataPageResultTextResult> textResult;

        /**
         * <p>the text url.</p>
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

    public static class DescribeFileModerationResultResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the moderated object.</p>
         * 
         * <strong>example:</strong>
         * <p>26769ada6e264e7ba9aa048241e12be9</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>Optional, document type.</p>
         * 
         * <strong>example:</strong>
         * <p>doc</p>
         */
        @NameInMap("DocType")
        public String docType;

        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageResult")
        public java.util.List<DescribeFileModerationResultResponseBodyDataPageResult> pageResult;

        /**
         * <p>The URL of the moderation object.</p>
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

        public DescribeFileModerationResultResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
