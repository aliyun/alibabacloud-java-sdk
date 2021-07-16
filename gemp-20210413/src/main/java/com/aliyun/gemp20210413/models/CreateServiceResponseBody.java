// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateServiceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 服务ID
    @NameInMap("data")
    public CreateServiceResponseBodyData data;

    public static CreateServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceResponseBody self = new CreateServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceResponseBody setData(CreateServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateServiceResponseBodyData getData() {
        return this.data;
    }

    public static class CreateServiceResponseBodyData extends TeaModel {
        // 服务ID
        @NameInMap("serviceId")
        public Long serviceId;

        public static CreateServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceResponseBodyData self = new CreateServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateServiceResponseBodyData setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

    }

}
