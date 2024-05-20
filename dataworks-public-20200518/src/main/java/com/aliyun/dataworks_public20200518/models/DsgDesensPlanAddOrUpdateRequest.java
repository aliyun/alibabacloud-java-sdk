// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgDesensPlanAddOrUpdateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesensRules")
    public java.util.List<DsgDesensPlanAddOrUpdateRequestDesensRules> desensRules;

    public static DsgDesensPlanAddOrUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgDesensPlanAddOrUpdateRequest self = new DsgDesensPlanAddOrUpdateRequest();
        return TeaModel.build(map, self);
    }

    public DsgDesensPlanAddOrUpdateRequest setDesensRules(java.util.List<DsgDesensPlanAddOrUpdateRequestDesensRules> desensRules) {
        this.desensRules = desensRules;
        return this;
    }
    public java.util.List<DsgDesensPlanAddOrUpdateRequestDesensRules> getDesensRules() {
        return this.desensRules;
    }

    public static class DsgDesensPlanAddOrUpdateRequestDesensRulesDesensPlan extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("DesensPlanType")
        public String desensPlanType;

        @NameInMap("ExtParam")
        public java.util.Map<String, ?> extParam;

        public static DsgDesensPlanAddOrUpdateRequestDesensRulesDesensPlan build(java.util.Map<String, ?> map) throws Exception {
            DsgDesensPlanAddOrUpdateRequestDesensRulesDesensPlan self = new DsgDesensPlanAddOrUpdateRequestDesensRulesDesensPlan();
            return TeaModel.build(map, self);
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRulesDesensPlan setDesensPlanType(String desensPlanType) {
            this.desensPlanType = desensPlanType;
            return this;
        }
        public String getDesensPlanType() {
            return this.desensPlanType;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRulesDesensPlan setExtParam(java.util.Map<String, ?> extParam) {
            this.extParam = extParam;
            return this;
        }
        public java.util.Map<String, ?> getExtParam() {
            return this.extParam;
        }

    }

    public static class DsgDesensPlanAddOrUpdateRequestDesensRules extends TeaModel {
        @NameInMap("CheckWatermark")
        public Boolean checkWatermark;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("DesensPlan")
        public DsgDesensPlanAddOrUpdateRequestDesensRulesDesensPlan desensPlan;

        @NameInMap("Id")
        public Integer id;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("SceneIds")
        public java.util.List<Integer> sceneIds;

        @NameInMap("Status")
        public Integer status;

        public static DsgDesensPlanAddOrUpdateRequestDesensRules build(java.util.Map<String, ?> map) throws Exception {
            DsgDesensPlanAddOrUpdateRequestDesensRules self = new DsgDesensPlanAddOrUpdateRequestDesensRules();
            return TeaModel.build(map, self);
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRules setCheckWatermark(Boolean checkWatermark) {
            this.checkWatermark = checkWatermark;
            return this;
        }
        public Boolean getCheckWatermark() {
            return this.checkWatermark;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRules setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRules setDesensPlan(DsgDesensPlanAddOrUpdateRequestDesensRulesDesensPlan desensPlan) {
            this.desensPlan = desensPlan;
            return this;
        }
        public DsgDesensPlanAddOrUpdateRequestDesensRulesDesensPlan getDesensPlan() {
            return this.desensPlan;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRules setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRules setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRules setSceneIds(java.util.List<Integer> sceneIds) {
            this.sceneIds = sceneIds;
            return this;
        }
        public java.util.List<Integer> getSceneIds() {
            return this.sceneIds;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRules setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
