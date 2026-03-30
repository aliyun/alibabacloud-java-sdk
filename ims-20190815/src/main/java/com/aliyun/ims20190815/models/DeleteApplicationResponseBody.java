// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteApplicationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>85836703-8D4F-485F-9726-4D1C730F957E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationResponseBody self = new DeleteApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
