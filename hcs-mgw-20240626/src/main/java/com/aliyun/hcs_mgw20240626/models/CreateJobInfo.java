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

    /**
     * <p>The audit method.</p>
     */
    @NameInMap("Audit")
    public Audit audit;

    /**
     * <p>Indicates whether the Target attribute value of the symbolic links at the source data address is converted. You can convert the Target attribute value of the symbolic links at the source data address in one of the following scenarios: The source data address is an Object Storage Service (OSS) data address and the destination data address is a local data address. The source data address is a local data address and the destination data address is an OSS data address. The source data address is a local data address and the destination data address is another local data address. This ensures that the symbolic links at the destination data address can point to their objects as expected.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ConvertSymlinkTarget")
    public Boolean convertSymlinkTarget;

    /**
     * <p>Specifies whether to create a migration report.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CreateReport")
    public Boolean createReport;

    /**
     * <p>The name of the destination data address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_dest_address</p>
     */
    @NameInMap("DestAddress")
    public String destAddress;

    /**
     * <p>Specifies whether to enable multi-version migration. Multi-version migration is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableMultiVersioning")
    public Boolean enableMultiVersioning;

    /**
     * <p>The filtering rule.</p>
     */
    @NameInMap("FilterRule")
    public FilterRule filterRule;

    /**
     * <p>The throttling settings of the task.</p>
     */
    @NameInMap("ImportQos")
    public ImportQos importQos;

    /**
     * <p>The task name.\
     * The name can contain lowercase letters, digits, hyphens (-), and underscores (<em>). The name must be 3 to 63 characters in length. The name is case-sensitive and encoded in UTF-8. The name cannot start with a hyphen (-) or an underscore (</em>). You must specify a name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The file overwriting mode.\
     * Valid values: never and always.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>always</p>
     */
    @NameInMap("OverwriteMode")
    public String overwriteMode;

    /**
     * <p>The ID of the parent task. When you create a subtask to migrate a file that failed to be migrated, you can specify the ID of the parent task.</p>
     * 
     * <strong>example:</strong>
     * <p>6af62558-970d-4f44-8663-4e297170fd6a</p>
     */
    @NameInMap("ParentVersion")
    public String parentVersion;

    /**
     * <p>The scheduling rule.</p>
     */
    @NameInMap("ScheduleRule")
    public ScheduleRule scheduleRule;

    /**
     * <p>The name of the source data address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_src_address</p>
     */
    @NameInMap("SrcAddress")
    public String srcAddress;

    /**
     * <p>The tags in the key:value format.\
     * The value can contain letters, digits, hyphens (-), underscores (_), and commas (,). The value can be up to 1,024 characters in length.</p>
     * 
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
     * <p>The file transfer mode.\
     * Valid values: all and lastmodified. all: transfers the full data of files. lastmodified: transfers the incremental data of files.\
     * Valid values if OverwriteMode and TransferMode are used together:</p>
     * <ul>
     * <li>A combination of always and all indicates that all files are forcefully overwritten.</li>
     * <li>A combination of always and lastmodified indicates that files are overwritten based on the last modification time.</li>
     * <li>A combination of never and all indicates that the files with the same name are not overwritten.</li>
     * </ul>
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
