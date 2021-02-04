// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourcePackageProductResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public Long orderId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeResourcePackageProductResponseData data;

    public static DescribeResourcePackageProductResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackageProductResponse self = new DescribeResourcePackageProductResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackageProductResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourcePackageProductResponse setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public DescribeResourcePackageProductResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeResourcePackageProductResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeResourcePackageProductResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeResourcePackageProductResponse setData(DescribeResourcePackageProductResponseData data) {
        this.data = data;
        return this;
    }
    public DescribeResourcePackageProductResponseData getData() {
        return this.data;
    }

    public static class DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty self = new DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties extends TeaModel {
        @NameInMap("Property")
        @Validation(required = true)
        public java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty> property;

        public static DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties self = new DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties setProperty(java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty> property) {
            this.property = property;
            return this;
        }
        public java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty> getProperty() {
            return this.property;
        }

    }

    public static class DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public Integer value;

        @NameInMap("Unit")
        @Validation(required = true)
        public String unit;

        public static DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration self = new DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations extends TeaModel {
        @NameInMap("AvailableDuration")
        @Validation(required = true)
        public java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration> availableDuration;

        public static DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations self = new DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations setAvailableDuration(java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration> availableDuration) {
            this.availableDuration = availableDuration;
            return this;
        }
        public java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration> getAvailableDuration() {
            return this.availableDuration;
        }

    }

    public static class DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("AvailableDurations")
        @Validation(required = true)
        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations availableDurations;

        public static DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification self = new DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification setAvailableDurations(DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations availableDurations) {
            this.availableDurations = availableDurations;
            return this;
        }
        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations getAvailableDurations() {
            return this.availableDurations;
        }

    }

    public static class DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications extends TeaModel {
        @NameInMap("Specification")
        @Validation(required = true)
        public java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification> specification;

        public static DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications self = new DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications setSpecification(java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification> specification) {
            this.specification = specification;
            return this;
        }
        public java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification> getSpecification() {
            return this.specification;
        }

    }

    public static class DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageType extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Properties")
        @Validation(required = true)
        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties properties;

        @NameInMap("Specifications")
        @Validation(required = true)
        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications specifications;

        public static DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageType build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageType self = new DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageType();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageType setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageType setProperties(DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties properties) {
            this.properties = properties;
            return this;
        }
        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties getProperties() {
            return this.properties;
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageType setSpecifications(DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications specifications) {
            this.specifications = specifications;
            return this;
        }
        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications getSpecifications() {
            return this.specifications;
        }

    }

    public static class DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypes extends TeaModel {
        @NameInMap("PackageType")
        @Validation(required = true)
        public java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageType> packageType;

        public static DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypes self = new DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypes();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypes setPackageType(java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageType> packageType) {
            this.packageType = packageType;
            return this;
        }
        public java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageType> getPackageType() {
            return this.packageType;
        }

    }

    public static class DescribeResourcePackageProductResponseDataResourcePackagesResourcePackage extends TeaModel {
        @NameInMap("ProductCode")
        @Validation(required = true)
        public String productCode;

        @NameInMap("ProductType")
        @Validation(required = true)
        public String productType;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("PackageTypes")
        @Validation(required = true)
        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypes packageTypes;

        public static DescribeResourcePackageProductResponseDataResourcePackagesResourcePackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseDataResourcePackagesResourcePackage self = new DescribeResourcePackageProductResponseDataResourcePackagesResourcePackage();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackage setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackage setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackage setPackageTypes(DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypes packageTypes) {
            this.packageTypes = packageTypes;
            return this;
        }
        public DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypes getPackageTypes() {
            return this.packageTypes;
        }

    }

    public static class DescribeResourcePackageProductResponseDataResourcePackages extends TeaModel {
        @NameInMap("ResourcePackage")
        @Validation(required = true)
        public java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackage> resourcePackage;

        public static DescribeResourcePackageProductResponseDataResourcePackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseDataResourcePackages self = new DescribeResourcePackageProductResponseDataResourcePackages();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseDataResourcePackages setResourcePackage(java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackage> resourcePackage) {
            this.resourcePackage = resourcePackage;
            return this;
        }
        public java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackage> getResourcePackage() {
            return this.resourcePackage;
        }

    }

    public static class DescribeResourcePackageProductResponseData extends TeaModel {
        @NameInMap("ResourcePackages")
        @Validation(required = true)
        public DescribeResourcePackageProductResponseDataResourcePackages resourcePackages;

        public static DescribeResourcePackageProductResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseData self = new DescribeResourcePackageProductResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseData setResourcePackages(DescribeResourcePackageProductResponseDataResourcePackages resourcePackages) {
            this.resourcePackages = resourcePackages;
            return this;
        }
        public DescribeResourcePackageProductResponseDataResourcePackages getResourcePackages() {
            return this.resourcePackages;
        }

    }

}
