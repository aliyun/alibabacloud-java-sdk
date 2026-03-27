// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteAddonReleaseResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>264C3E89-BE6E-5F82-A484-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteAddonReleaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAddonReleaseResponseBody self = new DeleteAddonReleaseResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAddonReleaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
