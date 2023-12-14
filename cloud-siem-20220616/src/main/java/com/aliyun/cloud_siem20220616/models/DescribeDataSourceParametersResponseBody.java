// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeDataSourceParametersResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeDataSourceParametersResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDataSourceParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourceParametersResponseBody self = new DescribeDataSourceParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourceParametersResponseBody setData(java.util.List<DescribeDataSourceParametersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDataSourceParametersResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDataSourceParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDataSourceParametersResponseBodyDataParamValue extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Value")
        public String value;

        public static DescribeDataSourceParametersResponseBodyDataParamValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSourceParametersResponseBodyDataParamValue self = new DescribeDataSourceParametersResponseBodyDataParamValue();
            return TeaModel.build(map, self);
        }

        public DescribeDataSourceParametersResponseBodyDataParamValue setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeDataSourceParametersResponseBodyDataParamValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDataSourceParametersResponseBodyData extends TeaModel {
        @NameInMap("CanEditted")
        public Integer canEditted;

        @NameInMap("CloudCode")
        public String cloudCode;

        @NameInMap("DataSourceType")
        public String dataSourceType;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Disabled")
        public Boolean disabled;

        @NameInMap("FormatCheck")
        public String formatCheck;

        @NameInMap("Hit")
        public String hit;

        @NameInMap("ParaCode")
        public String paraCode;

        @NameInMap("ParaLevel")
        public Integer paraLevel;

        @NameInMap("ParaName")
        public String paraName;

        @NameInMap("ParaType")
        public String paraType;

        @NameInMap("ParamValue")
        public java.util.List<DescribeDataSourceParametersResponseBodyDataParamValue> paramValue;

        @NameInMap("Required")
        public Integer required;

        @NameInMap("Title")
        public String title;

        public static DescribeDataSourceParametersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSourceParametersResponseBodyData self = new DescribeDataSourceParametersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDataSourceParametersResponseBodyData setCanEditted(Integer canEditted) {
            this.canEditted = canEditted;
            return this;
        }
        public Integer getCanEditted() {
            return this.canEditted;
        }

        public DescribeDataSourceParametersResponseBodyData setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
        }

        public DescribeDataSourceParametersResponseBodyData setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public DescribeDataSourceParametersResponseBodyData setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeDataSourceParametersResponseBodyData setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeDataSourceParametersResponseBodyData setFormatCheck(String formatCheck) {
            this.formatCheck = formatCheck;
            return this;
        }
        public String getFormatCheck() {
            return this.formatCheck;
        }

        public DescribeDataSourceParametersResponseBodyData setHit(String hit) {
            this.hit = hit;
            return this;
        }
        public String getHit() {
            return this.hit;
        }

        public DescribeDataSourceParametersResponseBodyData setParaCode(String paraCode) {
            this.paraCode = paraCode;
            return this;
        }
        public String getParaCode() {
            return this.paraCode;
        }

        public DescribeDataSourceParametersResponseBodyData setParaLevel(Integer paraLevel) {
            this.paraLevel = paraLevel;
            return this;
        }
        public Integer getParaLevel() {
            return this.paraLevel;
        }

        public DescribeDataSourceParametersResponseBodyData setParaName(String paraName) {
            this.paraName = paraName;
            return this;
        }
        public String getParaName() {
            return this.paraName;
        }

        public DescribeDataSourceParametersResponseBodyData setParaType(String paraType) {
            this.paraType = paraType;
            return this;
        }
        public String getParaType() {
            return this.paraType;
        }

        public DescribeDataSourceParametersResponseBodyData setParamValue(java.util.List<DescribeDataSourceParametersResponseBodyDataParamValue> paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public java.util.List<DescribeDataSourceParametersResponseBodyDataParamValue> getParamValue() {
            return this.paramValue;
        }

        public DescribeDataSourceParametersResponseBodyData setRequired(Integer required) {
            this.required = required;
            return this;
        }
        public Integer getRequired() {
            return this.required;
        }

        public DescribeDataSourceParametersResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
