// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateImageResponseBody extends TeaModel {
    // The ID of the image.
    @NameInMap("ImageId")
    public String imageId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageResponseBody self = new CreateImageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
