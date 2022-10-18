// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetQueuingSizeResponse extends TeaModel {
    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Size")
    @Validation(required = true)
    public Long size;

    public static GetQueuingSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueuingSizeResponse self = new GetQueuingSizeResponse();
        return TeaModel.build(map, self);
    }

    public GetQueuingSizeResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQueuingSizeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueuingSizeResponse setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
