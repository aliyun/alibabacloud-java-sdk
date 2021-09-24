// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataSourceMetaRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("DatasourceName")
    @Validation(required = true)
    public String datasourceName;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("EnvType")
    public String envType;

    public static GetDataSourceMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceMetaRequest self = new GetDataSourceMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetDataSourceMetaRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetDataSourceMetaRequest setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }
    public String getDatasourceName() {
        return this.datasourceName;
    }

    public GetDataSourceMetaRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetDataSourceMetaRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetDataSourceMetaRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

}
