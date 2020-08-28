// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyImageShareGroupPermissionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("AddGroup")
    public java.util.List<String> addGroup;

    @NameInMap("RemoveGroup")
    public java.util.List<String> removeGroup;

    public static ModifyImageShareGroupPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageShareGroupPermissionRequest self = new ModifyImageShareGroupPermissionRequest();
        return TeaModel.build(map, self);
    }

}
