// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataSourcesRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Name")
    public String name;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("SubType")
    public String subType;

    @NameInMap("Status")
    public String status;

    @NameInMap("EnvType")
    public Integer envType;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static ListDataSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourcesRequest self = new ListDataSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourcesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDataSourcesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDataSourcesRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ListDataSourcesRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public ListDataSourcesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListDataSourcesRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public ListDataSourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataSourcesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
