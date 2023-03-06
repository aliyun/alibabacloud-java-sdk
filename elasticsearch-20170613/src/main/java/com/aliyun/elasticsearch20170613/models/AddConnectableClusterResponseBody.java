// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class AddConnectableClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The following information is returned:</p>
     * <br>
     * <p>*   true: The configuration is successful.</p>
     * <p>*   false: The configuration failed.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static AddConnectableClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddConnectableClusterResponseBody self = new AddConnectableClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public AddConnectableClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddConnectableClusterResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
