// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class AddDataCheckTemplateRequest extends TeaModel {
    /**
     * <p>The list of metric verification rules for basic data types. This field is required when checkType is set to 1 (metric comparison).</p>
     */
    @NameInMap("basicMetricRules")
    public java.util.List<AddDataCheckTemplateRequestBasicMetricRules> basicMetricRules;

    /**
     * <p>The verification rule type. Valid values:</p>
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
     * <p>The list of check rules for complex data type metrics. Used when checkType is set to 1 (metric comparison).</p>
     */
    @NameInMap("complexMetricRules")
    public java.util.List<AddDataCheckTemplateRequestComplexMetricRules> complexMetricRules;

    /**
     * <p>The list of datasource engine relationships (datasource engines associated with the template).</p>
     */
    @NameInMap("dsEngineRels")
    public java.util.List<AddDataCheckTemplateRequestDsEngineRels> dsEngineRels;

    /**
     * <p>The full-text comparison rule. This parameter has a value when checkType is set to 4 (full-text comparison). For the field structure, see the child field descriptions.</p>
     */
    @NameInMap("fulltextRule")
    public AddDataCheckTemplateRequestFulltextRule fulltextRule;

    /**
     * <p>The list of metric check rules. This parameter has a value when checkType is set to 1 (metric comparison).</p>
     */
    @NameInMap("metricRules")
    public java.util.List<AddDataCheckTemplateRequestMetricRules> metricRules;

    /**
     * <p>The list of null value rate check rules. This parameter has a value when checkType is set to 5 (null value rate comparison).</p>
     */
    @NameInMap("nullRules")
    public java.util.List<AddDataCheckTemplateRequestNullRules> nullRules;

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
     * <p>The name of the check template.</p>
     * 
     * <strong>example:</strong>
     * <p>Data volume check template</p>
     */
    @NameInMap("templateName")
    public String templateName;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The weak content check rule. This parameter has a value and is required when checkType is set to 2 (weak content comparison). For the field structure, refer to the child field descriptions below.</p>
     */
    @NameInMap("weakContentRule")
    public AddDataCheckTemplateRequestWeakContentRule weakContentRule;

    public static AddDataCheckTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDataCheckTemplateRequest self = new AddDataCheckTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddDataCheckTemplateRequest setBasicMetricRules(java.util.List<AddDataCheckTemplateRequestBasicMetricRules> basicMetricRules) {
        this.basicMetricRules = basicMetricRules;
        return this;
    }
    public java.util.List<AddDataCheckTemplateRequestBasicMetricRules> getBasicMetricRules() {
        return this.basicMetricRules;
    }

    public AddDataCheckTemplateRequest setCheckType(Integer checkType) {
        this.checkType = checkType;
        return this;
    }
    public Integer getCheckType() {
        return this.checkType;
    }

    public AddDataCheckTemplateRequest setComplexMetricRules(java.util.List<AddDataCheckTemplateRequestComplexMetricRules> complexMetricRules) {
        this.complexMetricRules = complexMetricRules;
        return this;
    }
    public java.util.List<AddDataCheckTemplateRequestComplexMetricRules> getComplexMetricRules() {
        return this.complexMetricRules;
    }

    public AddDataCheckTemplateRequest setDsEngineRels(java.util.List<AddDataCheckTemplateRequestDsEngineRels> dsEngineRels) {
        this.dsEngineRels = dsEngineRels;
        return this;
    }
    public java.util.List<AddDataCheckTemplateRequestDsEngineRels> getDsEngineRels() {
        return this.dsEngineRels;
    }

    public AddDataCheckTemplateRequest setFulltextRule(AddDataCheckTemplateRequestFulltextRule fulltextRule) {
        this.fulltextRule = fulltextRule;
        return this;
    }
    public AddDataCheckTemplateRequestFulltextRule getFulltextRule() {
        return this.fulltextRule;
    }

    public AddDataCheckTemplateRequest setMetricRules(java.util.List<AddDataCheckTemplateRequestMetricRules> metricRules) {
        this.metricRules = metricRules;
        return this;
    }
    public java.util.List<AddDataCheckTemplateRequestMetricRules> getMetricRules() {
        return this.metricRules;
    }

    public AddDataCheckTemplateRequest setNullRules(java.util.List<AddDataCheckTemplateRequestNullRules> nullRules) {
        this.nullRules = nullRules;
        return this;
    }
    public java.util.List<AddDataCheckTemplateRequestNullRules> getNullRules() {
        return this.nullRules;
    }

    public AddDataCheckTemplateRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDataCheckTemplateRequest setTemplateDesc(String templateDesc) {
        this.templateDesc = templateDesc;
        return this;
    }
    public String getTemplateDesc() {
        return this.templateDesc;
    }

    public AddDataCheckTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public AddDataCheckTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AddDataCheckTemplateRequest setWeakContentRule(AddDataCheckTemplateRequestWeakContentRule weakContentRule) {
        this.weakContentRule = weakContentRule;
        return this;
    }
    public AddDataCheckTemplateRequestWeakContentRule getWeakContentRule() {
        return this.weakContentRule;
    }

    public static class AddDataCheckTemplateRequestBasicMetricRules extends TeaModel {
        /**
         * <p>The verification methods (metric calculation methods). Separate multiple values with commas (,), such as SUM,AVG,MIN,MAX. The values must be within the range allowed by the templatetype.</p>
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
         * <p>The data type category. Valid values: 0 (native data type) and 1 (composite data type).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dataTypeClassify")
        public Integer dataTypeClassify;

        /**
         * <p>The data type group that identifies the data type category to which the verification rule applies. Valid values: integers from 0 to 7. For the description of each value, see the enumeration values.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dataTypeGroup")
        public Integer dataTypeGroup;

        /**
         * <p>The list of data types to which the verification rule applies. Configure this field based on your requirements.</p>
         */
        @NameInMap("dataTypeList")
        public java.util.List<String> dataTypeList;

        /**
         * <p>The data types. Configure this field based on your requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("dataTypes")
        public String dataTypes;

        /**
         * <p>The difference tolerance rate type. Valid values: 0 (unified) and 1 (custom). Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("diffTolerateType")
        public Integer diffTolerateType;

        /**
         * <p>The difference tolerance rate values. For the unified type, specify one value, such as {&quot;SAME&quot;: 0}. For the custom type, specify a value for each tolerance type, such as {&quot;SUM&quot;: 0.01, &quot;AVG&quot;: 0.001}.</p>
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
         * <p>The filter field names, separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("filterColumnName")
        public String filterColumnName;

        /**
         * <p><strong>[Deprecated]</strong> Use the filterColumnName field instead. This field is retained for backward compatibility.</p>
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
         * <p>Specifies whether to ignore trailing zero differences in decimal parts. Valid values: 0 (no) and 1 (yes).</p>
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
         * <p>Specifies whether to ignore differences between null values and empty strings. Valid values: 0 (no) and 1 (yes).</p>
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
         * <p>Specifies whether to ignore differences between null values and zero values. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreZeroDiff")
        public Integer ignoreZeroDiff;

        /**
         * <p>Specifies whether to enable count (data volume) verification. Valid values: 0 (no) and 1 (yes). Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("isCountCheck")
        public Integer isCountCheck;

        /**
         * <p>The rule ID that uniquely identifies a verification rule.</p>
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

        public static AddDataCheckTemplateRequestBasicMetricRules build(java.util.Map<String, ?> map) throws Exception {
            AddDataCheckTemplateRequestBasicMetricRules self = new AddDataCheckTemplateRequestBasicMetricRules();
            return TeaModel.build(map, self);
        }

        public AddDataCheckTemplateRequestBasicMetricRules setCheckMethods(String checkMethods) {
            this.checkMethods = checkMethods;
            return this;
        }
        public String getCheckMethods() {
            return this.checkMethods;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setControlFloatPrecision(Integer controlFloatPrecision) {
            this.controlFloatPrecision = controlFloatPrecision;
            return this;
        }
        public Integer getControlFloatPrecision() {
            return this.controlFloatPrecision;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setDataTypeClassify(Integer dataTypeClassify) {
            this.dataTypeClassify = dataTypeClassify;
            return this;
        }
        public Integer getDataTypeClassify() {
            return this.dataTypeClassify;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setDataTypeGroup(Integer dataTypeGroup) {
            this.dataTypeGroup = dataTypeGroup;
            return this;
        }
        public Integer getDataTypeGroup() {
            return this.dataTypeGroup;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setDataTypeList(java.util.List<String> dataTypeList) {
            this.dataTypeList = dataTypeList;
            return this;
        }
        public java.util.List<String> getDataTypeList() {
            return this.dataTypeList;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setDataTypes(String dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }
        public String getDataTypes() {
            return this.dataTypes;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setDiffTolerateType(Integer diffTolerateType) {
            this.diffTolerateType = diffTolerateType;
            return this;
        }
        public Integer getDiffTolerateType() {
            return this.diffTolerateType;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setDiffTolerateValues(java.util.Map<String, ?> diffTolerateValues) {
            this.diffTolerateValues = diffTolerateValues;
            return this;
        }
        public java.util.Map<String, ?> getDiffTolerateValues() {
            return this.diffTolerateValues;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setEnableDecimalScale(Integer enableDecimalScale) {
            this.enableDecimalScale = enableDecimalScale;
            return this;
        }
        public Integer getEnableDecimalScale() {
            return this.enableDecimalScale;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setFilterColumnName(String filterColumnName) {
            this.filterColumnName = filterColumnName;
            return this;
        }
        public String getFilterColumnName() {
            return this.filterColumnName;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setFilterColumns(String filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public String getFilterColumns() {
            return this.filterColumns;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setFloatPrecision(Integer floatPrecision) {
            this.floatPrecision = floatPrecision;
            return this;
        }
        public Integer getFloatPrecision() {
            return this.floatPrecision;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setIgnoreDecimalDiff(Integer ignoreDecimalDiff) {
            this.ignoreDecimalDiff = ignoreDecimalDiff;
            return this;
        }
        public Integer getIgnoreDecimalDiff() {
            return this.ignoreDecimalDiff;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setIgnoreDecimalScaleSuffixZero(Integer ignoreDecimalScaleSuffixZero) {
            this.ignoreDecimalScaleSuffixZero = ignoreDecimalScaleSuffixZero;
            return this;
        }
        public Integer getIgnoreDecimalScaleSuffixZero() {
            return this.ignoreDecimalScaleSuffixZero;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setIgnoreEmptyDiff(Integer ignoreEmptyDiff) {
            this.ignoreEmptyDiff = ignoreEmptyDiff;
            return this;
        }
        public Integer getIgnoreEmptyDiff() {
            return this.ignoreEmptyDiff;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setIgnoreNumericZero(Integer ignoreNumericZero) {
            this.ignoreNumericZero = ignoreNumericZero;
            return this;
        }
        public Integer getIgnoreNumericZero() {
            return this.ignoreNumericZero;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setIgnoreStringEmpty(Integer ignoreStringEmpty) {
            this.ignoreStringEmpty = ignoreStringEmpty;
            return this;
        }
        public Integer getIgnoreStringEmpty() {
            return this.ignoreStringEmpty;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setIgnoreZeroDiff(Integer ignoreZeroDiff) {
            this.ignoreZeroDiff = ignoreZeroDiff;
            return this;
        }
        public Integer getIgnoreZeroDiff() {
            return this.ignoreZeroDiff;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setIsCountCheck(Integer isCountCheck) {
            this.isCountCheck = isCountCheck;
            return this;
        }
        public Integer getIsCountCheck() {
            return this.isCountCheck;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public AddDataCheckTemplateRequestBasicMetricRules setSetDecimalScale(Integer setDecimalScale) {
            this.setDecimalScale = setDecimalScale;
            return this;
        }
        public Integer getSetDecimalScale() {
            return this.setDecimalScale;
        }

    }

    public static class AddDataCheckTemplateRequestComplexMetricRules extends TeaModel {
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
         * <p>The data type category. Valid values: 0 (native data type) and 1 (composite data type).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dataTypeClassify")
        public Integer dataTypeClassify;

        /**
         * <p>The data type group that identifies the data type category to which the verification rule applies. Valid values: integers from 0 to 7. For the description of each value, see the enumeration values.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dataTypeGroup")
        public Integer dataTypeGroup;

        /**
         * <p>The list of data types to which the verification rule applies. Configure this field based on your requirements.</p>
         */
        @NameInMap("dataTypeList")
        public java.util.List<String> dataTypeList;

        /**
         * <p>The data types. Configure this field based on your requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("dataTypes")
        public String dataTypes;

        /**
         * <p>The difference tolerance rate type. Valid values: 0 (unified) and 1 (custom). Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("diffTolerateType")
        public Integer diffTolerateType;

        /**
         * <p>The difference tolerance rate values. For the unified type, specify one value, such as {&quot;SAME&quot;: 0}. For the custom type, specify a value for each tolerance type, such as {&quot;SUM&quot;: 0.01, &quot;AVG&quot;: 0.001}.</p>
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
         * <p>The filter field names, separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("filterColumnName")
        public String filterColumnName;

        /**
         * <p><strong>[Deprecated]</strong> Use the filterColumnName field instead. This field is retained for backward compatibility.</p>
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
         * <p>Specifies whether to ignore trailing zero differences in decimal parts. Valid values: 0 (no) and 1 (yes).</p>
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
         * <p>Specifies whether to ignore differences between null values and empty strings. Valid values: 0 (no) and 1 (yes).</p>
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
         * <p>Specifies whether to ignore differences between null values and zero values. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreZeroDiff")
        public Integer ignoreZeroDiff;

        /**
         * <p>Specifies whether to enable count (data volume) verification. Valid values: 0 (no) and 1 (yes). Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("isCountCheck")
        public Integer isCountCheck;

        /**
         * <p>The rule ID that uniquely identifies a verification rule.</p>
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

        public static AddDataCheckTemplateRequestComplexMetricRules build(java.util.Map<String, ?> map) throws Exception {
            AddDataCheckTemplateRequestComplexMetricRules self = new AddDataCheckTemplateRequestComplexMetricRules();
            return TeaModel.build(map, self);
        }

        public AddDataCheckTemplateRequestComplexMetricRules setCheckMethods(String checkMethods) {
            this.checkMethods = checkMethods;
            return this;
        }
        public String getCheckMethods() {
            return this.checkMethods;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setControlFloatPrecision(Integer controlFloatPrecision) {
            this.controlFloatPrecision = controlFloatPrecision;
            return this;
        }
        public Integer getControlFloatPrecision() {
            return this.controlFloatPrecision;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setDataTypeClassify(Integer dataTypeClassify) {
            this.dataTypeClassify = dataTypeClassify;
            return this;
        }
        public Integer getDataTypeClassify() {
            return this.dataTypeClassify;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setDataTypeGroup(Integer dataTypeGroup) {
            this.dataTypeGroup = dataTypeGroup;
            return this;
        }
        public Integer getDataTypeGroup() {
            return this.dataTypeGroup;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setDataTypeList(java.util.List<String> dataTypeList) {
            this.dataTypeList = dataTypeList;
            return this;
        }
        public java.util.List<String> getDataTypeList() {
            return this.dataTypeList;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setDataTypes(String dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }
        public String getDataTypes() {
            return this.dataTypes;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setDiffTolerateType(Integer diffTolerateType) {
            this.diffTolerateType = diffTolerateType;
            return this;
        }
        public Integer getDiffTolerateType() {
            return this.diffTolerateType;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setDiffTolerateValues(java.util.Map<String, ?> diffTolerateValues) {
            this.diffTolerateValues = diffTolerateValues;
            return this;
        }
        public java.util.Map<String, ?> getDiffTolerateValues() {
            return this.diffTolerateValues;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setEnableDecimalScale(Integer enableDecimalScale) {
            this.enableDecimalScale = enableDecimalScale;
            return this;
        }
        public Integer getEnableDecimalScale() {
            return this.enableDecimalScale;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setFilterColumnName(String filterColumnName) {
            this.filterColumnName = filterColumnName;
            return this;
        }
        public String getFilterColumnName() {
            return this.filterColumnName;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setFilterColumns(String filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public String getFilterColumns() {
            return this.filterColumns;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setFloatPrecision(Integer floatPrecision) {
            this.floatPrecision = floatPrecision;
            return this;
        }
        public Integer getFloatPrecision() {
            return this.floatPrecision;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setIgnoreDecimalDiff(Integer ignoreDecimalDiff) {
            this.ignoreDecimalDiff = ignoreDecimalDiff;
            return this;
        }
        public Integer getIgnoreDecimalDiff() {
            return this.ignoreDecimalDiff;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setIgnoreDecimalScaleSuffixZero(Integer ignoreDecimalScaleSuffixZero) {
            this.ignoreDecimalScaleSuffixZero = ignoreDecimalScaleSuffixZero;
            return this;
        }
        public Integer getIgnoreDecimalScaleSuffixZero() {
            return this.ignoreDecimalScaleSuffixZero;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setIgnoreEmptyDiff(Integer ignoreEmptyDiff) {
            this.ignoreEmptyDiff = ignoreEmptyDiff;
            return this;
        }
        public Integer getIgnoreEmptyDiff() {
            return this.ignoreEmptyDiff;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setIgnoreNumericZero(Integer ignoreNumericZero) {
            this.ignoreNumericZero = ignoreNumericZero;
            return this;
        }
        public Integer getIgnoreNumericZero() {
            return this.ignoreNumericZero;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setIgnoreStringEmpty(Integer ignoreStringEmpty) {
            this.ignoreStringEmpty = ignoreStringEmpty;
            return this;
        }
        public Integer getIgnoreStringEmpty() {
            return this.ignoreStringEmpty;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setIgnoreZeroDiff(Integer ignoreZeroDiff) {
            this.ignoreZeroDiff = ignoreZeroDiff;
            return this;
        }
        public Integer getIgnoreZeroDiff() {
            return this.ignoreZeroDiff;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setIsCountCheck(Integer isCountCheck) {
            this.isCountCheck = isCountCheck;
            return this;
        }
        public Integer getIsCountCheck() {
            return this.isCountCheck;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public AddDataCheckTemplateRequestComplexMetricRules setSetDecimalScale(Integer setDecimalScale) {
            this.setDecimalScale = setDecimalScale;
            return this;
        }
        public Integer getSetDecimalScale() {
            return this.setDecimalScale;
        }

    }

    public static class AddDataCheckTemplateRequestDsEngineRels extends TeaModel {
        /**
         * <p>The ID of the datasource engine configuration.</p>
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

        public static AddDataCheckTemplateRequestDsEngineRels build(java.util.Map<String, ?> map) throws Exception {
            AddDataCheckTemplateRequestDsEngineRels self = new AddDataCheckTemplateRequestDsEngineRels();
            return TeaModel.build(map, self);
        }

        public AddDataCheckTemplateRequestDsEngineRels setDsEngineId(String dsEngineId) {
            this.dsEngineId = dsEngineId;
            return this;
        }
        public String getDsEngineId() {
            return this.dsEngineId;
        }

        public AddDataCheckTemplateRequestDsEngineRels setDsType(String dsType) {
            this.dsType = dsType;
            return this;
        }
        public String getDsType() {
            return this.dsType;
        }

        public AddDataCheckTemplateRequestDsEngineRels setEngineTypes(java.util.List<String> engineTypes) {
            this.engineTypes = engineTypes;
            return this;
        }
        public java.util.List<String> getEngineTypes() {
            return this.engineTypes;
        }

    }

    public static class AddDataCheckTemplateRequestFulltextRule extends TeaModel {
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
         * <p>The rule ID that uniquely identifies a verification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        public static AddDataCheckTemplateRequestFulltextRule build(java.util.Map<String, ?> map) throws Exception {
            AddDataCheckTemplateRequestFulltextRule self = new AddDataCheckTemplateRequestFulltextRule();
            return TeaModel.build(map, self);
        }

        public AddDataCheckTemplateRequestFulltextRule setCheckMode(Integer checkMode) {
            this.checkMode = checkMode;
            return this;
        }
        public Integer getCheckMode() {
            return this.checkMode;
        }

        public AddDataCheckTemplateRequestFulltextRule setColumnEqualCmpType(Integer columnEqualCmpType) {
            this.columnEqualCmpType = columnEqualCmpType;
            return this;
        }
        public Integer getColumnEqualCmpType() {
            return this.columnEqualCmpType;
        }

        public AddDataCheckTemplateRequestFulltextRule setColumnEqualCmpValues(String columnEqualCmpValues) {
            this.columnEqualCmpValues = columnEqualCmpValues;
            return this;
        }
        public String getColumnEqualCmpValues() {
            return this.columnEqualCmpValues;
        }

        public AddDataCheckTemplateRequestFulltextRule setColumnIsCosine(Integer columnIsCosine) {
            this.columnIsCosine = columnIsCosine;
            return this;
        }
        public Integer getColumnIsCosine() {
            return this.columnIsCosine;
        }

        public AddDataCheckTemplateRequestFulltextRule setColumnIsIgnoreNull(Integer columnIsIgnoreNull) {
            this.columnIsIgnoreNull = columnIsIgnoreNull;
            return this;
        }
        public Integer getColumnIsIgnoreNull() {
            return this.columnIsIgnoreNull;
        }

        public AddDataCheckTemplateRequestFulltextRule setColumnIsIgnoreZero(Integer columnIsIgnoreZero) {
            this.columnIsIgnoreZero = columnIsIgnoreZero;
            return this;
        }
        public Integer getColumnIsIgnoreZero() {
            return this.columnIsIgnoreZero;
        }

        public AddDataCheckTemplateRequestFulltextRule setColumnIsSamples(Integer columnIsSamples) {
            this.columnIsSamples = columnIsSamples;
            return this;
        }
        public Integer getColumnIsSamples() {
            return this.columnIsSamples;
        }

        public AddDataCheckTemplateRequestFulltextRule setColumnSamplesType(Integer columnSamplesType) {
            this.columnSamplesType = columnSamplesType;
            return this;
        }
        public Integer getColumnSamplesType() {
            return this.columnSamplesType;
        }

        public AddDataCheckTemplateRequestFulltextRule setColumnSamplesValue(Integer columnSamplesValue) {
            this.columnSamplesValue = columnSamplesValue;
            return this;
        }
        public Integer getColumnSamplesValue() {
            return this.columnSamplesValue;
        }

        public AddDataCheckTemplateRequestFulltextRule setColumnSizeCmpType(Integer columnSizeCmpType) {
            this.columnSizeCmpType = columnSizeCmpType;
            return this;
        }
        public Integer getColumnSizeCmpType() {
            return this.columnSizeCmpType;
        }

        public AddDataCheckTemplateRequestFulltextRule setColumnSizeCmpValues(String columnSizeCmpValues) {
            this.columnSizeCmpValues = columnSizeCmpValues;
            return this;
        }
        public String getColumnSizeCmpValues() {
            return this.columnSizeCmpValues;
        }

        public AddDataCheckTemplateRequestFulltextRule setIsPrimaryKeyCheck(Integer isPrimaryKeyCheck) {
            this.isPrimaryKeyCheck = isPrimaryKeyCheck;
            return this;
        }
        public Integer getIsPrimaryKeyCheck() {
            return this.isPrimaryKeyCheck;
        }

        public AddDataCheckTemplateRequestFulltextRule setLineCheckType(Integer lineCheckType) {
            this.lineCheckType = lineCheckType;
            return this;
        }
        public Integer getLineCheckType() {
            return this.lineCheckType;
        }

        public AddDataCheckTemplateRequestFulltextRule setLineIsPrintAll(Integer lineIsPrintAll) {
            this.lineIsPrintAll = lineIsPrintAll;
            return this;
        }
        public Integer getLineIsPrintAll() {
            return this.lineIsPrintAll;
        }

        public AddDataCheckTemplateRequestFulltextRule setLineIsSamples(Integer lineIsSamples) {
            this.lineIsSamples = lineIsSamples;
            return this;
        }
        public Integer getLineIsSamples() {
            return this.lineIsSamples;
        }

        public AddDataCheckTemplateRequestFulltextRule setLineSamplesType(Integer lineSamplesType) {
            this.lineSamplesType = lineSamplesType;
            return this;
        }
        public Integer getLineSamplesType() {
            return this.lineSamplesType;
        }

        public AddDataCheckTemplateRequestFulltextRule setLineSamplesValue(Integer lineSamplesValue) {
            this.lineSamplesValue = lineSamplesValue;
            return this;
        }
        public Integer getLineSamplesValue() {
            return this.lineSamplesValue;
        }

        public AddDataCheckTemplateRequestFulltextRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class AddDataCheckTemplateRequestMetricRules extends TeaModel {
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
         * <p>The data type category. Valid values: 0 (native data type) and 1 (composite data type).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dataTypeClassify")
        public Integer dataTypeClassify;

        /**
         * <p>The data type group that identifies the data type category to which the verification rule applies. Valid values: integers from 0 to 7. For the description of each value, see the enumeration values.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dataTypeGroup")
        public Integer dataTypeGroup;

        /**
         * <p>The list of data types to which the verification rule applies. Configure this field based on your requirements.</p>
         */
        @NameInMap("dataTypeList")
        public java.util.List<String> dataTypeList;

        /**
         * <p>The data types. Configure this field based on your requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("dataTypes")
        public String dataTypes;

        /**
         * <p>The difference tolerance rate type. Valid values: 0 (unified) and 1 (custom). Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("diffTolerateType")
        public Integer diffTolerateType;

        /**
         * <p>The difference tolerance rate values. For the unified type, specify one value, such as {&quot;SAME&quot;: 0}. For the custom type, specify a value for each tolerance type, such as {&quot;SUM&quot;: 0.01, &quot;AVG&quot;: 0.001}.</p>
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
         * <p>The filter field names, separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>col_a,col_b</p>
         */
        @NameInMap("filterColumnName")
        public String filterColumnName;

        /**
         * <p><strong>[Deprecated]</strong> Use the filterColumnName field instead. This field is retained for backward compatibility.</p>
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
         * <p>Specifies whether to ignore trailing zero differences in decimal parts. Valid values: 0 (no) and 1 (yes).</p>
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
         * <p>Specifies whether to ignore differences between null values and empty strings. Valid values: 0 (no) and 1 (yes).</p>
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
         * <p>Specifies whether to ignore differences between null values and zero values. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreZeroDiff")
        public Integer ignoreZeroDiff;

        /**
         * <p>Specifies whether to enable count (data volume) verification. Valid values: 0 (no) and 1 (yes). Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("isCountCheck")
        public Integer isCountCheck;

        /**
         * <p>The rule ID that uniquely identifies a verification rule.</p>
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

        public static AddDataCheckTemplateRequestMetricRules build(java.util.Map<String, ?> map) throws Exception {
            AddDataCheckTemplateRequestMetricRules self = new AddDataCheckTemplateRequestMetricRules();
            return TeaModel.build(map, self);
        }

        public AddDataCheckTemplateRequestMetricRules setCheckMethods(String checkMethods) {
            this.checkMethods = checkMethods;
            return this;
        }
        public String getCheckMethods() {
            return this.checkMethods;
        }

        public AddDataCheckTemplateRequestMetricRules setControlFloatPrecision(Integer controlFloatPrecision) {
            this.controlFloatPrecision = controlFloatPrecision;
            return this;
        }
        public Integer getControlFloatPrecision() {
            return this.controlFloatPrecision;
        }

        public AddDataCheckTemplateRequestMetricRules setDataTypeClassify(Integer dataTypeClassify) {
            this.dataTypeClassify = dataTypeClassify;
            return this;
        }
        public Integer getDataTypeClassify() {
            return this.dataTypeClassify;
        }

        public AddDataCheckTemplateRequestMetricRules setDataTypeGroup(Integer dataTypeGroup) {
            this.dataTypeGroup = dataTypeGroup;
            return this;
        }
        public Integer getDataTypeGroup() {
            return this.dataTypeGroup;
        }

        public AddDataCheckTemplateRequestMetricRules setDataTypeList(java.util.List<String> dataTypeList) {
            this.dataTypeList = dataTypeList;
            return this;
        }
        public java.util.List<String> getDataTypeList() {
            return this.dataTypeList;
        }

        public AddDataCheckTemplateRequestMetricRules setDataTypes(String dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }
        public String getDataTypes() {
            return this.dataTypes;
        }

        public AddDataCheckTemplateRequestMetricRules setDiffTolerateType(Integer diffTolerateType) {
            this.diffTolerateType = diffTolerateType;
            return this;
        }
        public Integer getDiffTolerateType() {
            return this.diffTolerateType;
        }

        public AddDataCheckTemplateRequestMetricRules setDiffTolerateValues(java.util.Map<String, ?> diffTolerateValues) {
            this.diffTolerateValues = diffTolerateValues;
            return this;
        }
        public java.util.Map<String, ?> getDiffTolerateValues() {
            return this.diffTolerateValues;
        }

        public AddDataCheckTemplateRequestMetricRules setEnableDecimalScale(Integer enableDecimalScale) {
            this.enableDecimalScale = enableDecimalScale;
            return this;
        }
        public Integer getEnableDecimalScale() {
            return this.enableDecimalScale;
        }

        public AddDataCheckTemplateRequestMetricRules setFilterColumnName(String filterColumnName) {
            this.filterColumnName = filterColumnName;
            return this;
        }
        public String getFilterColumnName() {
            return this.filterColumnName;
        }

        public AddDataCheckTemplateRequestMetricRules setFilterColumns(String filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public String getFilterColumns() {
            return this.filterColumns;
        }

        public AddDataCheckTemplateRequestMetricRules setFloatPrecision(Integer floatPrecision) {
            this.floatPrecision = floatPrecision;
            return this;
        }
        public Integer getFloatPrecision() {
            return this.floatPrecision;
        }

        public AddDataCheckTemplateRequestMetricRules setIgnoreDecimalDiff(Integer ignoreDecimalDiff) {
            this.ignoreDecimalDiff = ignoreDecimalDiff;
            return this;
        }
        public Integer getIgnoreDecimalDiff() {
            return this.ignoreDecimalDiff;
        }

        public AddDataCheckTemplateRequestMetricRules setIgnoreDecimalScaleSuffixZero(Integer ignoreDecimalScaleSuffixZero) {
            this.ignoreDecimalScaleSuffixZero = ignoreDecimalScaleSuffixZero;
            return this;
        }
        public Integer getIgnoreDecimalScaleSuffixZero() {
            return this.ignoreDecimalScaleSuffixZero;
        }

        public AddDataCheckTemplateRequestMetricRules setIgnoreEmptyDiff(Integer ignoreEmptyDiff) {
            this.ignoreEmptyDiff = ignoreEmptyDiff;
            return this;
        }
        public Integer getIgnoreEmptyDiff() {
            return this.ignoreEmptyDiff;
        }

        public AddDataCheckTemplateRequestMetricRules setIgnoreNumericZero(Integer ignoreNumericZero) {
            this.ignoreNumericZero = ignoreNumericZero;
            return this;
        }
        public Integer getIgnoreNumericZero() {
            return this.ignoreNumericZero;
        }

        public AddDataCheckTemplateRequestMetricRules setIgnoreStringEmpty(Integer ignoreStringEmpty) {
            this.ignoreStringEmpty = ignoreStringEmpty;
            return this;
        }
        public Integer getIgnoreStringEmpty() {
            return this.ignoreStringEmpty;
        }

        public AddDataCheckTemplateRequestMetricRules setIgnoreZeroDiff(Integer ignoreZeroDiff) {
            this.ignoreZeroDiff = ignoreZeroDiff;
            return this;
        }
        public Integer getIgnoreZeroDiff() {
            return this.ignoreZeroDiff;
        }

        public AddDataCheckTemplateRequestMetricRules setIsCountCheck(Integer isCountCheck) {
            this.isCountCheck = isCountCheck;
            return this;
        }
        public Integer getIsCountCheck() {
            return this.isCountCheck;
        }

        public AddDataCheckTemplateRequestMetricRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public AddDataCheckTemplateRequestMetricRules setSetDecimalScale(Integer setDecimalScale) {
            this.setDecimalScale = setDecimalScale;
            return this;
        }
        public Integer getSetDecimalScale() {
            return this.setDecimalScale;
        }

    }

    public static class AddDataCheckTemplateRequestNullRules extends TeaModel {
        /**
         * <p>The data type group that identifies the data type category to which the verification rule applies. Valid values: integers from 0 to 7. For the description of each value, see the enumeration values.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dataTypeGroup")
        public Integer dataTypeGroup;

        /**
         * <p>The null value definitions, stored in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("nullValues")
        public String nullValues;

        /**
         * <p>The rule ID that uniquely identifies a verification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        public static AddDataCheckTemplateRequestNullRules build(java.util.Map<String, ?> map) throws Exception {
            AddDataCheckTemplateRequestNullRules self = new AddDataCheckTemplateRequestNullRules();
            return TeaModel.build(map, self);
        }

        public AddDataCheckTemplateRequestNullRules setDataTypeGroup(Integer dataTypeGroup) {
            this.dataTypeGroup = dataTypeGroup;
            return this;
        }
        public Integer getDataTypeGroup() {
            return this.dataTypeGroup;
        }

        public AddDataCheckTemplateRequestNullRules setNullValues(String nullValues) {
            this.nullValues = nullValues;
            return this;
        }
        public String getNullValues() {
            return this.nullValues;
        }

        public AddDataCheckTemplateRequestNullRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class AddDataCheckTemplateRequestWeakContentRule extends TeaModel {
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
         * <p>The rule ID that uniquely identifies a verification rule.</p>
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

        public static AddDataCheckTemplateRequestWeakContentRule build(java.util.Map<String, ?> map) throws Exception {
            AddDataCheckTemplateRequestWeakContentRule self = new AddDataCheckTemplateRequestWeakContentRule();
            return TeaModel.build(map, self);
        }

        public AddDataCheckTemplateRequestWeakContentRule setFilterColumnExpression(String filterColumnExpression) {
            this.filterColumnExpression = filterColumnExpression;
            return this;
        }
        public String getFilterColumnExpression() {
            return this.filterColumnExpression;
        }

        public AddDataCheckTemplateRequestWeakContentRule setFilterColumnTypes(java.util.List<String> filterColumnTypes) {
            this.filterColumnTypes = filterColumnTypes;
            return this;
        }
        public java.util.List<String> getFilterColumnTypes() {
            return this.filterColumnTypes;
        }

        public AddDataCheckTemplateRequestWeakContentRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public AddDataCheckTemplateRequestWeakContentRule setWeakContentAlgorithm(String weakContentAlgorithm) {
            this.weakContentAlgorithm = weakContentAlgorithm;
            return this;
        }
        public String getWeakContentAlgorithm() {
            return this.weakContentAlgorithm;
        }

    }

}
