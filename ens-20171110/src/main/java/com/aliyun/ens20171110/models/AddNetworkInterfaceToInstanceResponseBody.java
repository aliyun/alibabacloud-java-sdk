// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddNetworkInterfaceToInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddNetworkInterfaceToInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddNetworkInterfaceToInstanceResponseBody self = new AddNetworkInterfaceToInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddNetworkInterfaceToInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
