// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateProtocolServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the protocol service.</p>
     */
    @NameInMap("ProtocolServiceId")
    public String protocolServiceId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateProtocolServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProtocolServiceResponseBody self = new CreateProtocolServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProtocolServiceResponseBody setProtocolServiceId(String protocolServiceId) {
        this.protocolServiceId = protocolServiceId;
        return this;
    }
    public String getProtocolServiceId() {
        return this.protocolServiceId;
    }

    public CreateProtocolServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
