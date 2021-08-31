// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateServiceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SupplierName")
    public String supplierName;

    @NameInMap("SupplierUrl")
    public String supplierUrl;

    @NameInMap("DeployType")
    public String deployType;

    @NameInMap("DeployMetadata")
    public String deployMetadata;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("ServiceInfo")
    public java.util.List<UpdateServiceRequestServiceInfo> serviceInfo;

    @NameInMap("IsSupportOperated")
    public Boolean isSupportOperated;

    @NameInMap("PolicyNames")
    public String policyNames;

    @NameInMap("Duration")
    public Long duration;

    public static UpdateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceRequest self = new UpdateServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateServiceRequest setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public UpdateServiceRequest setSupplierUrl(String supplierUrl) {
        this.supplierUrl = supplierUrl;
        return this;
    }
    public String getSupplierUrl() {
        return this.supplierUrl;
    }

    public UpdateServiceRequest setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public UpdateServiceRequest setDeployMetadata(String deployMetadata) {
        this.deployMetadata = deployMetadata;
        return this;
    }
    public String getDeployMetadata() {
        return this.deployMetadata;
    }

    public UpdateServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateServiceRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public UpdateServiceRequest setServiceInfo(java.util.List<UpdateServiceRequestServiceInfo> serviceInfo) {
        this.serviceInfo = serviceInfo;
        return this;
    }
    public java.util.List<UpdateServiceRequestServiceInfo> getServiceInfo() {
        return this.serviceInfo;
    }

    public UpdateServiceRequest setIsSupportOperated(Boolean isSupportOperated) {
        this.isSupportOperated = isSupportOperated;
        return this;
    }
    public Boolean getIsSupportOperated() {
        return this.isSupportOperated;
    }

    public UpdateServiceRequest setPolicyNames(String policyNames) {
        this.policyNames = policyNames;
        return this;
    }
    public String getPolicyNames() {
        return this.policyNames;
    }

    public UpdateServiceRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public static class UpdateServiceRequestServiceInfo extends TeaModel {
        @NameInMap("Locale")
        public String locale;

        @NameInMap("ShortDescription")
        public String shortDescription;

        @NameInMap("Image")
        public String image;

        @NameInMap("Name")
        public String name;

        public static UpdateServiceRequestServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRequestServiceInfo self = new UpdateServiceRequestServiceInfo();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRequestServiceInfo setLocale(String locale) {
            this.locale = locale;
            return this;
        }
        public String getLocale() {
            return this.locale;
        }

        public UpdateServiceRequestServiceInfo setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public String getShortDescription() {
            return this.shortDescription;
        }

        public UpdateServiceRequestServiceInfo setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public UpdateServiceRequestServiceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
