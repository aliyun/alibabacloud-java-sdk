// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody extends TeaModel {
    /**
     * <p>The instance families that support deployment sets.</p>
     */
    @NameInMap("InstanceTypeFamilies")
    public String instanceTypeFamilies;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody self = new DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody setInstanceTypeFamilies(String instanceTypeFamilies) {
        this.instanceTypeFamilies = instanceTypeFamilies;
        return this;
    }
    public String getInstanceTypeFamilies() {
        return this.instanceTypeFamilies;
    }

    public DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
