// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ImportDataSourcesRequest extends TeaModel {
    /**
     * <p>The configurations of the data sources to be imported. The Name, DataSourceType, SubType, Description, Content, and EnvType fields are required. For more information about the fields, see [CreateDataSource](https://help.aliyun.com/document_detail/211429.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataSources")
    public String dataSources;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ImportDataSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDataSourcesRequest self = new ImportDataSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ImportDataSourcesRequest setDataSources(String dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public String getDataSources() {
        return this.dataSources;
    }

    public ImportDataSourcesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
