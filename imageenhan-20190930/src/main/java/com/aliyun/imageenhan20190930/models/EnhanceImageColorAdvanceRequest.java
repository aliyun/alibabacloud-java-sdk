// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class EnhanceImageColorAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("OutputFormat")
    @Validation(required = true)
    public String outputFormat;

    @NameInMap("Mode")
    @Validation(required = true)
    public String mode;

    public static EnhanceImageColorAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EnhanceImageColorAdvanceRequest self = new EnhanceImageColorAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
