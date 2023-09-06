// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SummaryImagesResponseBody extends TeaModel {
    /**
     * <p>The names of all images in the cluster.</p>
     */
    @NameInMap("ImagesName")
    public String imagesName;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SummaryImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SummaryImagesResponseBody self = new SummaryImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public SummaryImagesResponseBody setImagesName(String imagesName) {
        this.imagesName = imagesName;
        return this;
    }
    public String getImagesName() {
        return this.imagesName;
    }

    public SummaryImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
