// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CopyImageResponseBody extends TeaModel {
    // The ID of the image copy.
    @NameInMap("ImageId")
    public String imageId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CopyImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyImageResponseBody self = new CopyImageResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyImageResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CopyImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
