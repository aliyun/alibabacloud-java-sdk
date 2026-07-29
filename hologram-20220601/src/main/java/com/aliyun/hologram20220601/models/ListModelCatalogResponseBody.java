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

    /**
     * <p>The list of models.</p>
     */
    @NameInMap("modelList")
    public java.util.List<ListModelCatalogResponseBodyModelList> modelList;

    /**
     * <p>The pagination token. Set this parameter to the value of NextToken that is returned from the previous API call.</p>
     * 
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
         * <p>The default parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;timeout&quot;: 600, &quot;max_retries&quot;: 10, &quot;max_retry_delay&quot;: 8, &quot;initial_retry_delay&quot;: 0.5}</p>
         */
        @NameInMap("defaultParams")
        public String defaultParams;

        /**
         * <p>The additional parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;deepThink\&quot;:false,\&quot;onlineSearch\&quot;:true}</p>
         */
        @NameInMap("extra")
        public String extra;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.5-plus</p>
         */
        @NameInMap("modelType")
        public String modelType;

        /**
         * <p>The parameter example.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;extra_body&quot;: {
         *         &quot;translation_options&quot;: {
         *             &quot;source_lang&quot;: &quot;zh&quot;,
         *             &quot;domains&quot;: &quot;The sentence is from Ali Cloud IT domain. &quot;, 
         *             &quot;terms&quot;: [
         *                 {
         *                     &quot;source&quot;: &quot;生物传感器&quot;,
         *                     &quot;target&quot;: &quot;biological sensor&quot;
         *                 },
         *                 {
         *                     &quot;source&quot;: &quot;身体健康状况&quot;,
         *                     &quot;target&quot;: &quot;health status of the body&quot;
         *                 }
         *             ],
         *             &quot;tm_list&quot;: [
         *                 {
         *                     &quot;source&quot;: &quot;您可以通过如下方式查看集群的内核版本信息:&quot;,
         *                     &quot;target&quot;: &quot;You can use one of the following methods to query the engine version of a cluster:&quot;
         *                 }
         *             ]
         *         }
         *     }
         * }</p>
         */
        @NameInMap("paramsExample")
        public String paramsExample;

        /**
         * <p>The underlying model provider.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        @NameInMap("provider")
        public String provider;

        /**
         * <p>The deployment region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("serviceDeployRegion")
        public String serviceDeployRegion;

        @NameInMap("supportApiKeyAccess")
        public Boolean supportApiKeyAccess;

        /**
         * <p>The model purpose.</p>
         * 
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

        public ListModelCatalogResponseBodyModelList setSupportApiKeyAccess(Boolean supportApiKeyAccess) {
            this.supportApiKeyAccess = supportApiKeyAccess;
            return this;
        }
        public Boolean getSupportApiKeyAccess() {
            return this.supportApiKeyAccess;
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
