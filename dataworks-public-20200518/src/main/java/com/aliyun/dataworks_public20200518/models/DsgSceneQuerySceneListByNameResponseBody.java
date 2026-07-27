// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgSceneQuerySceneListByNameResponseBody extends TeaModel {
    /**
     * <p>The list of data masking scenarios.</p>
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
     * <p>The ID of the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>102400001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The request was successful.</p>
     * </li>
     * <li><p><code>false</code>: The request failed.</p>
     * </li>
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
         * <p>The ID of the E-MapReduce (EMR) cluster. This parameter is returned only if the <code>DbType</code> is <code>EMR</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>c-123456</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The engine type. Valid values:</p>
         * <ul>
         * <li><p>MaxCompute: <code>ODPS.ODPS</code></p>
         * </li>
         * <li><p>Hologres: <code>HOLO.POSTGRES</code></p>
         * </li>
         * <li><p>E-MapReduce (EMR): <code>EMR</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ODPS.ODPS</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The name of the engine instance.</p>
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
         * <p>The nested data masking scenarios.</p>
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
         * <p>The engine instances to which the data masking scenario applies.</p>
         */
        @NameInMap("Projects")
        public java.util.List<DsgSceneQuerySceneListByNameResponseBodyDataProjects> projects;

        /**
         * <p>The code for the level-1 scenario. Valid values:</p>
         * <ul>
         * <li><p>Data masking in Data Map and DataStudio: <code>dataworks_display_desense_code</code></p>
         * </li>
         * <li><p>Data masking at the MaxCompute engine layer: <code>maxcompute_desense_code</code></p>
         * </li>
         * <li><p>Data masking at the MaxCompute engine layer (new): <code>maxcompute_new_desense_code</code></p>
         * </li>
         * <li><p>Data masking at the Hologres engine layer: <code>hologres_display_desense_code</code></p>
         * </li>
         * <li><p>Static data masking in Data Integration: <code>dataworks_data_integration_desense_code</code></p>
         * </li>
         * <li><p>Data masking in Data Analysis: <code>dataworks_analysis_desense_code</code></p>
         * </li>
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
         * <li><p><code>0</code>: level-1 scenario</p>
         * </li>
         * <li><p><code>1</code>: level-2 scenario</p>
         * </li>
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
         * <p>The user groups to which the data masking scenario applies. Multiple user group names are separated by a comma (,).</p>
         * 
         * <strong>example:</strong>
         * <p>user1,user2</p>
         */
        @NameInMap("UserGroups")
        public String userGroups;

        @NameInMap("scenceDbType")
        public String scenceDbType;

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

        public DsgSceneQuerySceneListByNameResponseBodyData setScenceDbType(String scenceDbType) {
            this.scenceDbType = scenceDbType;
            return this;
        }
        public String getScenceDbType() {
            return this.scenceDbType;
        }

    }

}
