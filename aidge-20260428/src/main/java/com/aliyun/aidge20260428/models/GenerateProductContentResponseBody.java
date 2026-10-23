// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class GenerateProductContentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GenerateProductContentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <strong>example:</strong>
         * <p>54</p>
         */
        @NameInMap("Length")
        public Integer length;

        /**
         * <strong>example:</strong>
         * <p>ru</p>
         */
        @NameInMap("OutputLanguage")
        public String outputLanguage;

        @NameInMap("PointLengths")
        public java.util.List<Integer> pointLengths;

        @NameInMap("Points")
        public java.util.List<String> points;

        /**
         * <strong>example:</strong>
         * <p>Чашка Для Мороженого Из Нержавеющей Стали 14,5x10,8 см</p>
         */
        @NameInMap("Text")
        public String text;

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
