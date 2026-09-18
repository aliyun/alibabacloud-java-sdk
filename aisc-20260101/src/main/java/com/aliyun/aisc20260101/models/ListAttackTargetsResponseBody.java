// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class ListAttackTargetsResponseBody extends TeaModel {
    /**
     * <p>The list of scan targets on the current page.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAttackTargetsResponseBodyData> data;

    /**
     * <p>The normalized page number that takes effect. The value may differ from the input parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The normalized number of entries per page that takes effect. The value may differ from the input parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID. You can use this ID for troubleshooting and log tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>1EBD0C05-6C1F-4C95-9C63-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of scan targets that match the filter conditions. In post-filtering scenarios, this value is the total count after in-memory filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAttackTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAttackTargetsResponseBody self = new ListAttackTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAttackTargetsResponseBody setData(java.util.List<ListAttackTargetsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAttackTargetsResponseBodyData> getData() {
        return this.data;
    }

    public ListAttackTargetsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAttackTargetsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAttackTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAttackTargetsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAttackTargetsResponseBodyData extends TeaModel {
        /**
         * <p>The advanced connection configuration for the target (JSON character string). For common fields and provider configuration templates, see the ConnectionConfig parameter description of the CreateAttackTarget operation.</p>
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
         * <p>The time when the target was created. The value is a millisecond-level UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1735689600000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the scan target.</p>
         * 
         * <strong>example:</strong>
         * <p>Production Bailian application</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The HTTP or HTTPS endpoint address of the target model service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The time when the first scan was performed. The value is a millisecond-level UNIX timestamp. This parameter is null if no scan has been performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1735689600000</p>
         */
        @NameInMap("FirstScanTime")
        public Long firstScanTime;

        /**
         * <p>The failure reason of the most recent scan task. This parameter is empty if the most recent scan did not fail.</p>
         * 
         * <strong>example:</strong>
         * <p>Scan executor connection timed out</p>
         */
        @NameInMap("LastScanFailMessage")
        public String lastScanFailMessage;

        /**
         * <p>The detection status of the most recent scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("LastScanStatus")
        public String lastScanStatus;

        /**
         * <p>The time when the last scan was performed. The value is a millisecond-level UNIX timestamp. This parameter is null if no scan has been performed.</p>
         * 
         * <strong>example:</strong>
         * <p>1735689600000</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        /**
         * <p>The detailed message of the most recent connectivity verification. If the verification succeeded, the value is a response content snippet returned by the target service. If the verification failed, the value is the error reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Connectivity verification succeeded</p>
         */
        @NameInMap("LastVerifyMessage")
        public String lastVerifyMessage;

        /**
         * <p>The name of the target model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-flash</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>The time when the target was last modified. The value is a millisecond-level UNIX timestamp.</p>
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
         * <p>The risk level derived from the most recent completed scan task. This parameter is null if no scan has been performed.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The total number of scans performed. The value is 0 if no scan has been performed.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("ScanCount")
        public Long scanCount;

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

        /**
         * <p>The connectivity verification status of the target.</p>
         * 
         * <strong>example:</strong>
         * <p>verified</p>
         */
        @NameInMap("VerifyStatus")
        public String verifyStatus;

        public static ListAttackTargetsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAttackTargetsResponseBodyData self = new ListAttackTargetsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAttackTargetsResponseBodyData setConnectionConfig(String connectionConfig) {
            this.connectionConfig = connectionConfig;
            return this;
        }
        public String getConnectionConfig() {
            return this.connectionConfig;
        }

        public ListAttackTargetsResponseBodyData setConnectionMethod(String connectionMethod) {
            this.connectionMethod = connectionMethod;
            return this;
        }
        public String getConnectionMethod() {
            return this.connectionMethod;
        }

        public ListAttackTargetsResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListAttackTargetsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAttackTargetsResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListAttackTargetsResponseBodyData setFirstScanTime(Long firstScanTime) {
            this.firstScanTime = firstScanTime;
            return this;
        }
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        public ListAttackTargetsResponseBodyData setLastScanFailMessage(String lastScanFailMessage) {
            this.lastScanFailMessage = lastScanFailMessage;
            return this;
        }
        public String getLastScanFailMessage() {
            return this.lastScanFailMessage;
        }

        public ListAttackTargetsResponseBodyData setLastScanStatus(String lastScanStatus) {
            this.lastScanStatus = lastScanStatus;
            return this;
        }
        public String getLastScanStatus() {
            return this.lastScanStatus;
        }

        public ListAttackTargetsResponseBodyData setLastScanTime(Long lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        public ListAttackTargetsResponseBodyData setLastVerifyMessage(String lastVerifyMessage) {
            this.lastVerifyMessage = lastVerifyMessage;
            return this;
        }
        public String getLastVerifyMessage() {
            return this.lastVerifyMessage;
        }

        public ListAttackTargetsResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListAttackTargetsResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListAttackTargetsResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListAttackTargetsResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListAttackTargetsResponseBodyData setScanCount(Long scanCount) {
            this.scanCount = scanCount;
            return this;
        }
        public Long getScanCount() {
            return this.scanCount;
        }

        public ListAttackTargetsResponseBodyData setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListAttackTargetsResponseBodyData setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListAttackTargetsResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListAttackTargetsResponseBodyData setVerifyStatus(String verifyStatus) {
            this.verifyStatus = verifyStatus;
            return this;
        }
        public String getVerifyStatus() {
            return this.verifyStatus;
        }

    }

}
