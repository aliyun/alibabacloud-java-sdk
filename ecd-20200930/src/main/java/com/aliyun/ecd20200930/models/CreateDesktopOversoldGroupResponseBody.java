// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopOversoldGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateDesktopOversoldGroupResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDesktopOversoldGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopOversoldGroupResponseBody self = new CreateDesktopOversoldGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDesktopOversoldGroupResponseBody setData(CreateDesktopOversoldGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDesktopOversoldGroupResponseBodyData getData() {
        return this.data;
    }

    public CreateDesktopOversoldGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDesktopOversoldGroupResponseBodyData extends TeaModel {
        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("OversoldGroupId")
        public String oversoldGroupId;

        public static CreateDesktopOversoldGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDesktopOversoldGroupResponseBodyData self = new CreateDesktopOversoldGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDesktopOversoldGroupResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public CreateDesktopOversoldGroupResponseBodyData setOversoldGroupId(String oversoldGroupId) {
            this.oversoldGroupId = oversoldGroupId;
            return this;
        }
        public String getOversoldGroupId() {
            return this.oversoldGroupId;
        }

    }

}
