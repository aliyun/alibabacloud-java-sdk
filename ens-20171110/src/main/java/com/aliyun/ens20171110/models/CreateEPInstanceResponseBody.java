// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEPInstanceResponseBody extends TeaModel {
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateEPInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEPInstanceResponseBody self = new CreateEPInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEPInstanceResponseBody setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    public CreateEPInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
