// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class RankingSystem extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NOT_APPLIED</p>
     */
    @NameInMap("ApplyStatus")
    public String applyStatus;

    /**
     * <strong>example:</strong>
     * <p>NOT_DEPLOYED</p>
     */
    @NameInMap("DeployStatus")
    public String deployStatus;

    @NameInMap("Meta")
    public RankingSystemMeta meta;

    /**
     * <strong>example:</strong>
     * <p>a-a-a</p>
     */
    @NameInMap("ModelTemplateId")
    public String modelTemplateId;

    /**
     * <strong>example:</strong>
     * <p>servicea</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("SceneIdList")
    public java.util.List<Long> sceneIdList;

    public static RankingSystem build(java.util.Map<String, ?> map) throws Exception {
        RankingSystem self = new RankingSystem();
        return TeaModel.build(map, self);
    }

    public RankingSystem setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
        return this;
    }
    public String getApplyStatus() {
        return this.applyStatus;
    }

    public RankingSystem setDeployStatus(String deployStatus) {
        this.deployStatus = deployStatus;
        return this;
    }
    public String getDeployStatus() {
        return this.deployStatus;
    }

    public RankingSystem setMeta(RankingSystemMeta meta) {
        this.meta = meta;
        return this;
    }
    public RankingSystemMeta getMeta() {
        return this.meta;
    }

    public RankingSystem setModelTemplateId(String modelTemplateId) {
        this.modelTemplateId = modelTemplateId;
        return this;
    }
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    public RankingSystem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RankingSystem setSceneIdList(java.util.List<Long> sceneIdList) {
        this.sceneIdList = sceneIdList;
        return this;
    }
    public java.util.List<Long> getSceneIdList() {
        return this.sceneIdList;
    }

    public static class RankingSystemMetaPredictEngine extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>eas-oljkkdrggxhx7eizjd</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        public static RankingSystemMetaPredictEngine build(java.util.Map<String, ?> map) throws Exception {
            RankingSystemMetaPredictEngine self = new RankingSystemMetaPredictEngine();
            return TeaModel.build(map, self);
        }

        public RankingSystemMetaPredictEngine setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public RankingSystemMetaPredictEngine setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public RankingSystemMetaPredictEngine setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class RankingSystemMeta extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoDeploy")
        public Boolean autoDeploy;

        /**
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("AutoDeployAuc")
        public String autoDeployAuc;

        @NameInMap("Conf")
        public String conf;

        @NameInMap("FailMsg")
        public String failMsg;

        /**
         * <strong>example:</strong>
         * <p>模型A_T1638964800000</p>
         */
        @NameInMap("ModelVersionName")
        public String modelVersionName;

        @NameInMap("PredictEngine")
        public RankingSystemMetaPredictEngine predictEngine;

        /**
         * <strong>example:</strong>
         * <p>EAS</p>
         */
        @NameInMap("PredictEngineType")
        public String predictEngineType;

        public static RankingSystemMeta build(java.util.Map<String, ?> map) throws Exception {
            RankingSystemMeta self = new RankingSystemMeta();
            return TeaModel.build(map, self);
        }

        public RankingSystemMeta setAutoDeploy(Boolean autoDeploy) {
            this.autoDeploy = autoDeploy;
            return this;
        }
        public Boolean getAutoDeploy() {
            return this.autoDeploy;
        }

        public RankingSystemMeta setAutoDeployAuc(String autoDeployAuc) {
            this.autoDeployAuc = autoDeployAuc;
            return this;
        }
        public String getAutoDeployAuc() {
            return this.autoDeployAuc;
        }

        public RankingSystemMeta setConf(String conf) {
            this.conf = conf;
            return this;
        }
        public String getConf() {
            return this.conf;
        }

        public RankingSystemMeta setFailMsg(String failMsg) {
            this.failMsg = failMsg;
            return this;
        }
        public String getFailMsg() {
            return this.failMsg;
        }

        public RankingSystemMeta setModelVersionName(String modelVersionName) {
            this.modelVersionName = modelVersionName;
            return this;
        }
        public String getModelVersionName() {
            return this.modelVersionName;
        }

        public RankingSystemMeta setPredictEngine(RankingSystemMetaPredictEngine predictEngine) {
            this.predictEngine = predictEngine;
            return this;
        }
        public RankingSystemMetaPredictEngine getPredictEngine() {
            return this.predictEngine;
        }

        public RankingSystemMeta setPredictEngineType(String predictEngineType) {
            this.predictEngineType = predictEngineType;
            return this;
        }
        public String getPredictEngineType() {
            return this.predictEngineType;
        }

    }

}
