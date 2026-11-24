// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateAutoDisposeConfigResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6D7B26AD-2EDD-5A96-B9D2-CDEABFC55690</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAutoDisposeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoDisposeConfigResponseBody self = new CreateAutoDisposeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAutoDisposeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
