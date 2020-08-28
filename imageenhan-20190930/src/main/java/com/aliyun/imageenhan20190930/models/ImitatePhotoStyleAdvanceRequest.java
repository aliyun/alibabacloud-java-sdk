// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImitatePhotoStyleAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("StyleUrl")
    @Validation(required = true)
    public String styleUrl;

    public static ImitatePhotoStyleAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ImitatePhotoStyleAdvanceRequest self = new ImitatePhotoStyleAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
