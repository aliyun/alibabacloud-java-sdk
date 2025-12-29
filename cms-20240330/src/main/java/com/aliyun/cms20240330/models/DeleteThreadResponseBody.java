// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteThreadResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>123-0F43-23423-AC43-34234</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteThreadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteThreadResponseBody self = new DeleteThreadResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteThreadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
