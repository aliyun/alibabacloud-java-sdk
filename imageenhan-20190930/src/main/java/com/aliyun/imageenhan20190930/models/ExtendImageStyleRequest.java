// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ExtendImageStyleRequest extends TeaModel {
    @NameInMap("StyleUrl")
    @Validation(required = true)
    public String styleUrl;

    @NameInMap("MajorUrl")
    @Validation(required = true)
    public String majorUrl;

    public static ExtendImageStyleRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtendImageStyleRequest self = new ExtendImageStyleRequest();
        return TeaModel.build(map, self);
    }

}
