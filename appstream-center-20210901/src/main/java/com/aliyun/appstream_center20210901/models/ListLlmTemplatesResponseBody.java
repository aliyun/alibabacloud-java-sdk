// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListLlmTemplatesResponseBody extends TeaModel {
    /**
     * <p>The list of returned data objects.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListLlmTemplatesResponseBodyData> data;

    /**
     * <p>The page number of the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListLlmTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLlmTemplatesResponseBody self = new ListLlmTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLlmTemplatesResponseBody setData(java.util.List<ListLlmTemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLlmTemplatesResponseBodyData> getData() {
        return this.data;
    }

    public ListLlmTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLlmTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLlmTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLlmTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListLlmTemplatesResponseBodyData extends TeaModel {
        /**
         * <p>The model configuration JSON object.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;id&quot;: &quot;qwen3.6-plus&quot;,
         *     &quot;cost&quot;: {
         *         &quot;input&quot;: 0,
         *         &quot;output&quot;: 0,
         *         &quot;cacheRead&quot;: 0,
         *         &quot;cacheWrite&quot;: 0
         *     },
         *     &quot;name&quot;: &quot;Qwen3.6-Plus&quot;,
         *     &quot;input&quot;: [&quot;image&quot;, &quot;text&quot;],
         *     &quot;compat&quot;: {
         *         &quot;supportsUsageInStreaming&quot;: true
         *     },
         *     &quot;maxTokens&quot;: 65536,
         *     &quot;reasoning&quot;: false,
         *     &quot;contextWindow&quot;: 1000000
         * }</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The template description.</p>
         * 
         * <strong>example:</strong>
         * <p>千问Plus系列模型</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether this is the default model in the associated model group.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefaultModel")
        public Boolean isDefaultModel;

        /**
         * <p>The model code.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.6-plus</p>
         */
        @NameInMap("LlmCode")
        public String llmCode;

        /**
         * <p>The model template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>llmt-xxxx</p>
         */
        @NameInMap("LlmTemplateId")
        public String llmTemplateId;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3.6-Plus</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the model provider template.</p>
         * 
         * <strong>example:</strong>
         * <p>mpt-xxxx</p>
         */
        @NameInMap("ProviderTemplateId")
        public String providerTemplateId;

        public static ListLlmTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLlmTemplatesResponseBodyData self = new ListLlmTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLlmTemplatesResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListLlmTemplatesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLlmTemplatesResponseBodyData setIsDefaultModel(Boolean isDefaultModel) {
            this.isDefaultModel = isDefaultModel;
            return this;
        }
        public Boolean getIsDefaultModel() {
            return this.isDefaultModel;
        }

        public ListLlmTemplatesResponseBodyData setLlmCode(String llmCode) {
            this.llmCode = llmCode;
            return this;
        }
        public String getLlmCode() {
            return this.llmCode;
        }

        public ListLlmTemplatesResponseBodyData setLlmTemplateId(String llmTemplateId) {
            this.llmTemplateId = llmTemplateId;
            return this;
        }
        public String getLlmTemplateId() {
            return this.llmTemplateId;
        }

        public ListLlmTemplatesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLlmTemplatesResponseBodyData setProviderTemplateId(String providerTemplateId) {
            this.providerTemplateId = providerTemplateId;
            return this;
        }
        public String getProviderTemplateId() {
            return this.providerTemplateId;
        }

    }

}
