// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteHtmlResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteHtmlResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHtmlResourceResponse self = new DeleteHtmlResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHtmlResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
