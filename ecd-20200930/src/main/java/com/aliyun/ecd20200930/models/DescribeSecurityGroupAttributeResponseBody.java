// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupAttributeResponseBody extends TeaModel {
    @NameInMap("EgressPermissions")
    public java.util.List<Permission> egressPermissions;

    @NameInMap("IngressPermissions")
    public java.util.List<Permission> ingressPermissions;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSecurityGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupAttributeResponseBody self = new DescribeSecurityGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupAttributeResponseBody setEgressPermissions(java.util.List<Permission> egressPermissions) {
        this.egressPermissions = egressPermissions;
        return this;
    }
    public java.util.List<Permission> getEgressPermissions() {
        return this.egressPermissions;
    }

    public DescribeSecurityGroupAttributeResponseBody setIngressPermissions(java.util.List<Permission> ingressPermissions) {
        this.ingressPermissions = ingressPermissions;
        return this;
    }
    public java.util.List<Permission> getIngressPermissions() {
        return this.ingressPermissions;
    }

    public DescribeSecurityGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
