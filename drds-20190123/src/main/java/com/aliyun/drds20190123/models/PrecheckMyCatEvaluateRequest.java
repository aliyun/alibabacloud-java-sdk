// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class PrecheckMyCatEvaluateRequest extends TeaModel {
    @NameInMap("BusPeakQps")
    public Long busPeakQps;

    @NameInMap("CapacityIncPercent")
    public Integer capacityIncPercent;

    @NameInMap("ImportDbList")
    public java.util.List<String> importDbList;

    @NameInMap("QpsIncPercent")
    public Integer qpsIncPercent;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleUrl")
    public String ruleUrl;

    @NameInMap("SchemaUrl")
    public String schemaUrl;

    @NameInMap("SequenceType")
    public Integer sequenceType;

    @NameInMap("ServerUrl")
    public String serverUrl;

    @NameInMap("TaskName")
    public String taskName;

    public static PrecheckMyCatEvaluateRequest build(java.util.Map<String, ?> map) throws Exception {
        PrecheckMyCatEvaluateRequest self = new PrecheckMyCatEvaluateRequest();
        return TeaModel.build(map, self);
    }

    public PrecheckMyCatEvaluateRequest setBusPeakQps(Long busPeakQps) {
        this.busPeakQps = busPeakQps;
        return this;
    }
    public Long getBusPeakQps() {
        return this.busPeakQps;
    }

    public PrecheckMyCatEvaluateRequest setCapacityIncPercent(Integer capacityIncPercent) {
        this.capacityIncPercent = capacityIncPercent;
        return this;
    }
    public Integer getCapacityIncPercent() {
        return this.capacityIncPercent;
    }

    public PrecheckMyCatEvaluateRequest setImportDbList(java.util.List<String> importDbList) {
        this.importDbList = importDbList;
        return this;
    }
    public java.util.List<String> getImportDbList() {
        return this.importDbList;
    }

    public PrecheckMyCatEvaluateRequest setQpsIncPercent(Integer qpsIncPercent) {
        this.qpsIncPercent = qpsIncPercent;
        return this;
    }
    public Integer getQpsIncPercent() {
        return this.qpsIncPercent;
    }

    public PrecheckMyCatEvaluateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PrecheckMyCatEvaluateRequest setRuleUrl(String ruleUrl) {
        this.ruleUrl = ruleUrl;
        return this;
    }
    public String getRuleUrl() {
        return this.ruleUrl;
    }

    public PrecheckMyCatEvaluateRequest setSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
        return this;
    }
    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public PrecheckMyCatEvaluateRequest setSequenceType(Integer sequenceType) {
        this.sequenceType = sequenceType;
        return this;
    }
    public Integer getSequenceType() {
        return this.sequenceType;
    }

    public PrecheckMyCatEvaluateRequest setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }
    public String getServerUrl() {
        return this.serverUrl;
    }

    public PrecheckMyCatEvaluateRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
