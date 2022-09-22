// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyOrderAutoRebootTimeResponseBody extends TeaModel {
    @NameInMap("ModifyOrderAutoRebootTimeInfo")
    public ModifyOrderAutoRebootTimeInfo modifyOrderAutoRebootTimeInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyOrderAutoRebootTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOrderAutoRebootTimeResponseBody self = new ModifyOrderAutoRebootTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOrderAutoRebootTimeResponseBody setModifyOrderAutoRebootTimeInfo(ModifyOrderAutoRebootTimeInfo modifyOrderAutoRebootTimeInfo) {
        this.modifyOrderAutoRebootTimeInfo = modifyOrderAutoRebootTimeInfo;
        return this;
    }
    public ModifyOrderAutoRebootTimeInfo getModifyOrderAutoRebootTimeInfo() {
        return this.modifyOrderAutoRebootTimeInfo;
    }

    public ModifyOrderAutoRebootTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyOrderAutoRebootTimeInfo extends TeaModel {
        @NameInMap("AutoRebootTime")
        public String autoRebootTime;

        @NameInMap("OrderId")
        public Long orderId;

        public static ModifyOrderAutoRebootTimeInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyOrderAutoRebootTimeInfo self = new ModifyOrderAutoRebootTimeInfo();
            return TeaModel.build(map, self);
        }

        public ModifyOrderAutoRebootTimeInfo setAutoRebootTime(String autoRebootTime) {
            this.autoRebootTime = autoRebootTime;
            return this;
        }
        public String getAutoRebootTime() {
            return this.autoRebootTime;
        }

        public ModifyOrderAutoRebootTimeInfo setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
