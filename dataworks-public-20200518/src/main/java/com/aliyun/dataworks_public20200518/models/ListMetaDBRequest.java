// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMetaDBRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("DataSourceType")
    @Validation(required = true)
    public String dataSourceType;

    public static ListMetaDBRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetaDBRequest self = new ListMetaDBRequest();
        return TeaModel.build(map, self);
    }

    public ListMetaDBRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListMetaDBRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

}
