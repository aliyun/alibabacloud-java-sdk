// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageBodiesResponseBody extends TeaModel {
    // 图片裁剪结果
    @NameInMap("Bodies")
    public java.util.List<Body> bodies;

    // 请求唯一ID
    @NameInMap("RequestId")
    public String requestId;

    public static DetectImageBodiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageBodiesResponseBody self = new DetectImageBodiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectImageBodiesResponseBody setBodies(java.util.List<Body> bodies) {
        this.bodies = bodies;
        return this;
    }
    public java.util.List<Body> getBodies() {
        return this.bodies;
    }

    public DetectImageBodiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
