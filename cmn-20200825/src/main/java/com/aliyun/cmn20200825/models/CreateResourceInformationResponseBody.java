// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateResourceInformationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceInformationId")
    public String resourceInformationId;

    public static CreateResourceInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceInformationResponseBody self = new CreateResourceInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateResourceInformationResponseBody setResourceInformationId(String resourceInformationId) {
        this.resourceInformationId = resourceInformationId;
        return this;
    }
    public String getResourceInformationId() {
        return this.resourceInformationId;
    }

}
