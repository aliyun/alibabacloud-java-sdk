// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceMirrorRequest extends TeaModel {
    /**
     * <p>The percentage of the traffic that is mirrored to the destination service. Valid values: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Ratio")
    public Integer ratio;

    /**
     * <p>The instances.</p>
     */
    @NameInMap("Target")
    public java.util.List<String> target;

    public static CreateServiceMirrorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceMirrorRequest self = new CreateServiceMirrorRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceMirrorRequest setRatio(Integer ratio) {
        this.ratio = ratio;
        return this;
    }
    public Integer getRatio() {
        return this.ratio;
    }

    public CreateServiceMirrorRequest setTarget(java.util.List<String> target) {
        this.target = target;
        return this;
    }
    public java.util.List<String> getTarget() {
        return this.target;
    }

}
