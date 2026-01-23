// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateSecurityClassifyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateSecurityClassifyRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateSecurityClassifyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityClassifyRequest self = new CreateSecurityClassifyRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecurityClassifyRequest setCreateCommand(CreateSecurityClassifyRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateSecurityClassifyRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateSecurityClassifyRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateSecurityClassifyRequestCreateCommandAdvancedConditionListOptionList extends TeaModel {
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

        public static CreateSecurityClassifyRequestCreateCommandAdvancedConditionListOptionList build(java.util.Map<String, ?> map) throws Exception {
            CreateSecurityClassifyRequestCreateCommandAdvancedConditionListOptionList self = new CreateSecurityClassifyRequestCreateCommandAdvancedConditionListOptionList();
            return TeaModel.build(map, self);
        }

        public CreateSecurityClassifyRequestCreateCommandAdvancedConditionListOptionList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateSecurityClassifyRequestCreateCommandAdvancedConditionListOptionList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateSecurityClassifyRequestCreateCommandAdvancedConditionList extends TeaModel {
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
        public java.util.List<CreateSecurityClassifyRequestCreateCommandAdvancedConditionListOptionList> optionList;

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

        public static CreateSecurityClassifyRequestCreateCommandAdvancedConditionList build(java.util.Map<String, ?> map) throws Exception {
            CreateSecurityClassifyRequestCreateCommandAdvancedConditionList self = new CreateSecurityClassifyRequestCreateCommandAdvancedConditionList();
            return TeaModel.build(map, self);
        }

        public CreateSecurityClassifyRequestCreateCommandAdvancedConditionList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateSecurityClassifyRequestCreateCommandAdvancedConditionList setOperate(String operate) {
            this.operate = operate;
            return this;
        }
        public String getOperate() {
            return this.operate;
        }

        public CreateSecurityClassifyRequestCreateCommandAdvancedConditionList setOptionList(java.util.List<CreateSecurityClassifyRequestCreateCommandAdvancedConditionListOptionList> optionList) {
            this.optionList = optionList;
            return this;
        }
        public java.util.List<CreateSecurityClassifyRequestCreateCommandAdvancedConditionListOptionList> getOptionList() {
            return this.optionList;
        }

        public CreateSecurityClassifyRequestCreateCommandAdvancedConditionList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public CreateSecurityClassifyRequestCreateCommandAdvancedConditionList setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public CreateSecurityClassifyRequestCreateCommandAdvancedConditionList setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public CreateSecurityClassifyRequestCreateCommandAdvancedConditionList setValueList(java.util.List<String> valueList) {
            this.valueList = valueList;
            return this;
        }
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

    }

    public static class CreateSecurityClassifyRequestCreateCommand extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Abbreviation")
        public String abbreviation;

        @NameInMap("AdvancedConditionList")
        public java.util.List<CreateSecurityClassifyRequestCreateCommandAdvancedConditionList> advancedConditionList;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("FeatureNameList")
        public java.util.List<String> featureNameList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>L2</p>
         */
        @NameInMap("LevelName")
        public String levelName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>/</p>
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

        public static CreateSecurityClassifyRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateSecurityClassifyRequestCreateCommand self = new CreateSecurityClassifyRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateSecurityClassifyRequestCreateCommand setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
            return this;
        }
        public String getAbbreviation() {
            return this.abbreviation;
        }

        public CreateSecurityClassifyRequestCreateCommand setAdvancedConditionList(java.util.List<CreateSecurityClassifyRequestCreateCommandAdvancedConditionList> advancedConditionList) {
            this.advancedConditionList = advancedConditionList;
            return this;
        }
        public java.util.List<CreateSecurityClassifyRequestCreateCommandAdvancedConditionList> getAdvancedConditionList() {
            return this.advancedConditionList;
        }

        public CreateSecurityClassifyRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateSecurityClassifyRequestCreateCommand setFeatureNameList(java.util.List<String> featureNameList) {
            this.featureNameList = featureNameList;
            return this;
        }
        public java.util.List<String> getFeatureNameList() {
            return this.featureNameList;
        }

        public CreateSecurityClassifyRequestCreateCommand setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

        public CreateSecurityClassifyRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSecurityClassifyRequestCreateCommand setParentPath(String parentPath) {
            this.parentPath = parentPath;
            return this;
        }
        public String getParentPath() {
            return this.parentPath;
        }

        public CreateSecurityClassifyRequestCreateCommand setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateSecurityClassifyRequestCreateCommand setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
