// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class DBVersionDetail extends TeaModel {
    @NameInMap("specs")
    public java.util.List<DBVersionDetailSpecs> specs;

    @NameInMap("status")
    public String status;

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
        @NameInMap("defaultReplicas")
        public Integer defaultReplicas;

        @NameInMap("maxReplicas")
        public Integer maxReplicas;

        @NameInMap("minReplicas")
        public Integer minReplicas;

        @NameInMap("name")
        public String name;

        @NameInMap("specs")
        public java.util.List<String> specs;

        @NameInMap("step")
        public Integer step;

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
        @NameInMap("componentSpecs")
        public java.util.List<DBVersionDetailSpecsComponentSpecs> componentSpecs;

        @NameInMap("isHA")
        public Boolean isHA;

        @NameInMap("isStandalone")
        public Boolean isStandalone;

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

        public DBVersionDetailSpecs setZoneMode(String zoneMode) {
            this.zoneMode = zoneMode;
            return this;
        }
        public String getZoneMode() {
            return this.zoneMode;
        }

    }

}
