// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class UpdateGlobalEventsStorageRegionRequest extends TeaModel {
    /**
     * <p>The region where you want to store global events.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>ap-southeast-1</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>the Singapore region</p>
     * <!-- -->
     * </li>
     * <li><p>cn-hangzhou</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>the China (Hangzhou) region</p>
     * <!-- --></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1</p>
     */
    @NameInMap("StorageRegion")
    public String storageRegion;

    public static UpdateGlobalEventsStorageRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGlobalEventsStorageRegionRequest self = new UpdateGlobalEventsStorageRegionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGlobalEventsStorageRegionRequest setStorageRegion(String storageRegion) {
        this.storageRegion = storageRegion;
        return this;
    }
    public String getStorageRegion() {
        return this.storageRegion;
    }

}
