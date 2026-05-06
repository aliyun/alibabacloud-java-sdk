// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListModelTemplatesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListModelTemplatesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListModelTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelTemplatesResponseBody self = new ListModelTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelTemplatesResponseBody setData(java.util.List<ListModelTemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListModelTemplatesResponseBodyData> getData() {
        return this.data;
    }

    public ListModelTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListModelTemplatesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>OpenClaw</p>
         */
        @NameInMap("AgentProvider")
        public String agentProvider;

        /**
         * <strong>example:</strong>
         * <p>{
         *     &quot;defaults&quot;: {
         *         &quot;model&quot;: {
         *             &quot;primary&quot;: &quot;bailian/qwen3.5-plus&quot;
         *         }
         *     }
         * }</p>
         */
        @NameInMap("Config")
        public String config;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasModel")
        public Boolean hasModel;

        /**
         * <strong>example:</strong>
         * <p>mt-xxxx</p>
         */
        @NameInMap("ModelTemplateId")
        public String modelTemplateId;

        /**
         * <strong>example:</strong>
         * <p>model-template-001</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListModelTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModelTemplatesResponseBodyData self = new ListModelTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModelTemplatesResponseBodyData setAgentProvider(String agentProvider) {
            this.agentProvider = agentProvider;
            return this;
        }
        public String getAgentProvider() {
            return this.agentProvider;
        }

        public ListModelTemplatesResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListModelTemplatesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModelTemplatesResponseBodyData setHasModel(Boolean hasModel) {
            this.hasModel = hasModel;
            return this;
        }
        public Boolean getHasModel() {
            return this.hasModel;
        }

        public ListModelTemplatesResponseBodyData setModelTemplateId(String modelTemplateId) {
            this.modelTemplateId = modelTemplateId;
            return this;
        }
        public String getModelTemplateId() {
            return this.modelTemplateId;
        }

        public ListModelTemplatesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
