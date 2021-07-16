// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSubscriptionServiceGroupsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<ListSubscriptionServiceGroupsResponseBodyData> data;

    public static ListSubscriptionServiceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionServiceGroupsResponseBody self = new ListSubscriptionServiceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionServiceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubscriptionServiceGroupsResponseBody setData(java.util.List<ListSubscriptionServiceGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSubscriptionServiceGroupsResponseBodyData> getData() {
        return this.data;
    }

    public static class ListSubscriptionServiceGroupsResponseBodyData extends TeaModel {
        // 主键
        @NameInMap("serviceId")
        public Long serviceId;

        // 服务组名称
        @NameInMap("serviceName")
        public String serviceName;

        // 服务组描述
        @NameInMap("serviceGroupDescription")
        public String serviceGroupDescription;

        public static ListSubscriptionServiceGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionServiceGroupsResponseBodyData self = new ListSubscriptionServiceGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionServiceGroupsResponseBodyData setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public ListSubscriptionServiceGroupsResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListSubscriptionServiceGroupsResponseBodyData setServiceGroupDescription(String serviceGroupDescription) {
            this.serviceGroupDescription = serviceGroupDescription;
            return this;
        }
        public String getServiceGroupDescription() {
            return this.serviceGroupDescription;
        }

    }

}
