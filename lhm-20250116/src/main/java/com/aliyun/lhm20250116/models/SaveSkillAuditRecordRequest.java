// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class SaveSkillAuditRecordRequest extends TeaModel {
    /**
     * <p>The batch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20001</p>
     */
    @NameInMap("batchId")
    public String batchId;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12313</p>
     */
    @NameInMap("cid")
    public String cid;

    /**
     * <p>The dry run status.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("dryRunStatus")
    public String dryRunStatus;

    /**
     * <p>The extended information.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("extInfo")
    public String extInfo;

    /**
     * <p>The record type.</p>
     * 
     * <strong>example:</strong>
     * <p>logCorrelation</p>
     */
    @NameInMap("recordType")
    public String recordType;

    /**
     * <p>The conversion result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("scriptTransformResult")
    public String scriptTransformResult;

    /**
     * <p>The conversion status.</p>
     * 
     * <strong>example:</strong>
     * <p>end</p>
     */
    @NameInMap("scriptTransformStatus")
    public String scriptTransformStatus;

    /**
     * <p>The source dialect.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("sourceDialect")
    public String sourceDialect;

    /**
     * <p>The source dialect content.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT * FROM t;</p>
     */
    @NameInMap("sourceSqlScript")
    public String sourceSqlScript;

    /**
     * <p>The target dialect.</p>
     * 
     * <strong>example:</strong>
     * <p>bigquery</p>
     */
    @NameInMap("targetDialect")
    public String targetDialect;

    public static SaveSkillAuditRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSkillAuditRecordRequest self = new SaveSkillAuditRecordRequest();
        return TeaModel.build(map, self);
    }

    public SaveSkillAuditRecordRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public SaveSkillAuditRecordRequest setCid(String cid) {
        this.cid = cid;
        return this;
    }
    public String getCid() {
        return this.cid;
    }

    public SaveSkillAuditRecordRequest setDryRunStatus(String dryRunStatus) {
        this.dryRunStatus = dryRunStatus;
        return this;
    }
    public String getDryRunStatus() {
        return this.dryRunStatus;
    }

    public SaveSkillAuditRecordRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public SaveSkillAuditRecordRequest setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

    public SaveSkillAuditRecordRequest setScriptTransformResult(String scriptTransformResult) {
        this.scriptTransformResult = scriptTransformResult;
        return this;
    }
    public String getScriptTransformResult() {
        return this.scriptTransformResult;
    }

    public SaveSkillAuditRecordRequest setScriptTransformStatus(String scriptTransformStatus) {
        this.scriptTransformStatus = scriptTransformStatus;
        return this;
    }
    public String getScriptTransformStatus() {
        return this.scriptTransformStatus;
    }

    public SaveSkillAuditRecordRequest setSourceDialect(String sourceDialect) {
        this.sourceDialect = sourceDialect;
        return this;
    }
    public String getSourceDialect() {
        return this.sourceDialect;
    }

    public SaveSkillAuditRecordRequest setSourceSqlScript(String sourceSqlScript) {
        this.sourceSqlScript = sourceSqlScript;
        return this;
    }
    public String getSourceSqlScript() {
        return this.sourceSqlScript;
    }

    public SaveSkillAuditRecordRequest setTargetDialect(String targetDialect) {
        this.targetDialect = targetDialect;
        return this;
    }
    public String getTargetDialect() {
        return this.targetDialect;
    }

}
