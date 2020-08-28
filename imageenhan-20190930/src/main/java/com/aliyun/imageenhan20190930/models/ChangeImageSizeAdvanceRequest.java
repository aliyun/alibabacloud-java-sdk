// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ChangeImageSizeAdvanceRequest extends TeaModel {
    @NameInMap("UrlObject")
    @Validation(required = true)
    public java.io.InputStream urlObject;

    @NameInMap("Width")
    @Validation(required = true)
    public Integer width;

    @NameInMap("Height")
    @Validation(required = true)
    public Integer height;

    public static ChangeImageSizeAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeImageSizeAdvanceRequest self = new ChangeImageSizeAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
