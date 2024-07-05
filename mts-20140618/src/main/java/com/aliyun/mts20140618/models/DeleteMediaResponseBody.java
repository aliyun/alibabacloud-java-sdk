// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteMediaResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>05F8B913-E9F3-4A6F-9922-48CADA0FFAAD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaResponseBody self = new DeleteMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
