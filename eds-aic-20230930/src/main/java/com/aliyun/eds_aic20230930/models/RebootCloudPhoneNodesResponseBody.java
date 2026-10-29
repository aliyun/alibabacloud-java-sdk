// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RebootCloudPhoneNodesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4610632D-D661-5982-B3D7-5D3FD183F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RebootCloudPhoneNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootCloudPhoneNodesResponseBody self = new RebootCloudPhoneNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootCloudPhoneNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
