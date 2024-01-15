// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopOversoldGroupSaleResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyDesktopOversoldGroupSaleResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDesktopOversoldGroupSaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopOversoldGroupSaleResponseBody self = new ModifyDesktopOversoldGroupSaleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopOversoldGroupSaleResponseBody setData(ModifyDesktopOversoldGroupSaleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyDesktopOversoldGroupSaleResponseBodyData getData() {
        return this.data;
    }

    public ModifyDesktopOversoldGroupSaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyDesktopOversoldGroupSaleResponseBodyData extends TeaModel {
        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("OversoldGroupId")
        public String oversoldGroupId;

        public static ModifyDesktopOversoldGroupSaleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyDesktopOversoldGroupSaleResponseBodyData self = new ModifyDesktopOversoldGroupSaleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyDesktopOversoldGroupSaleResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public ModifyDesktopOversoldGroupSaleResponseBodyData setOversoldGroupId(String oversoldGroupId) {
            this.oversoldGroupId = oversoldGroupId;
            return this;
        }
        public String getOversoldGroupId() {
            return this.oversoldGroupId;
        }

    }

}
