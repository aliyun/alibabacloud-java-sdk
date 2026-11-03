// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDIJobsRequest extends TeaModel {
    /**
     * <p>The type of the destination data source. If you do not specify this parameter, no limit is applied. Valid values: Hologres, OSS-HDFS, OSS, MaxCompute, LogHub, StarRocks, DataHub, AnalyticDB_For_MySQL, Kafka, and Hive.</p>
     * 
     * <strong>example:</strong>
     * <p>Hologres</p>
     */
    @NameInMap("DestinationDataSourceType")
    public String destinationDataSourceType;

    /**
     * <p>The synchronization type. Valid values:</p>
     * <ul>
     * <li>FullAndRealtimeIncremental: full and real-time incremental synchronization</li>
     * <li>RealtimeIncremental: real-time incremental synchronization</li>
     * <li>Full: full synchronization</li>
     * <li>OfflineIncremental: batch incremental synchronization</li>
     * <li>FullAndOfflineIncremental: full and batch incremental synchronization</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FullAndRealtimeIncremental</p>
     */
    @NameInMap("MigrationType")
    public String migrationType;

    /**
     * <p>The name of the export task.</p>
     * <p>The name must be unique within the current DataWorks workspace. Duplicate names are not allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>test_export_01</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1967</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The type of the source data source. If you do not specify this parameter, no limit is applied. Valid values: PolarDB, MySQL, Kafka, LogHub, Hologres, Oracle, OceanBase, MongoDB, RedShift, Hive, SQLServer, Doris, and ClickHouse.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("SourceDataSourceType")
    public String sourceDataSourceType;

    /**
     * <p>The task configuration specification type. Valid values: FILESPEC, CLASSIC, and ALL. FILESPEC: new-version tasks based on structured filespec. CLASSIC: tasks in the traditional configuration mode.</p>
     * 
     * <strong>example:</strong>
     * <p>FILESPEC</p>
     */
    @NameInMap("SpecType")
    public String specType;

    public static ListDIJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDIJobsRequest self = new ListDIJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListDIJobsRequest setDestinationDataSourceType(String destinationDataSourceType) {
        this.destinationDataSourceType = destinationDataSourceType;
        return this;
    }
    public String getDestinationDataSourceType() {
        return this.destinationDataSourceType;
    }

    public ListDIJobsRequest setMigrationType(String migrationType) {
        this.migrationType = migrationType;
        return this;
    }
    public String getMigrationType() {
        return this.migrationType;
    }

    public ListDIJobsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDIJobsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDIJobsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDIJobsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDIJobsRequest setSourceDataSourceType(String sourceDataSourceType) {
        this.sourceDataSourceType = sourceDataSourceType;
        return this;
    }
    public String getSourceDataSourceType() {
        return this.sourceDataSourceType;
    }

    public ListDIJobsRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

}
