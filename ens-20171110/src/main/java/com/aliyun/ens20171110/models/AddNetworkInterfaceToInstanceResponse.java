// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddNetworkInterfaceToInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddNetworkInterfaceToInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddNetworkInterfaceToInstanceResponse self = new AddNetworkInterfaceToInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AddNetworkInterfaceToInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
