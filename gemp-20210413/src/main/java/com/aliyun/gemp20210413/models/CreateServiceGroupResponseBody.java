// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateServiceGroupResponseBody extends TeaModel {
    // 服务组ID
    @NameInMap("data")
    public CreateServiceGroupResponseBodyData data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static CreateServiceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceGroupResponseBody self = new CreateServiceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceGroupResponseBody setData(CreateServiceGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateServiceGroupResponseBodyData getData() {
        return this.data;
    }

    public CreateServiceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateServiceGroupResponseBodyData extends TeaModel {
        // 服务组ID
        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        public static CreateServiceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceGroupResponseBodyData self = new CreateServiceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateServiceGroupResponseBodyData setServiceGroupId(Long serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

    }

}
