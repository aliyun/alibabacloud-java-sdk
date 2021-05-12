// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateEnvironmentAndGenerateVendorConfigRequest extends TeaModel {
    @NameInMap("envUID")
    public String envUID;

    @NameInMap("platform")
    public CreateEnvironmentAndGenerateVendorConfigRequestPlatform platform;

    @NameInMap("productName")
    public String productName;

    @NameInMap("productUID")
    public String productUID;

    @NameInMap("productVersion")
    public String productVersion;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    @NameInMap("vendorType")
    public String vendorType;

    public static CreateEnvironmentAndGenerateVendorConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentAndGenerateVendorConfigRequest self = new CreateEnvironmentAndGenerateVendorConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentAndGenerateVendorConfigRequest setEnvUID(String envUID) {
        this.envUID = envUID;
        return this;
    }
    public String getEnvUID() {
        return this.envUID;
    }

    public CreateEnvironmentAndGenerateVendorConfigRequest setPlatform(CreateEnvironmentAndGenerateVendorConfigRequestPlatform platform) {
        this.platform = platform;
        return this;
    }
    public CreateEnvironmentAndGenerateVendorConfigRequestPlatform getPlatform() {
        return this.platform;
    }

    public CreateEnvironmentAndGenerateVendorConfigRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public CreateEnvironmentAndGenerateVendorConfigRequest setProductUID(String productUID) {
        this.productUID = productUID;
        return this;
    }
    public String getProductUID() {
        return this.productUID;
    }

    public CreateEnvironmentAndGenerateVendorConfigRequest setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

    public CreateEnvironmentAndGenerateVendorConfigRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public CreateEnvironmentAndGenerateVendorConfigRequest setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class CreateEnvironmentAndGenerateVendorConfigRequestPlatform extends TeaModel {
        @NameInMap("architecture")
        public String architecture;

        @NameInMap("os")
        public String os;

        public static CreateEnvironmentAndGenerateVendorConfigRequestPlatform build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvironmentAndGenerateVendorConfigRequestPlatform self = new CreateEnvironmentAndGenerateVendorConfigRequestPlatform();
            return TeaModel.build(map, self);
        }

        public CreateEnvironmentAndGenerateVendorConfigRequestPlatform setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public CreateEnvironmentAndGenerateVendorConfigRequestPlatform setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

    }

}
