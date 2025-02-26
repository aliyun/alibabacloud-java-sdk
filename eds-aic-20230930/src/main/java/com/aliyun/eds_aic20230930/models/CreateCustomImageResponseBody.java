// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateCustomImageResponseBody extends TeaModel {
    /**
     * <p>Image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-075cllfeuazh0****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20393E53-8FF1-524C-B494-B478A5369733</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomImageResponseBody self = new CreateCustomImageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomImageResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateCustomImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
