// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class RankingSystemHistory extends TeaModel {
    @NameInMap("Meta")
    public RankingSystemHistoryMeta meta;

    /**
     * <strong>example:</strong>
     * <p>servicea</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>8AC865AF-37D6-42ED-AA9A-B60D8ECDF640</p>
     */
    @NameInMap("OperateId")
    public String operateId;

    /**
     * <strong>example:</strong>
     * <p>2021-12-06T03:01:41.217Z</p>
     */
    @NameInMap("OperateTime")
    public String operateTime;

    /**
     * <strong>example:</strong>
     * <p>CONF_CHANGE</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    public static RankingSystemHistory build(java.util.Map<String, ?> map) throws Exception {
        RankingSystemHistory self = new RankingSystemHistory();
        return TeaModel.build(map, self);
    }

    public RankingSystemHistory setMeta(RankingSystemHistoryMeta meta) {
        this.meta = meta;
        return this;
    }
    public RankingSystemHistoryMeta getMeta() {
        return this.meta;
    }

    public RankingSystemHistory setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RankingSystemHistory setOperateId(String operateId) {
        this.operateId = operateId;
        return this;
    }
    public String getOperateId() {
        return this.operateId;
    }

    public RankingSystemHistory setOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public String getOperateTime() {
        return this.operateTime;
    }

    public RankingSystemHistory setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public static class RankingSystemHistoryMetaPredictEngine extends TeaModel {
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

        public static RankingSystemHistoryMetaPredictEngine build(java.util.Map<String, ?> map) throws Exception {
            RankingSystemHistoryMetaPredictEngine self = new RankingSystemHistoryMetaPredictEngine();
            return TeaModel.build(map, self);
        }

        public RankingSystemHistoryMetaPredictEngine setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public RankingSystemHistoryMetaPredictEngine setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class RankingSystemHistoryMeta extends TeaModel {
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

        /**
         * <strong>example:</strong>
         * <p>排序模型A</p>
         */
        @NameInMap("ModelTemplateName")
        public String modelTemplateName;

        @NameInMap("PredictEngine")
        public RankingSystemHistoryMetaPredictEngine predictEngine;

        /**
         * <strong>example:</strong>
         * <p>EAS</p>
         */
        @NameInMap("PredictEngineType")
        public String predictEngineType;

        /**
         * <strong>example:</strong>
         * <p>aaaa</p>
         */
        @NameInMap("PreviousOperateId")
        public String previousOperateId;

        public static RankingSystemHistoryMeta build(java.util.Map<String, ?> map) throws Exception {
            RankingSystemHistoryMeta self = new RankingSystemHistoryMeta();
            return TeaModel.build(map, self);
        }

        public RankingSystemHistoryMeta setAutoDeploy(Boolean autoDeploy) {
            this.autoDeploy = autoDeploy;
            return this;
        }
        public Boolean getAutoDeploy() {
            return this.autoDeploy;
        }

        public RankingSystemHistoryMeta setAutoDeployAuc(String autoDeployAuc) {
            this.autoDeployAuc = autoDeployAuc;
            return this;
        }
        public String getAutoDeployAuc() {
            return this.autoDeployAuc;
        }

        public RankingSystemHistoryMeta setConf(String conf) {
            this.conf = conf;
            return this;
        }
        public String getConf() {
            return this.conf;
        }

        public RankingSystemHistoryMeta setModelTemplateName(String modelTemplateName) {
            this.modelTemplateName = modelTemplateName;
            return this;
        }
        public String getModelTemplateName() {
            return this.modelTemplateName;
        }

        public RankingSystemHistoryMeta setPredictEngine(RankingSystemHistoryMetaPredictEngine predictEngine) {
            this.predictEngine = predictEngine;
            return this;
        }
        public RankingSystemHistoryMetaPredictEngine getPredictEngine() {
            return this.predictEngine;
        }

        public RankingSystemHistoryMeta setPredictEngineType(String predictEngineType) {
            this.predictEngineType = predictEngineType;
            return this;
        }
        public String getPredictEngineType() {
            return this.predictEngineType;
        }

        public RankingSystemHistoryMeta setPreviousOperateId(String previousOperateId) {
            this.previousOperateId = previousOperateId;
            return this;
        }
        public String getPreviousOperateId() {
            return this.previousOperateId;
        }

    }

}
