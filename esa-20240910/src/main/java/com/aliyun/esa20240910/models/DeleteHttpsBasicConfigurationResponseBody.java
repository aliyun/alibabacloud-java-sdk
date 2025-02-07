// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteHttpsBasicConfigurationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHttpsBasicConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpsBasicConfigurationResponseBody self = new DeleteHttpsBasicConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHttpsBasicConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
