// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class UpdateUserAuthConfigResponseBody extends TeaModel {
    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>83C6468F-3D68-5791-860E-29AB8FCACC73</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUserAuthConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserAuthConfigResponseBody self = new UpdateUserAuthConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserAuthConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
