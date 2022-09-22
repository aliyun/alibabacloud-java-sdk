// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeInstanceAutoRebootTimeResponseBody extends TeaModel {
    @NameInMap("AutoRebootInfos")
    public AutoRebootInfos autoRebootInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceAutoRebootTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAutoRebootTimeResponseBody self = new DescribeInstanceAutoRebootTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAutoRebootTimeResponseBody setAutoRebootInfos(AutoRebootInfos autoRebootInfos) {
        this.autoRebootInfos = autoRebootInfos;
        return this;
    }
    public AutoRebootInfos getAutoRebootInfos() {
        return this.autoRebootInfos;
    }

    public DescribeInstanceAutoRebootTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AutoRebootInfo extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LimitRebootTime")
        public String limitRebootTime;

        @NameInMap("OrderType")
        public String orderType;

        @NameInMap("RebootTime")
        public String rebootTime;

        public static AutoRebootInfo build(java.util.Map<String, ?> map) throws Exception {
            AutoRebootInfo self = new AutoRebootInfo();
            return TeaModel.build(map, self);
        }

        public AutoRebootInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AutoRebootInfo setLimitRebootTime(String limitRebootTime) {
            this.limitRebootTime = limitRebootTime;
            return this;
        }
        public String getLimitRebootTime() {
            return this.limitRebootTime;
        }

        public AutoRebootInfo setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public AutoRebootInfo setRebootTime(String rebootTime) {
            this.rebootTime = rebootTime;
            return this;
        }
        public String getRebootTime() {
            return this.rebootTime;
        }

    }

    public static class AutoRebootInfos extends TeaModel {
        @NameInMap("AutoRebootInfo")
        public java.util.List<AutoRebootInfo> autoRebootInfo;

        public static AutoRebootInfos build(java.util.Map<String, ?> map) throws Exception {
            AutoRebootInfos self = new AutoRebootInfos();
            return TeaModel.build(map, self);
        }

        public AutoRebootInfos setAutoRebootInfo(java.util.List<AutoRebootInfo> autoRebootInfo) {
            this.autoRebootInfo = autoRebootInfo;
            return this;
        }
        public java.util.List<AutoRebootInfo> getAutoRebootInfo() {
            return this.autoRebootInfo;
        }

    }

}
