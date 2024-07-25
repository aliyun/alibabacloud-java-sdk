// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateServiceSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateServiceSourceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>C67DED2B-F19B-5BEC-88C1-D6EB854CD0D4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateServiceSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceSourceResponseBody self = new CreateServiceSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateServiceSourceResponseBody setData(CreateServiceSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateServiceSourceResponseBodyData getData() {
        return this.data;
    }

    public CreateServiceSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateServiceSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateServiceSourceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gss-cpqots5lht****</p>
         */
        @NameInMap("serviceSourceId")
        public String serviceSourceId;

        public static CreateServiceSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceSourceResponseBodyData self = new CreateServiceSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateServiceSourceResponseBodyData setServiceSourceId(String serviceSourceId) {
            this.serviceSourceId = serviceSourceId;
            return this;
        }
        public String getServiceSourceId() {
            return this.serviceSourceId;
        }

    }

}
