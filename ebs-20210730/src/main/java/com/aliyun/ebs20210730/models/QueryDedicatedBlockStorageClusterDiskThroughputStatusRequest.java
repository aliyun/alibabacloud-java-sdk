// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the request of SetDedicatedBlockStorageClusterDiskThroughput api.</p>
     */
    @NameInMap("QosRequestId")
    public String qosRequestId;

    /**
     * <p>The region ID of the dedicated block storage cluster.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest self = new QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest setQosRequestId(String qosRequestId) {
        this.qosRequestId = qosRequestId;
        return this;
    }
    public String getQosRequestId() {
        return this.qosRequestId;
    }

    public QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
