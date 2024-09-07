// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDeploymentSetSupportedInstanceTypeFamilyResponseBody extends TeaModel {
    /**
     * <p>The instance families that support the deployment strategy.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.i2g,ecs.i1,ecs.i2ne,ecs.i2gne</p>
     */
    @NameInMap("InstanceTypeFamilies")
    public String instanceTypeFamilies;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B7DB-A3DC7DE1****</p>
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
