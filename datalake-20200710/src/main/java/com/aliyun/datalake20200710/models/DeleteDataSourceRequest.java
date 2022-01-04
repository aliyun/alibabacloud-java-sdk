// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteDataSourceRequest extends TeaModel {
    @NameInMap("DataSourceId")
    public String dataSourceId;

    public static DeleteDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourceRequest self = new DeleteDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

}
