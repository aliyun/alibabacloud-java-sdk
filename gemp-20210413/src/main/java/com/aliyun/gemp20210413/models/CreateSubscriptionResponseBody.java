// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateSubscriptionResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateSubscriptionResponseBodyData data;

    // request id
    @NameInMap("requestId")
    public String requestId;

    public static CreateSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscriptionResponseBody self = new CreateSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSubscriptionResponseBody setData(CreateSubscriptionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSubscriptionResponseBodyData getData() {
        return this.data;
    }

    public CreateSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSubscriptionResponseBodyData extends TeaModel {
        // 订阅id
        @NameInMap("subscriptionId")
        public Long subscriptionId;

        public static CreateSubscriptionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSubscriptionResponseBodyData self = new CreateSubscriptionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSubscriptionResponseBodyData setSubscriptionId(Long subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Long getSubscriptionId() {
            return this.subscriptionId;
        }

    }

}
