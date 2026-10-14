// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class InitializeENSECKServiceRoleResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F3B261DD-3858-4D3C-877D-303ADF374600</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InitializeENSECKServiceRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeENSECKServiceRoleResponseBody self = new InitializeENSECKServiceRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeENSECKServiceRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
