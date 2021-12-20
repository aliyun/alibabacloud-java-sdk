// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateEnvironmentRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("location")
    public String location;

    @NameInMap("name")
    public String name;

    @NameInMap("platform")
    public CreateEnvironmentRequestPlatform platform;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    // 环境类型
    @NameInMap("type")
    public String type;

    @NameInMap("vendorConfig")
    public String vendorConfig;

    @NameInMap("vendorType")
    public String vendorType;

    public static CreateEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentRequest self = new CreateEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEnvironmentRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public CreateEnvironmentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEnvironmentRequest setPlatform(CreateEnvironmentRequestPlatform platform) {
        this.platform = platform;
        return this;
    }
    public CreateEnvironmentRequestPlatform getPlatform() {
        return this.platform;
    }

    public CreateEnvironmentRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public CreateEnvironmentRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateEnvironmentRequest setVendorConfig(String vendorConfig) {
        this.vendorConfig = vendorConfig;
        return this;
    }
    public String getVendorConfig() {
        return this.vendorConfig;
    }

    public CreateEnvironmentRequest setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class CreateEnvironmentRequestPlatform extends TeaModel {
        @NameInMap("architecture")
        public String architecture;

        @NameInMap("os")
        public String os;

        public static CreateEnvironmentRequestPlatform build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvironmentRequestPlatform self = new CreateEnvironmentRequestPlatform();
            return TeaModel.build(map, self);
        }

        public CreateEnvironmentRequestPlatform setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public CreateEnvironmentRequestPlatform setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

    }

}
