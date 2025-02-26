// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateServiceResponseBodyData data;

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

    public static CreateServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceResponseBody self = new CreateServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateServiceResponseBody setData(CreateServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateServiceResponseBodyData getData() {
        return this.data;
    }

    public CreateServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateServiceResponseBodyData extends TeaModel {
        @NameInMap("serviceIds")
        public java.util.List<String> serviceIds;

        public static CreateServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceResponseBodyData self = new CreateServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateServiceResponseBodyData setServiceIds(java.util.List<String> serviceIds) {
            this.serviceIds = serviceIds;
            return this;
        }
        public java.util.List<String> getServiceIds() {
            return this.serviceIds;
        }

    }

}
