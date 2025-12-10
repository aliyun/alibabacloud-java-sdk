// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetJobResp extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
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
     * <strong>example:</strong>
     * <p>2025-07-04T06:02:21.000Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
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
     * <strong>example:</strong>
     * <p>2025-07-05T06:02:22.000Z</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <strong>example:</strong>
     * <your-job-name>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>always</p>
     */
    @NameInMap("OverwriteMode")
    public String overwriteMode;

    /**
     * <strong>example:</strong>
     * <p>11<strong><em>9</em>38</strong><em>34</em>*</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <your-parent-job-name>
     */
    @NameInMap("ParentName")
    public String parentName;

    /**
     * <strong>example:</strong>
     * <p>3<em><strong>1a7f-18</strong>-41d9-</em><em><strong>-21591</strong></em>49**</p>
     */
    @NameInMap("ParentVersion")
    public String parentVersion;

    @NameInMap("ScheduleRule")
    public ScheduleRule scheduleRule;

    /**
     * <strong>example:</strong>
     * <your-src-address-name>
     */
    @NameInMap("SrcAddress")
    public String srcAddress;

    /**
     * <strong>example:</strong>
     * <p>IMPORT_JOB_DOING</p>
     */
    @NameInMap("Status")
    public String status;

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
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("TransferMode")
    public String transferMode;

    /**
     * <strong>example:</strong>
     * <p>31<em><strong>a7f-188f-</strong></em><em>-b266-215</em>**8e49d7</p>
     */
    @NameInMap("Version")
    public String version;

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
