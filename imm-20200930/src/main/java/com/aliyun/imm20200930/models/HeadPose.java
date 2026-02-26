// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class HeadPose extends TeaModel {
    /**
     * <p>The angel of elevation or depression of the head. Unit: degree. Valid values: -180 to 180. A recommended range for reliable results is from -30 to 30.</p>
     * 
     * <strong>example:</strong>
     * <p>18.385589599609375</p>
     */
    @NameInMap("Pitch")
    public Float pitch;

    /**
     * <p>The angle of the tilt to the side. Unit: degree. Valid values: -180 to 180. A recommended range for reliable results is from -45 to 45.</p>
     * 
     * <strong>example:</strong>
     * <p>4.204030513763428</p>
     */
    @NameInMap("Roll")
    public Float roll;

    /**
     * <p>The angle of leftward or rightward rotation of the head. Unit: degree. Valid values: -180 to 180. A recommended range for reliable results is from -80 to 80.</p>
     * 
     * <strong>example:</strong>
     * <p>2.4945924282073975</p>
     */
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
