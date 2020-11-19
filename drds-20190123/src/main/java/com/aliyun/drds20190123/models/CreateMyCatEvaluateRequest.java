// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateMyCatEvaluateRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskName")
    @Validation(required = true)
    public String taskName;

    @NameInMap("SchemaUrl")
    @Validation(required = true)
    public String schemaUrl;

    @NameInMap("RuleUrl")
    @Validation(required = true)
    public String ruleUrl;

    @NameInMap("ImportDbList")
    @Validation(required = true)
    public java.util.List<String> importDbList;

    @NameInMap("BusPeakQps")
    @Validation(required = true)
    public Long busPeakQps;

    @NameInMap("CapacityIncPercent")
    @Validation(required = true)
    public Integer capacityIncPercent;

    @NameInMap("QpsIncPercent")
    @Validation(required = true)
    public Integer qpsIncPercent;

    @NameInMap("SequenceType")
    @Validation(required = true)
    public Integer sequenceType;

    @NameInMap("ServerUrl")
    @Validation(required = true)
    public String serverUrl;

    public static CreateMyCatEvaluateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMyCatEvaluateRequest self = new CreateMyCatEvaluateRequest();
        return TeaModel.build(map, self);
    }

    public CreateMyCatEvaluateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMyCatEvaluateRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateMyCatEvaluateRequest setSchemaUrl(String schemaUrl) {
        this.schemaUrl = schemaUrl;
        return this;
    }
    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public CreateMyCatEvaluateRequest setRuleUrl(String ruleUrl) {
        this.ruleUrl = ruleUrl;
        return this;
    }
    public String getRuleUrl() {
        return this.ruleUrl;
    }

    public CreateMyCatEvaluateRequest setImportDbList(java.util.List<String> importDbList) {
        this.importDbList = importDbList;
        return this;
    }
    public java.util.List<String> getImportDbList() {
        return this.importDbList;
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

    public CreateMyCatEvaluateRequest setQpsIncPercent(Integer qpsIncPercent) {
        this.qpsIncPercent = qpsIncPercent;
        return this;
    }
    public Integer getQpsIncPercent() {
        return this.qpsIncPercent;
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

}
