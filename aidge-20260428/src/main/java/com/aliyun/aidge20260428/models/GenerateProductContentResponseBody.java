// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class GenerateProductContentResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned for successful calls.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The processing result. Contains copy data upon success. Returns null upon business failure.</p>
     */
    @NameInMap("Data")
    public GenerateProductContentResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned for successful calls.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which is used for troubleshooting. This parameter may be empty in extreme exception scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the business processing is successful. Valid values: true (the output passes verification) and false (the business processing fails).</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GenerateProductContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateProductContentResponseBody self = new GenerateProductContentResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateProductContentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateProductContentResponseBody setData(GenerateProductContentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateProductContentResponseBodyData getData() {
        return this.data;
    }

    public GenerateProductContentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateProductContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateProductContentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateProductContentResponseBodyData extends TeaModel {
        /**
         * <p>The actual copy type processed.</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The total number of characters in data.text, including formatting characters such as spaces, punctuation marks, and line breaks.</p>
         * 
         * <strong>example:</strong>
         * <p>54</p>
         */
        @NameInMap("Length")
        public Integer length;

        /**
         * <p>The code of the actual output language.</p>
         * 
         * <strong>example:</strong>
         * <p>ru</p>
         */
        @NameInMap("OutputLanguage")
        public String outputLanguage;

        /**
         * <p>The number of characters for each selling point, which corresponds to data.points one by one. This parameter is returned only when bullet points are successfully processed.</p>
         */
        @NameInMap("PointLengths")
        public java.util.List<Integer> pointLengths;

        /**
         * <p>The selling point texts arranged in output order. This parameter is returned only when bullet points are successfully processed.</p>
         */
        @NameInMap("Points")
        public java.util.List<String> points;

        /**
         * <p>The final copy. Generated keywords are separated by commas and spaces. Rewritten keywords are separated by spaces. Bullet points are separated by line breaks.</p>
         * 
         * <strong>example:</strong>
         * <p>Чашка Для Мороженого Из Нержавеющей Стали 14,5x10,8 см</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The usage information.</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Integer> usageMap;

        public static GenerateProductContentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateProductContentResponseBodyData self = new GenerateProductContentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateProductContentResponseBodyData setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GenerateProductContentResponseBodyData setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public GenerateProductContentResponseBodyData setOutputLanguage(String outputLanguage) {
            this.outputLanguage = outputLanguage;
            return this;
        }
        public String getOutputLanguage() {
            return this.outputLanguage;
        }

        public GenerateProductContentResponseBodyData setPointLengths(java.util.List<Integer> pointLengths) {
            this.pointLengths = pointLengths;
            return this;
        }
        public java.util.List<Integer> getPointLengths() {
            return this.pointLengths;
        }

        public GenerateProductContentResponseBodyData setPoints(java.util.List<String> points) {
            this.points = points;
            return this;
        }
        public java.util.List<String> getPoints() {
            return this.points;
        }

        public GenerateProductContentResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GenerateProductContentResponseBodyData setUsageMap(java.util.Map<String, Integer> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Integer> getUsageMap() {
            return this.usageMap;
        }

    }

}
