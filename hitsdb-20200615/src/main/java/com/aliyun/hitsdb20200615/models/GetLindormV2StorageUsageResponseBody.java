// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormV2StorageUsageResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("CapacityByDiskCategory")
    public java.util.List<java.util.Map<String, ?>> capacityByDiskCategory;

    @NameInMap("InstanceStorageZoneMap")
    public java.util.Map<String, ?> instanceStorageZoneMap;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UsageByDiskCategory")
    public java.util.List<java.util.Map<String, ?>> usageByDiskCategory;

    public static GetLindormV2StorageUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLindormV2StorageUsageResponseBody self = new GetLindormV2StorageUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLindormV2StorageUsageResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetLindormV2StorageUsageResponseBody setCapacityByDiskCategory(java.util.List<java.util.Map<String, ?>> capacityByDiskCategory) {
        this.capacityByDiskCategory = capacityByDiskCategory;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getCapacityByDiskCategory() {
        return this.capacityByDiskCategory;
    }

    public GetLindormV2StorageUsageResponseBody setInstanceStorageZoneMap(java.util.Map<String, ?> instanceStorageZoneMap) {
        this.instanceStorageZoneMap = instanceStorageZoneMap;
        return this;
    }
    public java.util.Map<String, ?> getInstanceStorageZoneMap() {
        return this.instanceStorageZoneMap;
    }

    public GetLindormV2StorageUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLindormV2StorageUsageResponseBody setUsageByDiskCategory(java.util.List<java.util.Map<String, ?>> usageByDiskCategory) {
        this.usageByDiskCategory = usageByDiskCategory;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getUsageByDiskCategory() {
        return this.usageByDiskCategory;
    }

}
