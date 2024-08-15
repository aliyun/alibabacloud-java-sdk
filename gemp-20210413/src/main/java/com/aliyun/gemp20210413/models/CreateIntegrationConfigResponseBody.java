// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateIntegrationConfigResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public CreateIntegrationConfigResponseBodyData data;

    /**
     * <p>id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>601FA6A2-AC5C-4B59-BE11-378F887A6A11</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>101</p>
         */
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
