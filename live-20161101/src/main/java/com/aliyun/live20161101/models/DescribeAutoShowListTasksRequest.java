// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeAutoShowListTasksRequest extends TeaModel {
    /**
     * <p>The ID of the production studio whose scheduled tasks you want to query.</p>
     * <blockquote>
     * <p>If you create a scheduled task by calling the <a href="https://help.aliyun.com/document_detail/2848056.html">InitializeAutoShowListTask</a> operation, use the CasterId value returned by that operation. If you leave this parameter empty, all scheduled tasks under your account are queried by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>53200b81-b761-4c10-842a-a0726d97****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAutoShowListTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoShowListTasksRequest self = new DescribeAutoShowListTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoShowListTasksRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeAutoShowListTasksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAutoShowListTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
