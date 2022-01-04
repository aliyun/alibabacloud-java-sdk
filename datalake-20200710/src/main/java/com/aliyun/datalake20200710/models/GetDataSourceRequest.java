// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetDataSourceRequest extends TeaModel {
    @NameInMap("DataSourceId")
    public String dataSourceId;

    public static GetDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceRequest self = new GetDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public GetDataSourceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

}
