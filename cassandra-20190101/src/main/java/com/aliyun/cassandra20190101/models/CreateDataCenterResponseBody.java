// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class CreateDataCenterResponseBody extends TeaModel {
    @NameInMap("DataCenterId")
    public String dataCenterId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataCenterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataCenterResponseBody self = new CreateDataCenterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataCenterResponseBody setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
        return this;
    }
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    public CreateDataCenterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
