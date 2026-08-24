// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class GetKVCacheStoreRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kvcs-your-id</p>
     */
    @NameInMap("KvcsId")
    public String kvcsId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetKVCacheStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKVCacheStoreRequest self = new GetKVCacheStoreRequest();
        return TeaModel.build(map, self);
    }

    public GetKVCacheStoreRequest setKvcsId(String kvcsId) {
        this.kvcsId = kvcsId;
        return this;
    }
    public String getKvcsId() {
        return this.kvcsId;
    }

    public GetKVCacheStoreRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
