// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateServiceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SupplierName")
    public String supplierName;

    @NameInMap("SupplierUrl")
    public String supplierUrl;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("DeployType")
    public String deployType;

    @NameInMap("DeployMetadata")
    public String deployMetadata;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("ServiceInfo")
    public java.util.List<CreateServiceRequestServiceInfo> serviceInfo;

    public static CreateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceRequest self = new CreateServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateServiceRequest setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public CreateServiceRequest setSupplierUrl(String supplierUrl) {
        this.supplierUrl = supplierUrl;
        return this;
    }
    public String getSupplierUrl() {
        return this.supplierUrl;
    }

    public CreateServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateServiceRequest setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public CreateServiceRequest setDeployMetadata(String deployMetadata) {
        this.deployMetadata = deployMetadata;
        return this;
    }
    public String getDeployMetadata() {
        return this.deployMetadata;
    }

    public CreateServiceRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public CreateServiceRequest setServiceInfo(java.util.List<CreateServiceRequestServiceInfo> serviceInfo) {
        this.serviceInfo = serviceInfo;
        return this;
    }
    public java.util.List<CreateServiceRequestServiceInfo> getServiceInfo() {
        return this.serviceInfo;
    }

    public static class CreateServiceRequestServiceInfo extends TeaModel {
        @NameInMap("Locale")
        public String locale;

        @NameInMap("ShortDescription")
        public String shortDescription;

        @NameInMap("Image")
        public String image;

        @NameInMap("Name")
        public String name;

        public static CreateServiceRequestServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceRequestServiceInfo self = new CreateServiceRequestServiceInfo();
            return TeaModel.build(map, self);
        }

        public CreateServiceRequestServiceInfo setLocale(String locale) {
            this.locale = locale;
            return this;
        }
        public String getLocale() {
            return this.locale;
        }

        public CreateServiceRequestServiceInfo setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public String getShortDescription() {
            return this.shortDescription;
        }

        public CreateServiceRequestServiceInfo setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public CreateServiceRequestServiceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
