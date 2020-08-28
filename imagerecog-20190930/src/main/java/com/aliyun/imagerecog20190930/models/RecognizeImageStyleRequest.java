// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeImageStyleRequest extends TeaModel {
    @NameInMap("Url")
    @Validation(required = true)
    public String url;

    public static RecognizeImageStyleRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageStyleRequest self = new RecognizeImageStyleRequest();
        return TeaModel.build(map, self);
    }

}
