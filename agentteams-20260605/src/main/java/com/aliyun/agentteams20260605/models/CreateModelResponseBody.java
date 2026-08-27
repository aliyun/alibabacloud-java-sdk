// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateModelResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public CreateModelResponseBodyData data;

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

    public static CreateModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelResponseBody self = new CreateModelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateModelResponseBody setData(CreateModelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateModelResponseBodyData getData() {
        return this.data;
    }

    public CreateModelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateModelResponseBodyData extends TeaModel {
        /**
         * <p>The creation time, in millisecond timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1718000000000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The model description.</p>
         * 
         * <strong>example:</strong>
         * <p>my model</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-xxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-model</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of protocols supported by the model.</p>
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

        /**
         * <p>The name of the model provider.</p>
         * 
         * <strong>example:</strong>
         * <p>my-provider</p>
         */
        @NameInMap("ProviderName")
        public String providerName;

        /**
         * <p>The update time, in millisecond timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1718000000000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static CreateModelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateModelResponseBodyData self = new CreateModelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateModelResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateModelResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateModelResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateModelResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateModelResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateModelResponseBodyData setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        public CreateModelResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public CreateModelResponseBodyData setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public CreateModelResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
