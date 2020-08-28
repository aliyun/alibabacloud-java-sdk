// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class MakeSuperResolutionImageAdvanceRequest extends TeaModel {
    @NameInMap("UrlObject")
    @Validation(required = true)
    public java.io.InputStream urlObject;

    public static MakeSuperResolutionImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        MakeSuperResolutionImageAdvanceRequest self = new MakeSuperResolutionImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
