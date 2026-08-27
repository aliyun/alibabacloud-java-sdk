// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateModelProviderResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public CreateModelProviderResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>req-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateModelProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelProviderResponseBody self = new CreateModelProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelProviderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateModelProviderResponseBody setData(CreateModelProviderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateModelProviderResponseBodyData getData() {
        return this.data;
    }

    public CreateModelProviderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateModelProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateModelProviderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateModelProviderResponseBodyData extends TeaModel {
        /**
         * <p>The address of the model provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://api.example.com">https://api.example.com</a></p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The time when the model provider was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-11T10:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the model provider.</p>
         * 
         * <strong>example:</strong>
         * <p>my provider</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the model provider.</p>
         * 
         * <strong>example:</strong>
         * <p>p-xxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the model provider.</p>
         * 
         * <strong>example:</strong>
         * <p>my-provider</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of protocols supported by the model provider.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;openai&quot;]</p>
         */
        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        /**
         * <p>The provider identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>openai</p>
         */
        @NameInMap("Provider")
        public String provider;

        public static CreateModelProviderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateModelProviderResponseBodyData self = new CreateModelProviderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateModelProviderResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public CreateModelProviderResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateModelProviderResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateModelProviderResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateModelProviderResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateModelProviderResponseBodyData setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        public CreateModelProviderResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

    }

}
