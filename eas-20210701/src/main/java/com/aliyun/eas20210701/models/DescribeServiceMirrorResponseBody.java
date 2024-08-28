// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceMirrorResponseBody extends TeaModel {
    /**
     * <p>The percentage of traffic that you want to mirror. Valid values: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Ratio")
    public String ratio;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service name.</p>
     * 
     * <strong>example:</strong>
     * <p>foo</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The destination services to which you want to mirror traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>foo2,foo3</p>
     */
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
