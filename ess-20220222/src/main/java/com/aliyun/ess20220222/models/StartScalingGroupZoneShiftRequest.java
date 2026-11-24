// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class StartScalingGroupZoneShiftRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see Ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The expiration time of the zone transfer. After the time expires, the system automatically ends the transfer and restores the related zones. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time must be in UTC. The value must be later than the current time and cannot be more than 3 days after the current time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T12:05Z</p>
     */
    @NameInMap("ExpiryTime")
    public String expiryTime;

    /**
     * <p>The IDs of the impaired zones. Valid values of N: 1 to 5.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("ImpairedZoneIds")
    public java.util.List<String> impairedZoneIds;

    /**
     * <p>The region ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp14wlu85wrpchm0****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static StartScalingGroupZoneShiftRequest build(java.util.Map<String, ?> map) throws Exception {
        StartScalingGroupZoneShiftRequest self = new StartScalingGroupZoneShiftRequest();
        return TeaModel.build(map, self);
    }

    public StartScalingGroupZoneShiftRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartScalingGroupZoneShiftRequest setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }
    public String getExpiryTime() {
        return this.expiryTime;
    }

    public StartScalingGroupZoneShiftRequest setImpairedZoneIds(java.util.List<String> impairedZoneIds) {
        this.impairedZoneIds = impairedZoneIds;
        return this;
    }
    public java.util.List<String> getImpairedZoneIds() {
        return this.impairedZoneIds;
    }

    public StartScalingGroupZoneShiftRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartScalingGroupZoneShiftRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
