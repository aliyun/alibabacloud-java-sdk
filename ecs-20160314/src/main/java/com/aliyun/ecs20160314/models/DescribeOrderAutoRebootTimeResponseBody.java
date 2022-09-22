// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeOrderAutoRebootTimeResponseBody extends TeaModel {
    @NameInMap("DescribeOrderAutoRebootTimeInfo")
    public DescribeOrderAutoRebootTimeInfo describeOrderAutoRebootTimeInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOrderAutoRebootTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrderAutoRebootTimeResponseBody self = new DescribeOrderAutoRebootTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrderAutoRebootTimeResponseBody setDescribeOrderAutoRebootTimeInfo(DescribeOrderAutoRebootTimeInfo describeOrderAutoRebootTimeInfo) {
        this.describeOrderAutoRebootTimeInfo = describeOrderAutoRebootTimeInfo;
        return this;
    }
    public DescribeOrderAutoRebootTimeInfo getDescribeOrderAutoRebootTimeInfo() {
        return this.describeOrderAutoRebootTimeInfo;
    }

    public DescribeOrderAutoRebootTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOrderAutoRebootTimeInfo extends TeaModel {
        @NameInMap("AutoRebootTime")
        public String autoRebootTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OrderId")
        public Long orderId;

        public static DescribeOrderAutoRebootTimeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrderAutoRebootTimeInfo self = new DescribeOrderAutoRebootTimeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeOrderAutoRebootTimeInfo setAutoRebootTime(String autoRebootTime) {
            this.autoRebootTime = autoRebootTime;
            return this;
        }
        public String getAutoRebootTime() {
            return this.autoRebootTime;
        }

        public DescribeOrderAutoRebootTimeInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeOrderAutoRebootTimeInfo setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
