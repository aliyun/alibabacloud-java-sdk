// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopLivePullToPushRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region of the live center. Valid values:</p>
     * <ul>
     * <li>ap-southeast-1: Singapore</li>
     * <li>ap-southeast-5: Indonesia (Jakarta)</li>
     * <li>cn-beijing: China (Beijing)</li>
     * <li>cn-shanghai: China (Shanghai)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>preregion</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3bb44350-0c34-49c7-8c5e-cba5e6c0****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StopLivePullToPushRequest build(java.util.Map<String, ?> map) throws Exception {
        StopLivePullToPushRequest self = new StopLivePullToPushRequest();
        return TeaModel.build(map, self);
    }

    public StopLivePullToPushRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StopLivePullToPushRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public StopLivePullToPushRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StopLivePullToPushRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
