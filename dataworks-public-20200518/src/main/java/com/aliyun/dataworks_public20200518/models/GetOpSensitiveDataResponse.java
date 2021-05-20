// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOpSensitiveDataResponse extends TeaModel {
    @NameInMap("OpSensitiveData")
    @Validation(required = true)
    public String opSensitiveData;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static GetOpSensitiveDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpSensitiveDataResponse self = new GetOpSensitiveDataResponse();
        return TeaModel.build(map, self);
    }

    public GetOpSensitiveDataResponse setOpSensitiveData(String opSensitiveData) {
        this.opSensitiveData = opSensitiveData;
        return this;
    }
    public String getOpSensitiveData() {
        return this.opSensitiveData;
    }

    public GetOpSensitiveDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
