// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeRelatedAuthorizationStatusResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OSSAuthorized")
    public Boolean OSSAuthorized;

    @NameInMap("MTSAuthorized")
    public Boolean MTSAuthorized;

    @NameInMap("MNSAuthorized")
    public Boolean MNSAuthorized;

    @NameInMap("Authorized")
    public Boolean authorized;

    public static DescribeRelatedAuthorizationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRelatedAuthorizationStatusResponseBody self = new DescribeRelatedAuthorizationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRelatedAuthorizationStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRelatedAuthorizationStatusResponseBody setOSSAuthorized(Boolean OSSAuthorized) {
        this.OSSAuthorized = OSSAuthorized;
        return this;
    }
    public Boolean getOSSAuthorized() {
        return this.OSSAuthorized;
    }

    public DescribeRelatedAuthorizationStatusResponseBody setMTSAuthorized(Boolean MTSAuthorized) {
        this.MTSAuthorized = MTSAuthorized;
        return this;
    }
    public Boolean getMTSAuthorized() {
        return this.MTSAuthorized;
    }

    public DescribeRelatedAuthorizationStatusResponseBody setMNSAuthorized(Boolean MNSAuthorized) {
        this.MNSAuthorized = MNSAuthorized;
        return this;
    }
    public Boolean getMNSAuthorized() {
        return this.MNSAuthorized;
    }

    public DescribeRelatedAuthorizationStatusResponseBody setAuthorized(Boolean authorized) {
        this.authorized = authorized;
        return this;
    }
    public Boolean getAuthorized() {
        return this.authorized;
    }

}
