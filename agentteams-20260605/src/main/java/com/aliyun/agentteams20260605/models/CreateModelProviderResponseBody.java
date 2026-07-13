// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateModelProviderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateModelProviderResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Address")
        public String address;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Protocols")
        public java.util.List<String> protocols;

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
