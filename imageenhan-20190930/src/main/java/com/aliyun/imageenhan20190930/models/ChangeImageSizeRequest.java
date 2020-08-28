// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ChangeImageSizeRequest extends TeaModel {
    @NameInMap("Width")
    @Validation(required = true)
    public Integer width;

    @NameInMap("Height")
    @Validation(required = true)
    public Integer height;

    @NameInMap("Url")
    @Validation(required = true)
    public String url;

    public static ChangeImageSizeRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeImageSizeRequest self = new ChangeImageSizeRequest();
        return TeaModel.build(map, self);
    }

}
