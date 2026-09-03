// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class CreateJobInfo extends TeaModel {
    /**
     * <p>Specifies whether to migrate appendable files as normal or multipart files. Default value: false.</p>
     * 
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
     * <p>Specifies whether to transform the target of a symbolic link. When migrating data from OSS to a local server, from a local server to OSS, or between two local servers, set this parameter to \<code>true\\</code> to ensure that symbolic links can be accessed after migration.</p>
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
     * <p>Specifies whether to migrate multiple object versions. Multi-version migration is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableMultiVersioning")
    public Boolean enableMultiVersioning;

    /**
     * <p>The filter rule.</p>
     */
    @NameInMap("FilterRule")
    public FilterRule filterRule;

    /**
     * <p>The task throttling settings.</p>
     */
    @NameInMap("ImportQos")
    public ImportQos importQos;

    /**
     * <p>The task name.<br>
     * The name must be 3 to 63 characters in length and can contain lowercase letters, digits, hyphens (-), and underscores (<em>). The name is case-sensitive and must be UTF-8 encoded. It cannot start with a hyphen (-) or an underscore (</em>). This parameter cannot be empty.<br></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The file overwrite mode.<br>
     * Valid values: \<code>never\\</code> and \<code>always\\</code>. \<code>never\\</code>: Does not overwrite existing files. \<code>always\\</code>: Overwrites existing files.<br></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>always</p>
     */
    @NameInMap("OverwriteMode")
    public String overwriteMode;

    /**
     * <p>The parent task ID. Specify this ID when you create a subtask to retry failed file transfers.</p>
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
     * <p>The tags, in key-value format.<br>
     * Allowed characters include uppercase and lowercase letters, digits, hyphens (-), and underscores (_). The maximum length is 1024 characters.<br></p>
     * 
     * <strong>example:</strong>
     * <p>K1:V1,K2:V2</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>Specifies the StorageClass for destination files. The destination address can only be OSS. Valid values: Standard, IA, Archive, ColdArchive, DeepColdArchive.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("TargetStorageClass")
    public String targetStorageClass;

    /**
     * <p>The file transfer mode.<br>
     * Valid values: \<code>all\\</code> (full transfer) and \<code>lastmodified\\</code> (incremental transfer).<br>
     * \<code>OverwriteMode\\</code> and \<code>TransferMode\\</code> are used together:<br><br></p>
     * <ul>
     * <li><p>\<code>always\\</code> and \<code>all\\</code>: Forces a full overwrite.</p>
     * </li>
     * <li><p>\<code>always\\</code> and \<code>lastmodified\\</code>: Overwrites files based on their last modified time.</p>
     * </li>
     * <li><p>\<code>never\\</code> and an empty value for \<code>TransferMode\\</code>: Does not overwrite files with the same name.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("TransferMode")
    public String transferMode;

    /**
     * <p>Specifies whether to preserve the lastModifyTime. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithLastModifyTime")
    public Boolean withLastModifyTime;

    /**
     * <p>Specifies whether to migrate the StorageClass property. This is allowed only for OSS-to-OSS migration.</p>
     * 
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
