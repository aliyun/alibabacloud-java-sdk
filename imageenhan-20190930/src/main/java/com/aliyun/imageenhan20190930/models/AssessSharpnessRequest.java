// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class AssessSharpnessRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static AssessSharpnessRequest build(java.util.Map<String, ?> map) throws Exception {
        AssessSharpnessRequest self = new AssessSharpnessRequest();
        return TeaModel.build(map, self);
    }

}
