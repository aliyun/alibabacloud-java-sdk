// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetSensitiveDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SensitiveData")
    @Validation(required = true)
    public java.util.Map<String, ?> sensitiveData;

    public static GetSensitiveDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSensitiveDataResponse self = new GetSensitiveDataResponse();
        return TeaModel.build(map, self);
    }

    public GetSensitiveDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSensitiveDataResponse setSensitiveData(java.util.Map<String, ?> sensitiveData) {
        this.sensitiveData = sensitiveData;
        return this;
    }
    public java.util.Map<String, ?> getSensitiveData() {
        return this.sensitiveData;
    }

}
