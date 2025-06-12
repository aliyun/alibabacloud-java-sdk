// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ManualModerationResultResponseBody extends TeaModel {
    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public ManualModerationResultResponseBodyData data;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ManualModerationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ManualModerationResultResponseBody self = new ManualModerationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ManualModerationResultResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ManualModerationResultResponseBody setData(ManualModerationResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ManualModerationResultResponseBodyData getData() {
        return this.data;
    }

    public ManualModerationResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ManualModerationResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ManualModerationResultResponseBodyDataResult extends TeaModel {
        /**
         * <p>Label description</p>
         * 
         * <strong>example:</strong>
         * <p>no risk</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Risk label</p>
         * 
         * <strong>example:</strong>
         * <p>violent_explosion</p>
         */
        @NameInMap("Label")
        public String label;

        public static ManualModerationResultResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ManualModerationResultResponseBodyDataResult self = new ManualModerationResultResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ManualModerationResultResponseBodyDataResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ManualModerationResultResponseBodyDataResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class ManualModerationResultResponseBodyData extends TeaModel {
        /**
         * <p>The value of dataId passed during the API request. This field will not be present if it was not provided during the request.</p>
         * 
         * <strong>example:</strong>
         * <p>data1234</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>Detailed label results.</p>
         */
        @NameInMap("Result")
        public java.util.List<ManualModerationResultResponseBodyDataResult> result;

        /**
         * <p>Risk level, returned based on the set high and low risk scores. Possible values include:</p>
         * <ul>
         * <li><p>high: High risk</p>
         * </li>
         * <li><p>low: Low risk</p>
         * </li>
         * <li><p>none: No risk detected</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>Task ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx-xxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ManualModerationResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ManualModerationResultResponseBodyData self = new ManualModerationResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ManualModerationResultResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ManualModerationResultResponseBodyData setResult(java.util.List<ManualModerationResultResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ManualModerationResultResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ManualModerationResultResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ManualModerationResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
