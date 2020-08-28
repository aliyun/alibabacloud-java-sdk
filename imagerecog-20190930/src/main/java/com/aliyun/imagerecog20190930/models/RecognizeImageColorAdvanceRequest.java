// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeImageColorAdvanceRequest extends TeaModel {
    @NameInMap("UrlObject")
    @Validation(required = true)
    public java.io.InputStream urlObject;

    @NameInMap("ColorCount")
    public Integer colorCount;

    public static RecognizeImageColorAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageColorAdvanceRequest self = new RecognizeImageColorAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
