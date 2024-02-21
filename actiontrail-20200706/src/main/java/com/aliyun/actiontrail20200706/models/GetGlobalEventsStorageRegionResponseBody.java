// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetGlobalEventsStorageRegionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The region where global events are stored.</p>
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

    public static GetGlobalEventsStorageRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalEventsStorageRegionResponseBody self = new GetGlobalEventsStorageRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGlobalEventsStorageRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGlobalEventsStorageRegionResponseBody setStorageRegion(String storageRegion) {
        this.storageRegion = storageRegion;
        return this;
    }
    public String getStorageRegion() {
        return this.storageRegion;
    }

}
