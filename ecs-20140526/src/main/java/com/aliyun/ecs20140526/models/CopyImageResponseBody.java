// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CopyImageResponseBody extends TeaModel {
    /**
     * <p>The ID of the image copy.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp1h46wfpjsjastd****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
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
