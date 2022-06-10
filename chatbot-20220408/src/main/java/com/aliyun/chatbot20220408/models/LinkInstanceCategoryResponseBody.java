// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class LinkInstanceCategoryResponseBody extends TeaModel {
    // 请求Id
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
