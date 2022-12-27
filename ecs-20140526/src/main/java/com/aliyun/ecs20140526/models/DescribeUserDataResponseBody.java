// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeUserDataResponseBody extends TeaModel {
    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The region ID of the instance.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The user data of the instance.
    @NameInMap("UserData")
    public String userData;

    public static DescribeUserDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserDataResponseBody self = new DescribeUserDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserDataResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeUserDataResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeUserDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserDataResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
