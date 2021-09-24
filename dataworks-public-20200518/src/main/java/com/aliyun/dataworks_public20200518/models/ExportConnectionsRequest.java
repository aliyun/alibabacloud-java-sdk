// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ExportConnectionsRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("Name")
    public String name;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("SubType")
    public String subType;

    @NameInMap("EnvType")
    public Integer envType;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static ExportConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportConnectionsRequest self = new ExportConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ExportConnectionsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ExportConnectionsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ExportConnectionsRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ExportConnectionsRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public ExportConnectionsRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public ExportConnectionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ExportConnectionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
