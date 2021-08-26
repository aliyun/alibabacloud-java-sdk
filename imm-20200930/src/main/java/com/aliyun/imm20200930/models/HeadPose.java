// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class HeadPose extends TeaModel {
    // Pitch
    @NameInMap("Pitch")
    public Float pitch;

    // Roll
    @NameInMap("Roll")
    public Float roll;

    // Yaw
    @NameInMap("Yaw")
    public Float yaw;

    public static HeadPose build(java.util.Map<String, ?> map) throws Exception {
        HeadPose self = new HeadPose();
        return TeaModel.build(map, self);
    }

    public HeadPose setPitch(Float pitch) {
        this.pitch = pitch;
        return this;
    }
    public Float getPitch() {
        return this.pitch;
    }

    public HeadPose setRoll(Float roll) {
        this.roll = roll;
        return this;
    }
    public Float getRoll() {
        return this.roll;
    }

    public HeadPose setYaw(Float yaw) {
        this.yaw = yaw;
        return this;
    }
    public Float getYaw() {
        return this.yaw;
    }

}
