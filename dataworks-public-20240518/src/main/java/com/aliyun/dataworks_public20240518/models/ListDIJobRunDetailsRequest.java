// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDIJobRunDetailsRequest extends TeaModel {
    /**
     * <p>The ID of the synchronization task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11265</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The name of the source.</p>
     * 
     * <strong>example:</strong>
     * <p>ds_name</p>
     */
    @NameInMap("SourceDataSourceName")
    public String sourceDataSourceName;

    /**
     * <p>The name of the database in the source.</p>
     * 
     * <strong>example:</strong>
     * <p>db_name</p>
     */
    @NameInMap("SourceDatabaseName")
    public String sourceDatabaseName;

    /**
     * <p>The name of the schema of the source.</p>
     * 
     * <strong>example:</strong>
     * <p>schema_name</p>
     */
    @NameInMap("SourceSchemaName")
    public String sourceSchemaName;

    /**
     * <p>The name of the table in the source.</p>
     * 
     * <strong>example:</strong>
     * <p>table_name</p>
     */
    @NameInMap("SourceTableName")
    public String sourceTableName;

    public static ListDIJobRunDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDIJobRunDetailsRequest self = new ListDIJobRunDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListDIJobRunDetailsRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public ListDIJobRunDetailsRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public ListDIJobRunDetailsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDIJobRunDetailsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDIJobRunDetailsRequest setSourceDataSourceName(String sourceDataSourceName) {
        this.sourceDataSourceName = sourceDataSourceName;
        return this;
    }
    public String getSourceDataSourceName() {
        return this.sourceDataSourceName;
    }

    public ListDIJobRunDetailsRequest setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
        return this;
    }
    public String getSourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    public ListDIJobRunDetailsRequest setSourceSchemaName(String sourceSchemaName) {
        this.sourceSchemaName = sourceSchemaName;
        return this;
    }
    public String getSourceSchemaName() {
        return this.sourceSchemaName;
    }

    public ListDIJobRunDetailsRequest setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }
    public String getSourceTableName() {
        return this.sourceTableName;
    }

}
