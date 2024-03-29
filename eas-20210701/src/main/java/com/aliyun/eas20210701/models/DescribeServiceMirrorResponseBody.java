// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceMirrorResponseBody extends TeaModel {
    @NameInMap("Ratio")
    public String ratio;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("Target")
    public String target;

    public static DescribeServiceMirrorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMirrorResponseBody self = new DescribeServiceMirrorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMirrorResponseBody setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public DescribeServiceMirrorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceMirrorResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public DescribeServiceMirrorResponseBody setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
