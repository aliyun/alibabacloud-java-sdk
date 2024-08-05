// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveVpcAccessAndAbolishApisResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f7834d74be4e41aa8e607b0fafae9b33</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ016</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveVpcAccessAndAbolishApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveVpcAccessAndAbolishApisResponseBody self = new RemoveVpcAccessAndAbolishApisResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveVpcAccessAndAbolishApisResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public RemoveVpcAccessAndAbolishApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
