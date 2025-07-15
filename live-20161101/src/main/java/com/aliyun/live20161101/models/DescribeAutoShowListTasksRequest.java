// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeAutoShowListTasksRequest extends TeaModel {
    /**
     * <p>The ID of the production studio for which you want to query scheduled tasks.</p>
     * <blockquote>
     * <p> If the scheduled tasks were created by calling the <a href="https://help.aliyun.com/document_detail/2848056.html">InitializeAutoShowListTask</a> operation, check the value of the response parameter CasterId to obtain the ID. If you do not specify this parameter, the system queries all the scheduled tasks that belong to the user specified by the OwnerId parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>53200b81-b761-4c10-842a-a0726d97****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("OwnerId")
    public Long ownerId;

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
