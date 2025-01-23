// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgSceneQuerySceneListByNameResponseBody extends TeaModel {
    /**
     * <p>The data entries returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DsgSceneQuerySceneListByNameResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>1029030003</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>param error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>102400001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The ID of the EMR cluster. This parameter is returned only when the data scope that takes effect in the data masking scenario is an EMR compute engine.</p>
         * 
         * <strong>example:</strong>
         * <p>c-1234</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The type of the compute engine. Valid values:</p>
         * <ul>
         * <li>ODPS: ODPS.ODPS</li>
         * <li>HOLO: HOLO.POSTGRES</li>
         * <li>EMR: EMR</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ODPS.ODPS</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The name of the compute engine.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_project</p>
         */
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
        /**
         * <p>The information about multiple levels of data masking scenarios.</p>
         */
        @NameInMap("Children")
        public java.util.List<?> children;

        /**
         * <p>The description of the data masking scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>Test scenarios</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The ID of the data masking scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The information about the compute engine for which the data masking scenario takes effect.</p>
         */
        @NameInMap("Projects")
        public java.util.List<DsgSceneQuerySceneListByNameResponseBodyDataProjects> projects;

        /**
         * <p>The code of the level-1 data masking scenario. Valid values:</p>
         * <ul>
         * <li>dataworks_display_desense_code: masking of displayed data in DataStudio and Data Map</li>
         * <li>maxcompute_desense_code: data masking at the MaxCompute compute engine layer</li>
         * <li>maxcompute_new_desense_code: data masking at the MaxCompute compute engine layer (new)</li>
         * <li>hologres_display_desense_code: data masking at the Hologres compute engine layer</li>
         * <li>dataworks_data_integration_desense_code: static data masking in Data Integration</li>
         * <li>dataworks_analysis_desense_code: masking of displayed data in DataAnalysis</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dataworks_display_desense_code</p>
         */
        @NameInMap("SceneCode")
        public String sceneCode;

        /**
         * <p>The level of the data masking scenario. Valid values:</p>
         * <ul>
         * <li>0: level-1 data masking scenario</li>
         * <li>1: level-2 data masking scenario</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SceneLevel")
        public Integer sceneLevel;

        /**
         * <p>The name of the data masking scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>test_scene</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The list of user groups in the data masking scenario. Separate user groups with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>user1,user2</p>
         */
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
