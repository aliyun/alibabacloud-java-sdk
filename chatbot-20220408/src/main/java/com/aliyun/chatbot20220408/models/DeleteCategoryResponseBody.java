// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteCategoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4B3E0DE3-DC57-5BFE-88D4-ADD8ED024F55</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCategoryResponseBody self = new DeleteCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
