// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class OpenStructDlfSnapshotDto extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("changelogRecordCount")
    public Long changelogRecordCount;

    /**
     * <strong>example:</strong>
     * <p>APPEND</p>
     */
    @NameInMap("commitKind")
    public String commitKind;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("deltaRecordCount")
    public Long deltaRecordCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("schemaId")
    public Long schemaId;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("snapshotId")
    public Long snapshotId;

    /**
     * <strong>example:</strong>
     * <p>1711334400000</p>
     */
    @NameInMap("timeMillis")
    public Long timeMillis;

    /**
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("totalRecordCount")
    public Long totalRecordCount;

    public static OpenStructDlfSnapshotDto build(java.util.Map<String, ?> map) throws Exception {
        OpenStructDlfSnapshotDto self = new OpenStructDlfSnapshotDto();
        return TeaModel.build(map, self);
    }

    public OpenStructDlfSnapshotDto setChangelogRecordCount(Long changelogRecordCount) {
        this.changelogRecordCount = changelogRecordCount;
        return this;
    }
    public Long getChangelogRecordCount() {
        return this.changelogRecordCount;
    }

    public OpenStructDlfSnapshotDto setCommitKind(String commitKind) {
        this.commitKind = commitKind;
        return this;
    }
    public String getCommitKind() {
        return this.commitKind;
    }

    public OpenStructDlfSnapshotDto setDeltaRecordCount(Long deltaRecordCount) {
        this.deltaRecordCount = deltaRecordCount;
        return this;
    }
    public Long getDeltaRecordCount() {
        return this.deltaRecordCount;
    }

    public OpenStructDlfSnapshotDto setSchemaId(Long schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public Long getSchemaId() {
        return this.schemaId;
    }

    public OpenStructDlfSnapshotDto setSnapshotId(Long snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public Long getSnapshotId() {
        return this.snapshotId;
    }

    public OpenStructDlfSnapshotDto setTimeMillis(Long timeMillis) {
        this.timeMillis = timeMillis;
        return this;
    }
    public Long getTimeMillis() {
        return this.timeMillis;
    }

    public OpenStructDlfSnapshotDto setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

}
