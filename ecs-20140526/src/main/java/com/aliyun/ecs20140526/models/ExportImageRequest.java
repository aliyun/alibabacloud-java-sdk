// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ExportImageRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("OSSBucket")
    @Validation(required = true)
    public String OSSBucket;

    @NameInMap("OSSPrefix")
    public String OSSPrefix;

    @NameInMap("ImageFormat")
    public String imageFormat;

    @NameInMap("RoleName")
    public String roleName;

    public static ExportImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportImageRequest self = new ExportImageRequest();
        return TeaModel.build(map, self);
    }

}
