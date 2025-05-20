// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Snapshot extends TeaModel {
    @NameInMap("baseManifestList")
    public String baseManifestList;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("changelogManifestList")
    public String changelogManifestList;

    @NameInMap("changelogRecordCount")
    public Long changelogRecordCount;

    @NameInMap("commitIdentifier")
    public Long commitIdentifier;

    @NameInMap("commitKind")
    public String commitKind;

    @NameInMap("commitUser")
    public String commitUser;

    @NameInMap("deltaManifestList")
    public String deltaManifestList;

    @NameInMap("deltaRecordCount")
    public Long deltaRecordCount;

    @NameInMap("id")
    public Long id;

    @NameInMap("indexManifest")
    public String indexManifest;

    @NameInMap("logOffsets")
    public java.util.Map<String, Long> logOffsets;

    @NameInMap("schemaId")
    public Long schemaId;

    @NameInMap("statistics")
    public String statistics;

    @NameInMap("timeMillis")
    public Long timeMillis;

    @NameInMap("totalRecordCount")
    public Long totalRecordCount;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("version")
    public Integer version;

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

    public Snapshot setSchemaId(Long schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public Long getSchemaId() {
        return this.schemaId;
    }

    public Snapshot setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }
    public String getStatistics() {
        return this.statistics;
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
