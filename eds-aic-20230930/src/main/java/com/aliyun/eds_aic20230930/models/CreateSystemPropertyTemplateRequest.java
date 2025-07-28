// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateSystemPropertyTemplateRequest extends TeaModel {
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
    public CreateSystemPropertyTemplateRequestSystemPropertyInfo systemPropertyInfo;

    @NameInMap("TemplateName")
    public String templateName;

    public static CreateSystemPropertyTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSystemPropertyTemplateRequest self = new CreateSystemPropertyTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateSystemPropertyTemplateRequest setEnableAuto(Boolean enableAuto) {
        this.enableAuto = enableAuto;
        return this;
    }
    public Boolean getEnableAuto() {
        return this.enableAuto;
    }

    public CreateSystemPropertyTemplateRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateSystemPropertyTemplateRequest setSystemPropertyInfo(CreateSystemPropertyTemplateRequestSystemPropertyInfo systemPropertyInfo) {
        this.systemPropertyInfo = systemPropertyInfo;
        return this;
    }
    public CreateSystemPropertyTemplateRequestSystemPropertyInfo getSystemPropertyInfo() {
        return this.systemPropertyInfo;
    }

    public CreateSystemPropertyTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public static class CreateSystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos extends TeaModel {
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

        public static CreateSystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos build(java.util.Map<String, ?> map) throws Exception {
            CreateSystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos self = new CreateSystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos();
            return TeaModel.build(map, self);
        }

        public CreateSystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

        public CreateSystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public String getPropertyValue() {
            return this.propertyValue;
        }

    }

    public static class CreateSystemPropertyTemplateRequestSystemPropertyInfo extends TeaModel {
        @NameInMap("CustomPropertyInfos")
        public java.util.List<CreateSystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos> customPropertyInfos;

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

        public static CreateSystemPropertyTemplateRequestSystemPropertyInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateSystemPropertyTemplateRequestSystemPropertyInfo self = new CreateSystemPropertyTemplateRequestSystemPropertyInfo();
            return TeaModel.build(map, self);
        }

        public CreateSystemPropertyTemplateRequestSystemPropertyInfo setCustomPropertyInfos(java.util.List<CreateSystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos> customPropertyInfos) {
            this.customPropertyInfos = customPropertyInfos;
            return this;
        }
        public java.util.List<CreateSystemPropertyTemplateRequestSystemPropertyInfoCustomPropertyInfos> getCustomPropertyInfos() {
            return this.customPropertyInfos;
        }

        public CreateSystemPropertyTemplateRequestSystemPropertyInfo setRoBootloader(String roBootloader) {
            this.roBootloader = roBootloader;
            return this;
        }
        public String getRoBootloader() {
            return this.roBootloader;
        }

        public CreateSystemPropertyTemplateRequestSystemPropertyInfo setRoBuildDisplayId(String roBuildDisplayId) {
            this.roBuildDisplayId = roBuildDisplayId;
            return this;
        }
        public String getRoBuildDisplayId() {
            return this.roBuildDisplayId;
        }

        public CreateSystemPropertyTemplateRequestSystemPropertyInfo setRoBuildFingerprint(String roBuildFingerprint) {
            this.roBuildFingerprint = roBuildFingerprint;
            return this;
        }
        public String getRoBuildFingerprint() {
            return this.roBuildFingerprint;
        }

        public CreateSystemPropertyTemplateRequestSystemPropertyInfo setRoBuildHost(String roBuildHost) {
            this.roBuildHost = roBuildHost;
            return this;
        }
        public String getRoBuildHost() {
            return this.roBuildHost;
        }

        public CreateSystemPropertyTemplateRequestSystemPropertyInfo setRoBuildId(String roBuildId) {
            this.roBuildId = roBuildId;
            return this;
        }
        public String getRoBuildId() {
            return this.roBuildId;
        }

        public CreateSystemPropertyTemplateRequestSystemPropertyInfo setRoBuildProduct(String roBuildProduct) {
            this.roBuildProduct = roBuildProduct;
            return this;
        }
        public String getRoBuildProduct() {
            return this.roBuildProduct;
        }

        public CreateSystemPropertyTemplateRequestSystemPropertyInfo setRoBuildTags(String roBuildTags) {
            this.roBuildTags = roBuildTags;
            return this;
        }
        public String getRoBuildTags() {
            return this.roBuildTags;
        }

        public CreateSystemPropertyTemplateRequestSystemPropertyInfo setRoBuildType(String roBuildType) {
            this.roBuildType = roBuildType;
            return this;
        }
        public String getRoBuildType() {
            return this.roBuildType;
        }

        public CreateSystemPropertyTemplateRequestSystemPropertyInfo setRoBuildUser(String roBuildUser) {
            this.roBuildUser = roBuildUser;
            return this;
        }
        public String getRoBuildUser() {
            return this.roBuildUser;
        }

        public CreateSystemPropertyTemplateRequestSystemPropertyInfo setRoProductBoard(String roProductBoard) {
            this.roProductBoard = roProductBoard;
            return this;
        }
        public String getRoProductBoard() {
            return this.roProductBoard;
        }

        public CreateSystemPropertyTemplateRequestSystemPropertyInfo setRoProductBrand(String roProductBrand) {
            this.roProductBrand = roProductBrand;
            return this;
        }
        public String getRoProductBrand() {
            return this.roProductBrand;
        }

        public CreateSystemPropertyTemplateRequestSystemPropertyInfo setRoProductDevice(String roProductDevice) {
            this.roProductDevice = roProductDevice;
            return this;
        }
        public String getRoProductDevice() {
            return this.roProductDevice;
        }

        public CreateSystemPropertyTemplateRequestSystemPropertyInfo setRoProductManufacturer(String roProductManufacturer) {
            this.roProductManufacturer = roProductManufacturer;
            return this;
        }
        public String getRoProductManufacturer() {
            return this.roProductManufacturer;
        }

        public CreateSystemPropertyTemplateRequestSystemPropertyInfo setRoProductModel(String roProductModel) {
            this.roProductModel = roProductModel;
            return this;
        }
        public String getRoProductModel() {
            return this.roProductModel;
        }

        public CreateSystemPropertyTemplateRequestSystemPropertyInfo setRwRoSerialNo(String rwRoSerialNo) {
            this.rwRoSerialNo = rwRoSerialNo;
            return this;
        }
        public String getRwRoSerialNo() {
            return this.rwRoSerialNo;
        }

    }

}
