// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeSceneAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static RecognizeSceneAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeSceneAdvanceRequest self = new RecognizeSceneAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
