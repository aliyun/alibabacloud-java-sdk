// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class LinkInstanceCategoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D8C96601-E645-1BD7-99F3-04EADAB84E29</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static LinkInstanceCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LinkInstanceCategoryResponseBody self = new LinkInstanceCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public LinkInstanceCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
