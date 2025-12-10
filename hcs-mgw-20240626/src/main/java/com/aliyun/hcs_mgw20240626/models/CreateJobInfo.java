// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class CreateJobInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AppendableToNormal")
    public Boolean appendableToNormal;

    @NameInMap("Audit")
    public Audit audit;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ConvertSymlinkTarget")
    public Boolean convertSymlinkTarget;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CreateReport")
    public Boolean createReport;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <your-dest-address-name>
     */
    @NameInMap("DestAddress")
    public String destAddress;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableMultiVersioning")
    public Boolean enableMultiVersioning;

    @NameInMap("FilterRule")
    public FilterRule filterRule;

    @NameInMap("ImportQos")
    public ImportQos importQos;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <your-job-name>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>always</p>
     */
    @NameInMap("OverwriteMode")
    public String overwriteMode;

    /**
     * <strong>example:</strong>
     * <your-parent-version>
     */
    @NameInMap("ParentVersion")
    public String parentVersion;

    @NameInMap("ScheduleRule")
    public ScheduleRule scheduleRule;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <your-src-address-name>
     */
    @NameInMap("SrcAddress")
    public String srcAddress;

    /**
     * <strong>example:</strong>
     * <p>K1:V1,K2:V2</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("TargetStorageClass")
    public String targetStorageClass;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("TransferMode")
    public String transferMode;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithLastModifyTime")
    public Boolean withLastModifyTime;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WithStorageClass")
    public Boolean withStorageClass;

    public static CreateJobInfo build(java.util.Map<String, ?> map) throws Exception {
        CreateJobInfo self = new CreateJobInfo();
        return TeaModel.build(map, self);
    }

    public CreateJobInfo setAppendableToNormal(Boolean appendableToNormal) {
        this.appendableToNormal = appendableToNormal;
        return this;
    }
    public Boolean getAppendableToNormal() {
        return this.appendableToNormal;
    }

    public CreateJobInfo setAudit(Audit audit) {
        this.audit = audit;
        return this;
    }
    public Audit getAudit() {
        return this.audit;
    }

    public CreateJobInfo setConvertSymlinkTarget(Boolean convertSymlinkTarget) {
        this.convertSymlinkTarget = convertSymlinkTarget;
        return this;
    }
    public Boolean getConvertSymlinkTarget() {
        return this.convertSymlinkTarget;
    }

    public CreateJobInfo setCreateReport(Boolean createReport) {
        this.createReport = createReport;
        return this;
    }
    public Boolean getCreateReport() {
        return this.createReport;
    }

    public CreateJobInfo setDestAddress(String destAddress) {
        this.destAddress = destAddress;
        return this;
    }
    public String getDestAddress() {
        return this.destAddress;
    }

    public CreateJobInfo setEnableMultiVersioning(Boolean enableMultiVersioning) {
        this.enableMultiVersioning = enableMultiVersioning;
        return this;
    }
    public Boolean getEnableMultiVersioning() {
        return this.enableMultiVersioning;
    }

    public CreateJobInfo setFilterRule(FilterRule filterRule) {
        this.filterRule = filterRule;
        return this;
    }
    public FilterRule getFilterRule() {
        return this.filterRule;
    }

    public CreateJobInfo setImportQos(ImportQos importQos) {
        this.importQos = importQos;
        return this;
    }
    public ImportQos getImportQos() {
        return this.importQos;
    }

    public CreateJobInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateJobInfo setOverwriteMode(String overwriteMode) {
        this.overwriteMode = overwriteMode;
        return this;
    }
    public String getOverwriteMode() {
        return this.overwriteMode;
    }

    public CreateJobInfo setParentVersion(String parentVersion) {
        this.parentVersion = parentVersion;
        return this;
    }
    public String getParentVersion() {
        return this.parentVersion;
    }

    public CreateJobInfo setScheduleRule(ScheduleRule scheduleRule) {
        this.scheduleRule = scheduleRule;
        return this;
    }
    public ScheduleRule getScheduleRule() {
        return this.scheduleRule;
    }

    public CreateJobInfo setSrcAddress(String srcAddress) {
        this.srcAddress = srcAddress;
        return this;
    }
    public String getSrcAddress() {
        return this.srcAddress;
    }

    public CreateJobInfo setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateJobInfo setTargetStorageClass(String targetStorageClass) {
        this.targetStorageClass = targetStorageClass;
        return this;
    }
    public String getTargetStorageClass() {
        return this.targetStorageClass;
    }

    public CreateJobInfo setTransferMode(String transferMode) {
        this.transferMode = transferMode;
        return this;
    }
    public String getTransferMode() {
        return this.transferMode;
    }

    public CreateJobInfo setWithLastModifyTime(Boolean withLastModifyTime) {
        this.withLastModifyTime = withLastModifyTime;
        return this;
    }
    public Boolean getWithLastModifyTime() {
        return this.withLastModifyTime;
    }

    public CreateJobInfo setWithStorageClass(Boolean withStorageClass) {
        this.withStorageClass = withStorageClass;
        return this;
    }
    public Boolean getWithStorageClass() {
        return this.withStorageClass;
    }

}
