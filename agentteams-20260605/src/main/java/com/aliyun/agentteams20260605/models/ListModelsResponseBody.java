// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListModelsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of models.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("Items")
    public java.util.List<ListModelsResponseBodyItems> items;

    /**
     * <p>The maximum number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>nt-xxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelsResponseBody self = new ListModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListModelsResponseBody setItems(java.util.List<ListModelsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListModelsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListModelsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListModelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListModelsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListModelsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListModelsResponseBodyItems extends TeaModel {
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
         * <p>The model provider ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-xxx</p>
         */
        @NameInMap("ProviderId")
        public String providerId;

        /**
         * <p>The model provider name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-provider</p>
         */
        @NameInMap("ProviderName")
        public String providerName;

        /**
         * <p>The number of associated workers.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("WorkerNum")
        public Long workerNum;

        public static ListModelsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyItems self = new ListModelsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModelsResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListModelsResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListModelsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListModelsResponseBodyItems setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        public ListModelsResponseBodyItems setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListModelsResponseBodyItems setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public ListModelsResponseBodyItems setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public ListModelsResponseBodyItems setWorkerNum(Long workerNum) {
            this.workerNum = workerNum;
            return this;
        }
        public Long getWorkerNum() {
            return this.workerNum;
        }

    }

}
