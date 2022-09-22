// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeInstanceHealthStatusResponseBody extends TeaModel {
    @NameInMap("HealthStatusModel")
    public java.util.List<HealthStatusModel> healthStatusModel;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceHealthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceHealthStatusResponseBody self = new DescribeInstanceHealthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceHealthStatusResponseBody setHealthStatusModel(java.util.List<HealthStatusModel> healthStatusModel) {
        this.healthStatusModel = healthStatusModel;
        return this;
    }
    public java.util.List<HealthStatusModel> getHealthStatusModel() {
        return this.healthStatusModel;
    }

    public DescribeInstanceHealthStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class HealthStatus extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static HealthStatus build(java.util.Map<String, ?> map) throws Exception {
            HealthStatus self = new HealthStatus();
            return TeaModel.build(map, self);
        }

        public HealthStatus setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public HealthStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class HealthStatusModel extends TeaModel {
        @NameInMap("HealthStatus")
        public HealthStatus healthStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        public static HealthStatusModel build(java.util.Map<String, ?> map) throws Exception {
            HealthStatusModel self = new HealthStatusModel();
            return TeaModel.build(map, self);
        }

        public HealthStatusModel setHealthStatus(HealthStatus healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public HealthStatus getHealthStatus() {
            return this.healthStatus;
        }

        public HealthStatusModel setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
