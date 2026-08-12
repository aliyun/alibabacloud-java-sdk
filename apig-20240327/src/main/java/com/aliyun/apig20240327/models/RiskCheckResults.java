// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class RiskCheckResults extends TeaModel {
    /**
     * <p>The check time</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890000</p>
     */
    @NameInMap("checkTime")
    public Long checkTime;

    /**
     * <p>The gateway ID</p>
     * 
     * <strong>example:</strong>
     * <p>gw-0364f863b1a04474911b48cd6d51d03d</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The instance metadata</p>
     */
    @NameInMap("metadata")
    public RiskCheckResultsMetadata metadata;

    /**
     * <p>The risk details list</p>
     */
    @NameInMap("riskDetails")
    public java.util.List<RiskCheckResultsRiskDetails> riskDetails;

    /**
     * <p>The risk level</p>
     * 
     * <strong>example:</strong>
     * <p>MEDIUM</p>
     */
    @NameInMap("riskLevel")
    public String riskLevel;

    /**
     * <p>The risk score</p>
     * 
     * <strong>example:</strong>
     * <p>85</p>
     */
    @NameInMap("score")
    public Integer score;

    /**
     * <p>The snapshot time</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890000</p>
     */
    @NameInMap("snapshotTime")
    public Long snapshotTime;

    /**
     * <p>The execution status</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The total number of risks</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalRisk")
    public Integer totalRisk;

    public static RiskCheckResults build(java.util.Map<String, ?> map) throws Exception {
        RiskCheckResults self = new RiskCheckResults();
        return TeaModel.build(map, self);
    }

    public RiskCheckResults setCheckTime(Long checkTime) {
        this.checkTime = checkTime;
        return this;
    }
    public Long getCheckTime() {
        return this.checkTime;
    }

    public RiskCheckResults setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public RiskCheckResults setMetadata(RiskCheckResultsMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public RiskCheckResultsMetadata getMetadata() {
        return this.metadata;
    }

    public RiskCheckResults setRiskDetails(java.util.List<RiskCheckResultsRiskDetails> riskDetails) {
        this.riskDetails = riskDetails;
        return this;
    }
    public java.util.List<RiskCheckResultsRiskDetails> getRiskDetails() {
        return this.riskDetails;
    }

    public RiskCheckResults setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public RiskCheckResults setScore(Integer score) {
        this.score = score;
        return this;
    }
    public Integer getScore() {
        return this.score;
    }

    public RiskCheckResults setSnapshotTime(Long snapshotTime) {
        this.snapshotTime = snapshotTime;
        return this;
    }
    public Long getSnapshotTime() {
        return this.snapshotTime;
    }

    public RiskCheckResults setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RiskCheckResults setTotalRisk(Integer totalRisk) {
        this.totalRisk = totalRisk;
        return this;
    }
    public Integer getTotalRisk() {
        return this.totalRisk;
    }

    public static class RiskCheckResultsMetadata extends TeaModel {
        /**
         * <p>The cluster type</p>
         * 
         * <strong>example:</strong>
         * <p>Ingress</p>
         */
        @NameInMap("clusterType")
        public String clusterType;

        /**
         * <p>The replica count</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("replica")
        public Integer replica;

        /**
         * <p>The specification</p>
         * 
         * <strong>example:</strong>
         * <p>apigw.small.x1</p>
         */
        @NameInMap("spec")
        public String spec;

        /**
         * <p>The version</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.14</p>
         */
        @NameInMap("version")
        public String version;

        public static RiskCheckResultsMetadata build(java.util.Map<String, ?> map) throws Exception {
            RiskCheckResultsMetadata self = new RiskCheckResultsMetadata();
            return TeaModel.build(map, self);
        }

        public RiskCheckResultsMetadata setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public RiskCheckResultsMetadata setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public RiskCheckResultsMetadata setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public RiskCheckResultsMetadata setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class RiskCheckResultsRiskDetails extends TeaModel {
        /**
         * <p>The check module</p>
         * 
         * <strong>example:</strong>
         * <p>BaseInfo</p>
         */
        @NameInMap("checkModule")
        public String checkModule;

        /**
         * <p>The risk detailed data</p>
         */
        @NameInMap("data")
        public java.util.Map<String, String> data;

        /**
         * <p>The risk description</p>
         * 
         * <strong>example:</strong>
         * <p>The version is outdated</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Whether to mute notifications</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isNoticeMute")
        public Boolean isNoticeMute;

        /**
         * <p>The risk code</p>
         * 
         * <strong>example:</strong>
         * <p>30010010001</p>
         */
        @NameInMap("riskCode")
        public String riskCode;

        /**
         * <p>The risk level</p>
         * 
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        @NameInMap("riskLevel")
        public String riskLevel;

        /**
         * <p>The risk title</p>
         * 
         * <strong>example:</strong>
         * <p>Version Risk</p>
         */
        @NameInMap("riskName")
        public String riskName;

        /**
         * <p>The risk type</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("riskType")
        public String riskType;

        /**
         * <p>The risk situation</p>
         * 
         * <strong>example:</strong>
         * <p>Current version is 2 releases behind</p>
         */
        @NameInMap("situation")
        public String situation;

        /**
         * <p>The fix suggestion</p>
         * 
         * <strong>example:</strong>
         * <p>Upgrade to the latest version</p>
         */
        @NameInMap("suggestion")
        public String suggestion;

        public static RiskCheckResultsRiskDetails build(java.util.Map<String, ?> map) throws Exception {
            RiskCheckResultsRiskDetails self = new RiskCheckResultsRiskDetails();
            return TeaModel.build(map, self);
        }

        public RiskCheckResultsRiskDetails setCheckModule(String checkModule) {
            this.checkModule = checkModule;
            return this;
        }
        public String getCheckModule() {
            return this.checkModule;
        }

        public RiskCheckResultsRiskDetails setData(java.util.Map<String, String> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, String> getData() {
            return this.data;
        }

        public RiskCheckResultsRiskDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RiskCheckResultsRiskDetails setIsNoticeMute(Boolean isNoticeMute) {
            this.isNoticeMute = isNoticeMute;
            return this;
        }
        public Boolean getIsNoticeMute() {
            return this.isNoticeMute;
        }

        public RiskCheckResultsRiskDetails setRiskCode(String riskCode) {
            this.riskCode = riskCode;
            return this;
        }
        public String getRiskCode() {
            return this.riskCode;
        }

        public RiskCheckResultsRiskDetails setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public RiskCheckResultsRiskDetails setRiskName(String riskName) {
            this.riskName = riskName;
            return this;
        }
        public String getRiskName() {
            return this.riskName;
        }

        public RiskCheckResultsRiskDetails setRiskType(String riskType) {
            this.riskType = riskType;
            return this;
        }
        public String getRiskType() {
            return this.riskType;
        }

        public RiskCheckResultsRiskDetails setSituation(String situation) {
            this.situation = situation;
            return this;
        }
        public String getSituation() {
            return this.situation;
        }

        public RiskCheckResultsRiskDetails setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

}
