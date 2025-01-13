// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QuerySceneListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>FAFCD152-4791-5F2F-B0BE-2DC06FD4F05B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<QuerySceneListResponseBodyResults> results;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Integer statusCode;

    public static QuerySceneListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySceneListResponseBody self = new QuerySceneListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySceneListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySceneListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySceneListResponseBody setResults(java.util.List<QuerySceneListResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<QuerySceneListResponseBodyResults> getResults() {
        return this.results;
    }

    public QuerySceneListResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class QuerySceneListResponseBodyResultsTemplateInfoDTOList extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>6962</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("Name")
        public String name;

        public static QuerySceneListResponseBodyResultsTemplateInfoDTOList build(java.util.Map<String, ?> map) throws Exception {
            QuerySceneListResponseBodyResultsTemplateInfoDTOList self = new QuerySceneListResponseBodyResultsTemplateInfoDTOList();
            return TeaModel.build(map, self);
        }

        public QuerySceneListResponseBodyResultsTemplateInfoDTOList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QuerySceneListResponseBodyResultsTemplateInfoDTOList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QuerySceneListResponseBodyResultsTemplateInfoDTOList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QuerySceneListResponseBodyResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://ailabsaicloudservice.alicdn.com/hotel/icon/changjingmoshi/shuimian.png">https://ailabsaicloudservice.alicdn.com/hotel/icon/changjingmoshi/shuimian.png</a></p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <strong>example:</strong>
         * <p>73</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <strong>example:</strong>
         * <p>external</p>
         */
        @NameInMap("SceneSource")
        public String sceneSource;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SceneState")
        public Integer sceneState;

        /**
         * <strong>example:</strong>
         * <p>common</p>
         */
        @NameInMap("SceneType")
        public String sceneType;

        @NameInMap("TemplateInfoDTOList")
        public java.util.List<QuerySceneListResponseBodyResultsTemplateInfoDTOList> templateInfoDTOList;

        @NameInMap("UnavailableReason")
        public String unavailableReason;

        public static QuerySceneListResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            QuerySceneListResponseBodyResults self = new QuerySceneListResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public QuerySceneListResponseBodyResults setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QuerySceneListResponseBodyResults setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public QuerySceneListResponseBodyResults setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QuerySceneListResponseBodyResults setSceneSource(String sceneSource) {
            this.sceneSource = sceneSource;
            return this;
        }
        public String getSceneSource() {
            return this.sceneSource;
        }

        public QuerySceneListResponseBodyResults setSceneState(Integer sceneState) {
            this.sceneState = sceneState;
            return this;
        }
        public Integer getSceneState() {
            return this.sceneState;
        }

        public QuerySceneListResponseBodyResults setSceneType(String sceneType) {
            this.sceneType = sceneType;
            return this;
        }
        public String getSceneType() {
            return this.sceneType;
        }

        public QuerySceneListResponseBodyResults setTemplateInfoDTOList(java.util.List<QuerySceneListResponseBodyResultsTemplateInfoDTOList> templateInfoDTOList) {
            this.templateInfoDTOList = templateInfoDTOList;
            return this;
        }
        public java.util.List<QuerySceneListResponseBodyResultsTemplateInfoDTOList> getTemplateInfoDTOList() {
            return this.templateInfoDTOList;
        }

        public QuerySceneListResponseBodyResults setUnavailableReason(String unavailableReason) {
            this.unavailableReason = unavailableReason;
            return this;
        }
        public String getUnavailableReason() {
            return this.unavailableReason;
        }

    }

}
