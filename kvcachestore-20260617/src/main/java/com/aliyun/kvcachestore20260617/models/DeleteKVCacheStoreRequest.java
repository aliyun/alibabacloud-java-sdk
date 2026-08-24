// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class DeleteKVCacheStoreRequest extends TeaModel {
    /**
     * <p>The KvCacheStore instance ID. Only instances in the following states can be deleted: Available and Stopped. Instances in other states cannot be deleted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kvcs-your-id</p>
     */
    @NameInMap("KvcsId")
    public String kvcsId;

    /**
     * <p>The region ID, such as cn-hangzhou.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteKVCacheStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKVCacheStoreRequest self = new DeleteKVCacheStoreRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKVCacheStoreRequest setKvcsId(String kvcsId) {
        this.kvcsId = kvcsId;
        return this;
    }
    public String getKvcsId() {
        return this.kvcsId;
    }

    public DeleteKVCacheStoreRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
