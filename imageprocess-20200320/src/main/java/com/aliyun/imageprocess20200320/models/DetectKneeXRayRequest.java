// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectKneeXRayRequest extends TeaModel {
    @NameInMap("Url")
    @Validation(required = true)
    public String url;

    @NameInMap("DataFormat")
    @Validation(required = true)
    public String dataFormat;

    public static DetectKneeXRayRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectKneeXRayRequest self = new DetectKneeXRayRequest();
        return TeaModel.build(map, self);
    }

    public DetectKneeXRayRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public DetectKneeXRayRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

}
