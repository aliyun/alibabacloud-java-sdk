// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ImportDataSourcesRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("DataSources")
    public String dataSources;

    public static ImportDataSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDataSourcesRequest self = new ImportDataSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ImportDataSourcesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ImportDataSourcesRequest setDataSources(String dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public String getDataSources() {
        return this.dataSources;
    }

}
