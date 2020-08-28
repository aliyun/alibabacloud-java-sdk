// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateStorageSetRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    @Validation(required = true)
    public String zoneId;

    @NameInMap("StorageSetName")
    public String storageSetName;

    @NameInMap("Description")
    public String description;

    @NameInMap("MaxPartitionNumber")
    public Integer maxPartitionNumber;

    public static CreateStorageSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageSetRequest self = new CreateStorageSetRequest();
        return TeaModel.build(map, self);
    }

}
