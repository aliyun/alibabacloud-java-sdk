// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteHttpsApplicationConfigurationResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>35C66C7B-671H-4297-9187-2C4477247A78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHttpsApplicationConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpsApplicationConfigurationResponseBody self = new DeleteHttpsApplicationConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHttpsApplicationConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
