// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateFundAccountTransferResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <strong>example:</strong>
     * <p>1BB79-5B23-3EA-BB4F-352F93E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFundAccountTransferResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFundAccountTransferResponseBody self = new CreateFundAccountTransferResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFundAccountTransferResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public CreateFundAccountTransferResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
