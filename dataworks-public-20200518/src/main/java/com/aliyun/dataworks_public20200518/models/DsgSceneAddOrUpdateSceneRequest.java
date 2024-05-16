// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgSceneAddOrUpdateSceneRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("scenes")
    public java.util.List<DsgSceneAddOrUpdateSceneRequestScenes> scenes;

    public static DsgSceneAddOrUpdateSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgSceneAddOrUpdateSceneRequest self = new DsgSceneAddOrUpdateSceneRequest();
        return TeaModel.build(map, self);
    }

    public DsgSceneAddOrUpdateSceneRequest setScenes(java.util.List<DsgSceneAddOrUpdateSceneRequestScenes> scenes) {
        this.scenes = scenes;
        return this;
    }
    public java.util.List<DsgSceneAddOrUpdateSceneRequestScenes> getScenes() {
        return this.scenes;
    }

    public static class DsgSceneAddOrUpdateSceneRequestScenesProjects extends TeaModel {
        @NameInMap("clusterId")
        public String clusterId;

        @NameInMap("dbType")
        public String dbType;

        @NameInMap("projectName")
        public String projectName;

        public static DsgSceneAddOrUpdateSceneRequestScenesProjects build(java.util.Map<String, ?> map) throws Exception {
            DsgSceneAddOrUpdateSceneRequestScenesProjects self = new DsgSceneAddOrUpdateSceneRequestScenesProjects();
            return TeaModel.build(map, self);
        }

        public DsgSceneAddOrUpdateSceneRequestScenesProjects setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DsgSceneAddOrUpdateSceneRequestScenesProjects setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DsgSceneAddOrUpdateSceneRequestScenesProjects setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class DsgSceneAddOrUpdateSceneRequestScenes extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("id")
        public String id;

        @NameInMap("projects")
        public java.util.List<DsgSceneAddOrUpdateSceneRequestScenesProjects> projects;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("sceneCode")
        public String sceneCode;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("sceneName")
        public String sceneName;

        @NameInMap("userGroupIds")
        public java.util.List<Long> userGroupIds;

        public static DsgSceneAddOrUpdateSceneRequestScenes build(java.util.Map<String, ?> map) throws Exception {
            DsgSceneAddOrUpdateSceneRequestScenes self = new DsgSceneAddOrUpdateSceneRequestScenes();
            return TeaModel.build(map, self);
        }

        public DsgSceneAddOrUpdateSceneRequestScenes setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DsgSceneAddOrUpdateSceneRequestScenes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DsgSceneAddOrUpdateSceneRequestScenes setProjects(java.util.List<DsgSceneAddOrUpdateSceneRequestScenesProjects> projects) {
            this.projects = projects;
            return this;
        }
        public java.util.List<DsgSceneAddOrUpdateSceneRequestScenesProjects> getProjects() {
            return this.projects;
        }

        public DsgSceneAddOrUpdateSceneRequestScenes setSceneCode(String sceneCode) {
            this.sceneCode = sceneCode;
            return this;
        }
        public String getSceneCode() {
            return this.sceneCode;
        }

        public DsgSceneAddOrUpdateSceneRequestScenes setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public DsgSceneAddOrUpdateSceneRequestScenes setUserGroupIds(java.util.List<Long> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<Long> getUserGroupIds() {
            return this.userGroupIds;
        }

    }

}
