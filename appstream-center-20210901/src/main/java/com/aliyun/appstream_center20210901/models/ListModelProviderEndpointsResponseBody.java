// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListModelProviderEndpointsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListModelProviderEndpointsResponseBodyData> data;

    /**
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
        @NameInMap("ApiType")
        public String apiType;

        @NameInMap("BaseUrl")
        public String baseUrl;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProviderUrl")
        public String providerUrl;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("Endpoints")
        public java.util.List<ListModelProviderEndpointsResponseBodyDataEndpoints> endpoints;

        @NameInMap("ProviderName")
        public String providerName;

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
