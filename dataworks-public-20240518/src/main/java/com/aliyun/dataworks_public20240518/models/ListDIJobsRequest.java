// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDIJobsRequest extends TeaModel {
    /**
     * <p>The type of the destination data source. If you do not specify this parameter, jobs are not filtered by this criterion. Valid values: <code>Hologres</code>, <code>OSS-HDFS</code>, <code>OSS</code>, <code>MaxCompute</code>, <code>LogHub</code>, <code>StarRocks</code>, <code>DataHub</code>, <code>AnalyticDB_For_MySQL</code>, <code>Kafka</code>, and <code>Hive</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Hologres</p>
     */
    @NameInMap("DestinationDataSourceType")
    public String destinationDataSourceType;

    /**
     * <p>The synchronization type. Valid values:</p>
     * <ul>
     * <li><p><code>FullAndRealtimeIncremental</code>: full and real-time incremental synchronization</p>
     * </li>
     * <li><p><code>RealtimeIncremental</code>: real-time incremental synchronization</p>
     * </li>
     * <li><p><code>Full</code>: full synchronization</p>
     * </li>
     * <li><p><code>OfflineIncremental</code>: offline incremental synchronization</p>
     * </li>
     * <li><p><code>FullAndOfflineIncremental</code>: full and offline incremental synchronization</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FullAndRealtimeIncremental</p>
     */
    @NameInMap("MigrationType")
    public String migrationType;

    /**
     * <p>The name of the Data Integration job.</p>
     * <p>The name must be unique within the DataWorks workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>test_export_01</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number. Pages are numbered starting from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default: 10. Maximum: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1967</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The type of the source data source. If you do not specify this parameter, jobs are not filtered by this criterion. Valid values: <code>PolarDB</code>, <code>MySQL</code>, <code>Kafka</code>, <code>LogHub</code>, <code>Hologres</code>, <code>Oracle</code>, <code>OceanBase</code>, <code>MongoDB</code>, <code>RedShift</code>, <code>Hive</code>, <code>SQLServer</code>, <code>Doris</code>, and <code>ClickHouse</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("SourceDataSourceType")
    public String sourceDataSourceType;

    /**
     * <p>The configuration type of the job. Valid values: <code>FILESPEC</code>, <code>CLASSIC</code>, and <code>ALL</code>. <code>FILESPEC</code> indicates a new job type configured based on a structured file specification. <code>CLASSIC</code> indicates a job configured in the traditional mode. If you set this parameter to <code>ALL</code>, jobs of both types are returned.</p>
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
