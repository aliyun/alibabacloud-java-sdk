// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListModelCatalogResponseBody extends TeaModel {
    /**
     * <p>maxResults</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("modelList")
    public java.util.List<ListModelCatalogResponseBodyModelList> modelList;

    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>819A7F0F-2951-540F-BD94-6A41ECF0281F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListModelCatalogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelCatalogResponseBody self = new ListModelCatalogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelCatalogResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListModelCatalogResponseBody setModelList(java.util.List<ListModelCatalogResponseBodyModelList> modelList) {
        this.modelList = modelList;
        return this;
    }
    public java.util.List<ListModelCatalogResponseBodyModelList> getModelList() {
        return this.modelList;
    }

    public ListModelCatalogResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelCatalogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListModelCatalogResponseBodyModelList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;timeout&quot;: 600, &quot;max_retries&quot;: 10, &quot;max_retry_delay&quot;: 8, &quot;initial_retry_delay&quot;: 0.5}</p>
         */
        @NameInMap("defaultParams")
        public String defaultParams;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;deepThink\&quot;:false,\&quot;onlineSearch\&quot;:true}</p>
         */
        @NameInMap("extra")
        public String extra;

        /**
         * <strong>example:</strong>
         * <p>qwen3.5-plus</p>
         */
        @NameInMap("modelType")
        public String modelType;

        @NameInMap("paramsExample")
        public String paramsExample;

        /**
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        @NameInMap("provider")
        public String provider;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("serviceDeployRegion")
        public String serviceDeployRegion;

        /**
         * <strong>example:</strong>
         * <p>chat/completions</p>
         */
        @NameInMap("taskType")
        public String taskType;

        public static ListModelCatalogResponseBodyModelList build(java.util.Map<String, ?> map) throws Exception {
            ListModelCatalogResponseBodyModelList self = new ListModelCatalogResponseBodyModelList();
            return TeaModel.build(map, self);
        }

        public ListModelCatalogResponseBodyModelList setDefaultParams(String defaultParams) {
            this.defaultParams = defaultParams;
            return this;
        }
        public String getDefaultParams() {
            return this.defaultParams;
        }

        public ListModelCatalogResponseBodyModelList setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public ListModelCatalogResponseBodyModelList setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public ListModelCatalogResponseBodyModelList setParamsExample(String paramsExample) {
            this.paramsExample = paramsExample;
            return this;
        }
        public String getParamsExample() {
            return this.paramsExample;
        }

        public ListModelCatalogResponseBodyModelList setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListModelCatalogResponseBodyModelList setServiceDeployRegion(String serviceDeployRegion) {
            this.serviceDeployRegion = serviceDeployRegion;
            return this;
        }
        public String getServiceDeployRegion() {
            return this.serviceDeployRegion;
        }

        public ListModelCatalogResponseBodyModelList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
