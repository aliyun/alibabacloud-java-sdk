// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class AddIntlImageProductVersionRequest extends TeaModel {
    @NameInMap("AccessDetail")
    public AddIntlImageProductVersionRequestAccessDetail accessDetail;

    @NameInMap("Ak")
    public String ak;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("ImageConstraint")
    public AddIntlImageProductVersionRequestImageConstraint imageConstraint;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Secret")
    public String secret;

    @NameInMap("Uid")
    public String uid;

    public static AddIntlImageProductVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddIntlImageProductVersionRequest self = new AddIntlImageProductVersionRequest();
        return TeaModel.build(map, self);
    }

    public AddIntlImageProductVersionRequest setAccessDetail(AddIntlImageProductVersionRequestAccessDetail accessDetail) {
        this.accessDetail = accessDetail;
        return this;
    }
    public AddIntlImageProductVersionRequestAccessDetail getAccessDetail() {
        return this.accessDetail;
    }

    public AddIntlImageProductVersionRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public AddIntlImageProductVersionRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public AddIntlImageProductVersionRequest setImageConstraint(AddIntlImageProductVersionRequestImageConstraint imageConstraint) {
        this.imageConstraint = imageConstraint;
        return this;
    }
    public AddIntlImageProductVersionRequestImageConstraint getImageConstraint() {
        return this.imageConstraint;
    }

    public AddIntlImageProductVersionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddIntlImageProductVersionRequest setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public AddIntlImageProductVersionRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public static class AddIntlImageProductVersionRequestAccessDetail extends TeaModel {
        @NameInMap("Ak")
        public String ak;

        @NameInMap("AutoPublish")
        public Boolean autoPublish;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageVersion")
        public String imageVersion;

        @NameInMap("Region")
        public String region;

        @NameInMap("ReleaseNote")
        public String releaseNote;

        @NameInMap("ReleaseRegionOption")
        public String releaseRegionOption;

        @NameInMap("Secret")
        public String secret;

        public static AddIntlImageProductVersionRequestAccessDetail build(java.util.Map<String, ?> map) throws Exception {
            AddIntlImageProductVersionRequestAccessDetail self = new AddIntlImageProductVersionRequestAccessDetail();
            return TeaModel.build(map, self);
        }

        public AddIntlImageProductVersionRequestAccessDetail setAk(String ak) {
            this.ak = ak;
            return this;
        }
        public String getAk() {
            return this.ak;
        }

        public AddIntlImageProductVersionRequestAccessDetail setAutoPublish(Boolean autoPublish) {
            this.autoPublish = autoPublish;
            return this;
        }
        public Boolean getAutoPublish() {
            return this.autoPublish;
        }

        public AddIntlImageProductVersionRequestAccessDetail setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public AddIntlImageProductVersionRequestAccessDetail setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public AddIntlImageProductVersionRequestAccessDetail setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public AddIntlImageProductVersionRequestAccessDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public AddIntlImageProductVersionRequestAccessDetail setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public AddIntlImageProductVersionRequestAccessDetail setReleaseRegionOption(String releaseRegionOption) {
            this.releaseRegionOption = releaseRegionOption;
            return this;
        }
        public String getReleaseRegionOption() {
            return this.releaseRegionOption;
        }

        public AddIntlImageProductVersionRequestAccessDetail setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

    }

    public static class AddIntlImageProductVersionRequestImageConstraintBaseConfig extends TeaModel {
        @NameInMap("MaxCpu")
        public Integer maxCpu;

        @NameInMap("MaxMemory")
        public Float maxMemory;

        @NameInMap("MinBandwidth")
        public Integer minBandwidth;

        @NameInMap("MinCpu")
        public Integer minCpu;

        @NameInMap("MinDataDiskSize")
        public Integer minDataDiskSize;

        @NameInMap("MinMemory")
        public Float minMemory;

        @NameInMap("MinSystemDiskSize")
        public Integer minSystemDiskSize;

        public static AddIntlImageProductVersionRequestImageConstraintBaseConfig build(java.util.Map<String, ?> map) throws Exception {
            AddIntlImageProductVersionRequestImageConstraintBaseConfig self = new AddIntlImageProductVersionRequestImageConstraintBaseConfig();
            return TeaModel.build(map, self);
        }

        public AddIntlImageProductVersionRequestImageConstraintBaseConfig setMaxCpu(Integer maxCpu) {
            this.maxCpu = maxCpu;
            return this;
        }
        public Integer getMaxCpu() {
            return this.maxCpu;
        }

        public AddIntlImageProductVersionRequestImageConstraintBaseConfig setMaxMemory(Float maxMemory) {
            this.maxMemory = maxMemory;
            return this;
        }
        public Float getMaxMemory() {
            return this.maxMemory;
        }

        public AddIntlImageProductVersionRequestImageConstraintBaseConfig setMinBandwidth(Integer minBandwidth) {
            this.minBandwidth = minBandwidth;
            return this;
        }
        public Integer getMinBandwidth() {
            return this.minBandwidth;
        }

        public AddIntlImageProductVersionRequestImageConstraintBaseConfig setMinCpu(Integer minCpu) {
            this.minCpu = minCpu;
            return this;
        }
        public Integer getMinCpu() {
            return this.minCpu;
        }

        public AddIntlImageProductVersionRequestImageConstraintBaseConfig setMinDataDiskSize(Integer minDataDiskSize) {
            this.minDataDiskSize = minDataDiskSize;
            return this;
        }
        public Integer getMinDataDiskSize() {
            return this.minDataDiskSize;
        }

        public AddIntlImageProductVersionRequestImageConstraintBaseConfig setMinMemory(Float minMemory) {
            this.minMemory = minMemory;
            return this;
        }
        public Float getMinMemory() {
            return this.minMemory;
        }

        public AddIntlImageProductVersionRequestImageConstraintBaseConfig setMinSystemDiskSize(Integer minSystemDiskSize) {
            this.minSystemDiskSize = minSystemDiskSize;
            return this;
        }
        public Integer getMinSystemDiskSize() {
            return this.minSystemDiskSize;
        }

    }

    public static class AddIntlImageProductVersionRequestImageConstraint extends TeaModel {
        @NameInMap("BaseConfig")
        public AddIntlImageProductVersionRequestImageConstraintBaseConfig baseConfig;

        @NameInMap("CustomizeFamilyConstraints")
        public java.util.Map<String, ?> customizeFamilyConstraints;

        @NameInMap("SupportMoreNetworkCards")
        public Boolean supportMoreNetworkCards;

        @NameInMap("TcpPortRange")
        public java.util.List<String> tcpPortRange;

        @NameInMap("UdpPortRange")
        public java.util.List<String> udpPortRange;

        public static AddIntlImageProductVersionRequestImageConstraint build(java.util.Map<String, ?> map) throws Exception {
            AddIntlImageProductVersionRequestImageConstraint self = new AddIntlImageProductVersionRequestImageConstraint();
            return TeaModel.build(map, self);
        }

        public AddIntlImageProductVersionRequestImageConstraint setBaseConfig(AddIntlImageProductVersionRequestImageConstraintBaseConfig baseConfig) {
            this.baseConfig = baseConfig;
            return this;
        }
        public AddIntlImageProductVersionRequestImageConstraintBaseConfig getBaseConfig() {
            return this.baseConfig;
        }

        public AddIntlImageProductVersionRequestImageConstraint setCustomizeFamilyConstraints(java.util.Map<String, ?> customizeFamilyConstraints) {
            this.customizeFamilyConstraints = customizeFamilyConstraints;
            return this;
        }
        public java.util.Map<String, ?> getCustomizeFamilyConstraints() {
            return this.customizeFamilyConstraints;
        }

        public AddIntlImageProductVersionRequestImageConstraint setSupportMoreNetworkCards(Boolean supportMoreNetworkCards) {
            this.supportMoreNetworkCards = supportMoreNetworkCards;
            return this;
        }
        public Boolean getSupportMoreNetworkCards() {
            return this.supportMoreNetworkCards;
        }

        public AddIntlImageProductVersionRequestImageConstraint setTcpPortRange(java.util.List<String> tcpPortRange) {
            this.tcpPortRange = tcpPortRange;
            return this;
        }
        public java.util.List<String> getTcpPortRange() {
            return this.tcpPortRange;
        }

        public AddIntlImageProductVersionRequestImageConstraint setUdpPortRange(java.util.List<String> udpPortRange) {
            this.udpPortRange = udpPortRange;
            return this;
        }
        public java.util.List<String> getUdpPortRange() {
            return this.udpPortRange;
        }

    }

}
