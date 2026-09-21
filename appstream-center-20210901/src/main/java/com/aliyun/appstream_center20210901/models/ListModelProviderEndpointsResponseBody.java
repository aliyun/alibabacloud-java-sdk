// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListModelProviderEndpointsResponseBody extends TeaModel {
    /**
     * <p>The returned data object.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListModelProviderEndpointsResponseBodyData> data;

    /**
     * <p>The request ID, which uniquely identifies the request.</p>
     * 
     * <strong>example:</strong>
     * <p>XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListModelProviderEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelProviderEndpointsResponseBody self = new ListModelProviderEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelProviderEndpointsResponseBody setData(java.util.List<ListModelProviderEndpointsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListModelProviderEndpointsResponseBodyData> getData() {
        return this.data;
    }

    public ListModelProviderEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListModelProviderEndpointsResponseBodyDataEndpoints extends TeaModel {
        /**
         * <p>The API compatibility type, such as openai-compatible or anthropic-compatible.</p>
         * 
         * <strong>example:</strong>
         * <p>openai-compatible</p>
         */
        @NameInMap("ApiType")
        public String apiType;

        /**
         * <p>The API base URL, such as <a href="https://coding.dashscope.aliyuncs.com/v1">https://coding.dashscope.aliyuncs.com/v1</a>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://coding.dashscope.aliyuncs.com/v1">https://coding.dashscope.aliyuncs.com/v1</a></p>
         */
        @NameInMap("BaseUrl")
        public String baseUrl;

        /**
         * <p>The endpoint description, such as Coding Plan - OpenAI compatible protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>Coding Plan - OpenAI</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The endpoint identifier name, such as coding-openai or cn-beijing.</p>
         * 
         * <strong>example:</strong>
         * <p>coding-openai</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The provider URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test">https://test</a></p>
         */
        @NameInMap("ProviderUrl")
        public String providerUrl;

        /**
         * <p>The list of tags used for categorization and filtering, such as coding-plan, on-demand, or cn-beijing.</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        public static ListModelProviderEndpointsResponseBodyDataEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListModelProviderEndpointsResponseBodyDataEndpoints self = new ListModelProviderEndpointsResponseBodyDataEndpoints();
            return TeaModel.build(map, self);
        }

        public ListModelProviderEndpointsResponseBodyDataEndpoints setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public ListModelProviderEndpointsResponseBodyDataEndpoints setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public ListModelProviderEndpointsResponseBodyDataEndpoints setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModelProviderEndpointsResponseBodyDataEndpoints setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListModelProviderEndpointsResponseBodyDataEndpoints setProviderUrl(String providerUrl) {
            this.providerUrl = providerUrl;
            return this;
        }
        public String getProviderUrl() {
            return this.providerUrl;
        }

        public ListModelProviderEndpointsResponseBodyDataEndpoints setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

    public static class ListModelProviderEndpointsResponseBodyData extends TeaModel {
        /**
         * <p>The provider description, such as Alibaba Cloud Bailian.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen Plus series models</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of all endpoints under the provider.</p>
         */
        @NameInMap("Endpoints")
        public java.util.List<ListModelProviderEndpointsResponseBodyDataEndpoints> endpoints;

        /**
         * <p>The provider name, such as bailian or moonshot.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        @NameInMap("ProviderName")
        public String providerName;

        /**
         * <p>The provider website URL, which is used to direct users to obtain an API key.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test">https://test</a></p>
         */
        @NameInMap("ProviderUrl")
        public String providerUrl;

        public static ListModelProviderEndpointsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModelProviderEndpointsResponseBodyData self = new ListModelProviderEndpointsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModelProviderEndpointsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModelProviderEndpointsResponseBodyData setEndpoints(java.util.List<ListModelProviderEndpointsResponseBodyDataEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<ListModelProviderEndpointsResponseBodyDataEndpoints> getEndpoints() {
            return this.endpoints;
        }

        public ListModelProviderEndpointsResponseBodyData setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public ListModelProviderEndpointsResponseBodyData setProviderUrl(String providerUrl) {
            this.providerUrl = providerUrl;
            return this;
        }
        public String getProviderUrl() {
            return this.providerUrl;
        }

    }

}
