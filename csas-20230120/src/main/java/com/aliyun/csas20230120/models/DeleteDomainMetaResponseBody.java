// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteDomainMetaResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>91DAC192-F069-5CE6-B53F-41683D6A9555</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDomainMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainMetaResponseBody self = new DeleteDomainMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDomainMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
