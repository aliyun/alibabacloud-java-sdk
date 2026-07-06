// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteServiceCredentialResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>492E130C-76D3-55D5-BE5C-C023E431369A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteServiceCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceCredentialResponseBody self = new DeleteServiceCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServiceCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
