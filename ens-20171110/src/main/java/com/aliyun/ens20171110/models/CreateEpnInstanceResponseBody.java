// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEpnInstanceResponseBody extends TeaModel {
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateEpnInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEpnInstanceResponseBody self = new CreateEpnInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEpnInstanceResponseBody setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    public CreateEpnInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
