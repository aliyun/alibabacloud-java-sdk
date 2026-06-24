// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateModelTemplateResponseBody extends TeaModel {
    /**
     * <p>The creation result.</p>
     */
    @NameInMap("Data")
    public CreateModelTemplateResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateModelTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelTemplateResponseBody self = new CreateModelTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelTemplateResponseBody setData(CreateModelTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateModelTemplateResponseBodyData getData() {
        return this.data;
    }

    public CreateModelTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateModelTemplateResponseBodyData extends TeaModel {
        /**
         * <p>The model group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mt-xxxx</p>
         */
        @NameInMap("ModelTemplateId")
        public String modelTemplateId;

        public static CreateModelTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateModelTemplateResponseBodyData self = new CreateModelTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateModelTemplateResponseBodyData setModelTemplateId(String modelTemplateId) {
            this.modelTemplateId = modelTemplateId;
            return this;
        }
        public String getModelTemplateId() {
            return this.modelTemplateId;
        }

    }

}
