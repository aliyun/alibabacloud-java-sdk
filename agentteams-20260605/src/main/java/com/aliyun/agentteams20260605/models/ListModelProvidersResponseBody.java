// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListModelProvidersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Items")
    public java.util.List<ListModelProvidersResponseBodyItems> items;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListModelProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelProvidersResponseBody self = new ListModelProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelProvidersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListModelProvidersResponseBody setItems(java.util.List<ListModelProvidersResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListModelProvidersResponseBodyItems> getItems() {
        return this.items;
    }

    public ListModelProvidersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListModelProvidersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListModelProvidersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelProvidersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListModelProvidersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListModelProvidersResponseBodyItems extends TeaModel {
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

        public static ListModelProvidersResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListModelProvidersResponseBodyItems self = new ListModelProvidersResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListModelProvidersResponseBodyItems setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListModelProvidersResponseBodyItems setApiKeys(java.util.List<String> apiKeys) {
            this.apiKeys = apiKeys;
            return this;
        }
        public java.util.List<String> getApiKeys() {
            return this.apiKeys;
        }

        public ListModelProvidersResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListModelProvidersResponseBodyItems setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public ListModelProvidersResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModelProvidersResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListModelProvidersResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListModelProvidersResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListModelProvidersResponseBodyItems setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        public ListModelProvidersResponseBodyItems setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

    }

}
