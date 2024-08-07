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
     * <p>The request ID.</p>
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
         * <p>The display value.</p>
         * 
         * <strong>example:</strong>
         * <p>guangzhou</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The actual value.</p>
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
         * <p>Indicates whether the edit operation is supported. Valid values:</p>
         * <ul>
         * <li><strong>0</strong></li>
         * <li><strong>1</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>wafApi</p>
         */
        @NameInMap("CanEditted")
        public Integer canEditted;

        /**
         * <p>The code of the cloud service provider. Valid values:</p>
         * <ul>
         * <li><strong>qcloud</strong>: Tencent Cloud</li>
         * <li><strong>aliyun</strong>: Alibaba Cloud</li>
         * <li><strong>hcloud</strong>: Huawei Cloud</li>
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
         * <li><strong>obs</strong>: Huawei Cloud Object Storage Service (OBS)</li>
         * <li><strong>wafApi</strong>: download API of Tencent Cloud Web Application Firewall (WAF)</li>
         * <li><strong>ckafka</strong>: Tencent Cloud TDMQ for CKafka</li>
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
         * <p>Indicates whether the modification operation is forbidden. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>wafApi</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The method that is used to check the parameter format.</p>
         * 
         * <strong>example:</strong>
         * <p>email</p>
         */
        @NameInMap("FormatCheck")
        public String formatCheck;

        /**
         * <p>The additional information.</p>
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
         * <p>The parameter level. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: the parameters of the data source</li>
         * <li><strong>2</strong>: the parameters of the log</li>
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
         * <p>The data type of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("ParaType")
        public String paraType;

        /**
         * <p>The value of the parameter.</p>
         */
        @NameInMap("ParamValue")
        public java.util.List<DescribeDataSourceParametersResponseBodyDataParamValue> paramValue;

        /**
         * <p>Indicates whether the parameter is required. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: required</li>
         * <li><strong>0</strong>: optional</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Required")
        public Integer required;

        /**
         * <p>The note for the parameter value.</p>
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
