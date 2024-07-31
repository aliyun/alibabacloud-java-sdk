// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateNodeOwnerResponseBody extends TeaModel {
    /**
     * <p>The request ID. You can use the request ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>E6F0DBDD-5AD****</p>
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

    public static UpdateNodeOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeOwnerResponseBody self = new UpdateNodeOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNodeOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateNodeOwnerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
