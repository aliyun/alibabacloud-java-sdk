// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateModelProviderTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateModelProviderTemplateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateModelProviderTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelProviderTemplateResponseBody self = new CreateModelProviderTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelProviderTemplateResponseBody setData(CreateModelProviderTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateModelProviderTemplateResponseBodyData getData() {
        return this.data;
    }

    public CreateModelProviderTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateModelProviderTemplateResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mpt-xxxx</p>
         */
        @NameInMap("ProviderTemplateId")
        public String providerTemplateId;

        public static CreateModelProviderTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateModelProviderTemplateResponseBodyData self = new CreateModelProviderTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateModelProviderTemplateResponseBodyData setProviderTemplateId(String providerTemplateId) {
            this.providerTemplateId = providerTemplateId;
            return this;
        }
        public String getProviderTemplateId() {
            return this.providerTemplateId;
        }

    }

}
