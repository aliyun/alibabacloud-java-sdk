// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalGuardResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public MultiModalGuardResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Ext")
        public Object ext;

        /**
         * <strong>example:</strong>
         * <p>contraband_act</p>
         */
        @NameInMap("Label")
        public String label;

        /**
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
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("Level")
        public String level;

        @NameInMap("Result")
        public java.util.List<MultiModalGuardResponseBodyDataDetailResult> result;

        /**
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
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
         * <strong>example:</strong>
         * <p>data1234</p>
         */
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Detail")
        public java.util.List<MultiModalGuardResponseBodyDataDetail> detail;

        /**
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
