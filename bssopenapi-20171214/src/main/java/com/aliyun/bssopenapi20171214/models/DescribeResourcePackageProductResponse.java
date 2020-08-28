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

    }

    public static class DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties extends TeaModel {
        @NameInMap("Property")
        @Validation(required = true)
        public java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypePropertiesProperty> property;

        public static DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties self = new DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeProperties();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations extends TeaModel {
        @NameInMap("AvailableDuration")
        @Validation(required = true)
        public java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurationsAvailableDuration> availableDuration;

        public static DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations self = new DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecificationAvailableDurations();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications extends TeaModel {
        @NameInMap("Specification")
        @Validation(required = true)
        public java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecificationsSpecification> specification;

        public static DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications self = new DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageTypeSpecifications();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypes extends TeaModel {
        @NameInMap("PackageType")
        @Validation(required = true)
        public java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypesPackageType> packageType;

        public static DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypes self = new DescribeResourcePackageProductResponseDataResourcePackagesResourcePackagePackageTypes();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeResourcePackageProductResponseDataResourcePackages extends TeaModel {
        @NameInMap("ResourcePackage")
        @Validation(required = true)
        public java.util.List<DescribeResourcePackageProductResponseDataResourcePackagesResourcePackage> resourcePackage;

        public static DescribeResourcePackageProductResponseDataResourcePackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackageProductResponseDataResourcePackages self = new DescribeResourcePackageProductResponseDataResourcePackages();
            return TeaModel.build(map, self);
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

    }

}
