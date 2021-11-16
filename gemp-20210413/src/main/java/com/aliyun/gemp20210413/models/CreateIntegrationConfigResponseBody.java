// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateIntegrationConfigResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateIntegrationConfigResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    public static CreateIntegrationConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIntegrationConfigResponseBody self = new CreateIntegrationConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIntegrationConfigResponseBody setData(CreateIntegrationConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateIntegrationConfigResponseBodyData getData() {
        return this.data;
    }

    public CreateIntegrationConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateIntegrationConfigResponseBodyData extends TeaModel {
        // 集成配置id
        @NameInMap("integrationConfigId")
        public Long integrationConfigId;

        public static CreateIntegrationConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateIntegrationConfigResponseBodyData self = new CreateIntegrationConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateIntegrationConfigResponseBodyData setIntegrationConfigId(Long integrationConfigId) {
            this.integrationConfigId = integrationConfigId;
            return this;
        }
        public Long getIntegrationConfigId() {
            return this.integrationConfigId;
        }

    }

}
