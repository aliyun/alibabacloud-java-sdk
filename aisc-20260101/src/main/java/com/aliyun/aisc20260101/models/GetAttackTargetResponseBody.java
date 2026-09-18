// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class GetAttackTargetResponseBody extends TeaModel {
    /**
     * <p>The scan target details.</p>
     */
    @NameInMap("Data")
    public GetAttackTargetResponseBodyData data;

    /**
     * <p>The request ID. You can use this ID for troubleshooting and log tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>1EBD0C05-6C1F-4C95-9C63-B7AB7B5A9C8E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAttackTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAttackTargetResponseBody self = new GetAttackTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAttackTargetResponseBody setData(GetAttackTargetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAttackTargetResponseBodyData getData() {
        return this.data;
    }

    public GetAttackTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAttackTargetResponseBodyData extends TeaModel {
        /**
         * <p>The advanced connection configuration (JSON character string). For common fields and provider configuration templates, refer to the ConnectionConfig parameter of CreateAttackTarget.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;httpMethod\&quot;:\&quot;POST\&quot;,\&quot;authType\&quot;:\&quot;bearer\&quot;,\&quot;timeoutMs\&quot;:30000,\&quot;requestTemplate\&quot;:\&quot;{\\\&quot;input\\\&quot;:{\\\&quot;prompt\\\&quot;:\\\&quot;{{prompt}}\\\&quot;},\\\&quot;parameters\\\&quot;:{\\\&quot;incremental_output\\\&quot;:true},\\\&quot;debug\\\&quot;:{}}\&quot;,\&quot;messageJsonPath\&quot;:\&quot;$.output.text\&quot;,\&quot;requestHeaders\&quot;:\&quot;{\\\&quot;X-DashScope-SSE\\\&quot;: \\\&quot;enable\\\&quot; }\&quot;,\&quot;stream\&quot;:true,\&quot;customAuthHeaderName\&quot;:\&quot;\&quot;}</p>
         */
        @NameInMap("ConnectionConfig")
        public String connectionConfig;

        /**
         * <p>The connection protocol type of the target service.</p>
         * 
         * <strong>example:</strong>
         * <p>openai</p>
         */
        @NameInMap("ConnectionMethod")
        public String connectionMethod;

        /**
         * <p>The time when the target was created. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735689600000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the scan target. This value may be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Production Bailian application</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The HTTP or HTTPS endpoint of the target model service. When ConnectionMethod is set to enterprise_relay, this value is a fixed internal endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The time of the first scan. This value is a UNIX timestamp in milliseconds. This is an aggregate field that is not populated by this operation and returns an empty value. Refer to ListAttackTargets.</p>
         * 
         * <strong>example:</strong>
         * <p>1735689600000</p>
         */
        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        /**
         * <p>The failure reason of the most recent scan task. This is an aggregate field that is not populated by this operation and returns an empty value. Refer to ListAttackTargets.</p>
         * 
         * <strong>example:</strong>
         * <p>Execution timed out</p>
         */
        @NameInMap("LastScanFailMessage")
        public String lastScanFailMessage;

        /**
         * <p>The status of the most recent scan task. This is an aggregate field that is not populated by this operation and returns an empty value. Refer to ListAttackTargets.</p>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("LastScanStatus")
        public String lastScanStatus;

        /**
         * <p>The time of the most recent scan. This value is a UNIX timestamp in milliseconds. This is an aggregate field that is not populated by this operation and returns an empty value. Refer to ListAttackTargets.</p>
         * 
         * <strong>example:</strong>
         * <p>1735689600000</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        /**
         * <p>The name of the target model. When ConnectionMethod is set to enterprise_relay, this value is the fixed platform value Agent.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-flash</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>The time when the target was last modified. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735689600000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The business label of the model or agent provider.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        @NameInMap("Provider")
        public String provider;

        /**
         * <p>The risk level of the task result. This is an aggregate field that is not populated by this operation and returns an empty value. Refer to ListAttackTargets.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The cumulative number of scans. This is an aggregate field that is not populated by this operation and returns an empty value. For the meaning and example values, refer to the ListAttackTargets response.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("ScanCount")
        public Long scanCount;

        /**
         * <p>The scan node configuration (JSON character string). Common fields include scanType (scan pattern: attack for security attack scan, tc260 for TC260 filing scan), scannerType (execute DPI engine: classic for per-sample execute, agent for multi-round autonomous attack), and sampleScope (sample scope: version for the current effective version, all for full samples). If the target is not configured, the default configurations are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;scanType&quot;:&quot;attack&quot;,&quot;scannerType&quot;:&quot;classic&quot;,&quot;sampleScope&quot;:&quot;all&quot;}</p>
         */
        @NameInMap("ScanTaskConfig")
        public String scanTaskConfig;

        /**
         * <p>The unique identifier of the scan target.</p>
         * 
         * <strong>example:</strong>
         * <p>target-abc123def4567</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The display name of the scan target.</p>
         * 
         * <strong>example:</strong>
         * <p>My Bailian target</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The type of the scan target.</p>
         * 
         * <strong>example:</strong>
         * <p>model</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static GetAttackTargetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAttackTargetResponseBodyData self = new GetAttackTargetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAttackTargetResponseBodyData setConnectionConfig(String connectionConfig) {
            this.connectionConfig = connectionConfig;
            return this;
        }
        public String getConnectionConfig() {
            return this.connectionConfig;
        }

        public GetAttackTargetResponseBodyData setConnectionMethod(String connectionMethod) {
            this.connectionMethod = connectionMethod;
            return this;
        }
        public String getConnectionMethod() {
            return this.connectionMethod;
        }

        public GetAttackTargetResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetAttackTargetResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAttackTargetResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetAttackTargetResponseBodyData setFirstScanTime(Long firstScanTime) {
            this.firstScanTime = firstScanTime;
            return this;
        }
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        public GetAttackTargetResponseBodyData setLastScanFailMessage(String lastScanFailMessage) {
            this.lastScanFailMessage = lastScanFailMessage;
            return this;
        }
        public String getLastScanFailMessage() {
            return this.lastScanFailMessage;
        }

        public GetAttackTargetResponseBodyData setLastScanStatus(String lastScanStatus) {
            this.lastScanStatus = lastScanStatus;
            return this;
        }
        public String getLastScanStatus() {
            return this.lastScanStatus;
        }

        public GetAttackTargetResponseBodyData setLastScanTime(Long lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        public GetAttackTargetResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetAttackTargetResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetAttackTargetResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public GetAttackTargetResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public GetAttackTargetResponseBodyData setScanCount(Long scanCount) {
            this.scanCount = scanCount;
            return this;
        }
        public Long getScanCount() {
            return this.scanCount;
        }

        public GetAttackTargetResponseBodyData setScanTaskConfig(String scanTaskConfig) {
            this.scanTaskConfig = scanTaskConfig;
            return this;
        }
        public String getScanTaskConfig() {
            return this.scanTaskConfig;
        }

        public GetAttackTargetResponseBodyData setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public GetAttackTargetResponseBodyData setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public GetAttackTargetResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
