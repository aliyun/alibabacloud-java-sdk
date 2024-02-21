// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class UpdateGlobalEventsStorageRegionRequest extends TeaModel {
    /**
     * <p>The region where you want to store global events.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   ap-southeast-1</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    the Singapore region</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   cn-hangzhou</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    the China (Hangzhou) region</p>
     * <br>
     * <p>    <!-- --></p>
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
