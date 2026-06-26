// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class CatalogSummary extends TeaModel {
    /**
     * <p>The total number of metadata requests in the current month.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("apiVisitCountMonthly")
    public Long apiVisitCountMonthly;

    /**
     * <p>The month-over-month data on the total number of databases.</p>
     */
    @NameInMap("databaseCount")
    public MoMValues databaseCount;

    /**
     * <p>The total number of file requests for the current month.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("fileAccessCountMonthly")
    public Long fileAccessCountMonthly;

    /**
     * <p>The date when the storage overview data was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01</p>
     */
    @NameInMap("generatedDate")
    public String generatedDate;

    /**
     * <p>The storage usage for Archive data files.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("objTypeArchiveSize")
    public Long objTypeArchiveSize;

    /**
     * <p>The storage usage for Cold Archive data files.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("objTypeColdArchiveSize")
    public Long objTypeColdArchiveSize;

    /**
     * <p>The storage usage for Infrequent Access (IA) data files.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("objTypeIaSize")
    public Long objTypeIaSize;

    /**
     * <p>The storage usage for Standard data files.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("objTypeStandardSize")
    public Long objTypeStandardSize;

    /**
     * <p>The month-over-month data on the total number of partitions.</p>
     */
    @NameInMap("partitionCount")
    public MoMValues partitionCount;

    /**
     * <p>The month-over-month data on the total number of tables.</p>
     */
    @NameInMap("tableCount")
    public MoMValues tableCount;

    /**
     * <p>The data access traffic for the current month, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("throughputMonthly")
    public Long throughputMonthly;

    /**
     * <p>The month-over-month data on the total number of files.</p>
     */
    @NameInMap("totalFileCount")
    public MoMValues totalFileCount;

    /**
     * <p>The change in storage capacity from the previous period, in bytes.</p>
     */
    @NameInMap("totalFileSizeInBytes")
    public MoMValues totalFileSizeInBytes;

    /**
     * <p>The month-over-month data for the total number of metadata files.</p>
     */
    @NameInMap("totalMetaFileCount")
    public MoMValues totalMetaFileCount;

    /**
     * <p>The month-over-month data for the storage usage of metadata files, in bytes.</p>
     */
    @NameInMap("totalMetaSizeInBytes")
    public MoMValues totalMetaSizeInBytes;

    public static CatalogSummary build(java.util.Map<String, ?> map) throws Exception {
        CatalogSummary self = new CatalogSummary();
        return TeaModel.build(map, self);
    }

    public CatalogSummary setApiVisitCountMonthly(Long apiVisitCountMonthly) {
        this.apiVisitCountMonthly = apiVisitCountMonthly;
        return this;
    }
    public Long getApiVisitCountMonthly() {
        return this.apiVisitCountMonthly;
    }

    public CatalogSummary setDatabaseCount(MoMValues databaseCount) {
        this.databaseCount = databaseCount;
        return this;
    }
    public MoMValues getDatabaseCount() {
        return this.databaseCount;
    }

    public CatalogSummary setFileAccessCountMonthly(Long fileAccessCountMonthly) {
        this.fileAccessCountMonthly = fileAccessCountMonthly;
        return this;
    }
    public Long getFileAccessCountMonthly() {
        return this.fileAccessCountMonthly;
    }

    public CatalogSummary setGeneratedDate(String generatedDate) {
        this.generatedDate = generatedDate;
        return this;
    }
    public String getGeneratedDate() {
        return this.generatedDate;
    }

    public CatalogSummary setObjTypeArchiveSize(Long objTypeArchiveSize) {
        this.objTypeArchiveSize = objTypeArchiveSize;
        return this;
    }
    public Long getObjTypeArchiveSize() {
        return this.objTypeArchiveSize;
    }

    public CatalogSummary setObjTypeColdArchiveSize(Long objTypeColdArchiveSize) {
        this.objTypeColdArchiveSize = objTypeColdArchiveSize;
        return this;
    }
    public Long getObjTypeColdArchiveSize() {
        return this.objTypeColdArchiveSize;
    }

    public CatalogSummary setObjTypeIaSize(Long objTypeIaSize) {
        this.objTypeIaSize = objTypeIaSize;
        return this;
    }
    public Long getObjTypeIaSize() {
        return this.objTypeIaSize;
    }

    public CatalogSummary setObjTypeStandardSize(Long objTypeStandardSize) {
        this.objTypeStandardSize = objTypeStandardSize;
        return this;
    }
    public Long getObjTypeStandardSize() {
        return this.objTypeStandardSize;
    }

    public CatalogSummary setPartitionCount(MoMValues partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }
    public MoMValues getPartitionCount() {
        return this.partitionCount;
    }

    public CatalogSummary setTableCount(MoMValues tableCount) {
        this.tableCount = tableCount;
        return this;
    }
    public MoMValues getTableCount() {
        return this.tableCount;
    }

    public CatalogSummary setThroughputMonthly(Long throughputMonthly) {
        this.throughputMonthly = throughputMonthly;
        return this;
    }
    public Long getThroughputMonthly() {
        return this.throughputMonthly;
    }

    public CatalogSummary setTotalFileCount(MoMValues totalFileCount) {
        this.totalFileCount = totalFileCount;
        return this;
    }
    public MoMValues getTotalFileCount() {
        return this.totalFileCount;
    }

    public CatalogSummary setTotalFileSizeInBytes(MoMValues totalFileSizeInBytes) {
        this.totalFileSizeInBytes = totalFileSizeInBytes;
        return this;
    }
    public MoMValues getTotalFileSizeInBytes() {
        return this.totalFileSizeInBytes;
    }

    public CatalogSummary setTotalMetaFileCount(MoMValues totalMetaFileCount) {
        this.totalMetaFileCount = totalMetaFileCount;
        return this;
    }
    public MoMValues getTotalMetaFileCount() {
        return this.totalMetaFileCount;
    }

    public CatalogSummary setTotalMetaSizeInBytes(MoMValues totalMetaSizeInBytes) {
        this.totalMetaSizeInBytes = totalMetaSizeInBytes;
        return this;
    }
    public MoMValues getTotalMetaSizeInBytes() {
        return this.totalMetaSizeInBytes;
    }

}
