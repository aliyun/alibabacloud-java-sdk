// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckTemplateResponseBody extends TeaModel {
    /**
     * <p>The data body returned by the operation. For the field structure, refer to the child field descriptions below.</p>
     */
    @NameInMap("data")
    public GetDataCheckTemplateResponseBodyData data;

    /**
     * <p>The error code. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values: true: The call is successful. false: The call failed. If the call failed, check errCode and errMessage for details.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetDataCheckTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckTemplateResponseBody self = new GetDataCheckTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataCheckTemplateResponseBody setData(GetDataCheckTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataCheckTemplateResponseBodyData getData() {
        return this.data;
    }

    public GetDataCheckTemplateResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetDataCheckTemplateResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetDataCheckTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataCheckTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataCheckTemplateResponseBodyDataBasicMetricRules extends TeaModel {
        /**
         * <p>The check methods (metric calculation methods). Multiple values are separated by commas, such as SUM,AVG,MIN,MAX. The values must be within the range allowed by the templatetype.</p>
         * 
         * <strong>example:</strong>
         * <p>SUM,AVG</p>
         */
        @NameInMap("checkMethods")
        public String checkMethods;

        /**
         * <p>The data type category. Valid values: 0: primitive data type. 1: composite data type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dataTypeClassify")
        public Integer dataTypeClassify;

        /**
         * <p>The data type group that identifies the data type category to which the check rule applies. The value is an integer from 0 to 7. For the meaning of each value, refer to the valid values.</p>
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
         * <p>The difference tolerance rate type. Valid values: 0: unified. 1: custom. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("diffTolerateType")
        public Integer diffTolerateType;

        /**
         * <p>The difference tolerance rate values. When the type is unified, one value is used. When the type is custom, values are set by the configured tolerance type, such as sum:33,avg:99.</p>
         */
        @NameInMap("diffTolerateValues")
        public java.util.Map<String, ?> diffTolerateValues;

        /**
         * <p>Specifies whether to enable decimal scale control for DECIMAL type comparison. Valid values: 0: no. 1: yes.</p>
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
         * <p>Specifies whether to ignore trailing zeros in decimal places for DECIMAL type comparison. Valid values: 0: no. 1: yes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreDecimalScaleSuffixZero")
        public Integer ignoreDecimalScaleSuffixZero;

        /**
         * <p>Specifies whether to ignore zero values for numeric types. Valid values: 0: no. 1: yes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreNumericZero")
        public Integer ignoreNumericZero;

        /**
         * <p>Specifies whether to ignore empty strings and null for string types. Valid values: 0: no. 1: yes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreStringEmpty")
        public Integer ignoreStringEmpty;

        /**
         * <p>Specifies whether to enable count (data volume) check. Valid values: 0: no. 1: yes. Default value: 1.</p>
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
         * <p>The specific number of decimal places for DECIMAL type comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("setDecimalScale")
        public Integer setDecimalScale;

        public static GetDataCheckTemplateResponseBodyDataBasicMetricRules build(java.util.Map<String, ?> map) throws Exception {
            GetDataCheckTemplateResponseBodyDataBasicMetricRules self = new GetDataCheckTemplateResponseBodyDataBasicMetricRules();
            return TeaModel.build(map, self);
        }

        public GetDataCheckTemplateResponseBodyDataBasicMetricRules setCheckMethods(String checkMethods) {
            this.checkMethods = checkMethods;
            return this;
        }
        public String getCheckMethods() {
            return this.checkMethods;
        }

        public GetDataCheckTemplateResponseBodyDataBasicMetricRules setDataTypeClassify(Integer dataTypeClassify) {
            this.dataTypeClassify = dataTypeClassify;
            return this;
        }
        public Integer getDataTypeClassify() {
            return this.dataTypeClassify;
        }

        public GetDataCheckTemplateResponseBodyDataBasicMetricRules setDataTypeGroup(Integer dataTypeGroup) {
            this.dataTypeGroup = dataTypeGroup;
            return this;
        }
        public Integer getDataTypeGroup() {
            return this.dataTypeGroup;
        }

        public GetDataCheckTemplateResponseBodyDataBasicMetricRules setDataTypeList(java.util.List<String> dataTypeList) {
            this.dataTypeList = dataTypeList;
            return this;
        }
        public java.util.List<String> getDataTypeList() {
            return this.dataTypeList;
        }

        public GetDataCheckTemplateResponseBodyDataBasicMetricRules setDataTypes(String dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }
        public String getDataTypes() {
            return this.dataTypes;
        }

        public GetDataCheckTemplateResponseBodyDataBasicMetricRules setDiffTolerateType(Integer diffTolerateType) {
            this.diffTolerateType = diffTolerateType;
            return this;
        }
        public Integer getDiffTolerateType() {
            return this.diffTolerateType;
        }

        public GetDataCheckTemplateResponseBodyDataBasicMetricRules setDiffTolerateValues(java.util.Map<String, ?> diffTolerateValues) {
            this.diffTolerateValues = diffTolerateValues;
            return this;
        }
        public java.util.Map<String, ?> getDiffTolerateValues() {
            return this.diffTolerateValues;
        }

        public GetDataCheckTemplateResponseBodyDataBasicMetricRules setEnableDecimalScale(Integer enableDecimalScale) {
            this.enableDecimalScale = enableDecimalScale;
            return this;
        }
        public Integer getEnableDecimalScale() {
            return this.enableDecimalScale;
        }

        public GetDataCheckTemplateResponseBodyDataBasicMetricRules setFilterColumnName(String filterColumnName) {
            this.filterColumnName = filterColumnName;
            return this;
        }
        public String getFilterColumnName() {
            return this.filterColumnName;
        }

        public GetDataCheckTemplateResponseBodyDataBasicMetricRules setIgnoreDecimalScaleSuffixZero(Integer ignoreDecimalScaleSuffixZero) {
            this.ignoreDecimalScaleSuffixZero = ignoreDecimalScaleSuffixZero;
            return this;
        }
        public Integer getIgnoreDecimalScaleSuffixZero() {
            return this.ignoreDecimalScaleSuffixZero;
        }

        public GetDataCheckTemplateResponseBodyDataBasicMetricRules setIgnoreNumericZero(Integer ignoreNumericZero) {
            this.ignoreNumericZero = ignoreNumericZero;
            return this;
        }
        public Integer getIgnoreNumericZero() {
            return this.ignoreNumericZero;
        }

        public GetDataCheckTemplateResponseBodyDataBasicMetricRules setIgnoreStringEmpty(Integer ignoreStringEmpty) {
            this.ignoreStringEmpty = ignoreStringEmpty;
            return this;
        }
        public Integer getIgnoreStringEmpty() {
            return this.ignoreStringEmpty;
        }

        public GetDataCheckTemplateResponseBodyDataBasicMetricRules setIsCountCheck(Integer isCountCheck) {
            this.isCountCheck = isCountCheck;
            return this;
        }
        public Integer getIsCountCheck() {
            return this.isCountCheck;
        }

        public GetDataCheckTemplateResponseBodyDataBasicMetricRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetDataCheckTemplateResponseBodyDataBasicMetricRules setSetDecimalScale(Integer setDecimalScale) {
            this.setDecimalScale = setDecimalScale;
            return this;
        }
        public Integer getSetDecimalScale() {
            return this.setDecimalScale;
        }

    }

    public static class GetDataCheckTemplateResponseBodyDataComplexMetricRules extends TeaModel {
        /**
         * <p>The check methods (metric calculation methods). Multiple values are separated by commas, such as SUM,AVG,MIN,MAX. The values must be within the range allowed by the templatetype.</p>
         * 
         * <strong>example:</strong>
         * <p>SUM,AVG</p>
         */
        @NameInMap("checkMethods")
        public String checkMethods;

        /**
         * <p>The data type category. Valid values: 0: primitive data type. 1: composite data type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dataTypeClassify")
        public Integer dataTypeClassify;

        /**
         * <p>The data type group that identifies the data type category to which the check rule applies. The value is an integer from 0 to 7. For the meaning of each value, refer to the valid values.</p>
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
         * <p>The difference tolerance rate type. Valid values: 0: unified. 1: custom. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("diffTolerateType")
        public Integer diffTolerateType;

        /**
         * <p>The difference tolerance rate values. When the type is unified, one value is used. When the type is custom, values are set by the configured tolerance type, such as sum:33,avg:99.</p>
         */
        @NameInMap("diffTolerateValues")
        public java.util.Map<String, ?> diffTolerateValues;

        /**
         * <p>Specifies whether to enable decimal scale control for DECIMAL type comparison. Valid values: 0: no. 1: yes.</p>
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
         * <p>Specifies whether to ignore trailing zeros in decimal places for DECIMAL type comparison. Valid values: 0: no. 1: yes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreDecimalScaleSuffixZero")
        public Integer ignoreDecimalScaleSuffixZero;

        /**
         * <p>Specifies whether to ignore zero values for numeric types. Valid values: 0: no. 1: yes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreNumericZero")
        public Integer ignoreNumericZero;

        /**
         * <p>Specifies whether to ignore empty strings and null for string types. Valid values: 0: no. 1: yes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreStringEmpty")
        public Integer ignoreStringEmpty;

        /**
         * <p>Specifies whether to enable count (data volume) check. Valid values: 0: no. 1: yes. Default value: 1.</p>
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
         * <p>The specific number of decimal places for DECIMAL type comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("setDecimalScale")
        public Integer setDecimalScale;

        public static GetDataCheckTemplateResponseBodyDataComplexMetricRules build(java.util.Map<String, ?> map) throws Exception {
            GetDataCheckTemplateResponseBodyDataComplexMetricRules self = new GetDataCheckTemplateResponseBodyDataComplexMetricRules();
            return TeaModel.build(map, self);
        }

        public GetDataCheckTemplateResponseBodyDataComplexMetricRules setCheckMethods(String checkMethods) {
            this.checkMethods = checkMethods;
            return this;
        }
        public String getCheckMethods() {
            return this.checkMethods;
        }

        public GetDataCheckTemplateResponseBodyDataComplexMetricRules setDataTypeClassify(Integer dataTypeClassify) {
            this.dataTypeClassify = dataTypeClassify;
            return this;
        }
        public Integer getDataTypeClassify() {
            return this.dataTypeClassify;
        }

        public GetDataCheckTemplateResponseBodyDataComplexMetricRules setDataTypeGroup(Integer dataTypeGroup) {
            this.dataTypeGroup = dataTypeGroup;
            return this;
        }
        public Integer getDataTypeGroup() {
            return this.dataTypeGroup;
        }

        public GetDataCheckTemplateResponseBodyDataComplexMetricRules setDataTypeList(java.util.List<String> dataTypeList) {
            this.dataTypeList = dataTypeList;
            return this;
        }
        public java.util.List<String> getDataTypeList() {
            return this.dataTypeList;
        }

        public GetDataCheckTemplateResponseBodyDataComplexMetricRules setDataTypes(String dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }
        public String getDataTypes() {
            return this.dataTypes;
        }

        public GetDataCheckTemplateResponseBodyDataComplexMetricRules setDiffTolerateType(Integer diffTolerateType) {
            this.diffTolerateType = diffTolerateType;
            return this;
        }
        public Integer getDiffTolerateType() {
            return this.diffTolerateType;
        }

        public GetDataCheckTemplateResponseBodyDataComplexMetricRules setDiffTolerateValues(java.util.Map<String, ?> diffTolerateValues) {
            this.diffTolerateValues = diffTolerateValues;
            return this;
        }
        public java.util.Map<String, ?> getDiffTolerateValues() {
            return this.diffTolerateValues;
        }

        public GetDataCheckTemplateResponseBodyDataComplexMetricRules setEnableDecimalScale(Integer enableDecimalScale) {
            this.enableDecimalScale = enableDecimalScale;
            return this;
        }
        public Integer getEnableDecimalScale() {
            return this.enableDecimalScale;
        }

        public GetDataCheckTemplateResponseBodyDataComplexMetricRules setFilterColumnName(String filterColumnName) {
            this.filterColumnName = filterColumnName;
            return this;
        }
        public String getFilterColumnName() {
            return this.filterColumnName;
        }

        public GetDataCheckTemplateResponseBodyDataComplexMetricRules setIgnoreDecimalScaleSuffixZero(Integer ignoreDecimalScaleSuffixZero) {
            this.ignoreDecimalScaleSuffixZero = ignoreDecimalScaleSuffixZero;
            return this;
        }
        public Integer getIgnoreDecimalScaleSuffixZero() {
            return this.ignoreDecimalScaleSuffixZero;
        }

        public GetDataCheckTemplateResponseBodyDataComplexMetricRules setIgnoreNumericZero(Integer ignoreNumericZero) {
            this.ignoreNumericZero = ignoreNumericZero;
            return this;
        }
        public Integer getIgnoreNumericZero() {
            return this.ignoreNumericZero;
        }

        public GetDataCheckTemplateResponseBodyDataComplexMetricRules setIgnoreStringEmpty(Integer ignoreStringEmpty) {
            this.ignoreStringEmpty = ignoreStringEmpty;
            return this;
        }
        public Integer getIgnoreStringEmpty() {
            return this.ignoreStringEmpty;
        }

        public GetDataCheckTemplateResponseBodyDataComplexMetricRules setIsCountCheck(Integer isCountCheck) {
            this.isCountCheck = isCountCheck;
            return this;
        }
        public Integer getIsCountCheck() {
            return this.isCountCheck;
        }

        public GetDataCheckTemplateResponseBodyDataComplexMetricRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetDataCheckTemplateResponseBodyDataComplexMetricRules setSetDecimalScale(Integer setDecimalScale) {
            this.setDecimalScale = setDecimalScale;
            return this;
        }
        public Integer getSetDecimalScale() {
            return this.setDecimalScale;
        }

    }

    public static class GetDataCheckTemplateResponseBodyDataDsEngineRels extends TeaModel {
        /**
         * <p>The data source type, such as Hive or MaxCompute.</p>
         * 
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        @NameInMap("dsType")
        public String dsType;

        /**
         * <p>The list of covered check engine types, such as Tez or MapReduce. When in string format, multiple values are separated by commas.</p>
         */
        @NameInMap("engineTypes")
        public java.util.List<String> engineTypes;

        public static GetDataCheckTemplateResponseBodyDataDsEngineRels build(java.util.Map<String, ?> map) throws Exception {
            GetDataCheckTemplateResponseBodyDataDsEngineRels self = new GetDataCheckTemplateResponseBodyDataDsEngineRels();
            return TeaModel.build(map, self);
        }

        public GetDataCheckTemplateResponseBodyDataDsEngineRels setDsType(String dsType) {
            this.dsType = dsType;
            return this;
        }
        public String getDsType() {
            return this.dsType;
        }

        public GetDataCheckTemplateResponseBodyDataDsEngineRels setEngineTypes(java.util.List<String> engineTypes) {
            this.engineTypes = engineTypes;
            return this;
        }
        public java.util.List<String> getEngineTypes() {
            return this.engineTypes;
        }

    }

    public static class GetDataCheckTemplateResponseBodyDataFulltextRule extends TeaModel {
        /**
         * <p>The check mode. Valid values: 0: row-level overall comparison. 1: row-level column-by-column comparison. 2: both row-level overall comparison and row-level column-by-column comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("checkMode")
        public Integer checkMode;

        /**
         * <p>The equality comparison type for row-level column-by-column comparison. Valid values: 0: all field types. 1: primitive basic data types. 2: composite data types. 3: custom.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("columnEqualCmpType")
        public Integer columnEqualCmpType;

        /**
         * <p>The custom type list for equality comparison during row-level column-by-column comparison. Multiple values are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>ARRAY,MAP</p>
         */
        @NameInMap("columnEqualCmpValues")
        public String columnEqualCmpValues;

        /**
         * <p>Specifies whether to enable cosine similarity for row-level column-by-column comparison. Valid values: 0: no. 1: yes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("columnIsCosine")
        public Integer columnIsCosine;

        /**
         * <p>Specifies whether to ignore differences between null values and empty strings during row-by-row and column-by-column comparison. Valid values: 0: No. 1: Yes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("columnIsIgnoreNull")
        public Integer columnIsIgnoreNull;

        /**
         * <p>Specifies whether to ignore differences between null values and 0 values during row-by-row and column-by-column comparison. Valid values: 0: No. 1: Yes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("columnIsIgnoreZero")
        public Integer columnIsIgnoreZero;

        /**
         * <p>Specifies whether to enable sampling during row-by-row and column-by-column comparison. Valid values: 0: No. 1: Yes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("columnIsSamples")
        public Integer columnIsSamples;

        /**
         * <p>The sampling method during row-by-row and column-by-column comparison. Valid values: 0: by row. 1: by percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("columnSamplesType")
        public Integer columnSamplesType;

        /**
         * <p>The sampling value during row-by-row and column-by-column comparison. The meaning depends on the sampling method. When sampling by row, this value represents the number of rows. When sampling by percentage, this value represents the percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("columnSamplesValue")
        public Integer columnSamplesValue;

        /**
         * <p>The size comparison type during row-by-row and column-by-column comparison. Valid values: 0: all composite data types. 1: custom.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("columnSizeCmpType")
        public Integer columnSizeCmpType;

        /**
         * <p>The custom type list for size comparison during row-by-row and column-by-column comparison. Multiple values are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ARRAY,MAP</p>
         */
        @NameInMap("columnSizeCmpValues")
        public String columnSizeCmpValues;

        /**
         * <p>Specifies whether to enable the existence check for primary keys or composite primary keys. Valid values: 0: No. 1: Yes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("isPrimaryKeyCheck")
        public Integer isPrimaryKeyCheck;

        /**
         * <p>The row-by-row comparison method. Valid values: 0: md5. 1: crc32.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("lineCheckType")
        public Integer lineCheckType;

        /**
         * <p>Specifies whether to print all columns in the difference details during row-by-row comparison. Valid values: 0: No. 1: Yes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("lineIsPrintAll")
        public Integer lineIsPrintAll;

        /**
         * <p>Specifies whether to enable sampling during row-by-row comparison. Valid values: 0: No. 1: Yes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("lineIsSamples")
        public Integer lineIsSamples;

        /**
         * <p>The sampling method during row-by-row comparison. Valid values: 0: by row. 1: by percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("lineSamplesType")
        public Integer lineSamplesType;

        /**
         * <p>The sampling value during row-by-row comparison. The meaning depends on the sampling method. When sampling by row, this value represents the number of rows. When sampling by percentage, this value represents the percentage.</p>
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

        public static GetDataCheckTemplateResponseBodyDataFulltextRule build(java.util.Map<String, ?> map) throws Exception {
            GetDataCheckTemplateResponseBodyDataFulltextRule self = new GetDataCheckTemplateResponseBodyDataFulltextRule();
            return TeaModel.build(map, self);
        }

        public GetDataCheckTemplateResponseBodyDataFulltextRule setCheckMode(Integer checkMode) {
            this.checkMode = checkMode;
            return this;
        }
        public Integer getCheckMode() {
            return this.checkMode;
        }

        public GetDataCheckTemplateResponseBodyDataFulltextRule setColumnEqualCmpType(Integer columnEqualCmpType) {
            this.columnEqualCmpType = columnEqualCmpType;
            return this;
        }
        public Integer getColumnEqualCmpType() {
            return this.columnEqualCmpType;
        }

        public GetDataCheckTemplateResponseBodyDataFulltextRule setColumnEqualCmpValues(String columnEqualCmpValues) {
            this.columnEqualCmpValues = columnEqualCmpValues;
            return this;
        }
        public String getColumnEqualCmpValues() {
            return this.columnEqualCmpValues;
        }

        public GetDataCheckTemplateResponseBodyDataFulltextRule setColumnIsCosine(Integer columnIsCosine) {
            this.columnIsCosine = columnIsCosine;
            return this;
        }
        public Integer getColumnIsCosine() {
            return this.columnIsCosine;
        }

        public GetDataCheckTemplateResponseBodyDataFulltextRule setColumnIsIgnoreNull(Integer columnIsIgnoreNull) {
            this.columnIsIgnoreNull = columnIsIgnoreNull;
            return this;
        }
        public Integer getColumnIsIgnoreNull() {
            return this.columnIsIgnoreNull;
        }

        public GetDataCheckTemplateResponseBodyDataFulltextRule setColumnIsIgnoreZero(Integer columnIsIgnoreZero) {
            this.columnIsIgnoreZero = columnIsIgnoreZero;
            return this;
        }
        public Integer getColumnIsIgnoreZero() {
            return this.columnIsIgnoreZero;
        }

        public GetDataCheckTemplateResponseBodyDataFulltextRule setColumnIsSamples(Integer columnIsSamples) {
            this.columnIsSamples = columnIsSamples;
            return this;
        }
        public Integer getColumnIsSamples() {
            return this.columnIsSamples;
        }

        public GetDataCheckTemplateResponseBodyDataFulltextRule setColumnSamplesType(Integer columnSamplesType) {
            this.columnSamplesType = columnSamplesType;
            return this;
        }
        public Integer getColumnSamplesType() {
            return this.columnSamplesType;
        }

        public GetDataCheckTemplateResponseBodyDataFulltextRule setColumnSamplesValue(Integer columnSamplesValue) {
            this.columnSamplesValue = columnSamplesValue;
            return this;
        }
        public Integer getColumnSamplesValue() {
            return this.columnSamplesValue;
        }

        public GetDataCheckTemplateResponseBodyDataFulltextRule setColumnSizeCmpType(Integer columnSizeCmpType) {
            this.columnSizeCmpType = columnSizeCmpType;
            return this;
        }
        public Integer getColumnSizeCmpType() {
            return this.columnSizeCmpType;
        }

        public GetDataCheckTemplateResponseBodyDataFulltextRule setColumnSizeCmpValues(String columnSizeCmpValues) {
            this.columnSizeCmpValues = columnSizeCmpValues;
            return this;
        }
        public String getColumnSizeCmpValues() {
            return this.columnSizeCmpValues;
        }

        public GetDataCheckTemplateResponseBodyDataFulltextRule setIsPrimaryKeyCheck(Integer isPrimaryKeyCheck) {
            this.isPrimaryKeyCheck = isPrimaryKeyCheck;
            return this;
        }
        public Integer getIsPrimaryKeyCheck() {
            return this.isPrimaryKeyCheck;
        }

        public GetDataCheckTemplateResponseBodyDataFulltextRule setLineCheckType(Integer lineCheckType) {
            this.lineCheckType = lineCheckType;
            return this;
        }
        public Integer getLineCheckType() {
            return this.lineCheckType;
        }

        public GetDataCheckTemplateResponseBodyDataFulltextRule setLineIsPrintAll(Integer lineIsPrintAll) {
            this.lineIsPrintAll = lineIsPrintAll;
            return this;
        }
        public Integer getLineIsPrintAll() {
            return this.lineIsPrintAll;
        }

        public GetDataCheckTemplateResponseBodyDataFulltextRule setLineIsSamples(Integer lineIsSamples) {
            this.lineIsSamples = lineIsSamples;
            return this;
        }
        public Integer getLineIsSamples() {
            return this.lineIsSamples;
        }

        public GetDataCheckTemplateResponseBodyDataFulltextRule setLineSamplesType(Integer lineSamplesType) {
            this.lineSamplesType = lineSamplesType;
            return this;
        }
        public Integer getLineSamplesType() {
            return this.lineSamplesType;
        }

        public GetDataCheckTemplateResponseBodyDataFulltextRule setLineSamplesValue(Integer lineSamplesValue) {
            this.lineSamplesValue = lineSamplesValue;
            return this;
        }
        public Integer getLineSamplesValue() {
            return this.lineSamplesValue;
        }

        public GetDataCheckTemplateResponseBodyDataFulltextRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class GetDataCheckTemplateResponseBodyDataMetricRules extends TeaModel {
        /**
         * <p>The check methods (metric calculation methods). Multiple values are separated by commas (,), such as SUM,AVG,MIN,MAX. The values must be within the range allowed by the templatetype.</p>
         * 
         * <strong>example:</strong>
         * <p>SUM,AVG</p>
         */
        @NameInMap("checkMethods")
        public String checkMethods;

        /**
         * <p>The data type category. Valid values: 0: primitive data type. 1: composite data type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("dataTypeClassify")
        public Integer dataTypeClassify;

        /**
         * <p>The data type group that identifies the data type category to which the check rule applies. The value is an integer from 0 to 7. For the meaning of each value, refer to the valid values.</p>
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
         * <p>The difference tolerance rate type. Valid values: 0: unified. 1: custom. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("diffTolerateType")
        public Integer diffTolerateType;

        /**
         * <p>The difference tolerance rate values. When the type is unified, one value is used. When the type is custom, values are set by the configured tolerance type, such as sum:33,avg:99.</p>
         */
        @NameInMap("diffTolerateValues")
        public java.util.Map<String, ?> diffTolerateValues;

        /**
         * <p>Specifies whether to enable decimal scale control for DECIMAL type comparison. Valid values: 0: no. 1: yes.</p>
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
         * <p>Specifies whether to ignore trailing zeros in decimal places for DECIMAL type comparison. Valid values: 0: no. 1: yes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreDecimalScaleSuffixZero")
        public Integer ignoreDecimalScaleSuffixZero;

        /**
         * <p>Specifies whether to ignore zero values for numeric types. Valid values: 0: no. 1: yes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreNumericZero")
        public Integer ignoreNumericZero;

        /**
         * <p>Specifies whether to ignore empty strings and null for string types. Valid values: 0: no. 1: yes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ignoreStringEmpty")
        public Integer ignoreStringEmpty;

        /**
         * <p>Specifies whether to enable count (data volume) check. Valid values: 0: no. 1: yes. Default value: 1.</p>
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
         * <p>The specific number of decimal places for DECIMAL type comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("setDecimalScale")
        public Integer setDecimalScale;

        public static GetDataCheckTemplateResponseBodyDataMetricRules build(java.util.Map<String, ?> map) throws Exception {
            GetDataCheckTemplateResponseBodyDataMetricRules self = new GetDataCheckTemplateResponseBodyDataMetricRules();
            return TeaModel.build(map, self);
        }

        public GetDataCheckTemplateResponseBodyDataMetricRules setCheckMethods(String checkMethods) {
            this.checkMethods = checkMethods;
            return this;
        }
        public String getCheckMethods() {
            return this.checkMethods;
        }

        public GetDataCheckTemplateResponseBodyDataMetricRules setDataTypeClassify(Integer dataTypeClassify) {
            this.dataTypeClassify = dataTypeClassify;
            return this;
        }
        public Integer getDataTypeClassify() {
            return this.dataTypeClassify;
        }

        public GetDataCheckTemplateResponseBodyDataMetricRules setDataTypeGroup(Integer dataTypeGroup) {
            this.dataTypeGroup = dataTypeGroup;
            return this;
        }
        public Integer getDataTypeGroup() {
            return this.dataTypeGroup;
        }

        public GetDataCheckTemplateResponseBodyDataMetricRules setDataTypeList(java.util.List<String> dataTypeList) {
            this.dataTypeList = dataTypeList;
            return this;
        }
        public java.util.List<String> getDataTypeList() {
            return this.dataTypeList;
        }

        public GetDataCheckTemplateResponseBodyDataMetricRules setDataTypes(String dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }
        public String getDataTypes() {
            return this.dataTypes;
        }

        public GetDataCheckTemplateResponseBodyDataMetricRules setDiffTolerateType(Integer diffTolerateType) {
            this.diffTolerateType = diffTolerateType;
            return this;
        }
        public Integer getDiffTolerateType() {
            return this.diffTolerateType;
        }

        public GetDataCheckTemplateResponseBodyDataMetricRules setDiffTolerateValues(java.util.Map<String, ?> diffTolerateValues) {
            this.diffTolerateValues = diffTolerateValues;
            return this;
        }
        public java.util.Map<String, ?> getDiffTolerateValues() {
            return this.diffTolerateValues;
        }

        public GetDataCheckTemplateResponseBodyDataMetricRules setEnableDecimalScale(Integer enableDecimalScale) {
            this.enableDecimalScale = enableDecimalScale;
            return this;
        }
        public Integer getEnableDecimalScale() {
            return this.enableDecimalScale;
        }

        public GetDataCheckTemplateResponseBodyDataMetricRules setFilterColumnName(String filterColumnName) {
            this.filterColumnName = filterColumnName;
            return this;
        }
        public String getFilterColumnName() {
            return this.filterColumnName;
        }

        public GetDataCheckTemplateResponseBodyDataMetricRules setIgnoreDecimalScaleSuffixZero(Integer ignoreDecimalScaleSuffixZero) {
            this.ignoreDecimalScaleSuffixZero = ignoreDecimalScaleSuffixZero;
            return this;
        }
        public Integer getIgnoreDecimalScaleSuffixZero() {
            return this.ignoreDecimalScaleSuffixZero;
        }

        public GetDataCheckTemplateResponseBodyDataMetricRules setIgnoreNumericZero(Integer ignoreNumericZero) {
            this.ignoreNumericZero = ignoreNumericZero;
            return this;
        }
        public Integer getIgnoreNumericZero() {
            return this.ignoreNumericZero;
        }

        public GetDataCheckTemplateResponseBodyDataMetricRules setIgnoreStringEmpty(Integer ignoreStringEmpty) {
            this.ignoreStringEmpty = ignoreStringEmpty;
            return this;
        }
        public Integer getIgnoreStringEmpty() {
            return this.ignoreStringEmpty;
        }

        public GetDataCheckTemplateResponseBodyDataMetricRules setIsCountCheck(Integer isCountCheck) {
            this.isCountCheck = isCountCheck;
            return this;
        }
        public Integer getIsCountCheck() {
            return this.isCountCheck;
        }

        public GetDataCheckTemplateResponseBodyDataMetricRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetDataCheckTemplateResponseBodyDataMetricRules setSetDecimalScale(Integer setDecimalScale) {
            this.setDecimalScale = setDecimalScale;
            return this;
        }
        public Integer getSetDecimalScale() {
            return this.setDecimalScale;
        }

    }

    public static class GetDataCheckTemplateResponseBodyDataNullRules extends TeaModel {
        /**
         * <p>The data type group that identifies the data type category to which the check rule applies. The value is an integer from 0 to 7. For the meaning of each value, refer to the valid values.</p>
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

        public static GetDataCheckTemplateResponseBodyDataNullRules build(java.util.Map<String, ?> map) throws Exception {
            GetDataCheckTemplateResponseBodyDataNullRules self = new GetDataCheckTemplateResponseBodyDataNullRules();
            return TeaModel.build(map, self);
        }

        public GetDataCheckTemplateResponseBodyDataNullRules setDataTypeGroup(Integer dataTypeGroup) {
            this.dataTypeGroup = dataTypeGroup;
            return this;
        }
        public Integer getDataTypeGroup() {
            return this.dataTypeGroup;
        }

        public GetDataCheckTemplateResponseBodyDataNullRules setNullValues(String nullValues) {
            this.nullValues = nullValues;
            return this;
        }
        public String getNullValues() {
            return this.nullValues;
        }

        public GetDataCheckTemplateResponseBodyDataNullRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class GetDataCheckTemplateResponseBodyDataWeakContentRule extends TeaModel {
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
         * <p>The weak content algorithm name. Valid values: md5 and crc32.</p>
         * 
         * <strong>example:</strong>
         * <p>md5</p>
         */
        @NameInMap("weakContentAlgorithm")
        public String weakContentAlgorithm;

        public static GetDataCheckTemplateResponseBodyDataWeakContentRule build(java.util.Map<String, ?> map) throws Exception {
            GetDataCheckTemplateResponseBodyDataWeakContentRule self = new GetDataCheckTemplateResponseBodyDataWeakContentRule();
            return TeaModel.build(map, self);
        }

        public GetDataCheckTemplateResponseBodyDataWeakContentRule setFilterColumnExpression(String filterColumnExpression) {
            this.filterColumnExpression = filterColumnExpression;
            return this;
        }
        public String getFilterColumnExpression() {
            return this.filterColumnExpression;
        }

        public GetDataCheckTemplateResponseBodyDataWeakContentRule setFilterColumnTypes(java.util.List<String> filterColumnTypes) {
            this.filterColumnTypes = filterColumnTypes;
            return this;
        }
        public java.util.List<String> getFilterColumnTypes() {
            return this.filterColumnTypes;
        }

        public GetDataCheckTemplateResponseBodyDataWeakContentRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetDataCheckTemplateResponseBodyDataWeakContentRule setWeakContentAlgorithm(String weakContentAlgorithm) {
            this.weakContentAlgorithm = weakContentAlgorithm;
            return this;
        }
        public String getWeakContentAlgorithm() {
            return this.weakContentAlgorithm;
        }

    }

    public static class GetDataCheckTemplateResponseBodyData extends TeaModel {
        /**
         * <p>The list of check rules for basic data type metrics. This field is required when checkType is set to 1 (metric comparison).</p>
         */
        @NameInMap("basicMetricRules")
        public java.util.List<GetDataCheckTemplateResponseBodyDataBasicMetricRules> basicMetricRules;

        /**
         * <p>The check rule type. Valid values: 0: data volume comparison. 1: metric comparison. 2: weak content comparison. 3: custom comparison. 4: full-text comparison. 5: null rate comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("checkType")
        public Integer checkType;

        /**
         * <p>The Chinese name of the check type (used in export report fields).</p>
         * 
         * <strong>example:</strong>
         * <p>指标比对</p>
         */
        @NameInMap("checkTypeExport")
        public String checkTypeExport;

        /**
         * <p>The check type name.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("checkTypeName")
        public Integer checkTypeName;

        /**
         * <p>The list of check rules for composite data type metrics. This field is used when checkType is set to 1 (metric comparison).</p>
         */
        @NameInMap("complexMetricRules")
        public java.util.List<GetDataCheckTemplateResponseBodyDataComplexMetricRules> complexMetricRules;

        /**
         * <p>The list of data source engine relationships (data source engines associated with the template).</p>
         */
        @NameInMap("dsEngineRels")
        public java.util.List<GetDataCheckTemplateResponseBodyDataDsEngineRels> dsEngineRels;

        /**
         * <p>The full-text comparison rule. This field has a value when checkType is set to 4 (full-text comparison). For the field structure, refer to the child field descriptions below.</p>
         */
        @NameInMap("fulltextRule")
        public GetDataCheckTemplateResponseBodyDataFulltextRule fulltextRule;

        /**
         * <p>The list of metric check rules. This parameter has a value when checkType is set to 1 (metric comparison).</p>
         */
        @NameInMap("metricRules")
        public java.util.List<GetDataCheckTemplateResponseBodyDataMetricRules> metricRules;

        /**
         * <p>The list of null rate check rules. This parameter has a value when checkType is set to 5 (null rate comparison).</p>
         */
        @NameInMap("nullRules")
        public java.util.List<GetDataCheckTemplateResponseBodyDataNullRules> nullRules;

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
         * <p>The name of the check template.</p>
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
        public GetDataCheckTemplateResponseBodyDataWeakContentRule weakContentRule;

        public static GetDataCheckTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataCheckTemplateResponseBodyData self = new GetDataCheckTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataCheckTemplateResponseBodyData setBasicMetricRules(java.util.List<GetDataCheckTemplateResponseBodyDataBasicMetricRules> basicMetricRules) {
            this.basicMetricRules = basicMetricRules;
            return this;
        }
        public java.util.List<GetDataCheckTemplateResponseBodyDataBasicMetricRules> getBasicMetricRules() {
            return this.basicMetricRules;
        }

        public GetDataCheckTemplateResponseBodyData setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public GetDataCheckTemplateResponseBodyData setCheckTypeExport(String checkTypeExport) {
            this.checkTypeExport = checkTypeExport;
            return this;
        }
        public String getCheckTypeExport() {
            return this.checkTypeExport;
        }

        public GetDataCheckTemplateResponseBodyData setCheckTypeName(Integer checkTypeName) {
            this.checkTypeName = checkTypeName;
            return this;
        }
        public Integer getCheckTypeName() {
            return this.checkTypeName;
        }

        public GetDataCheckTemplateResponseBodyData setComplexMetricRules(java.util.List<GetDataCheckTemplateResponseBodyDataComplexMetricRules> complexMetricRules) {
            this.complexMetricRules = complexMetricRules;
            return this;
        }
        public java.util.List<GetDataCheckTemplateResponseBodyDataComplexMetricRules> getComplexMetricRules() {
            return this.complexMetricRules;
        }

        public GetDataCheckTemplateResponseBodyData setDsEngineRels(java.util.List<GetDataCheckTemplateResponseBodyDataDsEngineRels> dsEngineRels) {
            this.dsEngineRels = dsEngineRels;
            return this;
        }
        public java.util.List<GetDataCheckTemplateResponseBodyDataDsEngineRels> getDsEngineRels() {
            return this.dsEngineRels;
        }

        public GetDataCheckTemplateResponseBodyData setFulltextRule(GetDataCheckTemplateResponseBodyDataFulltextRule fulltextRule) {
            this.fulltextRule = fulltextRule;
            return this;
        }
        public GetDataCheckTemplateResponseBodyDataFulltextRule getFulltextRule() {
            return this.fulltextRule;
        }

        public GetDataCheckTemplateResponseBodyData setMetricRules(java.util.List<GetDataCheckTemplateResponseBodyDataMetricRules> metricRules) {
            this.metricRules = metricRules;
            return this;
        }
        public java.util.List<GetDataCheckTemplateResponseBodyDataMetricRules> getMetricRules() {
            return this.metricRules;
        }

        public GetDataCheckTemplateResponseBodyData setNullRules(java.util.List<GetDataCheckTemplateResponseBodyDataNullRules> nullRules) {
            this.nullRules = nullRules;
            return this;
        }
        public java.util.List<GetDataCheckTemplateResponseBodyDataNullRules> getNullRules() {
            return this.nullRules;
        }

        public GetDataCheckTemplateResponseBodyData setTemplateDesc(String templateDesc) {
            this.templateDesc = templateDesc;
            return this;
        }
        public String getTemplateDesc() {
            return this.templateDesc;
        }

        public GetDataCheckTemplateResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetDataCheckTemplateResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetDataCheckTemplateResponseBodyData setWeakContentRule(GetDataCheckTemplateResponseBodyDataWeakContentRule weakContentRule) {
            this.weakContentRule = weakContentRule;
            return this;
        }
        public GetDataCheckTemplateResponseBodyDataWeakContentRule getWeakContentRule() {
            return this.weakContentRule;
        }

    }

}
