// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEPInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EPNInstanceId")
    @Validation(required = true)
    public String EPNInstanceId;

    public static CreateEPInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEPInstanceResponse self = new CreateEPInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateEPInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEPInstanceResponse setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

}
