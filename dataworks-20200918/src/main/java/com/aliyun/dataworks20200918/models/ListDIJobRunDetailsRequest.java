// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListDIJobRunDetailsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SourceDataSourceName")
    public String sourceDataSourceName;

    @NameInMap("SourceDatabaseName")
    public String sourceDatabaseName;

    @NameInMap("SourceSchemaName")
    public String sourceSchemaName;

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
