// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RemoveImageSubtitlesRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    @NameInMap("BX")
    public Double BX;

    @NameInMap("BY")
    public Double BY;

    @NameInMap("BW")
    public Double BW;

    @NameInMap("BH")
    public Double BH;

    public static RemoveImageSubtitlesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageSubtitlesRequest self = new RemoveImageSubtitlesRequest();
        return TeaModel.build(map, self);
    }

}
