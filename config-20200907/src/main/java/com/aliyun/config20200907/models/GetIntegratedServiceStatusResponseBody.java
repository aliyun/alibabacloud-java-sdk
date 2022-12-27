// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetIntegratedServiceStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetIntegratedServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIntegratedServiceStatusResponseBody self = new GetIntegratedServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIntegratedServiceStatusResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public GetIntegratedServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
