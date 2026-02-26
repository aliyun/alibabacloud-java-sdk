// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetPromptTestResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetPromptTestResultResponseBodyResult> result;

    public static GetPromptTestResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPromptTestResultResponseBody self = new GetPromptTestResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPromptTestResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPromptTestResultResponseBody setResult(java.util.List<GetPromptTestResultResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetPromptTestResultResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetPromptTestResultResponseBodyResultLabelDetails extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>terrorism</p>
         */
        @NameInMap("Label")
        public String label;

        public static GetPromptTestResultResponseBodyResultLabelDetails build(java.util.Map<String, ?> map) throws Exception {
            GetPromptTestResultResponseBodyResultLabelDetails self = new GetPromptTestResultResponseBodyResultLabelDetails();
            return TeaModel.build(map, self);
        }

        public GetPromptTestResultResponseBodyResultLabelDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPromptTestResultResponseBodyResultLabelDetails setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetPromptTestResultResponseBodyResult extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("LabelDetails")
        public java.util.List<GetPromptTestResultResponseBodyResultLabelDetails> labelDetails;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static GetPromptTestResultResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetPromptTestResultResponseBodyResult self = new GetPromptTestResultResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetPromptTestResultResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetPromptTestResultResponseBodyResult setLabelDetails(java.util.List<GetPromptTestResultResponseBodyResultLabelDetails> labelDetails) {
            this.labelDetails = labelDetails;
            return this;
        }
        public java.util.List<GetPromptTestResultResponseBodyResultLabelDetails> getLabelDetails() {
            return this.labelDetails;
        }

        public GetPromptTestResultResponseBodyResult setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

}
