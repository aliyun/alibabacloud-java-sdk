// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class RiskCheckResults extends TeaModel {
    @NameInMap("checkTime")
    public Long checkTime;

    /**
     * <p>网关实例的唯一标识符</p>
     * 
     * <strong>example:</strong>
     * <p>gw-0364f863b1a04474911b48cd6d51d03d</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>实例的基本信息</p>
     */
    @NameInMap("metadata")
    public RiskCheckResultsMetadata metadata;

    /**
     * <p>详细的风险项信息列表</p>
     */
    @NameInMap("riskDetails")
    public java.util.List<RiskCheckResultsRiskDetails> riskDetails;

    /**
     * <p>整体风险等级，可选值：LOW（低风险）、MEDIUM（中风险）、HIGH（高风险）、CRITICAL（严重风险）</p>
     * 
     * <strong>example:</strong>
     * <p>MEDIUM</p>
     */
    @NameInMap("riskLevel")
    public String riskLevel;

    /**
     * <p>风险综合评分，取值范围0-100分，分数越高表示风险越低</p>
     * 
     * <strong>example:</strong>
     * <p>85</p>
     */
    @NameInMap("score")
    public Integer score;

    @NameInMap("snapshotTime")
    public Long snapshotTime;

    /**
     * <p>风险检测状态，可选值：SUCCESS（成功）、FAIL（失败）、RUNNING（运行中）</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>检测到的风险项总数量</p>
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
         * <strong>example:</strong>
         * <p>Ingress</p>
         */
        @NameInMap("clusterType")
        public String clusterType;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("replica")
        public Integer replica;

        /**
         * <strong>example:</strong>
         * <p>apigw.small.x1</p>
         */
        @NameInMap("spec")
        public String spec;

        /**
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
         * <p>执行检测的模块名称</p>
         * 
         * <strong>example:</strong>
         * <p>BaseInfo</p>
         */
        @NameInMap("checkModule")
        public String checkModule;

        /**
         * <p>风险相关的详细数据，不同风险类型数据结构不同</p>
         */
        @NameInMap("data")
        public java.util.Map<String, String> data;

        /**
         * <p>风险的详细描述，JSON字符串格式</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;desc&quot;:&quot;单节点实例存在架构风险，单点故障会导致服务不可用。建议扩容到2节点及以上。&quot;}</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>该风险项的告警通知是否已被屏蔽</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isNoticeMute")
        public Boolean isNoticeMute;

        /**
         * <p>风险项的唯一标识码</p>
         * 
         * <strong>example:</strong>
         * <p>30010010001</p>
         */
        @NameInMap("riskCode")
        public String riskCode;

        /**
         * <p>该风险项的等级，可选值：LOW、MEDIUM、HIGH、CRITICAL</p>
         * 
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        @NameInMap("riskLevel")
        public String riskLevel;

        /**
         * <p>风险项的名称</p>
         * 
         * <strong>example:</strong>
         * <p>单节点架构风险</p>
         */
        @NameInMap("riskName")
        public String riskName;

        /**
         * <p>风险分类，可选值：SYSTEM（系统风险）、VERSION（版本风险）、SAFE（安全风险）、CAPACITY（容量风险）</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("riskType")
        public String riskType;

        /**
         * <p>当前实例的风险现状，JSON字符串格式</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;desc&quot;:&quot;集群节点数为1，不具备高可用能力&quot;}</p>
         */
        @NameInMap("situation")
        public String situation;

        /**
         * <p>针对该风险的优化建议，JSON字符串格式，包含描述和操作链接</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;desc&quot;:&quot;扩容到2节点及以上&quot;,&quot;links&quot;:[{&quot;descEn&quot;:&quot;click to upgrade specification&quot;,&quot;type&quot;:&quot;upgrade&quot;,&quot;desc&quot;:&quot;点击扩容&quot;}]}</p>
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
