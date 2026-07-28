// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class DBVersionDetail extends TeaModel {
    /**
     * <p>The specifications supported by the version.</p>
     */
    @NameInMap("specs")
    public java.util.List<DBVersionDetailSpecs> specs;

    /**
     * <p>The status of the version.</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The version number.</p>
     */
    @NameInMap("version")
    public String version;

    public static DBVersionDetail build(java.util.Map<String, ?> map) throws Exception {
        DBVersionDetail self = new DBVersionDetail();
        return TeaModel.build(map, self);
    }

    public DBVersionDetail setSpecs(java.util.List<DBVersionDetailSpecs> specs) {
        this.specs = specs;
        return this;
    }
    public java.util.List<DBVersionDetailSpecs> getSpecs() {
        return this.specs;
    }

    public DBVersionDetail setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DBVersionDetail setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class DBVersionDetailSpecsComponentSpecs extends TeaModel {
        /**
         * <p>The default number of replicas for the component.</p>
         */
        @NameInMap("defaultReplicas")
        public Integer defaultReplicas;

        /**
         * <p>The maximum number of replicas for the component.</p>
         */
        @NameInMap("maxReplicas")
        public Integer maxReplicas;

        /**
         * <p>The minimum number of replicas for the component.</p>
         */
        @NameInMap("minReplicas")
        public Integer minReplicas;

        /**
         * <p>The name of the component.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The available specifications for the component.</p>
         */
        @NameInMap("specs")
        public java.util.List<String> specs;

        /**
         * <p>The step size for scaling the number of replicas.</p>
         */
        @NameInMap("step")
        public Integer step;

        /**
         * <p>The type of the component.</p>
         */
        @NameInMap("type")
        public String type;

        public static DBVersionDetailSpecsComponentSpecs build(java.util.Map<String, ?> map) throws Exception {
            DBVersionDetailSpecsComponentSpecs self = new DBVersionDetailSpecsComponentSpecs();
            return TeaModel.build(map, self);
        }

        public DBVersionDetailSpecsComponentSpecs setDefaultReplicas(Integer defaultReplicas) {
            this.defaultReplicas = defaultReplicas;
            return this;
        }
        public Integer getDefaultReplicas() {
            return this.defaultReplicas;
        }

        public DBVersionDetailSpecsComponentSpecs setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        public DBVersionDetailSpecsComponentSpecs setMinReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        public DBVersionDetailSpecsComponentSpecs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DBVersionDetailSpecsComponentSpecs setSpecs(java.util.List<String> specs) {
            this.specs = specs;
            return this;
        }
        public java.util.List<String> getSpecs() {
            return this.specs;
        }

        public DBVersionDetailSpecsComponentSpecs setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

        public DBVersionDetailSpecsComponentSpecs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DBVersionDetailSpecs extends TeaModel {
        /**
         * <p>The component specifications.</p>
         */
        @NameInMap("componentSpecs")
        public java.util.List<DBVersionDetailSpecsComponentSpecs> componentSpecs;

        /**
         * <p>Indicates whether the high availability (HA) edition is supported.</p>
         */
        @NameInMap("isHA")
        public Boolean isHA;

        /**
         * <p>Indicates whether the Standalone edition is supported.</p>
         */
        @NameInMap("isStandalone")
        public Boolean isStandalone;

        /**
         * <p>Indicates whether the Standalone Pro edition is supported.</p>
         */
        @NameInMap("isStandalonePro")
        public Boolean isStandalonePro;

        /**
         * <p>The zone mode of the specification.</p>
         */
        @NameInMap("zoneMode")
        public String zoneMode;

        public static DBVersionDetailSpecs build(java.util.Map<String, ?> map) throws Exception {
            DBVersionDetailSpecs self = new DBVersionDetailSpecs();
            return TeaModel.build(map, self);
        }

        public DBVersionDetailSpecs setComponentSpecs(java.util.List<DBVersionDetailSpecsComponentSpecs> componentSpecs) {
            this.componentSpecs = componentSpecs;
            return this;
        }
        public java.util.List<DBVersionDetailSpecsComponentSpecs> getComponentSpecs() {
            return this.componentSpecs;
        }

        public DBVersionDetailSpecs setIsHA(Boolean isHA) {
            this.isHA = isHA;
            return this;
        }
        public Boolean getIsHA() {
            return this.isHA;
        }

        public DBVersionDetailSpecs setIsStandalone(Boolean isStandalone) {
            this.isStandalone = isStandalone;
            return this;
        }
        public Boolean getIsStandalone() {
            return this.isStandalone;
        }

        public DBVersionDetailSpecs setIsStandalonePro(Boolean isStandalonePro) {
            this.isStandalonePro = isStandalonePro;
            return this;
        }
        public Boolean getIsStandalonePro() {
            return this.isStandalonePro;
        }

        public DBVersionDetailSpecs setZoneMode(String zoneMode) {
            this.zoneMode = zoneMode;
            return this;
        }
        public String getZoneMode() {
            return this.zoneMode;
        }

    }

}
