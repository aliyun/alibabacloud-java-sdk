// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateHadoopDataSourceResponseBody extends TeaModel {
    @NameInMap("DataSourceId")
    public Integer dataSourceId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateHadoopDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHadoopDataSourceResponseBody self = new CreateHadoopDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHadoopDataSourceResponseBody setDataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Integer getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateHadoopDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
