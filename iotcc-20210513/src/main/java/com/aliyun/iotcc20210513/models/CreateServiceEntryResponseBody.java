// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateServiceEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceEntryId")
    public String serviceEntryId;

    public static CreateServiceEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceEntryResponseBody self = new CreateServiceEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceEntryResponseBody setServiceEntryId(String serviceEntryId) {
        this.serviceEntryId = serviceEntryId;
        return this;
    }
    public String getServiceEntryId() {
        return this.serviceEntryId;
    }

}
