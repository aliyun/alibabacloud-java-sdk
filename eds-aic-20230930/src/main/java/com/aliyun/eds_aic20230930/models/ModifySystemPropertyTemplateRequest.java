// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifySystemPropertyTemplateRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically generate preset system properties.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAuto")
    public Boolean enableAuto;

    /**
     * <p>The URL of the property template file. The system synchronously parses the file. If the file format is invalid, a parsing error is returned.</p>
     * <blockquote>
     * <p>File template format: <code>{ &quot;properties&quot;:{&quot;key1&quot;:&quot;value1&quot;, &quot;key2&quot;:&quot;value2&quot;}}</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://filepath****.com">https://filepath****.com</a></p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The information about the system property template.</p>
     */
    @NameInMap("SystemPropertyInfo")
    public ModifySystemPropertyTemplateRequestSystemPropertyInfo systemPropertyInfo;

    /**
     * <p>The ID of the property template.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-angyvganxlf****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The name of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>Template 1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static ModifySystemPropertyTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySystemPropertyTemplateRequest self = new ModifySystemPropertyTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifySystemPropertyTemplateRequest setEnableAuto(Boolean enableAuto) {
        this.enableAuto = enableAuto;
        return this;
    }
    public Boolean getEnableAuto() {
        return this.enableAuto;
    }

    public ModifySystemPropertyTemplateRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public ModifySystemPropertyTemplateRequest setSystemPropertyInfo(ModifySystemPropertyTemplateRequestSystemPropertyInfo systemPropertyInfo) {
        this.systemPropertyInfo = systemPropertyInfo;
        return this;
    }
    public ModifySystemPropertyTemplateRequestSystemPropertyInfo getSystemPropertyInfo() {
        return this.systemPropertyInfo;
    }

    public ModifySystemPropertyTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ModifySystemPropertyTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public static class ModifySystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos extends TeaModel {
        /**
         * <p>The key of the custom property.</p>
         * 
         * <strong>example:</strong>
         * <p>propKey</p>
         */
        @NameInMap("PropertyName")
        public String propertyName;

        /**
         * <p>The value of the custom property.</p>
         * 
         * <strong>example:</strong>
         * <p>propValue</p>
         */
        @NameInMap("PropertyValue")
        public String propertyValue;

        public static ModifySystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos build(java.util.Map<String, ?> map) throws Exception {
            ModifySystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos self = new ModifySystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos();
            return TeaModel.build(map, self);
        }

        public ModifySystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

        public ModifySystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public String getPropertyValue() {
            return this.propertyValue;
        }

    }

    public static class ModifySystemPropertyTemplateRequestSystemPropertyInfo extends TeaModel {
        /**
         * <p>The information about custom properties.</p>
         */
        @NameInMap("CustomPropertyInfos")
        public java.util.List<ModifySystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos> customPropertyInfos;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoBootloader")
        public String roBootloader;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoBuildDisplayId")
        public String roBuildDisplayId;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoBuildFingerprint")
        public String roBuildFingerprint;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoBuildHost")
        public String roBuildHost;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoBuildId")
        public String roBuildId;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoBuildProduct")
        public String roBuildProduct;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoBuildTags")
        public String roBuildTags;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoBuildType")
        public String roBuildType;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoBuildUser")
        public String roBuildUser;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoProductBoard")
        public String roProductBoard;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoProductBrand")
        public String roProductBrand;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoProductDevice")
        public String roProductDevice;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoProductManufacturer")
        public String roProductManufacturer;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoProductModel")
        public String roProductModel;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RwRoSerialNo")
        public String rwRoSerialNo;

        public static ModifySystemPropertyTemplateRequestSystemPropertyInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifySystemPropertyTemplateRequestSystemPropertyInfo self = new ModifySystemPropertyTemplateRequestSystemPropertyInfo();
            return TeaModel.build(map, self);
        }

        public ModifySystemPropertyTemplateRequestSystemPropertyInfo setCustomPropertyInfos(java.util.List<ModifySystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos> customPropertyInfos) {
            this.customPropertyInfos = customPropertyInfos;
            return this;
        }
        public java.util.List<ModifySystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos> getCustomPropertyInfos() {
            return this.customPropertyInfos;
        }

        public ModifySystemPropertyTemplateRequestSystemPropertyInfo setRoBootloader(String roBootloader) {
            this.roBootloader = roBootloader;
            return this;
        }
        public String getRoBootloader() {
            return this.roBootloader;
        }

        public ModifySystemPropertyTemplateRequestSystemPropertyInfo setRoBuildDisplayId(String roBuildDisplayId) {
            this.roBuildDisplayId = roBuildDisplayId;
            return this;
        }
        public String getRoBuildDisplayId() {
            return this.roBuildDisplayId;
        }

        public ModifySystemPropertyTemplateRequestSystemPropertyInfo setRoBuildFingerprint(String roBuildFingerprint) {
            this.roBuildFingerprint = roBuildFingerprint;
            return this;
        }
        public String getRoBuildFingerprint() {
            return this.roBuildFingerprint;
        }

        public ModifySystemPropertyTemplateRequestSystemPropertyInfo setRoBuildHost(String roBuildHost) {
            this.roBuildHost = roBuildHost;
            return this;
        }
        public String getRoBuildHost() {
            return this.roBuildHost;
        }

        public ModifySystemPropertyTemplateRequestSystemPropertyInfo setRoBuildId(String roBuildId) {
            this.roBuildId = roBuildId;
            return this;
        }
        public String getRoBuildId() {
            return this.roBuildId;
        }

        public ModifySystemPropertyTemplateRequestSystemPropertyInfo setRoBuildProduct(String roBuildProduct) {
            this.roBuildProduct = roBuildProduct;
            return this;
        }
        public String getRoBuildProduct() {
            return this.roBuildProduct;
        }

        public ModifySystemPropertyTemplateRequestSystemPropertyInfo setRoBuildTags(String roBuildTags) {
            this.roBuildTags = roBuildTags;
            return this;
        }
        public String getRoBuildTags() {
            return this.roBuildTags;
        }

        public ModifySystemPropertyTemplateRequestSystemPropertyInfo setRoBuildType(String roBuildType) {
            this.roBuildType = roBuildType;
            return this;
        }
        public String getRoBuildType() {
            return this.roBuildType;
        }

        public ModifySystemPropertyTemplateRequestSystemPropertyInfo setRoBuildUser(String roBuildUser) {
            this.roBuildUser = roBuildUser;
            return this;
        }
        public String getRoBuildUser() {
            return this.roBuildUser;
        }

        public ModifySystemPropertyTemplateRequestSystemPropertyInfo setRoProductBoard(String roProductBoard) {
            this.roProductBoard = roProductBoard;
            return this;
        }
        public String getRoProductBoard() {
            return this.roProductBoard;
        }

        public ModifySystemPropertyTemplateRequestSystemPropertyInfo setRoProductBrand(String roProductBrand) {
            this.roProductBrand = roProductBrand;
            return this;
        }
        public String getRoProductBrand() {
            return this.roProductBrand;
        }

        public ModifySystemPropertyTemplateRequestSystemPropertyInfo setRoProductDevice(String roProductDevice) {
            this.roProductDevice = roProductDevice;
            return this;
        }
        public String getRoProductDevice() {
            return this.roProductDevice;
        }

        public ModifySystemPropertyTemplateRequestSystemPropertyInfo setRoProductManufacturer(String roProductManufacturer) {
            this.roProductManufacturer = roProductManufacturer;
            return this;
        }
        public String getRoProductManufacturer() {
            return this.roProductManufacturer;
        }

        public ModifySystemPropertyTemplateRequestSystemPropertyInfo setRoProductModel(String roProductModel) {
            this.roProductModel = roProductModel;
            return this;
        }
        public String getRoProductModel() {
            return this.roProductModel;
        }

        public ModifySystemPropertyTemplateRequestSystemPropertyInfo setRwRoSerialNo(String rwRoSerialNo) {
            this.rwRoSerialNo = rwRoSerialNo;
            return this;
        }
        public String getRwRoSerialNo() {
            return this.rwRoSerialNo;
        }

    }

}
