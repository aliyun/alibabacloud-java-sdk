// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeDeployProcessResponseBody extends TeaModel {
    @NameInMap("DeployProcess")
    public String deployProcess;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DescribeDeployProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeployProcessResponseBody self = new DescribeDeployProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeployProcessResponseBody setDeployProcess(String deployProcess) {
        this.deployProcess = deployProcess;
        return this;
    }
    public String getDeployProcess() {
        return this.deployProcess;
    }

    public DescribeDeployProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeployProcessResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
