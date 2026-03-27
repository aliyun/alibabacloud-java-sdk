// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateServiceResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123-0F43-23423-AC43-34234</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>em87vd@c2e25bcfe0e21ce0***</p>
     */
    @NameInMap("serviceId")
    public String serviceId;

    public static UpdateServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceResponseBody self = new UpdateServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateServiceResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
