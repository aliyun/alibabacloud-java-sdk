// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageSetsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StorageSetIds")
    public String storageSetIds;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("StorageSetName")
    public String storageSetName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeStorageSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageSetsRequest self = new DescribeStorageSetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStorageSetsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeStorageSetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeStorageSetsRequest setStorageSetIds(String storageSetIds) {
        this.storageSetIds = storageSetIds;
        return this;
    }
    public String getStorageSetIds() {
        return this.storageSetIds;
    }

    public DescribeStorageSetsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeStorageSetsRequest setStorageSetName(String storageSetName) {
        this.storageSetName = storageSetName;
        return this;
    }
    public String getStorageSetName() {
        return this.storageSetName;
    }

    public DescribeStorageSetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStorageSetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
