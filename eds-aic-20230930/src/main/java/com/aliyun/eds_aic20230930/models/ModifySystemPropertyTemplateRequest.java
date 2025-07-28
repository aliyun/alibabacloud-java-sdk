// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifySystemPropertyTemplateRequest extends TeaModel {
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

    @NameInMap("SystemPropertyInfo")
    public ModifySystemPropertyTemplateRequestSystemPropertyInfo systemPropertyInfo;

    /**
     * <strong>example:</strong>
     * <p>ap-angyvganxlf****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

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
        @NameInMap("CustomPropertyInfos")
        public java.util.List<ModifySystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos> customPropertyInfos;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoBootloader")
        public String roBootloader;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoBuildDisplayId")
        public String roBuildDisplayId;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoBuildFingerprint")
        public String roBuildFingerprint;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoBuildHost")
        public String roBuildHost;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoBuildId")
        public String roBuildId;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoBuildProduct")
        public String roBuildProduct;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoBuildTags")
        public String roBuildTags;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoBuildType")
        public String roBuildType;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoBuildUser")
        public String roBuildUser;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoProductBoard")
        public String roProductBoard;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoProductBrand")
        public String roProductBrand;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoProductDevice")
        public String roProductDevice;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoProductManufacturer")
        public String roProductManufacturer;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoProductModel")
        public String roProductModel;

        /**
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
