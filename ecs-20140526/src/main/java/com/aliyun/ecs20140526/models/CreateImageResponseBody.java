// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImageResponseBody extends TeaModel {
    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp146shijn7hujku****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C8B26B44-0189-443E-9816-*******</p>
     */
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
