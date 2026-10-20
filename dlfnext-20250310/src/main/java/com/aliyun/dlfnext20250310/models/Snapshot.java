// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Snapshot extends TeaModel {
    /**
     * <p>The file name of the base manifest list.</p>
     * 
     * <strong>example:</strong>
     * <p>manifest-list-0c6fcaa1-b6bc-413d-9634-6471cce4f37e-2</p>
     */
    @NameInMap("baseManifestList")
    public String baseManifestList;

    /**
     * <p>The file name of the manifest list that records all changelogs generated for the snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>manifest-list-0c6fcaa1-b6bc-413d-9634-6471cce4f37e-4</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("changelogManifestList")
    public String changelogManifestList;

    /**
     * <p>The number of changelog records generated for the snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("changelogRecordCount")
    public Long changelogRecordCount;

    /**
     * <p>The transaction ID of the streaming write.</p>
     * 
     * <strong>example:</strong>
     * <p>9223372036854775807</p>
     */
    @NameInMap("commitIdentifier")
    public Long commitIdentifier;

    /**
     * <p>The streaming write type. Valid values: APPEND, COMPACT, OVERWRITE, and ANALYZE.</p>
     * 
     * <strong>example:</strong>
     * <p>COMPACT</p>
     */
    @NameInMap("commitKind")
    public String commitKind;

    /**
     * <p>The commit user, which is typically a UUID used to resume streaming writes.</p>
     * 
     * <strong>example:</strong>
     * <p>446aac61-bd5c-4fa0-8b14-846fa8810651</p>
     */
    @NameInMap("commitUser")
    public String commitUser;

    /**
     * <p>The file name of the manifest list that records all new changes in the snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>manifest-list-0c6fcaa1-b6bc-413d-9634-6471cce4f37e-3</p>
     */
    @NameInMap("deltaManifestList")
    public String deltaManifestList;

    /**
     * <p>The number of new change records in the snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("deltaRecordCount")
    public Long deltaRecordCount;

    /**
     * <p>The snapshot ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>The string representation of the snapshot ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("idString")
    public String idString;

    /**
     * <p>The file name of the manifest that records all index files of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>index-manifest-7cbdaa47-9578-43ac-ae6e-a7ec0486bba8-0</p>
     */
    @NameInMap("indexManifest")
    public String indexManifest;

    /**
     * <p>The log offsets at the time of the commit.</p>
     */
    @NameInMap("logOffsets")
    public java.util.Map<String, Long> logOffsets;

    /**
     * <p>The string representation of the parent snapshot ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("parentIdString")
    public String parentIdString;

    /**
     * <p>The schema ID of the table when the snapshot was generated.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("schemaId")
    public Long schemaId;

    /**
     * <p>The snapshot sequence number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sequenceNumber")
    public Long sequenceNumber;

    /**
     * <p>The file name of the table statistics information.</p>
     * 
     * <strong>example:</strong>
     * <p>stat-82c50592-2179-447b-906b-6fdb10ef32c6-0</p>
     */
    @NameInMap("statistics")
    public String statistics;

    /**
     * <p>The summary.</p>
     */
    @NameInMap("summary")
    public java.util.Map<String, String> summary;

    /**
     * <p>The commit time, which is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1741701564261</p>
     */
    @NameInMap("timeMillis")
    public Long timeMillis;

    /**
     * <p>The total number of records for all changes in the snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("totalRecordCount")
    public Long totalRecordCount;

    /**
     * <p>The file format version of the snapshot. The current version is 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("version")
    public Integer version;

    /**
     * <p>The watermark value.</p>
     * 
     * <strong>example:</strong>
     * <p>-9223372036854775808</p>
     */
    @NameInMap("watermark")
    public Long watermark;

    public static Snapshot build(java.util.Map<String, ?> map) throws Exception {
        Snapshot self = new Snapshot();
        return TeaModel.build(map, self);
    }

    public Snapshot setBaseManifestList(String baseManifestList) {
        this.baseManifestList = baseManifestList;
        return this;
    }
    public String getBaseManifestList() {
        return this.baseManifestList;
    }

    public Snapshot setChangelogManifestList(String changelogManifestList) {
        this.changelogManifestList = changelogManifestList;
        return this;
    }
    public String getChangelogManifestList() {
        return this.changelogManifestList;
    }

    public Snapshot setChangelogRecordCount(Long changelogRecordCount) {
        this.changelogRecordCount = changelogRecordCount;
        return this;
    }
    public Long getChangelogRecordCount() {
        return this.changelogRecordCount;
    }

    public Snapshot setCommitIdentifier(Long commitIdentifier) {
        this.commitIdentifier = commitIdentifier;
        return this;
    }
    public Long getCommitIdentifier() {
        return this.commitIdentifier;
    }

    public Snapshot setCommitKind(String commitKind) {
        this.commitKind = commitKind;
        return this;
    }
    public String getCommitKind() {
        return this.commitKind;
    }

    public Snapshot setCommitUser(String commitUser) {
        this.commitUser = commitUser;
        return this;
    }
    public String getCommitUser() {
        return this.commitUser;
    }

    public Snapshot setDeltaManifestList(String deltaManifestList) {
        this.deltaManifestList = deltaManifestList;
        return this;
    }
    public String getDeltaManifestList() {
        return this.deltaManifestList;
    }

    public Snapshot setDeltaRecordCount(Long deltaRecordCount) {
        this.deltaRecordCount = deltaRecordCount;
        return this;
    }
    public Long getDeltaRecordCount() {
        return this.deltaRecordCount;
    }

    public Snapshot setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Snapshot setIdString(String idString) {
        this.idString = idString;
        return this;
    }
    public String getIdString() {
        return this.idString;
    }

    public Snapshot setIndexManifest(String indexManifest) {
        this.indexManifest = indexManifest;
        return this;
    }
    public String getIndexManifest() {
        return this.indexManifest;
    }

    public Snapshot setLogOffsets(java.util.Map<String, Long> logOffsets) {
        this.logOffsets = logOffsets;
        return this;
    }
    public java.util.Map<String, Long> getLogOffsets() {
        return this.logOffsets;
    }

    public Snapshot setParentIdString(String parentIdString) {
        this.parentIdString = parentIdString;
        return this;
    }
    public String getParentIdString() {
        return this.parentIdString;
    }

    public Snapshot setSchemaId(Long schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public Long getSchemaId() {
        return this.schemaId;
    }

    public Snapshot setSequenceNumber(Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }
    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public Snapshot setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }
    public String getStatistics() {
        return this.statistics;
    }

    public Snapshot setSummary(java.util.Map<String, String> summary) {
        this.summary = summary;
        return this;
    }
    public java.util.Map<String, String> getSummary() {
        return this.summary;
    }

    public Snapshot setTimeMillis(Long timeMillis) {
        this.timeMillis = timeMillis;
        return this;
    }
    public Long getTimeMillis() {
        return this.timeMillis;
    }

    public Snapshot setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public Snapshot setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

    public Snapshot setWatermark(Long watermark) {
        this.watermark = watermark;
        return this;
    }
    public Long getWatermark() {
        return this.watermark;
    }

}
