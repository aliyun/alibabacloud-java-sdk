// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceMirrorResponseBody extends TeaModel {
    // 比例[0,100]
    @NameInMap("Ratio")
    public String ratio;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 服务名字
    @NameInMap("ServiceName")
    public String serviceName;

    // 设置流量镜像对服务列表
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
