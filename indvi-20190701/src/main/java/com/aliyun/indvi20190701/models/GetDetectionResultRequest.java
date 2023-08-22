// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.indvi20190701.models;

import com.aliyun.tea.*;

public class GetDetectionResultRequest extends TeaModel {
    @NameInMap("DetectPath")
    public String detectPath;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("PlatformType")
    public String platformType;

    public static GetDetectionResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionResultRequest self = new GetDetectionResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDetectionResultRequest setDetectPath(String detectPath) {
        this.detectPath = detectPath;
        return this;
    }
    public String getDetectPath() {
        return this.detectPath;
    }

    public GetDetectionResultRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public GetDetectionResultRequest setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

}
