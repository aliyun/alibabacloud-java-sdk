// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyStorageSetAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StorageSetId")
    @Validation(required = true)
    public String storageSetId;

    @NameInMap("StorageSetName")
    public String storageSetName;

    @NameInMap("Description")
    public String description;

    public static ModifyStorageSetAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageSetAttributeRequest self = new ModifyStorageSetAttributeRequest();
        return TeaModel.build(map, self);
    }

}
