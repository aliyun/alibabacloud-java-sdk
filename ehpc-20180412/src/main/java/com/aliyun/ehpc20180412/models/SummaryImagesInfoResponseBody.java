// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SummaryImagesInfoResponseBody extends TeaModel {
    @NameInMap("ImagesInfo")
    public String imagesInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static SummaryImagesInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SummaryImagesInfoResponseBody self = new SummaryImagesInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SummaryImagesInfoResponseBody setImagesInfo(String imagesInfo) {
        this.imagesInfo = imagesInfo;
        return this;
    }
    public String getImagesInfo() {
        return this.imagesInfo;
    }

    public SummaryImagesInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
