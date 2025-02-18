// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ManualModerationResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ManualModerationResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
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
        @NameInMap("Description")
        public String description;

        /**
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
         * <strong>example:</strong>
         * <p>data1234</p>
         */
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Result")
        public java.util.List<ManualModerationResultResponseBodyDataResult> result;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
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
