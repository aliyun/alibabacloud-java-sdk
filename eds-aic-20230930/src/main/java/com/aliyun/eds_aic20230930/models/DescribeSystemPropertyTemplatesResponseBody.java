// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeSystemPropertyTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5C5CEF0A-D6E1-58D3-8750-67DB4F82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SystemPropertyTemplateModel")
    public java.util.List<DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModel> systemPropertyTemplateModel;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSystemPropertyTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemPropertyTemplatesResponseBody self = new DescribeSystemPropertyTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSystemPropertyTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSystemPropertyTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSystemPropertyTemplatesResponseBody setSystemPropertyTemplateModel(java.util.List<DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModel> systemPropertyTemplateModel) {
        this.systemPropertyTemplateModel = systemPropertyTemplateModel;
        return this;
    }
    public java.util.List<DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModel> getSystemPropertyTemplateModel() {
        return this.systemPropertyTemplateModel;
    }

    public DescribeSystemPropertyTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModelSystemPropertyInfoCustomPropertyInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>propKey</p>
         */
        @NameInMap("PropertyName")
        public String propertyName;

        /**
         * <strong>example:</strong>
         * <p>propValue</p>
         */
        @NameInMap("PropertyValue")
        public String propertyValue;

        public static DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModelSystemPropertyInfoCustomPropertyInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModelSystemPropertyInfoCustomPropertyInfos self = new DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModelSystemPropertyInfoCustomPropertyInfos();
            return TeaModel.build(map, self);
        }

        public DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModelSystemPropertyInfoCustomPropertyInfos setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

        public DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModelSystemPropertyInfoCustomPropertyInfos setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public String getPropertyValue() {
            return this.propertyValue;
        }

    }

    public static class DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModelSystemPropertyInfo extends TeaModel {
        @NameInMap("CustomPropertyInfos")
        public java.util.List<DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModelSystemPropertyInfoCustomPropertyInfos> customPropertyInfos;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoProductDevice")
        public String roProductDevice;

        public static DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModelSystemPropertyInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModelSystemPropertyInfo self = new DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModelSystemPropertyInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModelSystemPropertyInfo setCustomPropertyInfos(java.util.List<DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModelSystemPropertyInfoCustomPropertyInfos> customPropertyInfos) {
            this.customPropertyInfos = customPropertyInfos;
            return this;
        }
        public java.util.List<DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModelSystemPropertyInfoCustomPropertyInfos> getCustomPropertyInfos() {
            return this.customPropertyInfos;
        }

        public DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModelSystemPropertyInfo setRoProductDevice(String roProductDevice) {
            this.roProductDevice = roProductDevice;
            return this;
        }
        public String getRoProductDevice() {
            return this.roProductDevice;
        }

    }

    public static class DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableAuto")
        public Boolean enableAuto;

        /**
         * <strong>example:</strong>
         * <p><a href="https://filepath****.com">https://filepath****.com</a></p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <strong>example:</strong>
         * <p>init</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("SystemPropertyInfo")
        public DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModelSystemPropertyInfo systemPropertyInfo;

        /**
         * <strong>example:</strong>
         * <p>ap-0caoenwutkkx****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        public static DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModel self = new DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModel();
            return TeaModel.build(map, self);
        }

        public DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModel setEnableAuto(Boolean enableAuto) {
            this.enableAuto = enableAuto;
            return this;
        }
        public Boolean getEnableAuto() {
            return this.enableAuto;
        }

        public DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModel setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModel setSystemPropertyInfo(DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModelSystemPropertyInfo systemPropertyInfo) {
            this.systemPropertyInfo = systemPropertyInfo;
            return this;
        }
        public DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModelSystemPropertyInfo getSystemPropertyInfo() {
            return this.systemPropertyInfo;
        }

        public DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModel setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public DescribeSystemPropertyTemplatesResponseBodySystemPropertyTemplateModel setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
