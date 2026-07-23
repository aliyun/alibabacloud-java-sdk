// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateNamespaceResponseBody extends TeaModel {
    /**
     * <p>API response code, 200 indicates success</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Response data</p>
     */
    @NameInMap("Data")
    public CreateNamespaceResponseBodyData data;

    /**
     * <p>API response message</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the operation was successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNamespaceResponseBody self = new CreateNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNamespaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateNamespaceResponseBody setData(CreateNamespaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateNamespaceResponseBodyData getData() {
        return this.data;
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
         * <p>Namespace ARN</p>
         * 
         * <strong>example:</strong>
         * <p>acs:eventbridge:cn-hangzhou:123456789:catalog/my_catalog/namespace/my_namespace</p>
         */
        @NameInMap("NamespaceARN")
        public String namespaceARN;

        public static CreateNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateNamespaceResponseBodyData self = new CreateNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateNamespaceResponseBodyData setNamespaceARN(String namespaceARN) {
            this.namespaceARN = namespaceARN;
            return this;
        }
        public String getNamespaceARN() {
            return this.namespaceARN;
        }

    }

}
