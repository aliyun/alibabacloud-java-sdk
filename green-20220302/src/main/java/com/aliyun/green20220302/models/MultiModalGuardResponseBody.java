// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalGuardResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
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
    public MultiModalGuardResponseBodyData data;

    /**
     * <p>The error message.</p>
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
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MultiModalGuardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MultiModalGuardResponseBody self = new MultiModalGuardResponseBody();
        return TeaModel.build(map, self);
    }

    public MultiModalGuardResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public MultiModalGuardResponseBody setData(MultiModalGuardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MultiModalGuardResponseBodyData getData() {
        return this.data;
    }

    public MultiModalGuardResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MultiModalGuardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MultiModalGuardResponseBodyDataDetailResult extends TeaModel {
        /**
         * <p>The confidence score. Valid values: 0 to 100. The value is accurate to two decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The description of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>疑似违禁行为</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The extended information about the detection results.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Ext")
        public Object ext;

        /**
         * <p>The label.</p>
         * 
         * <strong>example:</strong>
         * <p>contraband_act</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("Level")
        public String level;

        public static MultiModalGuardResponseBodyDataDetailResult build(java.util.Map<String, ?> map) throws Exception {
            MultiModalGuardResponseBodyDataDetailResult self = new MultiModalGuardResponseBodyDataDetailResult();
            return TeaModel.build(map, self);
        }

        public MultiModalGuardResponseBodyDataDetailResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public MultiModalGuardResponseBodyDataDetailResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MultiModalGuardResponseBodyDataDetailResult setExt(Object ext) {
            this.ext = ext;
            return this;
        }
        public Object getExt() {
            return this.ext;
        }

        public MultiModalGuardResponseBodyDataDetailResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public MultiModalGuardResponseBodyDataDetailResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class MultiModalGuardResponseBodyDataDetail extends TeaModel {
        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The detection results.</p>
         */
        @NameInMap("Result")
        public java.util.List<MultiModalGuardResponseBodyDataDetailResult> result;

        /**
         * <p>The moderation suggestion. Valid values: -<strong>block</strong>: The content is non-compliant. -<strong>pass</strong>: The content is compliant.</p>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>contentModeration</p>
         */
        @NameInMap("Type")
        public String type;

        public static MultiModalGuardResponseBodyDataDetail build(java.util.Map<String, ?> map) throws Exception {
            MultiModalGuardResponseBodyDataDetail self = new MultiModalGuardResponseBodyDataDetail();
            return TeaModel.build(map, self);
        }

        public MultiModalGuardResponseBodyDataDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public MultiModalGuardResponseBodyDataDetail setResult(java.util.List<MultiModalGuardResponseBodyDataDetailResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<MultiModalGuardResponseBodyDataDetailResult> getResult() {
            return this.result;
        }

        public MultiModalGuardResponseBodyDataDetail setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public MultiModalGuardResponseBodyDataDetail setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MultiModalGuardResponseBodyData extends TeaModel {
        /**
         * <p>The data ID of the detection object.</p>
         * 
         * <strong>example:</strong>
         * <p>data1234</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The detection details.</p>
         */
        @NameInMap("Detail")
        public java.util.List<MultiModalGuardResponseBodyDataDetail> detail;

        /**
         * <p>The moderation suggestion. Valid values: -block: The content is non-compliant. -pass: The content is compliant.</p>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static MultiModalGuardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MultiModalGuardResponseBodyData self = new MultiModalGuardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MultiModalGuardResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public MultiModalGuardResponseBodyData setDetail(java.util.List<MultiModalGuardResponseBodyDataDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<MultiModalGuardResponseBodyDataDetail> getDetail() {
            return this.detail;
        }

        public MultiModalGuardResponseBodyData setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

}
