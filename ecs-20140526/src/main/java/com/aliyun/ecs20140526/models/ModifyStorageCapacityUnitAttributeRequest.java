// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyStorageCapacityUnitAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StorageCapacityUnitId")
    @Validation(required = true)
    public String storageCapacityUnitId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    public static ModifyStorageCapacityUnitAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageCapacityUnitAttributeRequest self = new ModifyStorageCapacityUnitAttributeRequest();
        return TeaModel.build(map, self);
    }

}
