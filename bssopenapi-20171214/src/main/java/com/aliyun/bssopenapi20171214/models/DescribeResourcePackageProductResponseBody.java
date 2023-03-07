// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourcePackageProductResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeResourcePackageProductResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the order.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
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
        /**
         * <p>The name of the property.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the property.</p>
         */
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
        /**
         * <p>The name of the validity period.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The unit of the validity period for the resource plan. Valid values:</p>
         * <br>
         * <p>*   Month</p>
         * <p>*   Year</p>
         * <br>
         * <p>Default value: Month.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the validity period.</p>
         */
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
        /**
         * <p>The validity periods available for the resource plan.</p>
         */
        @NameInMap("AvailableDurations")
        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations availableDurations;

        /**
         * <p>The name of the specification.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the specification.</p>
         */
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
        /**
         * <p>The code of the resource plan.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The name of the resource plan type.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The properties of the resource plan.</p>
         */
        @NameInMap("Properties")
        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties properties;

        /**
         * <p>The specifications of the resource plan.</p>
         */
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
        /**
         * <p>The name of the resource plan.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The types of the resource plans.</p>
         */
        @NameInMap("PackageTypes")
        public DescribeResourcePackageProductResponseBodyDataResourcePackagesResourcePackagePackageTypes packageTypes;

        /**
         * <p>The code of the service.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The type of the service.</p>
         */
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
        /**
         * <p>The details about the resource plans.</p>
         */
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
