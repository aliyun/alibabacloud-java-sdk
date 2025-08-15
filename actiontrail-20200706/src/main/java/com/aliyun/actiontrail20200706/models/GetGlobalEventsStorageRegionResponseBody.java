// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetGlobalEventsStorageRegionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0474CD9D-DF37-55D4-8383-D978CFBE13A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The region where global events are stored.</p>
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
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
