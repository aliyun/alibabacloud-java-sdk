// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectKneeXRayAdvanceRequest extends TeaModel {
    @NameInMap("UrlObject")
    @Validation(required = true)
    public java.io.InputStream urlObject;

    @NameInMap("DataFormat")
    @Validation(required = true)
    public String dataFormat;

    public static DetectKneeXRayAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectKneeXRayAdvanceRequest self = new DetectKneeXRayAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
