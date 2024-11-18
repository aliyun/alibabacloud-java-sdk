// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfaceResponseBody extends TeaModel {
    @NameInMap("NetworkInterfaceIds")
    public java.util.List<String> networkInterfaceIds;

    /**
     * <strong>example:</strong>
     * <p>F3B261DD-3858-4D3C-877D-303ADF374600</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNetworkInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInterfaceResponseBody self = new CreateNetworkInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkInterfaceResponseBody setNetworkInterfaceIds(java.util.List<String> networkInterfaceIds) {
        this.networkInterfaceIds = networkInterfaceIds;
        return this;
    }
    public java.util.List<String> getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
    }

    public CreateNetworkInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
