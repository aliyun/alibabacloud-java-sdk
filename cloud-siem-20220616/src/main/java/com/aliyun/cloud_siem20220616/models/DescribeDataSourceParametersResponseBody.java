// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeDataSourceParametersResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeDataSourceParametersResponseBodyData> data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
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
        /**
         * <p>The displayed content.</p>
         * 
         * <strong>example:</strong>
         * <p>guangzhou</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The actual value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-guangzhou</p>
         */
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
        /**
         * <p>Indicates whether the parameter is editable. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: The parameter cannot be modified.</p>
         * </li>
         * <li><p><strong>1</strong>: The parameter can be modified.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>wafApi</p>
         */
        @NameInMap("CanEditted")
        public Integer canEditted;

        /**
         * <p>The code for the multicloud environment. Valid values:</p>
         * <ul>
         * <li><p><strong>qcloud</strong>: Tencent Cloud.</p>
         * </li>
         * <li><p><strong>aliyun</strong>: Alibaba Cloud.</p>
         * </li>
         * <li><p><strong>hcloud</strong>: Huawei Cloud.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hcloud</p>
         */
        @NameInMap("CloudCode")
        public String cloudCode;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><p><strong>obs</strong>: Huawei Cloud OBS.</p>
         * </li>
         * <li><p><strong>wafApi</strong>: Tencent Cloud WAF download API.</p>
         * </li>
         * <li><p><strong>ckafka</strong>: Tencent Cloud CKafka.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>obs</p>
         */
        @NameInMap("DataSourceType")
        public String dataSourceType;

        /**
         * <p>The default value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>wafApi</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>Indicates whether the parameter can be modified. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The parameter cannot be modified.</p>
         * </li>
         * <li><p><strong>false</strong>: The parameter can be modified.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>wafApi</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The format check method.</p>
         * 
         * <strong>example:</strong>
         * <p>email</p>
         */
        @NameInMap("FormatCheck")
        public String formatCheck;

        /**
         * <p>Additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>obs docment</p>
         */
        @NameInMap("Hit")
        public String hit;

        /**
         * <p>The code of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>region_code</p>
         */
        @NameInMap("ParaCode")
        public String paraCode;

        /**
         * <p>The level of the parameter. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: data source parameter.</p>
         * </li>
         * <li><p><strong>2</strong>: log parameter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParaLevel")
        public Integer paraLevel;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>region local</p>
         */
        @NameInMap("ParaName")
        public String paraName;

        /**
         * <p>The type of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("ParaType")
        public String paraType;

        /**
         * <p>The list of parameters.</p>
         */
        @NameInMap("ParamValue")
        public java.util.List<DescribeDataSourceParametersResponseBodyDataParamValue> paramValue;

        /**
         * <p>Indicates whether the parameter is required. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: The parameter is required.</p>
         * </li>
         * <li><p><strong>0</strong>: The parameter is optional.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Required")
        public Integer required;

        /**
         * <p>The prompt for the parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>obs bucket name</p>
         */
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
