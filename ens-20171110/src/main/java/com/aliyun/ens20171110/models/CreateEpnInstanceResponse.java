// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEpnInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EPNInstanceId")
    @Validation(required = true)
    public String EPNInstanceId;

    public static CreateEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEpnInstanceResponse self = new CreateEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateEpnInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEpnInstanceResponse setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

}
