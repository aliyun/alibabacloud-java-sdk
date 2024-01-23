// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ApplyScalingGroupRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Format")
    public String format;

    @NameInMap("RegionId")
    public String regionId;

    public static ApplyScalingGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyScalingGroupRequest self = new ApplyScalingGroupRequest();
        return TeaModel.build(map, self);
    }

    public ApplyScalingGroupRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ApplyScalingGroupRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public ApplyScalingGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
