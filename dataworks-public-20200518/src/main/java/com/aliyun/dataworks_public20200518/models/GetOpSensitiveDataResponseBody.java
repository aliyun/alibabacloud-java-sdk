// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOpSensitiveDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OpSensitiveData")
    public String opSensitiveData;

    public static GetOpSensitiveDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpSensitiveDataResponseBody self = new GetOpSensitiveDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpSensitiveDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpSensitiveDataResponseBody setOpSensitiveData(String opSensitiveData) {
        this.opSensitiveData = opSensitiveData;
        return this;
    }
    public String getOpSensitiveData() {
        return this.opSensitiveData;
    }

}
