// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgSceneAddOrUpdateSceneRequest extends TeaModel {
    /**
     * <p>The information about the level-2 data masking scenario.</p>
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
        /**
         * <p>If the data masking scenario takes effect for an E-MapReduce (EMR) compute engine, enter the ID of an EMR cluster. This parameter is required only when you use an EMR compute engine.</p>
         * 
         * <strong>example:</strong>
         * <p>c-1234</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        /**
         * <p>The type of the compute engine for which the data masking scenario takes effect. Valid values:</p>
         * <ul>
         * <li>ODPS: ODPS.ODPS</li>
         * <li>HOLO: HOLO.POSTGRES</li>
         * <li>EMR: EMR</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ODPS.ODPS</p>
         */
        @NameInMap("dbType")
        public String dbType;

        /**
         * <p>The name of the compute engine instance for which the data masking scenario takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_project</p>
         */
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
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test scenarios</p>
         */
        @NameInMap("desc")
        public String desc;

        /**
         * <p>The ID of the level-2 data masking scenario.</p>
         * <ul>
         * <li>If you do not configure this parameter, the current operation is to add a level-2 data masking scenario.</li>
         * <li>If you configure this parameter, the current operation is to modify a level-2 data masking scenario. You can call the <a href="https://help.aliyun.com/document_detail/2786322.html">DsgSceneQuerySceneListByName</a> operation to query the ID of the level-2 data masking scenario.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The information about the compute engine for which the data masking scenario takes effect.</p>
         */
        @NameInMap("projects")
        public java.util.List<DsgSceneAddOrUpdateSceneRequestScenesProjects> projects;

        /**
         * <p>The code of the level-1 data masking scenario to which the level-2 data masking scenario belongs. Valid values:</p>
         * <ul>
         * <li>dataworks_display_desense_code: masking of displayed data in DataStudio and Data Map</li>
         * <li>maxcompute_desense_code: data masking at the MaxCompute compute engine layer</li>
         * <li>maxcompute_new_desense_code: data masking at the MaxCompute compute engine layer (new)</li>
         * <li>dataworks_analysis_desense_code: masking of displayed data in DataAnalysis</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks_display_desense_code</p>
         */
        @NameInMap("sceneCode")
        public String sceneCode;

        /**
         * <p>The name of the level-2 data masking scenario.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_scene</p>
         */
        @NameInMap("sceneName")
        public String sceneName;

        /**
         * <p>The information about the user group for which the data masking scenario takes effect.</p>
         */
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
