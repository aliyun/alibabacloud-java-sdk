// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class ListKVCacheStoreAvailableHpnZonesRequest extends TeaModel {
    /**
     * <p>The list of KVCacheStore instance IDs, separated by commas. You can specify a minimum of 1 and a maximum of 100 instance IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KvcsIds")
    public java.util.List<String> kvcsIds;

    /**
     * <p>The region ID, such as cn-hangzhou.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListKVCacheStoreAvailableHpnZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKVCacheStoreAvailableHpnZonesRequest self = new ListKVCacheStoreAvailableHpnZonesRequest();
        return TeaModel.build(map, self);
    }

    public ListKVCacheStoreAvailableHpnZonesRequest setKvcsIds(java.util.List<String> kvcsIds) {
        this.kvcsIds = kvcsIds;
        return this;
    }
    public java.util.List<String> getKvcsIds() {
        return this.kvcsIds;
    }

    public ListKVCacheStoreAvailableHpnZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
