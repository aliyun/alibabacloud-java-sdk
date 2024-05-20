// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgSceneQuerySceneListByNameResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DsgSceneQuerySceneListByNameResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DsgSceneQuerySceneListByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DsgSceneQuerySceneListByNameResponseBody self = new DsgSceneQuerySceneListByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public DsgSceneQuerySceneListByNameResponseBody setData(java.util.List<DsgSceneQuerySceneListByNameResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DsgSceneQuerySceneListByNameResponseBodyData> getData() {
        return this.data;
    }

    public DsgSceneQuerySceneListByNameResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DsgSceneQuerySceneListByNameResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DsgSceneQuerySceneListByNameResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DsgSceneQuerySceneListByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DsgSceneQuerySceneListByNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DsgSceneQuerySceneListByNameResponseBodyDataProjects extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("ProjectName")
        public String projectName;

        public static DsgSceneQuerySceneListByNameResponseBodyDataProjects build(java.util.Map<String, ?> map) throws Exception {
            DsgSceneQuerySceneListByNameResponseBodyDataProjects self = new DsgSceneQuerySceneListByNameResponseBodyDataProjects();
            return TeaModel.build(map, self);
        }

        public DsgSceneQuerySceneListByNameResponseBodyDataProjects setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DsgSceneQuerySceneListByNameResponseBodyDataProjects setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DsgSceneQuerySceneListByNameResponseBodyDataProjects setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class DsgSceneQuerySceneListByNameResponseBodyData extends TeaModel {
        @NameInMap("Children")
        public java.util.List<?> children;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Projects")
        public java.util.List<DsgSceneQuerySceneListByNameResponseBodyDataProjects> projects;

        @NameInMap("SceneCode")
        public String sceneCode;

        @NameInMap("SceneLevel")
        public Integer sceneLevel;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("UserGroups")
        public String userGroups;

        public static DsgSceneQuerySceneListByNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DsgSceneQuerySceneListByNameResponseBodyData self = new DsgSceneQuerySceneListByNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DsgSceneQuerySceneListByNameResponseBodyData setChildren(java.util.List<?> children) {
            this.children = children;
            return this;
        }
        public java.util.List<?> getChildren() {
            return this.children;
        }

        public DsgSceneQuerySceneListByNameResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DsgSceneQuerySceneListByNameResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DsgSceneQuerySceneListByNameResponseBodyData setProjects(java.util.List<DsgSceneQuerySceneListByNameResponseBodyDataProjects> projects) {
            this.projects = projects;
            return this;
        }
        public java.util.List<DsgSceneQuerySceneListByNameResponseBodyDataProjects> getProjects() {
            return this.projects;
        }

        public DsgSceneQuerySceneListByNameResponseBodyData setSceneCode(String sceneCode) {
            this.sceneCode = sceneCode;
            return this;
        }
        public String getSceneCode() {
            return this.sceneCode;
        }

        public DsgSceneQuerySceneListByNameResponseBodyData setSceneLevel(Integer sceneLevel) {
            this.sceneLevel = sceneLevel;
            return this;
        }
        public Integer getSceneLevel() {
            return this.sceneLevel;
        }

        public DsgSceneQuerySceneListByNameResponseBodyData setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public DsgSceneQuerySceneListByNameResponseBodyData setUserGroups(String userGroups) {
            this.userGroups = userGroups;
            return this;
        }
        public String getUserGroups() {
            return this.userGroups;
        }

    }

}
