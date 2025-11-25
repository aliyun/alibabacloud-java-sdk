// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateIpsPrivateAssocResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>99A65AA0-C5B5-5092-BFCF-8111B436****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIpsPrivateAssocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpsPrivateAssocResponseBody self = new CreateIpsPrivateAssocResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpsPrivateAssocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
