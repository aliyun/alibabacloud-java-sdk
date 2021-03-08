// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ImageId")
    public String imageId;

    public static CreateImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageResponseBody self = new CreateImageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateImageResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

}
