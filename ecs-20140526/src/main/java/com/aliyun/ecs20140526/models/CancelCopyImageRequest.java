// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CancelCopyImageRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    public static CancelCopyImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCopyImageRequest self = new CancelCopyImageRequest();
        return TeaModel.build(map, self);
    }

}
