// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNamespaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateNamespaceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D1F1A6F3-7E03-5EAD-B3F1-123456789ABC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNamespaceResponseBody self = new CreateNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNamespaceResponseBody setData(CreateNamespaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateNamespaceResponseBodyData getData() {
        return this.data;
    }

    public CreateNamespaceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateNamespaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNamespaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateNamespaceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>myNamespace</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        public static CreateNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateNamespaceResponseBodyData self = new CreateNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateNamespaceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateNamespaceResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
