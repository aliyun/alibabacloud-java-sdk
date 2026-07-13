// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetModelProviderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetModelProviderResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetModelProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelProviderResponseBody self = new GetModelProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelProviderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetModelProviderResponseBody setData(GetModelProviderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetModelProviderResponseBodyData getData() {
        return this.data;
    }

    public GetModelProviderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetModelProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModelProviderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetModelProviderResponseBodyData extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("ApiKeys")
        public java.util.List<String> apiKeys;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeployStatus")
        public String deployStatus;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        @NameInMap("Provider")
        public String provider;

        @NameInMap("RegionId")
        public String regionId;

        public static GetModelProviderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetModelProviderResponseBodyData self = new GetModelProviderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetModelProviderResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetModelProviderResponseBodyData setApiKeys(java.util.List<String> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }
        public java.util.List<String> getApiKeys() {
            return this.apiKeys;
        }

        public GetModelProviderResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetModelProviderResponseBodyData setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public GetModelProviderResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetModelProviderResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetModelProviderResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetModelProviderResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetModelProviderResponseBodyData setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        public GetModelProviderResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public GetModelProviderResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
