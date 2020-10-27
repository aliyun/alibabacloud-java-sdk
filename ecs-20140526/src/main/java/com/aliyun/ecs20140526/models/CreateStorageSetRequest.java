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

    public CreateStorageSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateStorageSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateStorageSetRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateStorageSetRequest setStorageSetName(String storageSetName) {
        this.storageSetName = storageSetName;
        return this;
    }
    public String getStorageSetName() {
        return this.storageSetName;
    }

    public CreateStorageSetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateStorageSetRequest setMaxPartitionNumber(Integer maxPartitionNumber) {
        this.maxPartitionNumber = maxPartitionNumber;
        return this;
    }
    public Integer getMaxPartitionNumber() {
        return this.maxPartitionNumber;
    }

}
