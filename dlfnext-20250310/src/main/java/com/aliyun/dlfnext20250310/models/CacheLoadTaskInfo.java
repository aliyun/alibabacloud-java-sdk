// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class CacheLoadTaskInfo extends TeaModel {
    /**
     * <p>The data catalog ID.</p>
     * 
     * <strong>example:</strong>
     * <p>clg-paimon-xxxx</p>
     */
    @NameInMap("catalogId")
    public String catalogId;

    /**
     * <p>The number of files with completed cache loading.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("completedFiles")
    public Long completedFiles;

    /**
     * <p>The database name.</p>
     * 
     * <strong>example:</strong>
     * <p>database_name</p>
     */
    @NameInMap("database")
    public String database;

    /**
     * <p>The number of enumerated files.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("enumeratedFiles")
    public Long enumeratedFiles;

    /**
     * <p>The file enumeration completion status.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enumerationDone")
    public Boolean enumerationDone;

    /**
     * <p>The additional parameters.</p>
     */
    @NameInMap("extraOptions")
    public java.util.Map<String, String> extraOptions;

    /**
     * <p>The number of files with failed cache loading.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("failedFiles")
    public Long failedFiles;

    /**
     * <p>The most recent error message, which is empty when the status is normal.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("lastError")
    public String lastError;

    /**
     * <p>The number of bytes loaded into the cache.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("loadedBytes")
    public Long loadedBytes;

    /**
     * <p>The storage location.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://clg-xxxx/db-xxxx/tbl-xxxx</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>The start time of the task execution, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1790576716926</p>
     */
    @NameInMap("startedAt")
    public Long startedAt;

    /**
     * <p>The task execution status.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCEEDED</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The table name.</p>
     * 
     * <strong>example:</strong>
     * <p>table_name</p>
     */
    @NameInMap("table")
    public String table;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>lc-81afc0f7812ec737-1790576716926</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>The task update time, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1790576746926</p>
     */
    @NameInMap("taskUpdatedAt")
    public Long taskUpdatedAt;

    /**
     * <p>The total number of bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("totalBytes")
    public Long totalBytes;

    /**
     * <p>The total number of files.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalFiles")
    public Long totalFiles;

    public static CacheLoadTaskInfo build(java.util.Map<String, ?> map) throws Exception {
        CacheLoadTaskInfo self = new CacheLoadTaskInfo();
        return TeaModel.build(map, self);
    }

    public CacheLoadTaskInfo setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public CacheLoadTaskInfo setCompletedFiles(Long completedFiles) {
        this.completedFiles = completedFiles;
        return this;
    }
    public Long getCompletedFiles() {
        return this.completedFiles;
    }

    public CacheLoadTaskInfo setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public CacheLoadTaskInfo setEnumeratedFiles(Long enumeratedFiles) {
        this.enumeratedFiles = enumeratedFiles;
        return this;
    }
    public Long getEnumeratedFiles() {
        return this.enumeratedFiles;
    }

    public CacheLoadTaskInfo setEnumerationDone(Boolean enumerationDone) {
        this.enumerationDone = enumerationDone;
        return this;
    }
    public Boolean getEnumerationDone() {
        return this.enumerationDone;
    }

    public CacheLoadTaskInfo setExtraOptions(java.util.Map<String, String> extraOptions) {
        this.extraOptions = extraOptions;
        return this;
    }
    public java.util.Map<String, String> getExtraOptions() {
        return this.extraOptions;
    }

    public CacheLoadTaskInfo setFailedFiles(Long failedFiles) {
        this.failedFiles = failedFiles;
        return this;
    }
    public Long getFailedFiles() {
        return this.failedFiles;
    }

    public CacheLoadTaskInfo setLastError(String lastError) {
        this.lastError = lastError;
        return this;
    }
    public String getLastError() {
        return this.lastError;
    }

    public CacheLoadTaskInfo setLoadedBytes(Long loadedBytes) {
        this.loadedBytes = loadedBytes;
        return this;
    }
    public Long getLoadedBytes() {
        return this.loadedBytes;
    }

    public CacheLoadTaskInfo setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CacheLoadTaskInfo setStartedAt(Long startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public Long getStartedAt() {
        return this.startedAt;
    }

    public CacheLoadTaskInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CacheLoadTaskInfo setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

    public CacheLoadTaskInfo setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CacheLoadTaskInfo setTaskUpdatedAt(Long taskUpdatedAt) {
        this.taskUpdatedAt = taskUpdatedAt;
        return this;
    }
    public Long getTaskUpdatedAt() {
        return this.taskUpdatedAt;
    }

    public CacheLoadTaskInfo setTotalBytes(Long totalBytes) {
        this.totalBytes = totalBytes;
        return this;
    }
    public Long getTotalBytes() {
        return this.totalBytes;
    }

    public CacheLoadTaskInfo setTotalFiles(Long totalFiles) {
        this.totalFiles = totalFiles;
        return this;
    }
    public Long getTotalFiles() {
        return this.totalFiles;
    }

}
