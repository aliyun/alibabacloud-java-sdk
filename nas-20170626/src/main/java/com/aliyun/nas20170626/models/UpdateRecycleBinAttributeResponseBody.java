// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class UpdateRecycleBinAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRecycleBinAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecycleBinAttributeResponseBody self = new UpdateRecycleBinAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRecycleBinAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
