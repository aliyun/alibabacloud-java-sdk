// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class CatalogSummary extends TeaModel {
    @NameInMap("apiVisitCountMonthly")
    public Long apiVisitCountMonthly;

    @NameInMap("databaseCount")
    public MoMValues databaseCount;

    @NameInMap("fileAccessCountMonthly")
    public Long fileAccessCountMonthly;

    /**
     * <p>Update date of the statistics</p>
     */
    @NameInMap("generatedDate")
    public String generatedDate;

    @NameInMap("objTypeArchiveSize")
    public Long objTypeArchiveSize;

    @NameInMap("objTypeColdArchiveSize")
    public Long objTypeColdArchiveSize;

    @NameInMap("objTypeIaSize")
    public Long objTypeIaSize;

    @NameInMap("objTypeStandardSize")
    public Long objTypeStandardSize;

    @NameInMap("partitionCount")
    public MoMValues partitionCount;

    @NameInMap("tableCount")
    public MoMValues tableCount;

    @NameInMap("throughputMonthly")
    public Long throughputMonthly;

    @NameInMap("totalFileCount")
    public MoMValues totalFileCount;

    @NameInMap("totalFileSizeInBytes")
    public MoMValues totalFileSizeInBytes;

    @NameInMap("totalMetaFileCount")
    public MoMValues totalMetaFileCount;

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
