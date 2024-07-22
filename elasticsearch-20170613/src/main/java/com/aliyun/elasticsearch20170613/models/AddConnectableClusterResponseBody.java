// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class AddConnectableClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5A5D8E74-565C-43DC-B031-29289FA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
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
