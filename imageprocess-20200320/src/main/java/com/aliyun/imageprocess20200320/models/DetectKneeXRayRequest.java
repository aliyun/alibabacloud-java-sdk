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

}
