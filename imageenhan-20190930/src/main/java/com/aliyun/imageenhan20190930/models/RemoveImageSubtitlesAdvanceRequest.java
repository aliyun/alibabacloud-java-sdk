// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RemoveImageSubtitlesAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("BX")
    public Double BX;

    @NameInMap("BY")
    public Double BY;

    @NameInMap("BW")
    public Double BW;

    @NameInMap("BH")
    public Double BH;

    public static RemoveImageSubtitlesAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageSubtitlesAdvanceRequest self = new RemoveImageSubtitlesAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
