// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class DeployApplicationsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DeployApplicationsResponseBodyData data;

    public static DeployApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationsResponseBody self = new DeployApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeployApplicationsResponseBody setData(DeployApplicationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeployApplicationsResponseBodyData getData() {
        return this.data;
    }

    public static class DeployApplicationsResponseBodyData extends TeaModel {
        // Id of the execution
        @NameInMap("ExecutionId")
        public String executionId;

        public static DeployApplicationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeployApplicationsResponseBodyData self = new DeployApplicationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeployApplicationsResponseBodyData setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

    }

}
