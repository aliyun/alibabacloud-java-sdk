// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateConfigSequenceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F61CDR30-E83C-4FDA-BF73-9A94CDD44229</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateConfigSequenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigSequenceResponseBody self = new UpdateConfigSequenceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConfigSequenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
