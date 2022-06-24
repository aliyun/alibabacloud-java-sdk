// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DataActivitiesRunParamArgumentsArgsComponentsValue extends TeaModel {
    @NameInMap("type")
    public String type;

    @NameInMap("required")
    public Boolean required;

    @NameInMap("defaultValue")
    public String defaultValue;

    @NameInMap("unit")
    public String unit;

    @NameInMap("requestUrl")
    public String requestUrl;

    @NameInMap("opLevel")
    public Integer opLevel;

    @NameInMap("plainText")
    public String plainText;

    @NameInMap("cipherText")
    public String cipherText;

    @NameInMap("linkage")
    public DataActivitiesRunParamArgumentsArgsComponentsValueLinkage linkage;

    @NameInMap("constraint")
    public DataActivitiesRunParamArgumentsArgsComponentsValueConstraint constraint;

    @NameInMap("options")
    public java.util.List<java.util.Map<String, ?>> options;

    public static DataActivitiesRunParamArgumentsArgsComponentsValue build(java.util.Map<String, ?> map) throws Exception {
        DataActivitiesRunParamArgumentsArgsComponentsValue self = new DataActivitiesRunParamArgumentsArgsComponentsValue();
        return TeaModel.build(map, self);
    }

    public DataActivitiesRunParamArgumentsArgsComponentsValue setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DataActivitiesRunParamArgumentsArgsComponentsValue setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public DataActivitiesRunParamArgumentsArgsComponentsValue setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public DataActivitiesRunParamArgumentsArgsComponentsValue setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public DataActivitiesRunParamArgumentsArgsComponentsValue setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
        return this;
    }
    public String getRequestUrl() {
        return this.requestUrl;
    }

    public DataActivitiesRunParamArgumentsArgsComponentsValue setOpLevel(Integer opLevel) {
        this.opLevel = opLevel;
        return this;
    }
    public Integer getOpLevel() {
        return this.opLevel;
    }

    public DataActivitiesRunParamArgumentsArgsComponentsValue setPlainText(String plainText) {
        this.plainText = plainText;
        return this;
    }
    public String getPlainText() {
        return this.plainText;
    }

    public DataActivitiesRunParamArgumentsArgsComponentsValue setCipherText(String cipherText) {
        this.cipherText = cipherText;
        return this;
    }
    public String getCipherText() {
        return this.cipherText;
    }

    public DataActivitiesRunParamArgumentsArgsComponentsValue setLinkage(DataActivitiesRunParamArgumentsArgsComponentsValueLinkage linkage) {
        this.linkage = linkage;
        return this;
    }
    public DataActivitiesRunParamArgumentsArgsComponentsValueLinkage getLinkage() {
        return this.linkage;
    }

    public DataActivitiesRunParamArgumentsArgsComponentsValue setConstraint(DataActivitiesRunParamArgumentsArgsComponentsValueConstraint constraint) {
        this.constraint = constraint;
        return this;
    }
    public DataActivitiesRunParamArgumentsArgsComponentsValueConstraint getConstraint() {
        return this.constraint;
    }

    public DataActivitiesRunParamArgumentsArgsComponentsValue setOptions(java.util.List<java.util.Map<String, ?>> options) {
        this.options = options;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getOptions() {
        return this.options;
    }

    public static class DataActivitiesRunParamArgumentsArgsComponentsValueLinkage extends TeaModel {
        @NameInMap("defaultState")
        public Boolean defaultState;

        @NameInMap("depends")
        public String depends;

        @NameInMap("condition")
        public String condition;

        public static DataActivitiesRunParamArgumentsArgsComponentsValueLinkage build(java.util.Map<String, ?> map) throws Exception {
            DataActivitiesRunParamArgumentsArgsComponentsValueLinkage self = new DataActivitiesRunParamArgumentsArgsComponentsValueLinkage();
            return TeaModel.build(map, self);
        }

        public DataActivitiesRunParamArgumentsArgsComponentsValueLinkage setDefaultState(Boolean defaultState) {
            this.defaultState = defaultState;
            return this;
        }
        public Boolean getDefaultState() {
            return this.defaultState;
        }

        public DataActivitiesRunParamArgumentsArgsComponentsValueLinkage setDepends(String depends) {
            this.depends = depends;
            return this;
        }
        public String getDepends() {
            return this.depends;
        }

        public DataActivitiesRunParamArgumentsArgsComponentsValueLinkage setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

    }

    public static class DataActivitiesRunParamArgumentsArgsComponentsValueConstraint extends TeaModel {
        @NameInMap("range")
        public java.util.List<String> range;

        @NameInMap("checker")
        public String checker;

        @NameInMap("checkerTemplate")
        public String checkerTemplate;

        public static DataActivitiesRunParamArgumentsArgsComponentsValueConstraint build(java.util.Map<String, ?> map) throws Exception {
            DataActivitiesRunParamArgumentsArgsComponentsValueConstraint self = new DataActivitiesRunParamArgumentsArgsComponentsValueConstraint();
            return TeaModel.build(map, self);
        }

        public DataActivitiesRunParamArgumentsArgsComponentsValueConstraint setRange(java.util.List<String> range) {
            this.range = range;
            return this;
        }
        public java.util.List<String> getRange() {
            return this.range;
        }

        public DataActivitiesRunParamArgumentsArgsComponentsValueConstraint setChecker(String checker) {
            this.checker = checker;
            return this;
        }
        public String getChecker() {
            return this.checker;
        }

        public DataActivitiesRunParamArgumentsArgsComponentsValueConstraint setCheckerTemplate(String checkerTemplate) {
            this.checkerTemplate = checkerTemplate;
            return this;
        }
        public String getCheckerTemplate() {
            return this.checkerTemplate;
        }

    }

}
