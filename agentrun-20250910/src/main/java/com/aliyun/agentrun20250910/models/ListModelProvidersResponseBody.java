// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListModelProvidersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListModelProvidersResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

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

    public ListModelProvidersResponseBody setData(ListModelProvidersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListModelProvidersResponseBodyData getData() {
        return this.data;
    }

    public ListModelProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListModelProvidersResponseBodyDataItems extends TeaModel {
        /**
         * <p>baseUrl</p>
         * 
         * <strong>example:</strong>
         * <p>baseUrl</p>
         */
        @NameInMap("baseUrl")
        public String baseUrl;

        /**
         * <p>modelInfoConfig</p>
         */
        @NameInMap("modelInfoConfig")
        public ModelInfoConfig modelInfoConfig;

        /**
         * <strong>example:</strong>
         * <p>native</p>
         */
        @NameInMap("modelType")
        public String modelType;

        @NameInMap("models")
        public java.util.List<String> models;

        /**
         * <strong>example:</strong>
         * <p>providerName</p>
         */
        @NameInMap("providerName")
        public String providerName;

        public static ListModelProvidersResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListModelProvidersResponseBodyDataItems self = new ListModelProvidersResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListModelProvidersResponseBodyDataItems setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public ListModelProvidersResponseBodyDataItems setModelInfoConfig(ModelInfoConfig modelInfoConfig) {
            this.modelInfoConfig = modelInfoConfig;
            return this;
        }
        public ModelInfoConfig getModelInfoConfig() {
            return this.modelInfoConfig;
        }

        public ListModelProvidersResponseBodyDataItems setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public ListModelProvidersResponseBodyDataItems setModels(java.util.List<String> models) {
            this.models = models;
            return this;
        }
        public java.util.List<String> getModels() {
            return this.models;
        }

        public ListModelProvidersResponseBodyDataItems setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

    }

    public static class ListModelProvidersResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListModelProvidersResponseBodyDataItems> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>211</p>
         */
        @NameInMap("total")
        public Long total;

        public static ListModelProvidersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModelProvidersResponseBodyData self = new ListModelProvidersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModelProvidersResponseBodyData setItems(java.util.List<ListModelProvidersResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListModelProvidersResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListModelProvidersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListModelProvidersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListModelProvidersResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
