// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GenerateDefaultServiceTestConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51945B04-6AA6-410D-93BA-236E0248B104</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service test config</p>
     * 
     * <strong>example:</strong>
     * <hr>
     * <p>parameters:
     *   PayType: &quot;PostPaid&quot;
     *   EcsInstanceType: &quot;$[iact3-auto]&quot;
     *   InstancePassword: &quot;$[iact3-auto]&quot;</p>
     */
    @NameInMap("TestConfig")
    public String testConfig;

    public static GenerateDefaultServiceTestConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDefaultServiceTestConfigResponseBody self = new GenerateDefaultServiceTestConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDefaultServiceTestConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateDefaultServiceTestConfigResponseBody setTestConfig(String testConfig) {
        this.testConfig = testConfig;
        return this;
    }
    public String getTestConfig() {
        return this.testConfig;
    }

}
