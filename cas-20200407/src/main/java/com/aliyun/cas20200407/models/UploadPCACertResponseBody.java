// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UploadPCACertResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>1ed65580-7e33-6a50-8630-dd13fdc009ee</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UploadPCACertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadPCACertResponseBody self = new UploadPCACertResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadPCACertResponseBody setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public UploadPCACertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
