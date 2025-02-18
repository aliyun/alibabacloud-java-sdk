// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateResourceResponseBody extends TeaModel {
    /**
     * <p>The request ID. You can troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4CDF7B72-020B-542A-8465-21CFFA81XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceResponseBody self = new UpdateResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
