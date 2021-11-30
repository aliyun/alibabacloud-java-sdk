// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceMirrorRequest extends TeaModel {
    // 比例 [0, 100]
    @NameInMap("Ratio")
    public Integer ratio;

    // 服务实例列表
    @NameInMap("Target")
    public java.util.List<String> target;

    public static UpdateServiceMirrorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceMirrorRequest self = new UpdateServiceMirrorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceMirrorRequest setRatio(Integer ratio) {
        this.ratio = ratio;
        return this;
    }
    public Integer getRatio() {
        return this.ratio;
    }

    public UpdateServiceMirrorRequest setTarget(java.util.List<String> target) {
        this.target = target;
        return this;
    }
    public java.util.List<String> getTarget() {
        return this.target;
    }

}
