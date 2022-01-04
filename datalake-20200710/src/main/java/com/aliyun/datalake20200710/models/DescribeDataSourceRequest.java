// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DescribeDataSourceRequest extends TeaModel {
    @NameInMap("DataSourceId")
    public String dataSourceId;

    public static DescribeDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourceRequest self = new DescribeDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

}
