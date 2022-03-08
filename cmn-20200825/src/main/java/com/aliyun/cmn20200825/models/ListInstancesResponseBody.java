// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    // 实例列表
    @NameInMap("Instances")
    public java.util.List<ListInstancesResponseBodyInstances> instances;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setInstances(java.util.List<ListInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstancesResponseBodyInstances extends TeaModel {
        // 最大纳管设备数量
        @NameInMap("InstanceDeviceMaxCount")
        public String instanceDeviceMaxCount;

        // 实例到期时间
        @NameInMap("InstanceEndDate")
        public String instanceEndDate;

        // 实例ID
        @NameInMap("InstanceId")
        public String instanceId;

        // 实例名称
        @NameInMap("InstanceName")
        public String instanceName;

        // 实例开通时间
        @NameInMap("InstanceOpenDate")
        public String instanceOpenDate;

        // 实例规格
        @NameInMap("InstanceSpec")
        public String instanceSpec;

        // 实例状态
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        public static ListInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstances self = new ListInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstances setInstanceDeviceMaxCount(String instanceDeviceMaxCount) {
            this.instanceDeviceMaxCount = instanceDeviceMaxCount;
            return this;
        }
        public String getInstanceDeviceMaxCount() {
            return this.instanceDeviceMaxCount;
        }

        public ListInstancesResponseBodyInstances setInstanceEndDate(String instanceEndDate) {
            this.instanceEndDate = instanceEndDate;
            return this;
        }
        public String getInstanceEndDate() {
            return this.instanceEndDate;
        }

        public ListInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstancesResponseBodyInstances setInstanceOpenDate(String instanceOpenDate) {
            this.instanceOpenDate = instanceOpenDate;
            return this;
        }
        public String getInstanceOpenDate() {
            return this.instanceOpenDate;
        }

        public ListInstancesResponseBodyInstances setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        public ListInstancesResponseBodyInstances setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

    }

}
