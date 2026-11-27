// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acc20240402.models;

import com.aliyun.tea.*;

public class CreateImageCacheResponseBody extends TeaModel {
    /**
     * <p>The ID of the image cache.</p>
     * 
     * <strong>example:</strong>
     * <p>imc-bp1dj*****</p>
     */
    @NameInMap("ImageCacheId")
    public String imageCacheId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0E234675-3465-4CC3-9D0F-9A864BC*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateImageCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageCacheResponseBody self = new CreateImageCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageCacheResponseBody setImageCacheId(String imageCacheId) {
        this.imageCacheId = imageCacheId;
        return this;
    }
    public String getImageCacheId() {
        return this.imageCacheId;
    }

    public CreateImageCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
