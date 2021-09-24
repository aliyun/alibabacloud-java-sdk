// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListConnectionsRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ConnectionType")
    public String connectionType;

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

    public static ListConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionsRequest self = new ListConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListConnectionsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListConnectionsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListConnectionsRequest setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

    public ListConnectionsRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public ListConnectionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListConnectionsRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public ListConnectionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListConnectionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
