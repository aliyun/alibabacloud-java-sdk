// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateSharedAccountPermissionResponseBody extends TeaModel {
    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>C68B41B4-A646-5680-8A33-67884E3823A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSharedAccountPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSharedAccountPermissionResponseBody self = new UpdateSharedAccountPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSharedAccountPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
