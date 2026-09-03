// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetJobResp extends TeaModel {
    /**
     * <p>Specifies whether to migrate appendable files as normal or multipart files. The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AppendableToNormal")
    public Boolean appendableToNormal;

    /**
     * <p>The audit method.</p>
     */
    @NameInMap("Audit")
    public Audit audit;

    /**
     * <p>Indicates whether to convert the target of the symbolic link.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ConvertSymlinkTarget")
    public Boolean convertSymlinkTarget;

    /**
     * <p>Indicates whether to generate a migration report.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CreateReport")
    public Boolean createReport;

    /**
     * <p>The time when the job was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-01 12:00:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The name of the destination data address.</p>
     * 
     * <strong>example:</strong>
     * <p>test_dest_address</p>
     */
    @NameInMap("DestAddress")
    public String destAddress;

    /**
     * <p>Indicates whether multi-versioning is enabled.</p>
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
     * <p>The rate limiting rule for the job.</p>
     */
    @NameInMap("ImportQos")
    public ImportQos importQos;

    /**
     * <p>The time when the job was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-01 12:00:00</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <p>The name of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The file overwrite mode.</p>
     * 
     * <strong>example:</strong>
     * <p>always</p>
     */
    @NameInMap("OverwriteMode")
    public String overwriteMode;

    /**
     * <p>The owner.</p>
     * 
     * <strong>example:</strong>
     * <p>test_owner</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The name of the parent job.</p>
     * 
     * <strong>example:</strong>
     * <p>test_parent_name</p>
     */
    @NameInMap("ParentName")
    public String parentName;

    /**
     * <p>The ID of the parent job.</p>
     * 
     * <strong>example:</strong>
     * <p>7db93837-a5ee-4e3a-b3c8-800e7947dabc</p>
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
     * 
     * <strong>example:</strong>
     * <p>test_src_address</p>
     */
    @NameInMap("SrcAddress")
    public String srcAddress;

    /**
     * <p>The status of the job.</p>
     * <p>IMPORT_JOB_BEGIN: The job is created.</p>
     * <p>IMPORT_JOB_LAUNCHING: The job is starting.</p>
     * <p>IMPORT_JOB_PREPARING: The job is preparing.</p>
     * <p>IMPORT_JOB_DOING: The job is running.</p>
     * <p>IMPORT_JOB_SUSPEND: The job is paused.</p>
     * <p>IMPORT_JOB_CLOSING: The job is shutting down.</p>
     * <p>IMPORT_JOB_FINISHED: The job is finished.</p>
     * <p>IMPORT_JOB_INTERRUPTED: The job is abnormally interrupted.</p>
     * <p>IMPORT_JOB_CONFIRMED: The migration is complete, and the user has confirmed data integrity and consistency.</p>
     * <p>IMPORT_JOB_DELETING: The job is being deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>IMPORT_JOB_DOING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags.</p>
     * 
     * <strong>example:</strong>
     * <p>K1:V1,K2:V2</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>Specifies the StorageClass of the destination file. The destination address must be an OSS address. Valid values: Standard, IA, Archive, ColdArchive, and DeepColdArchive.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("TargetStorageClass")
    public String targetStorageClass;

    /**
     * <p>The file transfer mode.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("TransferMode")
    public String transferMode;

    /**
     * <p>The ID of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>test_id</p>
     */
    @NameInMap("Version")
    public String version;

    /**
     * <p>Specifies whether to retain the lastModifyTime property. The default value is true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithLastModifyTime")
    public Boolean withLastModifyTime;

    /**
     * <p>Specifies whether to migrate the StorageClass property. This is allowed only for migrations from OSS to OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WithStorageClass")
    public Boolean withStorageClass;

    public static GetJobResp build(java.util.Map<String, ?> map) throws Exception {
        GetJobResp self = new GetJobResp();
        return TeaModel.build(map, self);
    }

    public GetJobResp setAppendableToNormal(Boolean appendableToNormal) {
        this.appendableToNormal = appendableToNormal;
        return this;
    }
    public Boolean getAppendableToNormal() {
        return this.appendableToNormal;
    }

    public GetJobResp setAudit(Audit audit) {
        this.audit = audit;
        return this;
    }
    public Audit getAudit() {
        return this.audit;
    }

    public GetJobResp setConvertSymlinkTarget(Boolean convertSymlinkTarget) {
        this.convertSymlinkTarget = convertSymlinkTarget;
        return this;
    }
    public Boolean getConvertSymlinkTarget() {
        return this.convertSymlinkTarget;
    }

    public GetJobResp setCreateReport(Boolean createReport) {
        this.createReport = createReport;
        return this;
    }
    public Boolean getCreateReport() {
        return this.createReport;
    }

    public GetJobResp setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetJobResp setDestAddress(String destAddress) {
        this.destAddress = destAddress;
        return this;
    }
    public String getDestAddress() {
        return this.destAddress;
    }

    public GetJobResp setEnableMultiVersioning(Boolean enableMultiVersioning) {
        this.enableMultiVersioning = enableMultiVersioning;
        return this;
    }
    public Boolean getEnableMultiVersioning() {
        return this.enableMultiVersioning;
    }

    public GetJobResp setFilterRule(FilterRule filterRule) {
        this.filterRule = filterRule;
        return this;
    }
    public FilterRule getFilterRule() {
        return this.filterRule;
    }

    public GetJobResp setImportQos(ImportQos importQos) {
        this.importQos = importQos;
        return this;
    }
    public ImportQos getImportQos() {
        return this.importQos;
    }

    public GetJobResp setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public GetJobResp setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetJobResp setOverwriteMode(String overwriteMode) {
        this.overwriteMode = overwriteMode;
        return this;
    }
    public String getOverwriteMode() {
        return this.overwriteMode;
    }

    public GetJobResp setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public GetJobResp setParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }
    public String getParentName() {
        return this.parentName;
    }

    public GetJobResp setParentVersion(String parentVersion) {
        this.parentVersion = parentVersion;
        return this;
    }
    public String getParentVersion() {
        return this.parentVersion;
    }

    public GetJobResp setScheduleRule(ScheduleRule scheduleRule) {
        this.scheduleRule = scheduleRule;
        return this;
    }
    public ScheduleRule getScheduleRule() {
        return this.scheduleRule;
    }

    public GetJobResp setSrcAddress(String srcAddress) {
        this.srcAddress = srcAddress;
        return this;
    }
    public String getSrcAddress() {
        return this.srcAddress;
    }

    public GetJobResp setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetJobResp setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public GetJobResp setTargetStorageClass(String targetStorageClass) {
        this.targetStorageClass = targetStorageClass;
        return this;
    }
    public String getTargetStorageClass() {
        return this.targetStorageClass;
    }

    public GetJobResp setTransferMode(String transferMode) {
        this.transferMode = transferMode;
        return this;
    }
    public String getTransferMode() {
        return this.transferMode;
    }

    public GetJobResp setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetJobResp setWithLastModifyTime(Boolean withLastModifyTime) {
        this.withLastModifyTime = withLastModifyTime;
        return this;
    }
    public Boolean getWithLastModifyTime() {
        return this.withLastModifyTime;
    }

    public GetJobResp setWithStorageClass(Boolean withStorageClass) {
        this.withStorageClass = withStorageClass;
        return this;
    }
    public Boolean getWithStorageClass() {
        return this.withStorageClass;
    }

}
