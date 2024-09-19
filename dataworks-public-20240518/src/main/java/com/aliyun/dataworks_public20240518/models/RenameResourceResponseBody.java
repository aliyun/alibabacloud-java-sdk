// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RenameResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4CDF7B72-020B-542A-8465-21CFFA8XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RenameResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenameResourceResponseBody self = new RenameResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public RenameResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenameResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
