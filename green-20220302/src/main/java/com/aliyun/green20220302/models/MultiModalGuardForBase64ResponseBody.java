// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalGuardForBase64ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public MultiModalGuardForBase64ResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MultiModalGuardForBase64ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MultiModalGuardForBase64ResponseBody self = new MultiModalGuardForBase64ResponseBody();
        return TeaModel.build(map, self);
    }

    public MultiModalGuardForBase64ResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public MultiModalGuardForBase64ResponseBody setData(MultiModalGuardForBase64ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MultiModalGuardForBase64ResponseBodyData getData() {
        return this.data;
    }

    public MultiModalGuardForBase64ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MultiModalGuardForBase64ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MultiModalGuardForBase64ResponseBodyDataDetailResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <strong>example:</strong>
         * <p>未检测出风险</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>json格式数据</p>
         */
        @NameInMap("Ext")
        public Object ext;

        /**
         * <strong>example:</strong>
         * <p>nonLable</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("Level")
        public String level;

        public static MultiModalGuardForBase64ResponseBodyDataDetailResult build(java.util.Map<String, ?> map) throws Exception {
            MultiModalGuardForBase64ResponseBodyDataDetailResult self = new MultiModalGuardForBase64ResponseBodyDataDetailResult();
            return TeaModel.build(map, self);
        }

        public MultiModalGuardForBase64ResponseBodyDataDetailResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public MultiModalGuardForBase64ResponseBodyDataDetailResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MultiModalGuardForBase64ResponseBodyDataDetailResult setExt(Object ext) {
            this.ext = ext;
            return this;
        }
        public Object getExt() {
            return this.ext;
        }

        public MultiModalGuardForBase64ResponseBodyDataDetailResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public MultiModalGuardForBase64ResponseBodyDataDetailResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class MultiModalGuardForBase64ResponseBodyDataDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("Level")
        public String level;

        @NameInMap("Result")
        public java.util.List<MultiModalGuardForBase64ResponseBodyDataDetailResult> result;

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

        public static MultiModalGuardForBase64ResponseBodyDataDetail build(java.util.Map<String, ?> map) throws Exception {
            MultiModalGuardForBase64ResponseBodyDataDetail self = new MultiModalGuardForBase64ResponseBodyDataDetail();
            return TeaModel.build(map, self);
        }

        public MultiModalGuardForBase64ResponseBodyDataDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public MultiModalGuardForBase64ResponseBodyDataDetail setResult(java.util.List<MultiModalGuardForBase64ResponseBodyDataDetailResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<MultiModalGuardForBase64ResponseBodyDataDetailResult> getResult() {
            return this.result;
        }

        public MultiModalGuardForBase64ResponseBodyDataDetail setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public MultiModalGuardForBase64ResponseBodyDataDetail setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MultiModalGuardForBase64ResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Detail")
        public java.util.List<MultiModalGuardForBase64ResponseBodyDataDetail> detail;

        /**
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static MultiModalGuardForBase64ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MultiModalGuardForBase64ResponseBodyData self = new MultiModalGuardForBase64ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MultiModalGuardForBase64ResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public MultiModalGuardForBase64ResponseBodyData setDetail(java.util.List<MultiModalGuardForBase64ResponseBodyDataDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<MultiModalGuardForBase64ResponseBodyDataDetail> getDetail() {
            return this.detail;
        }

        public MultiModalGuardForBase64ResponseBodyData setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

}
