// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QuerySceneListResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<QuerySceneListResponseBodyResults> results;

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

        @NameInMap("Id")
        public Long id;

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
        @NameInMap("Icon")
        public String icon;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("SceneSource")
        public String sceneSource;

        @NameInMap("SceneState")
        public Integer sceneState;

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
