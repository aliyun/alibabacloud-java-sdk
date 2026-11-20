// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceVersionRemarkResponseBody extends TeaModel {
    /**
     * <p>The message returned in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServiceVersionRemarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceVersionRemarkResponseBody self = new UpdateServiceVersionRemarkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceVersionRemarkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateServiceVersionRemarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
