// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RenameNodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4CDF7B72-020B-542A-8465-21CFFA81XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RenameNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenameNodeResponseBody self = new RenameNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public RenameNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenameNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
