// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UploadImageResponseBody extends TeaModel {
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("RequestId")
    public String requestId;

    public static UploadImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadImageResponseBody self = new UploadImageResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadImageResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UploadImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
