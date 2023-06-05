// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataSourceMetaRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("DatasourceName")
    public String datasourceName;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The environment to which the data source belongs. Valid values:</p>
     * <br>
     * <p>*   0: development environment</p>
     * <p>*   1: production environment</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The name of the data source.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetDataSourceMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceMetaRequest self = new GetDataSourceMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetDataSourceMetaRequest setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }
    public String getDatasourceName() {
        return this.datasourceName;
    }

    public GetDataSourceMetaRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
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

    public GetDataSourceMetaRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
