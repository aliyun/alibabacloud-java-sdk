// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteImagesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImagesResponse self = new DeleteImagesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteImagesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
