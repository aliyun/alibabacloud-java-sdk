// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExportTaskDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1753858800</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    @NameInMap("error")
    public String error;

    /**
     * <strong>example:</strong>
     * <p>成员余额变更记录_20260730.csv</p>
     */
    @NameInMap("filename")
    public String filename;

    /**
     * <strong>example:</strong>
     * <p>1753858860</p>
     */
    @NameInMap("finishedAt")
    public Long finishedAt;

    /**
     * <strong>example:</strong>
     * <p>task_xxxxxxxx</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>50000</p>
     */
    @NameInMap("maxRows")
    public Integer maxRows;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("progress")
    public Integer progress;

    /**
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total")
    public Integer total;

    /**
     * <strong>example:</strong>
     * <p>balance_orders</p>
     */
    @NameInMap("type")
    public String type;

    public static ExportTaskDTO build(java.util.Map<String, ?> map) throws Exception {
        ExportTaskDTO self = new ExportTaskDTO();
        return TeaModel.build(map, self);
    }

    public ExportTaskDTO setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public ExportTaskDTO setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public ExportTaskDTO setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public ExportTaskDTO setFinishedAt(Long finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public Long getFinishedAt() {
        return this.finishedAt;
    }

    public ExportTaskDTO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExportTaskDTO setMaxRows(Integer maxRows) {
        this.maxRows = maxRows;
        return this;
    }
    public Integer getMaxRows() {
        return this.maxRows;
    }

    public ExportTaskDTO setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public ExportTaskDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ExportTaskDTO setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ExportTaskDTO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
