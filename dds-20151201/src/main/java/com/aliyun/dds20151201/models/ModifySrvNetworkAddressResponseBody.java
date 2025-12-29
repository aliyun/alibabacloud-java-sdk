// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifySrvNetworkAddressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>45D2B592-DEBA-4347-BBF3-xxxxxC97DBBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySrvNetworkAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySrvNetworkAddressResponseBody self = new ModifySrvNetworkAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySrvNetworkAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
