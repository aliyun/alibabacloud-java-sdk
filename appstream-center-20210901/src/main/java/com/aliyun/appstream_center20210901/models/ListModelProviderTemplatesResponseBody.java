// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListModelProviderTemplatesResponseBody extends TeaModel {
    /**
     * <p>The list of returned data objects.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListModelProviderTemplatesResponseBodyData> data;

    /**
     * <p>The page number of the current query result.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in the query result.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListModelProviderTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelProviderTemplatesResponseBody self = new ListModelProviderTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelProviderTemplatesResponseBody setData(java.util.List<ListModelProviderTemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListModelProviderTemplatesResponseBodyData> getData() {
        return this.data;
    }

    public ListModelProviderTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelProviderTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelProviderTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelProviderTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListModelProviderTemplatesResponseBodyData extends TeaModel {
        /**
         * <p>The model provider configuration as a JSON object.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;api&quot;: &quot;openai-completions&quot;,
         *     &quot;apiKey&quot;: &quot;sk-xxxx&quot;,
         *     &quot;baseUrl&quot;: &quot;<a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a>&quot;
         * }</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The description of the model provider template.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云百炼服务商</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the WUYING secure gateway proxy is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableWuyingProxy")
        public Boolean enableWuyingProxy;

        /**
         * <p>The name of the model provider template.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云百炼</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the model provider.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        @NameInMap("ProviderName")
        public String providerName;

        /**
         * <p>The model provider template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mpt-xxxx</p>
         */
        @NameInMap("ProviderTemplateId")
        public String providerTemplateId;

        /**
         * <p>The model provider type.</p>
         * 
         * <strong>example:</strong>
         * <p>WuyingCredit</p>
         */
        @NameInMap("ProviderType")
        public String providerType;

        public static ListModelProviderTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModelProviderTemplatesResponseBodyData self = new ListModelProviderTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModelProviderTemplatesResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListModelProviderTemplatesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModelProviderTemplatesResponseBodyData setEnableWuyingProxy(Boolean enableWuyingProxy) {
            this.enableWuyingProxy = enableWuyingProxy;
            return this;
        }
        public Boolean getEnableWuyingProxy() {
            return this.enableWuyingProxy;
        }

        public ListModelProviderTemplatesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListModelProviderTemplatesResponseBodyData setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public ListModelProviderTemplatesResponseBodyData setProviderTemplateId(String providerTemplateId) {
            this.providerTemplateId = providerTemplateId;
            return this;
        }
        public String getProviderTemplateId() {
            return this.providerTemplateId;
        }

        public ListModelProviderTemplatesResponseBodyData setProviderType(String providerType) {
            this.providerType = providerType;
            return this;
        }
        public String getProviderType() {
            return this.providerType;
        }

    }

}
