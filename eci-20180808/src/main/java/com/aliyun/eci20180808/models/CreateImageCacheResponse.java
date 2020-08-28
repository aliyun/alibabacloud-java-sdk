// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateImageCacheResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ImageCacheId")
    @Validation(required = true)
    public String imageCacheId;

    @NameInMap("ContainerGroupId")
    @Validation(required = true)
    public String containerGroupId;

    public static CreateImageCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageCacheResponse self = new CreateImageCacheResponse();
        return TeaModel.build(map, self);
    }

}
