// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourcePackageProductResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeResourcePackageProductResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeResourcePackageProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackageProductResponseBody self = new DescribeResourcePackageProductResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackageProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeResourcePackageProductResponseBody setData(DescribeResourcePackageProductResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeResourcePackageProductResponseBodyData getData() {
        return this.data;
    }

    public DescribeResourcePackageProductResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeResourcePackageProductResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public DescribeResourcePackageProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourcePackageProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty self = new DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties extends TeaModel {
        @NameInMap("Property")
        public java.util.List<DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty> property;

        public static DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties self = new DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties setProperty(java.util.List<DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty> property) {
            this.property = property;
            return this;
        }
        public java.util.List<DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty> getProperty() {
            return this.property;
        }

    }

    public static class DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public Integer value;

        public static DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration self = new DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations extends TeaModel {
        @NameInMap("AvailableDuration")
        public java.util.List<DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration> availableDuration;

        public static DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations self = new DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations setAvailableDuration(java.util.List<DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration> availableDuration) {
            this.availableDuration = availableDuration;
            return this;
        }
        public java.util.List<DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration> getAvailableDuration() {
            return this.availableDuration;
        }

    }

    public static class DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification extends TeaModel {
        @NameInMap("AvailableDurations")
        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations availableDurations;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification self = new DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification setAvailableDurations(DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations availableDurations) {
            this.availableDurations = availableDurations;
            return this;
        }
        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations getAvailableDurations() {
            return this.availableDurations;
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications extends TeaModel {
        @NameInMap("Specification")
        public java.util.List<DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification> specification;

        public static DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications self = new DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications setSpecification(java.util.List<DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification> specification) {
            this.specification = specification;
            return this;
        }
        public java.util.List<DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification> getSpecification() {
            return this.specification;
        }

    }

    public static class DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageType extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        @NameInMap("Properties")
        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties properties;

        @NameInMap("Specifications")
        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications specifications;

        public static DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageType build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageType self = new DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageType();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageType setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageType setProperties(DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties properties) {
            this.properties = properties;
            return this;
        }
        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties getProperties() {
            return this.properties;
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageType setSpecifications(DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications specifications) {
            this.specifications = specifications;
            return this;
        }
        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications getSpecifications() {
            return this.specifications;
        }

    }

    public static class DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypes extends TeaModel {
        @NameInMap("PackageType")
        public java.util.List<DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageType> packageType;

        public static DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypes self = new DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypes();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypes setPackageType(java.util.List<DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageType> packageType) {
            this.packageType = packageType;
            return this;
        }
        public java.util.List<DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageType> getPackageType() {
            return this.packageType;
        }

    }

    public static class DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackage extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("PackageTypes")
        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypes packageTypes;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductType")
        public String productType;

        public static DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackage self = new DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackage();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackage setPackageTypes(DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypes packageTypes) {
            this.packageTypes = packageTypes;
            return this;
        }
        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypes getPackageTypes() {
            return this.packageTypes;
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackage setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackage setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

    }

    public static class DescribeResourcePackageProductResponseBodyDataResourcePackages extends TeaModel {
        @NameInMap("ResourcePackage")
        public java.util.List<DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackage> resourcePackage;

        public static DescribeResourcePackageProductResponseBodyDataResourcePackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseBodyDataResourcePackages self = new DescribeResourcePackageProductResponseBodyDataResourcePackages();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseBodyDataResourcePackages setResourcePackage(java.util.List<DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackage> resourcePackage) {
            this.resourcePackage = resourcePackage;
            return this;
        }
        public java.util.List<DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackage> getResourcePackage() {
            return this.resourcePackage;
        }

    }

    public static class DescribeResourcePackageProductResponseBodyData extends TeaModel {
        @NameInMap("ResourcePackages")
        public DescribeResourcePackageProductResponseBodyDataResourcePackages resourcePackages;

        public static DescribeResourcePackageProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseBodyData self = new DescribeResourcePackageProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackageProductResponseBodyData setResourcePackages(DescribeResourcePackageProductResponseBodyDataResourcePackages resourcePackages) {
            this.resourcePackages = resourcePackages;
            return this;
        }
        public DescribeResourcePackageProductResponseBodyDataResourcePackages getResourcePackages() {
            return this.resourcePackages;
        }

    }

}
