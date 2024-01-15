// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewDesktopOversoldGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    public RenewDesktopOversoldGroupResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RenewDesktopOversoldGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewDesktopOversoldGroupResponseBody self = new RenewDesktopOversoldGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewDesktopOversoldGroupResponseBody setData(RenewDesktopOversoldGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RenewDesktopOversoldGroupResponseBodyData getData() {
        return this.data;
    }

    public RenewDesktopOversoldGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RenewDesktopOversoldGroupResponseBodyData extends TeaModel {
        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("OversoldGroupId")
        public String oversoldGroupId;

        public static RenewDesktopOversoldGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RenewDesktopOversoldGroupResponseBodyData self = new RenewDesktopOversoldGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RenewDesktopOversoldGroupResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public RenewDesktopOversoldGroupResponseBodyData setOversoldGroupId(String oversoldGroupId) {
            this.oversoldGroupId = oversoldGroupId;
            return this;
        }
        public String getOversoldGroupId() {
            return this.oversoldGroupId;
        }

    }

}
