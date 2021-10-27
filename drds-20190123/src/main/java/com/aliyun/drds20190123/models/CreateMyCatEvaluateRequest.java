// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateMyCatEvaluateRequest extends TeaModel {
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

    public static CreateMyCatEvaluateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMyCatEvaluateRequest self = new CreateMyCatEvaluateRequest();
        return TeaModel.build(map, self);
    }

    public CreateMyCatEvaluateRequest setBusPeakQps(Long busPeakQps) {
        this.busPeakQps = busPeakQps;
        return this;
    }
    public Long getBusPeakQps() {
        return this.busPeakQps;
    }

    public CreateMyCatEvaluateRequest setCapacityIncPercent(Integer capacityIncPercent) {
        this.capacityIncPercent = capacityIncPercent;
        return this;
    }
    public Integer getCapacityIncPercent() {
        return this.capacityIncPercent;
    }

    public CreateMyCatEvaluateRequest setImportDbList(java.util.List<String> importDbList) {
        this.importDbList = importDbList;
        return this;
    }
    public java.util.List<String> getImportDbList() {
        return this.importDbList;
    }

    public CreateMyCatEvaluateRequest setQpsIncPercent(Integer qpsIncPercent) {
        this.qpsIncPercent = qpsIncPercent;
        return this;
    }
    public Integer getQpsIncPercent() {
        return this.qpsIncPercent;
    }

    public CreateMyCatEvaluateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMyCatEvaluateRequest setRuleUrl(String ruleUrl) {
        this.ruleUrl = ruleUrl;
        return this;
    }
    public String getRuleUrl() {
        return this.ruleUrl;
    }

    public CreateMyCatEvaluateRequest setSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
        return this;
    }
    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public CreateMyCatEvaluateRequest setSequenceType(Integer sequenceType) {
        this.sequenceType = sequenceType;
        return this;
    }
    public Integer getSequenceType() {
        return this.sequenceType;
    }

    public CreateMyCatEvaluateRequest setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }
    public String getServerUrl() {
        return this.serverUrl;
    }

    public CreateMyCatEvaluateRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
