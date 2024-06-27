// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateHadoopDataSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DataSourceId")
    public Integer dataSourceId;

    /**
     * <strong>example:</strong>
     * <p>2C125605-266F-41CA-8AC5-3A643D4F42C5</p>
     */
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
