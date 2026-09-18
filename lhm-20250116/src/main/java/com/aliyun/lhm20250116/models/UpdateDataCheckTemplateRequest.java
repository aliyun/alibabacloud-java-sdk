// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class UpdateDataCheckTemplateRequest extends TeaModel {
    /**
     * <p>The list of metric check rules for basic data types. This field is required when checkType is set to 1 (metric comparison).</p>
     */
    @NameInMap("basicMetricRules")
    public java.util.List<UpdateDataCheckTemplateRequestBasicMetricRules> basicMetricRules;

    /**
     * <p>The check rule type. Valid values:</p>
     * <ul>
     * <li>0: data volume comparison.</li>
     * <li>1: metric comparison.</li>
     * <li>2: weak content comparison.</li>
     * <li>3: custom comparison.</li>
     * <li>4: full-text comparison.</li>
     * <li>5: null rate comparison.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("checkType")
    public Integer checkType;

    /**
     * <p>The list of complex data type metric check rules. Used when checkType is set to 1 (metric comparison).</p>
     */
    @NameInMap("complexMetricRules")
    public java.util.List<UpdateDataCheckTemplateRequestComplexMetricRules> complexMetricRules;

    /**
     * <p>The list of datasource engine relationships (datasource engines associated with the template).</p>
     */
    @NameInMap("dsEngineRels")
    public java.util.List<UpdateDataCheckTemplateRequestDsEngineRels> dsEngineRels;

    /**
     * <p>The full-text comparison rule. This parameter has a value when checkType is set to 4 (full-text comparison). Refer to the child fields for the field structure.</p>
     */
    @NameInMap("fulltextRule")
    public UpdateDataCheckTemplateRequestFulltextRule fulltextRule;

    /**
     * <p>The list of metric check rules. This parameter has a value when checkType is set to 1 (metric comparison).</p>
     */
    @NameInMap("metricRules")
    public java.util.List<UpdateDataCheckTemplateRequestMetricRules> metricRules;

    /**
     * <p>The list of null value rate check rules. This parameter has a value when checkType is set to 5 (null value rate comparison).</p>
     */
    @NameInMap("nullRules")
    public java.util.List<UpdateDataCheckTemplateRequestNullRules> nullRules;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues of this call.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The template description.</p>
     * 
     * <strong>example:</strong>
     * <p>Description of the data volume check template</p>
     */
    @NameInMap("templateDesc")
    public String templateDesc;

    /**
     * <p>The check template ID (logical foreign key) that uniquely identifies a check template.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("templateId")
    public String templateId;

    /**
     * <p>The check template name.</p>
     * 
     * <strong>example:</strong>
     * <p>Data volume check template</p>
     */
    @NameInMap("templateName")
    public String templateName;

    /**
     * <p>The weak content check rule. This parameter has a value and is required when checkType is set to 2 (weak content comparison). For the field structure, see the child field descriptions.</p>
     */
    @NameInMap("weakContentRule")
    public UpdateDataCheckTemplateRequestWeakContentRule weakContentRule;

    public static UpdateDataCheckTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataCheckTemplateRequest self = new UpdateDataCheckTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataCheckTemplateRequest setBasicMetricRules(java.util.List<UpdateDataCheckTemplateRequestBasicMetricRules> basicMetricRules) {
        this.basicMetricRules = basicMetricRules;
        return this;
    }
    public java.util.List<UpdateDataCheckTemplateRequestBasicMetricRules> getBasicMetricRules() {
        return this.basicMetricRules;
    }

    public UpdateDataCheckTemplateRequest setCheckType(Integer checkType) {
        this.checkType = checkType;
        return this;
    }
    public Integer getCheckType() {
        return this.checkType;
    }

    public UpdateDataCheckTemplateRequest setComplexMetricRules(java.util.List<UpdateDataCheckTemplateRequestComplexMetricRules> complexMetricRules) {
        this.complexMetricRules = complexMetricRules;
        return this;
    }
    public java.util.List<UpdateDataCheckTemplateRequestComplexMetricRules> getComplexMetricRules() {
        return this.complexMetricRules;
    }

    public UpdateDataCheckTemplateRequest setDsEngineRels(java.util.List<UpdateDataCheckTemplateRequestDsEngineRels> dsEngineRels) {
        this.dsEngineRels = dsEngineRels;
        return this;
    }
    public java.util.List<UpdateDataCheckTemplateRequestDsEngineRels> getDsEngineRels() {
        return this.dsEngineRels;
    }

    public UpdateDataCheckTemplateRequest setFulltextRule(UpdateDataCheckTemplateRequestFulltextRule fulltextRule) {
        this.fulltextRule = fulltextRule;
        return this;
    }
    public UpdateDataCheckTemplateRequestFulltextRule getFulltextRule() {
        return this.fulltextRule;
    }

    public UpdateDataCheckTemplateRequest setMetricRules(java.util.List<UpdateDataCheckTemplateRequestMetricRules> metricRules) {
        this.metricRules = metricRules;
        return this;
    }
    public java.util.List<UpdateDataCheckTemplateRequestMetricRules> getMetricRules() {
        return this.metricRules;
    }

    public UpdateDataCheckTemplateRequest setNullRules(java.util.List<UpdateDataCheckTemplateRequestNullRules> nullRules) {
        this.nullRules = nullRules;
        return this;
    }
    public java.util.List<UpdateDataCheckTemplateRequestNullRules> getNullRules() {
        return this.nullRules;
    }

    public UpdateDataCheckTemplateRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDataCheckTemplateRequest setTemplateDesc(String templateDesc) {
        this.templateDesc = templateDesc;
        return this;
    }
    public String getTemplateDesc() {
        return this.templateDesc;
    }

    public UpdateDataCheckTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateDataCheckTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public UpdateDataCheckTemplateRequest setWeakContentRule(UpdateDataCheckTemplateRequestWeakContentRule weakContentRule) {
        this.weakContentRule = weakContentRule;
        return this;
    }
    public UpdateDataCheckTemplateRequestWeakContentRule getWeakContentRule() {
        return this.weakContentRule;
    }

    public static class UpdateDataCheckTemplateRequestBasicMetricRules extends TeaModel {
        /**
         * <p>The check methods (metric calculation methods). Separate multiple values with commas, such as SUM,AVG,MIN,MAX. The values must be within the range allowed by the templatetype.</p>
         * 
         * <strong>example:</strong>
         * <p>SUM,AVG</p>
         */
        @NameInMap("checkMethods")
        public String checkMethods;

        /**
         * <p>Specifies whether to control floating-point precision. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("controlFloatPrecision")
        public Integer controlFloatPrecision;

        /**
         * <p>The data type category. Valid values: 0 (native data type) and 1 (complex data type).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dataTypeClassify")
        public Integer dataTypeClassify;

        /**
         * <p>The data type group that identifies the data type category to which the check rule applies. Valid values: integers from 0 to 7. For the description of each value, see the enumeration values.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dataTypeGroup")
        public Integer dataTypeGroup;

        /**
         * <p>The list of data types to which the check rule applies. Configure this field as needed.</p>
         */
        @NameInMap("dataTypeList")
        public java.util.List<String> dataTypeList;

        /**
         * <p>The data types. Configure this field as needed.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("dataTypes")
        public String dataTypes;

        /**
         * <p>The difference tolerance type. Valid values: 0 (unified) and 1 (custom). Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("diffTolerateType")
        public Integer diffTolerateType;

        /**
         * <p>The difference tolerance values. For the unified type, this is a single value, such as {&quot;SAME&quot;: 0}. For the custom type, values are set separately for each configured tolerance type, such as {&quot;SUM&quot;: 0.01, &quot;AVG&quot;: 0.001}.</p>
         */
        @NameInMap("diffTolerateValues")
        public java.util.Map<String, ?> diffTolerateValues;

        /**
         * <p>Specifies whether to enable decimal scale control for DECIMAL type comparison. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("enableDecimalScale")
        public Integer enableDecimalScale;

        /**
         * <p>The filter column names, separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("filterColumnName")
        public String filterColumnName;

        /**
         * <p><strong>[Deprecated]</strong> Use the filterColumnName field instead. This field was retained because the previous platform could not be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("filterColumns")
        public String filterColumns;

        /**
         * <p>The number of decimal places for floating-point values.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("floatPrecision")
        public Integer floatPrecision;

        /**
         * <p>Specifies whether to ignore trailing zero differences in the decimal part. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreDecimalDiff")
        public Integer ignoreDecimalDiff;

        /**
         * <p>Specifies whether to ignore trailing zeros in the decimal scale for DECIMAL type comparison. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreDecimalScaleSuffixZero")
        public Integer ignoreDecimalScaleSuffixZero;

        /**
         * <p>Specifies whether to ignore the difference between null values and empty strings. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreEmptyDiff")
        public Integer ignoreEmptyDiff;

        /**
         * <p>Specifies whether to ignore zero values for numeric types. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreNumericZero")
        public Integer ignoreNumericZero;

        /**
         * <p>Specifies whether to ignore empty strings and null values for string types. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreStringEmpty")
        public Integer ignoreStringEmpty;

        /**
         * <p>Specifies whether to ignore the difference between null values and zero values. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreZeroDiff")
        public Integer ignoreZeroDiff;

        /**
         * <p>Specifies whether to enable count (data volume) check. Valid values: 0 (no) and 1 (yes). Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("isCountCheck")
        public Integer isCountCheck;

        /**
         * <p>The rule ID that uniquely identifies a check rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>The specific decimal scale value for DECIMAL type comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("setDecimalScale")
        public Integer setDecimalScale;

        public static UpdateDataCheckTemplateRequestBasicMetricRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataCheckTemplateRequestBasicMetricRules self = new UpdateDataCheckTemplateRequestBasicMetricRules();
            return TeaModel.build(map, self);
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setCheckMethods(String checkMethods) {
            this.checkMethods = checkMethods;
            return this;
        }
        public String getCheckMethods() {
            return this.checkMethods;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setControlFloatPrecision(Integer controlFloatPrecision) {
            this.controlFloatPrecision = controlFloatPrecision;
            return this;
        }
        public Integer getControlFloatPrecision() {
            return this.controlFloatPrecision;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setDataTypeClassify(Integer dataTypeClassify) {
            this.dataTypeClassify = dataTypeClassify;
            return this;
        }
        public Integer getDataTypeClassify() {
            return this.dataTypeClassify;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setDataTypeGroup(Integer dataTypeGroup) {
            this.dataTypeGroup = dataTypeGroup;
            return this;
        }
        public Integer getDataTypeGroup() {
            return this.dataTypeGroup;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setDataTypeList(java.util.List<String> dataTypeList) {
            this.dataTypeList = dataTypeList;
            return this;
        }
        public java.util.List<String> getDataTypeList() {
            return this.dataTypeList;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setDataTypes(String dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }
        public String getDataTypes() {
            return this.dataTypes;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setDiffTolerateType(Integer diffTolerateType) {
            this.diffTolerateType = diffTolerateType;
            return this;
        }
        public Integer getDiffTolerateType() {
            return this.diffTolerateType;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setDiffTolerateValues(java.util.Map<String, ?> diffTolerateValues) {
            this.diffTolerateValues = diffTolerateValues;
            return this;
        }
        public java.util.Map<String, ?> getDiffTolerateValues() {
            return this.diffTolerateValues;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setEnableDecimalScale(Integer enableDecimalScale) {
            this.enableDecimalScale = enableDecimalScale;
            return this;
        }
        public Integer getEnableDecimalScale() {
            return this.enableDecimalScale;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setFilterColumnName(String filterColumnName) {
            this.filterColumnName = filterColumnName;
            return this;
        }
        public String getFilterColumnName() {
            return this.filterColumnName;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setFilterColumns(String filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public String getFilterColumns() {
            return this.filterColumns;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setFloatPrecision(Integer floatPrecision) {
            this.floatPrecision = floatPrecision;
            return this;
        }
        public Integer getFloatPrecision() {
            return this.floatPrecision;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setIgnoreDecimalDiff(Integer ignoreDecimalDiff) {
            this.ignoreDecimalDiff = ignoreDecimalDiff;
            return this;
        }
        public Integer getIgnoreDecimalDiff() {
            return this.ignoreDecimalDiff;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setIgnoreDecimalScaleSuffixZero(Integer ignoreDecimalScaleSuffixZero) {
            this.ignoreDecimalScaleSuffixZero = ignoreDecimalScaleSuffixZero;
            return this;
        }
        public Integer getIgnoreDecimalScaleSuffixZero() {
            return this.ignoreDecimalScaleSuffixZero;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setIgnoreEmptyDiff(Integer ignoreEmptyDiff) {
            this.ignoreEmptyDiff = ignoreEmptyDiff;
            return this;
        }
        public Integer getIgnoreEmptyDiff() {
            return this.ignoreEmptyDiff;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setIgnoreNumericZero(Integer ignoreNumericZero) {
            this.ignoreNumericZero = ignoreNumericZero;
            return this;
        }
        public Integer getIgnoreNumericZero() {
            return this.ignoreNumericZero;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setIgnoreStringEmpty(Integer ignoreStringEmpty) {
            this.ignoreStringEmpty = ignoreStringEmpty;
            return this;
        }
        public Integer getIgnoreStringEmpty() {
            return this.ignoreStringEmpty;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setIgnoreZeroDiff(Integer ignoreZeroDiff) {
            this.ignoreZeroDiff = ignoreZeroDiff;
            return this;
        }
        public Integer getIgnoreZeroDiff() {
            return this.ignoreZeroDiff;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setIsCountCheck(Integer isCountCheck) {
            this.isCountCheck = isCountCheck;
            return this;
        }
        public Integer getIsCountCheck() {
            return this.isCountCheck;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public UpdateDataCheckTemplateRequestBasicMetricRules setSetDecimalScale(Integer setDecimalScale) {
            this.setDecimalScale = setDecimalScale;
            return this;
        }
        public Integer getSetDecimalScale() {
            return this.setDecimalScale;
        }

    }

    public static class UpdateDataCheckTemplateRequestComplexMetricRules extends TeaModel {
        /**
         * <p>The check methods (metric calculation methods). Separate multiple values with commas, such as SUM,AVG,MIN,MAX. The values must be within the range allowed by the templatetype.</p>
         * 
         * <strong>example:</strong>
         * <p>SUM,AVG</p>
         */
        @NameInMap("checkMethods")
        public String checkMethods;

        /**
         * <p>Specifies whether to control floating-point precision. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("controlFloatPrecision")
        public Integer controlFloatPrecision;

        /**
         * <p>The data type category. Valid values: 0 (native data type) and 1 (complex data type).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dataTypeClassify")
        public Integer dataTypeClassify;

        /**
         * <p>The data type group that identifies the data type category to which the check rule applies. Valid values: integers from 0 to 7. For the description of each value, see the enumeration values.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dataTypeGroup")
        public Integer dataTypeGroup;

        /**
         * <p>The list of data types to which the check rule applies. Configure this field as needed.</p>
         */
        @NameInMap("dataTypeList")
        public java.util.List<String> dataTypeList;

        /**
         * <p>The data types. Configure this field as needed.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("dataTypes")
        public String dataTypes;

        /**
         * <p>The difference tolerance type. Valid values: 0 (unified) and 1 (custom). Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("diffTolerateType")
        public Integer diffTolerateType;

        /**
         * <p>The difference tolerance values. For the unified type, this is a single value, such as {&quot;SAME&quot;: 0}. For the custom type, values are set separately for each configured tolerance type, such as {&quot;SUM&quot;: 0.01, &quot;AVG&quot;: 0.001}.</p>
         */
        @NameInMap("diffTolerateValues")
        public java.util.Map<String, ?> diffTolerateValues;

        /**
         * <p>Specifies whether to enable decimal scale control for DECIMAL type comparison. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("enableDecimalScale")
        public Integer enableDecimalScale;

        /**
         * <p>The filter column names, separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("filterColumnName")
        public String filterColumnName;

        /**
         * <p><strong>[Deprecated]</strong> Use the filterColumnName field instead. This field was retained because the previous platform could not be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("filterColumns")
        public String filterColumns;

        /**
         * <p>The number of decimal places for floating-point values.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("floatPrecision")
        public Integer floatPrecision;

        /**
         * <p>Specifies whether to ignore trailing zero differences in the decimal part. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreDecimalDiff")
        public Integer ignoreDecimalDiff;

        /**
         * <p>Specifies whether to ignore trailing zeros in the decimal scale for DECIMAL type comparison. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreDecimalScaleSuffixZero")
        public Integer ignoreDecimalScaleSuffixZero;

        /**
         * <p>Specifies whether to ignore the difference between null values and empty strings. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreEmptyDiff")
        public Integer ignoreEmptyDiff;

        /**
         * <p>Specifies whether to ignore zero values for numeric types. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreNumericZero")
        public Integer ignoreNumericZero;

        /**
         * <p>Specifies whether to ignore empty strings and null values for string types. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreStringEmpty")
        public Integer ignoreStringEmpty;

        /**
         * <p>Specifies whether to ignore the difference between null values and zero values. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreZeroDiff")
        public Integer ignoreZeroDiff;

        /**
         * <p>Specifies whether to enable count (data volume) check. Valid values: 0 (no) and 1 (yes). Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("isCountCheck")
        public Integer isCountCheck;

        /**
         * <p>The rule ID that uniquely identifies a check rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>The specific decimal scale value for DECIMAL type comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("setDecimalScale")
        public Integer setDecimalScale;

        public static UpdateDataCheckTemplateRequestComplexMetricRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataCheckTemplateRequestComplexMetricRules self = new UpdateDataCheckTemplateRequestComplexMetricRules();
            return TeaModel.build(map, self);
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setCheckMethods(String checkMethods) {
            this.checkMethods = checkMethods;
            return this;
        }
        public String getCheckMethods() {
            return this.checkMethods;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setControlFloatPrecision(Integer controlFloatPrecision) {
            this.controlFloatPrecision = controlFloatPrecision;
            return this;
        }
        public Integer getControlFloatPrecision() {
            return this.controlFloatPrecision;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setDataTypeClassify(Integer dataTypeClassify) {
            this.dataTypeClassify = dataTypeClassify;
            return this;
        }
        public Integer getDataTypeClassify() {
            return this.dataTypeClassify;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setDataTypeGroup(Integer dataTypeGroup) {
            this.dataTypeGroup = dataTypeGroup;
            return this;
        }
        public Integer getDataTypeGroup() {
            return this.dataTypeGroup;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setDataTypeList(java.util.List<String> dataTypeList) {
            this.dataTypeList = dataTypeList;
            return this;
        }
        public java.util.List<String> getDataTypeList() {
            return this.dataTypeList;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setDataTypes(String dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }
        public String getDataTypes() {
            return this.dataTypes;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setDiffTolerateType(Integer diffTolerateType) {
            this.diffTolerateType = diffTolerateType;
            return this;
        }
        public Integer getDiffTolerateType() {
            return this.diffTolerateType;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setDiffTolerateValues(java.util.Map<String, ?> diffTolerateValues) {
            this.diffTolerateValues = diffTolerateValues;
            return this;
        }
        public java.util.Map<String, ?> getDiffTolerateValues() {
            return this.diffTolerateValues;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setEnableDecimalScale(Integer enableDecimalScale) {
            this.enableDecimalScale = enableDecimalScale;
            return this;
        }
        public Integer getEnableDecimalScale() {
            return this.enableDecimalScale;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setFilterColumnName(String filterColumnName) {
            this.filterColumnName = filterColumnName;
            return this;
        }
        public String getFilterColumnName() {
            return this.filterColumnName;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setFilterColumns(String filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public String getFilterColumns() {
            return this.filterColumns;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setFloatPrecision(Integer floatPrecision) {
            this.floatPrecision = floatPrecision;
            return this;
        }
        public Integer getFloatPrecision() {
            return this.floatPrecision;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setIgnoreDecimalDiff(Integer ignoreDecimalDiff) {
            this.ignoreDecimalDiff = ignoreDecimalDiff;
            return this;
        }
        public Integer getIgnoreDecimalDiff() {
            return this.ignoreDecimalDiff;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setIgnoreDecimalScaleSuffixZero(Integer ignoreDecimalScaleSuffixZero) {
            this.ignoreDecimalScaleSuffixZero = ignoreDecimalScaleSuffixZero;
            return this;
        }
        public Integer getIgnoreDecimalScaleSuffixZero() {
            return this.ignoreDecimalScaleSuffixZero;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setIgnoreEmptyDiff(Integer ignoreEmptyDiff) {
            this.ignoreEmptyDiff = ignoreEmptyDiff;
            return this;
        }
        public Integer getIgnoreEmptyDiff() {
            return this.ignoreEmptyDiff;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setIgnoreNumericZero(Integer ignoreNumericZero) {
            this.ignoreNumericZero = ignoreNumericZero;
            return this;
        }
        public Integer getIgnoreNumericZero() {
            return this.ignoreNumericZero;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setIgnoreStringEmpty(Integer ignoreStringEmpty) {
            this.ignoreStringEmpty = ignoreStringEmpty;
            return this;
        }
        public Integer getIgnoreStringEmpty() {
            return this.ignoreStringEmpty;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setIgnoreZeroDiff(Integer ignoreZeroDiff) {
            this.ignoreZeroDiff = ignoreZeroDiff;
            return this;
        }
        public Integer getIgnoreZeroDiff() {
            return this.ignoreZeroDiff;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setIsCountCheck(Integer isCountCheck) {
            this.isCountCheck = isCountCheck;
            return this;
        }
        public Integer getIsCountCheck() {
            return this.isCountCheck;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public UpdateDataCheckTemplateRequestComplexMetricRules setSetDecimalScale(Integer setDecimalScale) {
            this.setDecimalScale = setDecimalScale;
            return this;
        }
        public Integer getSetDecimalScale() {
            return this.setDecimalScale;
        }

    }

    public static class UpdateDataCheckTemplateRequestDsEngineRels extends TeaModel {
        /**
         * <p>The datasource engine configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("dsEngineId")
        public String dsEngineId;

        /**
         * <p>The datasource type, such as Hive or MaxCompute.</p>
         * 
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        @NameInMap("dsType")
        public String dsType;

        /**
         * <p>The list of covered check engine types, such as Tez or MapReduce. When specified as a string, separate multiple values with commas.</p>
         */
        @NameInMap("engineTypes")
        public java.util.List<String> engineTypes;

        public static UpdateDataCheckTemplateRequestDsEngineRels build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataCheckTemplateRequestDsEngineRels self = new UpdateDataCheckTemplateRequestDsEngineRels();
            return TeaModel.build(map, self);
        }

        public UpdateDataCheckTemplateRequestDsEngineRels setDsEngineId(String dsEngineId) {
            this.dsEngineId = dsEngineId;
            return this;
        }
        public String getDsEngineId() {
            return this.dsEngineId;
        }

        public UpdateDataCheckTemplateRequestDsEngineRels setDsType(String dsType) {
            this.dsType = dsType;
            return this;
        }
        public String getDsType() {
            return this.dsType;
        }

        public UpdateDataCheckTemplateRequestDsEngineRels setEngineTypes(java.util.List<String> engineTypes) {
            this.engineTypes = engineTypes;
            return this;
        }
        public java.util.List<String> getEngineTypes() {
            return this.engineTypes;
        }

    }

    public static class UpdateDataCheckTemplateRequestFulltextRule extends TeaModel {
        /**
         * <p>The check mode. Valid values:</p>
         * <ul>
         * <li>0: row-by-row overall comparison.</li>
         * <li>1: row-by-row column-by-column comparison.</li>
         * <li>2: both row-by-row overall comparison and row-by-row column-by-column comparison.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("checkMode")
        public Integer checkMode;

        /**
         * <p>The equality comparison type for row-by-row column-by-column comparison. Valid values:</p>
         * <ul>
         * <li>0: all field types.</li>
         * <li>1: native primitive data types.</li>
         * <li>2: complex data types.</li>
         * <li>3: custom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("columnEqualCmpType")
        public Integer columnEqualCmpType;

        /**
         * <p>The custom type list for equality comparison during row-by-row column-by-column comparison. Separate multiple values with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>ARRAY,MAP</p>
         */
        @NameInMap("columnEqualCmpValues")
        public String columnEqualCmpValues;

        /**
         * <p>Specifies whether to enable cosine similarity during row-by-row column-by-column comparison. Valid values:</p>
         * <ul>
         * <li>0: Disabled.</li>
         * <li>1: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("columnIsCosine")
        public Integer columnIsCosine;

        /**
         * <p>Specifies whether to ignore differences between null values and empty strings during row-by-row column-by-column comparison. Valid values:</p>
         * <ul>
         * <li>0: Not ignored.</li>
         * <li>1: Ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("columnIsIgnoreNull")
        public Integer columnIsIgnoreNull;

        /**
         * <p>Specifies whether to ignore differences between null values and 0 values during row-by-row column-by-column comparison. Valid values:</p>
         * <ul>
         * <li>0: Not ignored.</li>
         * <li>1: Ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("columnIsIgnoreZero")
        public Integer columnIsIgnoreZero;

        /**
         * <p>Specifies whether to enable sampling during row-by-row column-by-column comparison. Valid values:</p>
         * <ul>
         * <li>0: Disabled.</li>
         * <li>1: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("columnIsSamples")
        public Integer columnIsSamples;

        /**
         * <p>The sampling method for row-by-row column-by-column comparison. Valid values:</p>
         * <ul>
         * <li>0: by row.</li>
         * <li>1: by percentage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("columnSamplesType")
        public Integer columnSamplesType;

        /**
         * <p>The sampling value for row-by-row column-by-column comparison. The meaning depends on the sampling method: the number of rows when sampling by row, or the percentage value when sampling by percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("columnSamplesValue")
        public Integer columnSamplesValue;

        /**
         * <p>The size comparison type for row-by-row column-by-column comparison. Valid values:</p>
         * <ul>
         * <li>0: all complex data types.</li>
         * <li>1: custom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("columnSizeCmpType")
        public Integer columnSizeCmpType;

        /**
         * <p>The custom type list for size comparison during row-by-row column-by-column comparison. Separate multiple values with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>ARRAY,MAP</p>
         */
        @NameInMap("columnSizeCmpValues")
        public String columnSizeCmpValues;

        /**
         * <p>Specifies whether to enable primary key or composite primary key existence check. Valid values:</p>
         * <ul>
         * <li>0: Disabled.</li>
         * <li>1: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("isPrimaryKeyCheck")
        public Integer isPrimaryKeyCheck;

        /**
         * <p>The row-by-row comparison method. Valid values:</p>
         * <ul>
         * <li>0: md5.</li>
         * <li>1: crc32.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("lineCheckType")
        public Integer lineCheckType;

        /**
         * <p>Specifies whether to print all columns in the difference details during row-by-row comparison. Valid values:</p>
         * <ul>
         * <li>0: Not printed.</li>
         * <li>1: Printed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("lineIsPrintAll")
        public Integer lineIsPrintAll;

        /**
         * <p>Specifies whether to enable sampling during row-by-row comparison. Valid values:</p>
         * <ul>
         * <li>0: Disabled.</li>
         * <li>1: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("lineIsSamples")
        public Integer lineIsSamples;

        /**
         * <p>The sampling method for row-by-row comparison. Valid values:</p>
         * <ul>
         * <li>0: by row.</li>
         * <li>1: by percentage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("lineSamplesType")
        public Integer lineSamplesType;

        /**
         * <p>The sampling value for row-by-row comparison. The meaning depends on the sampling method: the number of rows when sampling by row, or the percentage value when sampling by percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("lineSamplesValue")
        public Integer lineSamplesValue;

        /**
         * <p>The rule ID that uniquely identifies a check rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        public static UpdateDataCheckTemplateRequestFulltextRule build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataCheckTemplateRequestFulltextRule self = new UpdateDataCheckTemplateRequestFulltextRule();
            return TeaModel.build(map, self);
        }

        public UpdateDataCheckTemplateRequestFulltextRule setCheckMode(Integer checkMode) {
            this.checkMode = checkMode;
            return this;
        }
        public Integer getCheckMode() {
            return this.checkMode;
        }

        public UpdateDataCheckTemplateRequestFulltextRule setColumnEqualCmpType(Integer columnEqualCmpType) {
            this.columnEqualCmpType = columnEqualCmpType;
            return this;
        }
        public Integer getColumnEqualCmpType() {
            return this.columnEqualCmpType;
        }

        public UpdateDataCheckTemplateRequestFulltextRule setColumnEqualCmpValues(String columnEqualCmpValues) {
            this.columnEqualCmpValues = columnEqualCmpValues;
            return this;
        }
        public String getColumnEqualCmpValues() {
            return this.columnEqualCmpValues;
        }

        public UpdateDataCheckTemplateRequestFulltextRule setColumnIsCosine(Integer columnIsCosine) {
            this.columnIsCosine = columnIsCosine;
            return this;
        }
        public Integer getColumnIsCosine() {
            return this.columnIsCosine;
        }

        public UpdateDataCheckTemplateRequestFulltextRule setColumnIsIgnoreNull(Integer columnIsIgnoreNull) {
            this.columnIsIgnoreNull = columnIsIgnoreNull;
            return this;
        }
        public Integer getColumnIsIgnoreNull() {
            return this.columnIsIgnoreNull;
        }

        public UpdateDataCheckTemplateRequestFulltextRule setColumnIsIgnoreZero(Integer columnIsIgnoreZero) {
            this.columnIsIgnoreZero = columnIsIgnoreZero;
            return this;
        }
        public Integer getColumnIsIgnoreZero() {
            return this.columnIsIgnoreZero;
        }

        public UpdateDataCheckTemplateRequestFulltextRule setColumnIsSamples(Integer columnIsSamples) {
            this.columnIsSamples = columnIsSamples;
            return this;
        }
        public Integer getColumnIsSamples() {
            return this.columnIsSamples;
        }

        public UpdateDataCheckTemplateRequestFulltextRule setColumnSamplesType(Integer columnSamplesType) {
            this.columnSamplesType = columnSamplesType;
            return this;
        }
        public Integer getColumnSamplesType() {
            return this.columnSamplesType;
        }

        public UpdateDataCheckTemplateRequestFulltextRule setColumnSamplesValue(Integer columnSamplesValue) {
            this.columnSamplesValue = columnSamplesValue;
            return this;
        }
        public Integer getColumnSamplesValue() {
            return this.columnSamplesValue;
        }

        public UpdateDataCheckTemplateRequestFulltextRule setColumnSizeCmpType(Integer columnSizeCmpType) {
            this.columnSizeCmpType = columnSizeCmpType;
            return this;
        }
        public Integer getColumnSizeCmpType() {
            return this.columnSizeCmpType;
        }

        public UpdateDataCheckTemplateRequestFulltextRule setColumnSizeCmpValues(String columnSizeCmpValues) {
            this.columnSizeCmpValues = columnSizeCmpValues;
            return this;
        }
        public String getColumnSizeCmpValues() {
            return this.columnSizeCmpValues;
        }

        public UpdateDataCheckTemplateRequestFulltextRule setIsPrimaryKeyCheck(Integer isPrimaryKeyCheck) {
            this.isPrimaryKeyCheck = isPrimaryKeyCheck;
            return this;
        }
        public Integer getIsPrimaryKeyCheck() {
            return this.isPrimaryKeyCheck;
        }

        public UpdateDataCheckTemplateRequestFulltextRule setLineCheckType(Integer lineCheckType) {
            this.lineCheckType = lineCheckType;
            return this;
        }
        public Integer getLineCheckType() {
            return this.lineCheckType;
        }

        public UpdateDataCheckTemplateRequestFulltextRule setLineIsPrintAll(Integer lineIsPrintAll) {
            this.lineIsPrintAll = lineIsPrintAll;
            return this;
        }
        public Integer getLineIsPrintAll() {
            return this.lineIsPrintAll;
        }

        public UpdateDataCheckTemplateRequestFulltextRule setLineIsSamples(Integer lineIsSamples) {
            this.lineIsSamples = lineIsSamples;
            return this;
        }
        public Integer getLineIsSamples() {
            return this.lineIsSamples;
        }

        public UpdateDataCheckTemplateRequestFulltextRule setLineSamplesType(Integer lineSamplesType) {
            this.lineSamplesType = lineSamplesType;
            return this;
        }
        public Integer getLineSamplesType() {
            return this.lineSamplesType;
        }

        public UpdateDataCheckTemplateRequestFulltextRule setLineSamplesValue(Integer lineSamplesValue) {
            this.lineSamplesValue = lineSamplesValue;
            return this;
        }
        public Integer getLineSamplesValue() {
            return this.lineSamplesValue;
        }

        public UpdateDataCheckTemplateRequestFulltextRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class UpdateDataCheckTemplateRequestMetricRules extends TeaModel {
        /**
         * <p>The check methods (metric calculation methods). Separate multiple values with commas (,), such as SUM,AVG,MIN,MAX. The values must be within the range allowed by the templatetype.</p>
         * 
         * <strong>example:</strong>
         * <p>SUM,AVG</p>
         */
        @NameInMap("checkMethods")
        public String checkMethods;

        /**
         * <p>Specifies whether to control floating-point precision. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("controlFloatPrecision")
        public Integer controlFloatPrecision;

        /**
         * <p>The data type category. Valid values: 0 (native data type) and 1 (complex data type).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dataTypeClassify")
        public Integer dataTypeClassify;

        /**
         * <p>The data type group that identifies the data type category to which the check rule applies. Valid values: integers from 0 to 7. For the description of each value, see the enumeration values.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dataTypeGroup")
        public Integer dataTypeGroup;

        /**
         * <p>The list of data types to which the check rule applies. Configure this field as needed.</p>
         */
        @NameInMap("dataTypeList")
        public java.util.List<String> dataTypeList;

        /**
         * <p>The data types. Configure this field as needed.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("dataTypes")
        public String dataTypes;

        /**
         * <p>The difference tolerance type. Valid values: 0 (unified) and 1 (custom). Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("diffTolerateType")
        public Integer diffTolerateType;

        /**
         * <p>The difference tolerance values. For the unified type, this is a single value, such as {&quot;SAME&quot;: 0}. For the custom type, values are set separately for each configured tolerance type, such as {&quot;SUM&quot;: 0.01, &quot;AVG&quot;: 0.001}.</p>
         */
        @NameInMap("diffTolerateValues")
        public java.util.Map<String, ?> diffTolerateValues;

        /**
         * <p>Specifies whether to enable decimal scale control for DECIMAL type comparison. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("enableDecimalScale")
        public Integer enableDecimalScale;

        /**
         * <p>The filter column names, separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("filterColumnName")
        public String filterColumnName;

        /**
         * <p><strong>[Deprecated]</strong> Use the filterColumnName field instead. This field was retained because the previous platform could not be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("filterColumns")
        public String filterColumns;

        /**
         * <p>The number of decimal places for floating-point values.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("floatPrecision")
        public Integer floatPrecision;

        /**
         * <p>Specifies whether to ignore trailing zero differences in the decimal part. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreDecimalDiff")
        public Integer ignoreDecimalDiff;

        /**
         * <p>Specifies whether to ignore trailing zeros in the decimal scale for DECIMAL type comparison. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreDecimalScaleSuffixZero")
        public Integer ignoreDecimalScaleSuffixZero;

        /**
         * <p>Specifies whether to ignore the difference between null values and empty strings. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreEmptyDiff")
        public Integer ignoreEmptyDiff;

        /**
         * <p>Specifies whether to ignore zero values for numeric types. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreNumericZero")
        public Integer ignoreNumericZero;

        /**
         * <p>Specifies whether to ignore empty strings and null values for string types. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreStringEmpty")
        public Integer ignoreStringEmpty;

        /**
         * <p>Specifies whether to ignore the difference between null values and zero values. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreZeroDiff")
        public Integer ignoreZeroDiff;

        /**
         * <p>Specifies whether to enable count (data volume) check. Valid values: 0 (no) and 1 (yes). Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("isCountCheck")
        public Integer isCountCheck;

        /**
         * <p>The rule ID that uniquely identifies a check rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>The specific decimal scale value for DECIMAL type comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("setDecimalScale")
        public Integer setDecimalScale;

        public static UpdateDataCheckTemplateRequestMetricRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataCheckTemplateRequestMetricRules self = new UpdateDataCheckTemplateRequestMetricRules();
            return TeaModel.build(map, self);
        }

        public UpdateDataCheckTemplateRequestMetricRules setCheckMethods(String checkMethods) {
            this.checkMethods = checkMethods;
            return this;
        }
        public String getCheckMethods() {
            return this.checkMethods;
        }

        public UpdateDataCheckTemplateRequestMetricRules setControlFloatPrecision(Integer controlFloatPrecision) {
            this.controlFloatPrecision = controlFloatPrecision;
            return this;
        }
        public Integer getControlFloatPrecision() {
            return this.controlFloatPrecision;
        }

        public UpdateDataCheckTemplateRequestMetricRules setDataTypeClassify(Integer dataTypeClassify) {
            this.dataTypeClassify = dataTypeClassify;
            return this;
        }
        public Integer getDataTypeClassify() {
            return this.dataTypeClassify;
        }

        public UpdateDataCheckTemplateRequestMetricRules setDataTypeGroup(Integer dataTypeGroup) {
            this.dataTypeGroup = dataTypeGroup;
            return this;
        }
        public Integer getDataTypeGroup() {
            return this.dataTypeGroup;
        }

        public UpdateDataCheckTemplateRequestMetricRules setDataTypeList(java.util.List<String> dataTypeList) {
            this.dataTypeList = dataTypeList;
            return this;
        }
        public java.util.List<String> getDataTypeList() {
            return this.dataTypeList;
        }

        public UpdateDataCheckTemplateRequestMetricRules setDataTypes(String dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }
        public String getDataTypes() {
            return this.dataTypes;
        }

        public UpdateDataCheckTemplateRequestMetricRules setDiffTolerateType(Integer diffTolerateType) {
            this.diffTolerateType = diffTolerateType;
            return this;
        }
        public Integer getDiffTolerateType() {
            return this.diffTolerateType;
        }

        public UpdateDataCheckTemplateRequestMetricRules setDiffTolerateValues(java.util.Map<String, ?> diffTolerateValues) {
            this.diffTolerateValues = diffTolerateValues;
            return this;
        }
        public java.util.Map<String, ?> getDiffTolerateValues() {
            return this.diffTolerateValues;
        }

        public UpdateDataCheckTemplateRequestMetricRules setEnableDecimalScale(Integer enableDecimalScale) {
            this.enableDecimalScale = enableDecimalScale;
            return this;
        }
        public Integer getEnableDecimalScale() {
            return this.enableDecimalScale;
        }

        public UpdateDataCheckTemplateRequestMetricRules setFilterColumnName(String filterColumnName) {
            this.filterColumnName = filterColumnName;
            return this;
        }
        public String getFilterColumnName() {
            return this.filterColumnName;
        }

        public UpdateDataCheckTemplateRequestMetricRules setFilterColumns(String filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public String getFilterColumns() {
            return this.filterColumns;
        }

        public UpdateDataCheckTemplateRequestMetricRules setFloatPrecision(Integer floatPrecision) {
            this.floatPrecision = floatPrecision;
            return this;
        }
        public Integer getFloatPrecision() {
            return this.floatPrecision;
        }

        public UpdateDataCheckTemplateRequestMetricRules setIgnoreDecimalDiff(Integer ignoreDecimalDiff) {
            this.ignoreDecimalDiff = ignoreDecimalDiff;
            return this;
        }
        public Integer getIgnoreDecimalDiff() {
            return this.ignoreDecimalDiff;
        }

        public UpdateDataCheckTemplateRequestMetricRules setIgnoreDecimalScaleSuffixZero(Integer ignoreDecimalScaleSuffixZero) {
            this.ignoreDecimalScaleSuffixZero = ignoreDecimalScaleSuffixZero;
            return this;
        }
        public Integer getIgnoreDecimalScaleSuffixZero() {
            return this.ignoreDecimalScaleSuffixZero;
        }

        public UpdateDataCheckTemplateRequestMetricRules setIgnoreEmptyDiff(Integer ignoreEmptyDiff) {
            this.ignoreEmptyDiff = ignoreEmptyDiff;
            return this;
        }
        public Integer getIgnoreEmptyDiff() {
            return this.ignoreEmptyDiff;
        }

        public UpdateDataCheckTemplateRequestMetricRules setIgnoreNumericZero(Integer ignoreNumericZero) {
            this.ignoreNumericZero = ignoreNumericZero;
            return this;
        }
        public Integer getIgnoreNumericZero() {
            return this.ignoreNumericZero;
        }

        public UpdateDataCheckTemplateRequestMetricRules setIgnoreStringEmpty(Integer ignoreStringEmpty) {
            this.ignoreStringEmpty = ignoreStringEmpty;
            return this;
        }
        public Integer getIgnoreStringEmpty() {
            return this.ignoreStringEmpty;
        }

        public UpdateDataCheckTemplateRequestMetricRules setIgnoreZeroDiff(Integer ignoreZeroDiff) {
            this.ignoreZeroDiff = ignoreZeroDiff;
            return this;
        }
        public Integer getIgnoreZeroDiff() {
            return this.ignoreZeroDiff;
        }

        public UpdateDataCheckTemplateRequestMetricRules setIsCountCheck(Integer isCountCheck) {
            this.isCountCheck = isCountCheck;
            return this;
        }
        public Integer getIsCountCheck() {
            return this.isCountCheck;
        }

        public UpdateDataCheckTemplateRequestMetricRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public UpdateDataCheckTemplateRequestMetricRules setSetDecimalScale(Integer setDecimalScale) {
            this.setDecimalScale = setDecimalScale;
            return this;
        }
        public Integer getSetDecimalScale() {
            return this.setDecimalScale;
        }

    }

    public static class UpdateDataCheckTemplateRequestNullRules extends TeaModel {
        /**
         * <p>The data type group that identifies the data type category to which the check rule applies. Valid values: integers from 0 to 7. For the description of each value, see the enumeration values.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dataTypeGroup")
        public Integer dataTypeGroup;

        /**
         * <p>The null values, stored in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("nullValues")
        public String nullValues;

        /**
         * <p>The rule ID that uniquely identifies a check rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        public static UpdateDataCheckTemplateRequestNullRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataCheckTemplateRequestNullRules self = new UpdateDataCheckTemplateRequestNullRules();
            return TeaModel.build(map, self);
        }

        public UpdateDataCheckTemplateRequestNullRules setDataTypeGroup(Integer dataTypeGroup) {
            this.dataTypeGroup = dataTypeGroup;
            return this;
        }
        public Integer getDataTypeGroup() {
            return this.dataTypeGroup;
        }

        public UpdateDataCheckTemplateRequestNullRules setNullValues(String nullValues) {
            this.nullValues = nullValues;
            return this;
        }
        public String getNullValues() {
            return this.nullValues;
        }

        public UpdateDataCheckTemplateRequestNullRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class UpdateDataCheckTemplateRequestWeakContentRule extends TeaModel {
        /**
         * <p>The filter column name expression.</p>
         * 
         * <strong>example:</strong>
         * <p>^col_.*$</p>
         */
        @NameInMap("filterColumnExpression")
        public String filterColumnExpression;

        /**
         * <p>The filter column types, separated by vertical bars (|).</p>
         */
        @NameInMap("filterColumnTypes")
        public java.util.List<String> filterColumnTypes;

        /**
         * <p>The rule ID that uniquely identifies a check rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>The weak content algorithm name: md5 or crc32.</p>
         * 
         * <strong>example:</strong>
         * <p>md5</p>
         */
        @NameInMap("weakContentAlgorithm")
        public String weakContentAlgorithm;

        public static UpdateDataCheckTemplateRequestWeakContentRule build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataCheckTemplateRequestWeakContentRule self = new UpdateDataCheckTemplateRequestWeakContentRule();
            return TeaModel.build(map, self);
        }

        public UpdateDataCheckTemplateRequestWeakContentRule setFilterColumnExpression(String filterColumnExpression) {
            this.filterColumnExpression = filterColumnExpression;
            return this;
        }
        public String getFilterColumnExpression() {
            return this.filterColumnExpression;
        }

        public UpdateDataCheckTemplateRequestWeakContentRule setFilterColumnTypes(java.util.List<String> filterColumnTypes) {
            this.filterColumnTypes = filterColumnTypes;
            return this;
        }
        public java.util.List<String> getFilterColumnTypes() {
            return this.filterColumnTypes;
        }

        public UpdateDataCheckTemplateRequestWeakContentRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public UpdateDataCheckTemplateRequestWeakContentRule setWeakContentAlgorithm(String weakContentAlgorithm) {
            this.weakContentAlgorithm = weakContentAlgorithm;
            return this;
        }
        public String getWeakContentAlgorithm() {
            return this.weakContentAlgorithm;
        }

    }

}
