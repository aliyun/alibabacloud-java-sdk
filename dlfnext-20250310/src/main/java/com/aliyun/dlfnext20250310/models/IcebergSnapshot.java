// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class IcebergSnapshot extends TeaModel {
    @NameInMap("addedRows")
    public Long addedRows;

    @NameInMap("id")
    public Long id;

    @NameInMap("operation")
    public String operation;

    @NameInMap("parentId")
    public Long parentId;

    @NameInMap("schemaId")
    public Long schemaId;

    @NameInMap("sequenceNumber")
    public Long sequenceNumber;

    @NameInMap("summary")
    public java.util.Map<String, String> summary;

    @NameInMap("timestampMillis")
    public Long timestampMillis;

    public static IcebergSnapshot build(java.util.Map<String, ?> map) throws Exception {
        IcebergSnapshot self = new IcebergSnapshot();
        return TeaModel.build(map, self);
    }

    public IcebergSnapshot setAddedRows(Long addedRows) {
        this.addedRows = addedRows;
        return this;
    }
    public Long getAddedRows() {
        return this.addedRows;
    }

    public IcebergSnapshot setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public IcebergSnapshot setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public IcebergSnapshot setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public IcebergSnapshot setSchemaId(Long schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public Long getSchemaId() {
        return this.schemaId;
    }

    public IcebergSnapshot setSequenceNumber(Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }
    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public IcebergSnapshot setSummary(java.util.Map<String, String> summary) {
        this.summary = summary;
        return this;
    }
    public java.util.Map<String, String> getSummary() {
        return this.summary;
    }

    public IcebergSnapshot setTimestampMillis(Long timestampMillis) {
        this.timestampMillis = timestampMillis;
        return this;
    }
    public Long getTimestampMillis() {
        return this.timestampMillis;
    }

}
