// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImitatePhotoStyleRequest extends TeaModel {
    @NameInMap("StyleUrl")
    @Validation(required = true)
    public String styleUrl;

    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static ImitatePhotoStyleRequest build(java.util.Map<String, ?> map) throws Exception {
        ImitatePhotoStyleRequest self = new ImitatePhotoStyleRequest();
        return TeaModel.build(map, self);
    }

}
