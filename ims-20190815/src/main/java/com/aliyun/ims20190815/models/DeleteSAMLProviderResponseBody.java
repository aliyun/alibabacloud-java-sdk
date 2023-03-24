// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteSAMLProviderResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSAMLProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSAMLProviderResponseBody self = new DeleteSAMLProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSAMLProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
