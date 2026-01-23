// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateSecurityClassifyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateSecurityClassifyRequestUpdateCommand updateCommand;

    public static UpdateSecurityClassifyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityClassifyRequest self = new UpdateSecurityClassifyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityClassifyRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateSecurityClassifyRequest setUpdateCommand(UpdateSecurityClassifyRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateSecurityClassifyRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionListOptionList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionListOptionList build(java.util.Map<String, ?> map) throws Exception {
            UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionListOptionList self = new UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionListOptionList();
            return TeaModel.build(map, self);
        }

        public UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionListOptionList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionListOptionList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("Operate")
        public String operate;

        @NameInMap("OptionList")
        public java.util.List<UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionListOptionList> optionList;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <strong>example:</strong>
         * <p>TABLE_NAME</p>
         */
        @NameInMap("Property")
        public String property;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EXPRESSION</p>
         */
        @NameInMap("Relation")
        public String relation;

        @NameInMap("ValueList")
        public java.util.List<String> valueList;

        public static UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionList build(java.util.Map<String, ?> map) throws Exception {
            UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionList self = new UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionList();
            return TeaModel.build(map, self);
        }

        public UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionList setOperate(String operate) {
            this.operate = operate;
            return this;
        }
        public String getOperate() {
            return this.operate;
        }

        public UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionList setOptionList(java.util.List<UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionListOptionList> optionList) {
            this.optionList = optionList;
            return this;
        }
        public java.util.List<UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionListOptionList> getOptionList() {
            return this.optionList;
        }

        public UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionList setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionList setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionList setValueList(java.util.List<String> valueList) {
            this.valueList = valueList;
            return this;
        }
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

    }

    public static class UpdateSecurityClassifyRequestUpdateCommand extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Abbreviation")
        public String abbreviation;

        @NameInMap("AdvancedConditionList")
        public java.util.List<UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionList> advancedConditionList;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("FeatureNameList")
        public java.util.List<String> featureNameList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>L2</p>
         */
        @NameInMap("LevelName")
        public String levelName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>/a/b/</p>
         */
        @NameInMap("ParentPath")
        public String parentPath;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("Status")
        public String status;

        public static UpdateSecurityClassifyRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateSecurityClassifyRequestUpdateCommand self = new UpdateSecurityClassifyRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateSecurityClassifyRequestUpdateCommand setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
            return this;
        }
        public String getAbbreviation() {
            return this.abbreviation;
        }

        public UpdateSecurityClassifyRequestUpdateCommand setAdvancedConditionList(java.util.List<UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionList> advancedConditionList) {
            this.advancedConditionList = advancedConditionList;
            return this;
        }
        public java.util.List<UpdateSecurityClassifyRequestUpdateCommandAdvancedConditionList> getAdvancedConditionList() {
            return this.advancedConditionList;
        }

        public UpdateSecurityClassifyRequestUpdateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateSecurityClassifyRequestUpdateCommand setFeatureNameList(java.util.List<String> featureNameList) {
            this.featureNameList = featureNameList;
            return this;
        }
        public java.util.List<String> getFeatureNameList() {
            return this.featureNameList;
        }

        public UpdateSecurityClassifyRequestUpdateCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateSecurityClassifyRequestUpdateCommand setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

        public UpdateSecurityClassifyRequestUpdateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateSecurityClassifyRequestUpdateCommand setParentPath(String parentPath) {
            this.parentPath = parentPath;
            return this;
        }
        public String getParentPath() {
            return this.parentPath;
        }

        public UpdateSecurityClassifyRequestUpdateCommand setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateSecurityClassifyRequestUpdateCommand setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
