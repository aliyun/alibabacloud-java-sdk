// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class EnhanceImageColorRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    @NameInMap("OutputFormat")
    @Validation(required = true)
    public String outputFormat;

    @NameInMap("Mode")
    @Validation(required = true)
    public String mode;

    public static EnhanceImageColorRequest build(java.util.Map<String, ?> map) throws Exception {
        EnhanceImageColorRequest self = new EnhanceImageColorRequest();
        return TeaModel.build(map, self);
    }

}
